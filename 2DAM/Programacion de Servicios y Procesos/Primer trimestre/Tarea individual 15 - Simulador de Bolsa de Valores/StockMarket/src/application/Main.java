package application;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.layout.VBox;
import javafx.scene.layout.HBox;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import java.util.ArrayList;
import java.util.List;
import javafx.application.Platform;

public class Main extends Application {
    private MarketTask marketTask;
    private Thread marketThread;
    private final List<Stock> stocks = new ArrayList<>();
    private LineChart<Number, Number> lineChart;
    private int timeStep = 0;
    private boolean isRunning = false;

    @Override
    public void start(Stage primaryStage) {
        TableView<Stock> table = new TableView<>();
        
        TableColumn<Stock, String> nameColumn = new TableColumn<>("Acción");
        nameColumn.setCellValueFactory(data -> new SimpleStringProperty(data.getValue().getName()));
        TableColumn<Stock, Double> valueColumn = new TableColumn<>("Valor");
        valueColumn.setCellValueFactory(data -> new SimpleDoubleProperty(data.getValue().getValue()).asObject());
        table.getColumns().addAll(nameColumn, valueColumn);

        stocks.add(new Stock("AAPL", 150.0));
        stocks.add(new Stock("GOOGL", 2800.0));
        stocks.add(new Stock("AMZN", 3400.0));
        stocks.add(new Stock("TSLA", 700.0));
        stocks.add(new Stock("MSFT", 299.0));
        table.getItems().addAll(stocks);

        NumberAxis xAxis = new NumberAxis();
        NumberAxis yAxis = new NumberAxis();
        lineChart = new LineChart<>(xAxis, yAxis);
        lineChart.setTitle("Valor de Acciones en el Tiempo");
        xAxis.setLabel("Tiempo");
        yAxis.setLabel("Valor");

        for (Stock stock : stocks) {
            XYChart.Series<Number, Number> series = new XYChart.Series<>();
            series.setName(stock.getName());
            lineChart.getData().add(series);
        }

        Button controlButton = new Button("Iniciar");
        controlButton.setOnAction(event -> {
            if (!isRunning) {
                startMarketTask(table);
                controlButton.setText("Pausar");
                isRunning = true;
            } else {
                stopMarketTask();
                controlButton.setText("Reanudar");
                isRunning = false;
            }
        });

        HBox hbox = new HBox(table, lineChart);
        VBox vbox = new VBox(hbox, controlButton);
        Scene scene = new Scene(vbox, 1000, 600);
        primaryStage.setTitle("Simulador de Mercado Bursátil");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void startMarketTask(TableView<Stock> table) {
        marketTask = new MarketTask(table, stocks);
        marketThread = new Thread(marketTask);
        marketThread.setDaemon(true);
        marketThread.start();

        new Thread(() -> {
            while (!Thread.currentThread().isInterrupted()) {
                try {
                    Thread.sleep(1000);
                    Platform.runLater(this::updateChart);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        }).start();
    }

    private void stopMarketTask() {
        if (marketTask != null) {
            marketTask.cancel();
        }
        if (marketThread != null) {
            marketThread.interrupt();
        }
    }

    private void updateChart() {
        for (int i = 0; i < stocks.size(); i++) {
            Stock stock = stocks.get(i);
            XYChart.Series<Number, Number> series = lineChart.getData().get(i);
            series.getData().add(new XYChart.Data<>(timeStep, stock.getValue()));
            if (series.getData().size() > 50) {
                series.getData().remove(0);
            }
        }
        timeStep++;
    }

    public static void main(String[] args) {
        launch(args);
    }
}