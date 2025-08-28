package application;

import javafx.concurrent.Task;
import javafx.scene.control.TableView;
import java.util.List;
import java.util.Random;
public class MarketTask extends Task<Void> {
	private final TableView<Stock> table;
	private final List<Stock> stocks;
	public MarketTask(TableView<Stock> table, List<Stock> stocks) {
		this.table = table;
		this.stocks = stocks;
	}
	@Override
	protected Void call() throws Exception {
		Random random = new Random();
		while (!isCancelled()) {
			// Actualizar los valores de las acciones
			for (Stock stock : stocks) {
				double newValue = 100 + random.nextDouble() * 200; // Valores entre 100 y 300
				stock.setValue(newValue);
			}
			// Refrescar la tabla en el hilo de la interfaz gráfica
			javafx.application.Platform.runLater(() -> table.refresh());
			// Pausa entre actualizaciones
			Thread.sleep(1000);
		}
		return null;
	}
}
