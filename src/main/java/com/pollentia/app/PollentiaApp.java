package com.pollentia.app;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class PollentiaApp extends Application {

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(
            PollentiaApp.class.getResource("projects/ProjectBrowserWindow.fxml")
        );
        Scene scene = new Scene(fxmlLoader.load(), 800, 450);
        stage.setTitle("Welcome to Pollentia!");
        stage.setScene(scene);
        stage.show();
        stage.setResizable(false);
    }

    public static void main(String[] args) {
        launch();
    }
}
