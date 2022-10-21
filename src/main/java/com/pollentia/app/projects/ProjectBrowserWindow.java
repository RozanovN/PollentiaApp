package com.pollentia.app.projects;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class ProjectBrowserWindow implements Initializable {
    @FXML
    private BorderPane StartUpBrowser;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle)
    {

    }

    @FXML
    private void close(MouseEvent event)
    {
        Stage stage = (Stage) StartUpBrowser.getScene().getWindow();
        stage.close();
    }

    @FXML
    private void clear(MouseEvent event)
    {
        StartUpBrowser.setCenter(null);
    }

    private void loadUI(String nameUI)
    {
        Parent root = null;
        try {
            root = FXMLLoader.load(getClass().getResource(nameUI));
        } catch (IOException exception) {
            System.out.println("Could not find Projects.fxml");
        }
        StartUpBrowser.setCenter(root);
    }

    @FXML
    private void projects(MouseEvent event)
    {
        loadUI("Projects.fxml");
    }

    public void defaultScreen()
    {
        loadUI("Projects.fxml");
    }


    public void settings(MouseEvent mouseEvent)
    {
    }

    public void plugins(MouseEvent mouseEvent)
    {
    }
}
