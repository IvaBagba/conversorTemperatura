package org.example.conversortemperatura;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;

import java.util.Calendar;

public class HelloController {
    @FXML
    private Label welcomeText;
    @FXML
    private Button celsiusButton;
    @FXML
    private Button fahrenheitButton;
    @FXML
    private Button resetButton;

    @FXML
    private TextField temperaturaInput;
    @FXML
    private TextField temperaturaConvert;
    @FXML
    private TextField fecha;

    @FXML
    private ImageView imagen;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }

    protected void setFecha() {
        fecha.setText(Calendar.getInstance().getTime().toString());
    }

    @FXML
    protected void onResetButtonClick() {
        temperaturaInput.clear();
        temperaturaConvert.clear();
    }

    @FXML
    protected void onFahrenheitButtonClick() {
        double temperaturaBase = Double.parseDouble(temperaturaInput.getText());
        double temperaturaConv = (temperaturaBase * 9/5) + 32;

        temperaturaConvert.setText(String.valueOf(temperaturaConv));
    }
}