import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class TemperatureConverter extends Application {

	public static void main(String[] args) {
		Application.launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
	
		HBox labels = new HBox(10);
		Label Fahrenheit = new Label("Fahrenheit");
		Label Celsius = new Label("                        Celsius");
		HBox textfields = new HBox(10);
		TextField fahrenheitTF = new TextField();
		TextField celsiusTF = new TextField();
		labels.getChildren().addAll(Fahrenheit, Celsius);
		textfields.getChildren().addAll(fahrenheitTF, celsiusTF);
		
		Button b = new Button("Convert");
		
		b.setOnAction(e -> {
			String text = fahrenheitTF.getText();
			double fahrenheit = Double.parseDouble(text);
			double celsius = (fahrenheit - 32) * .555;
			String celsius2 = Double.toString(celsius);
			celsiusTF.setText(celsius2);
			String text2 = celsiusTF.getText();
			double celsius3 = Double.parseDouble(text);
			double fahrenheit2 = celsius3 * 1.8 - 32;
			String fahrenheit3 = Double.toString(fahrenheit2);
			fahrenheitTF.setText(fahrenheit3);
		});
		
		VBox root = new VBox(10);
		root.setPadding(new Insets(10, 10, 100, 10));
		root.getChildren().addAll(labels, textfields, b);
		
		Scene scene = new Scene(root, 300, 110);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Temperature Converter");
		primaryStage.show();
	}
}

