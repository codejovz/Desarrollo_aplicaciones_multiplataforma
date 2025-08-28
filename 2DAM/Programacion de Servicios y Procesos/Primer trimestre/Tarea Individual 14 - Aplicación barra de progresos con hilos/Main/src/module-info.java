module Main {
	requires javafx.controls;
	
	opens application to javafx.graphics, javafx.fxml;
}
