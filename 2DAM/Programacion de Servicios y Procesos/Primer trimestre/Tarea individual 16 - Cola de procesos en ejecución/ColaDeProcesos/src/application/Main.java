package application;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;
import java.util.concurrent.atomic.AtomicInteger;

public class Main extends Application {
    
    private final ObservableList<Process> processQueue = FXCollections.observableArrayList();
    private final AtomicInteger processCounter = new AtomicInteger(1); // Para IDs únicos
    
    @Override
    public void start(Stage primaryStage) {
        try {
            TableView<Process> tableView = new TableView<>(processQueue);
            TableColumn<Process, Integer> idColumn = new TableColumn<>("ID");
            idColumn.setCellValueFactory(cellData -> new SimpleIntegerProperty(cellData.getValue().getId()).asObject());
            
            TableColumn<Process, Integer> timeColumn = new TableColumn<>("Tiempo (s)");
            timeColumn.setCellValueFactory(cellData -> new SimpleIntegerProperty(cellData.getValue().getExecutionTime()).asObject());
            
            TableColumn<Process, String> stateColumn = new TableColumn<>("Estado");
            stateColumn.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getState()));
            
            tableView.getColumns().addAll(idColumn, timeColumn, stateColumn);
            
            TextField timeInput = new TextField();
            timeInput.setPromptText("Tiempo de ejecución");
            
            Button addButton = new Button("Añadir Proceso");
            addButton.setOnAction(e -> {
                String input = timeInput.getText();
                try {
                    int time = Integer.parseInt(input);
                    if (time <= 0) throw new NumberFormatException();
                    processQueue.add(new Process(processCounter.getAndIncrement(), time));
                    timeInput.clear();
                } catch (NumberFormatException ex) {
                    showAlert("Error", "El tiempo debe ser un número entero positivo.");
                }
            });
            
            Button startButton = new Button("Iniciar Simulación");
            startButton.setOnAction(e -> iniciarSimulacion(tableView, addButton, startButton));
            
            Button resetButton = new Button("Reiniciar Simulación");
            resetButton.setOnAction(e -> {
                processQueue.clear();
                processCounter.set(1);
            });
            
            HBox controls = new HBox(10, timeInput, addButton, startButton, resetButton);
            VBox layout = new VBox(10, tableView, controls);
            layout.setPrefSize(600, 400);
            Scene scene = new Scene(layout);
            primaryStage.setScene(scene);
            primaryStage.setTitle("Simulación de Cola de Procesos");
            primaryStage.show();
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
    
    private void iniciarSimulacion(TableView<Process> tableView, Button addButton, Button startButton) {
        if (processQueue.isEmpty()) {
            showAlert("Advertencia", "No hay procesos en la cola.");
            return;
        }
        addButton.setDisable(true);
        startButton.setDisable(true);
              
        Thread simulationThread = new Thread(() -> {
            for (Process process : processQueue) {
                process.setState("Ejecutando");
                Platform.runLater(tableView::refresh);
                  
                try {
                    Thread.sleep(process.getExecutionTime() * 1000L);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                process.setState("Terminado");
                Platform.runLater(tableView::refresh);
            }
              
            Platform.runLater(() -> {
                addButton.setDisable(false);
                startButton.setDisable(false);
            });
        });
        
        simulationThread.setDaemon(true);
        simulationThread.start();
    }
    
    private void showAlert(String title, String message) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }
        
    public static void main(String[] args) {
        launch(args);
    }
}
