package coe528project;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class CustomerView extends Application {
    private int points = 0; // Example points (Modify as needed)
    private String status = (points >= 1000) ? "Gold" : "Silver";
    
    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Customer View");
        
        // Top section
        Label welcomeLabel = new Label("Welcome Jane. You have " + points + " points. Your status is " + status + ".");
        welcomeLabel.setFont(new Font(18));
        welcomeLabel.setAlignment(Pos.CENTER);
        HBox topSection = new HBox(welcomeLabel);
        topSection.setAlignment(Pos.CENTER);
        topSection.setPadding(new Insets(10));
        
        // Middle section - Table
        TableView<Book> table = new TableView<>();
        TableColumn<Book, String> bookNameCol = new TableColumn<>("Book Name");
        TableColumn<Book, Double> bookPriceCol = new TableColumn<>("Book Price");
        TableColumn<Book, CheckBox> selectCol = new TableColumn<>("Select");
        
        bookNameCol.setPrefWidth(250);
        bookPriceCol.setPrefWidth(150);
        selectCol.setPrefWidth(100);
        
        table.getColumns().addAll(bookNameCol, bookPriceCol, selectCol);
        
        // Bottom section - Buttons
        Button buyButton = new Button("Buy");
        buyButton.setStyle("-fx-background-color: lightblue; -fx-font-size: 14px; -fx-padding: 10px;");
        
        Button redeemButton = new Button("Redeem Points");
        redeemButton.setStyle("-fx-background-color: green; -fx-text-fill: white; -fx-font-size: 14px; -fx-padding: 10px;");
        
        Button logoutButton = new Button("Logout");
        logoutButton.setStyle("-fx-background-color: red; -fx-text-fill: white; -fx-font-size: 14px; -fx-padding: 10px;");
        
        logoutButton.setOnAction(e -> primaryStage.setScene(getLoginScene(primaryStage))); // Dummy login scene
        
        HBox bottomSection = new HBox(20, buyButton, redeemButton, logoutButton);
        bottomSection.setAlignment(Pos.CENTER);
        bottomSection.setPadding(new Insets(10));
        
        // Main Layout
        VBox layout = new VBox(15, topSection, table, bottomSection);
        layout.setPadding(new Insets(10));
        layout.setAlignment(Pos.CENTER);
        
        Scene scene = new Scene(layout, 600, 500);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
    private Scene getLoginScene(Stage primaryStage) {
        VBox loginLayout = new VBox(10, new Label("Login Screen (Placeholder)"));
        return new Scene(loginLayout, 300, 200);
    }
    
    public static void main(String[] args) {
        launch(args);
    }
    
    // Dummy Book class
    public static class Book {
        private String name;
        private double price;
        private CheckBox select;
        
        public Book(String name, double price) {
            this.name = name;
            this.price = price;
            this.select = new CheckBox();
        }
    }
}
