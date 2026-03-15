package coe528project;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;

public class Customer {
    private final StringProperty username;
    private final StringProperty password;
    private final IntegerProperty points;

    public Customer(String username, String password, int points) {
        this.username = new SimpleStringProperty(username);
        this.password = new SimpleStringProperty(password);
        this.points = new SimpleIntegerProperty(points);
    }

    public StringProperty usernameProperty() {
        return username;
    }

    public StringProperty passwordProperty() {
        return password;
    }

    public IntegerProperty pointsProperty() {
        return points;
    }

    public String getUsername() {
        return username.get();
    }

    public void setUsername(String username) {
        this.username.set(username);
    }

    public String getPassword() {
        return password.get();
    }

    public void setPassword(String password) {
        this.password.set(password);
    }

    public int getPoints() {
        return points.get();
    }

    public void setPoints(int points) {
        this.points.set(points);
    }
}
