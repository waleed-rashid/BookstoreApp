package coe528project;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class CustomerViewTester extends Application {
    @Override
    public void start(Stage primaryStage) {
        CustomerView customerView = new CustomerView();
        customerView.start(primaryStage);
    }

    public static void main(String[] args) {
        launch(args);
    }
}
