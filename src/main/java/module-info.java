module com.example.pollentiaapp {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires eu.hansolo.tilesfx;

    opens com.pollentia.app to javafx.fxml;
    exports com.pollentia.app;
    exports com.pollentia.app.projects;
    opens com.pollentia.app.projects to javafx.fxml;
}