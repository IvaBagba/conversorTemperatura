package org.example.conversortemperatura;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 616, 402);
        stage.setTitle("Conversor Temperatura Ivan Baguena de la Bandera");
        stage.resizableProperty().setValue(Boolean.FALSE);
        stage.setScene(scene);
        stage.show();
        HelloController controller = fxmlLoader.getController();
        controller.setFecha();
    }

    public static void main(String[] args) {
        launch();
    }
}