package application;

import javafx.application.Application;
import javafx.concurrent.Task;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.layout.VBox;
import javafx.application.Platform;
import java.util.concurrent.atomic.AtomicBoolean;

public class Main extends Application {
    private Task<Void> task;
    private AtomicBoolean running = new AtomicBoolean(false);
    private long startTime;

    @Override
    public void start(Stage primaryStage) {
        Button startButton = new Button("Iniciar tarea");
        Button stopButton = new Button("Parar tarea");
        ProgressBar progressBar = new ProgressBar(0);
        Label statusLabel = new Label("Estado: Listo");
        Label timerLabel = new Label("Tiempo: 0.000 segundos");

        progressBar.setPrefWidth(300);

        startButton.setOnAction(event -> {
            if (!running.get()) {
                running.set(true);
                startTime = System.currentTimeMillis();
                task = createTask();
                progressBar.progressProperty().bind(task.progressProperty());
                statusLabel.textProperty().bind(task.messageProperty());
                new Thread(task).start();
            }
        });

        stopButton.setOnAction(event -> {
            if (running.get()) {
                task.cancel();
                running.set(false);
                progressBar.progressProperty().unbind();
                statusLabel.textProperty().unbind();
                statusLabel.setText("Estado: Tarea cancelada");
            }
        });

        VBox root = new VBox(10, startButton, stopButton, progressBar, statusLabel, timerLabel);
        root.setStyle("-fx-padding: 20; -fx-alignment: center; -fx-spacing: 10;");

        primaryStage.setScene(new Scene(root, 400, 250));
        primaryStage.setTitle("Ejemplo de Hilos en JavaFX");
        primaryStage.show();

        // Actualizar el contador de tiempo
        Thread timerThread = new Thread(() -> {
            while (true) {
                if (running.get()) {
                    long elapsedTime = System.currentTimeMillis() - startTime;
                    Platform.runLater(() -> timerLabel.setText(String.format("Tiempo: %.3f segundos", elapsedTime / 1000.0)));
                }
                try {
                    Thread.sleep(10); // Actualizar cada 10 ms
                } catch (InterruptedException e) {
                    break;
                }
            }
        });
        timerThread.setDaemon(true);
        timerThread.start();
    }

    private Task<Void> createTask() {
        return new Task<>() {
            @Override
            protected Void call() throws Exception {
                for (int i = 0; i <= 100; i++) {
                    if (isCancelled()) {
                        break;
                    }
                    Thread.sleep(50); // Simula una operación costosa.
                    updateProgress(i, 100); // Actualiza el progreso.
                    updateMessage("Progreso: " + i + "%"); // Actualiza el mensaje.
                }
                return null;
            }

            @Override
            protected void succeeded() {
                running.set(false);
                updateMessage("Estado: Tarea completada");
            }

            @Override
            protected void failed() {
                running.set(false);
                updateMessage("Estado: Error en la tarea");
            }

            @Override
            protected void cancelled() {
                running.set(false);
                updateMessage("Estado: Tarea cancelada");
            }
        };
    }

    public static void main(String[] args) {
        launch(args);
    }
}