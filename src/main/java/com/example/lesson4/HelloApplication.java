package com.example.lesson4;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class HelloApplication extends Application {
    @Override
    public void start(Stage primarystage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("hello-view.fxml"));
        primarystage.setTitle("Chat");
        primarystage.setScene(new Scene(root, 300, 275));
        primarystage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}