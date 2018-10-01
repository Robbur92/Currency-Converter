package application;

import java.text.DecimalFormat;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class MainController {
	
	private static DecimalFormat df2 = new DecimalFormat(".##");
	@FXML
	private TextField currencyField;
	@FXML
	private Converter convert = new Converter();
	@FXML
	private Label fromLabel;
	@FXML
	private Label toLabel;
	@FXML
	private ComboBox<String> convertFromBox;
	@FXML
	private ComboBox<String> convertToBox;

	@FXML
	void initialize() {
		convertFromBox.getItems().clear();
		convertFromBox.getItems().addAll(
				"USD",
				"EURO",
				"GBP",
				"INR",
				"AUD",
				"CAD",
				"NOK"	
				);
		convertToBox.getItems().clear();
		convertToBox.getItems().addAll(
				"USD",
				"EURO",
				"GBP",
				"INR",
				"AUD",
				"CAD",
				"NOK"	
				);
	}
	
	@FXML
	public void processBoxes(ActionEvent event) {
		
		String from = convertFromBox.getValue();
		String to = convertToBox.getValue();
		double currency = Double.parseDouble(currencyField.getText());
		double output = convert.Calculate(currency, from, to);
		String currencyOut = String.valueOf(currency);
		String outputOut = String.valueOf(df2.format(output));
		fromLabel.setText(currencyOut + " " + from + " =");
		toLabel.setText(outputOut + " " + to);
		//System.out.println(from);
		//System.out.println(to);
		//System.out.println(currency);
		//System.out.println(output);
		
	}

}
