module com.example.pruebamongodbcss {
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;
    requires mongo.java.driver;
    requires com.jfoenix;
    requires java.desktop;

    opens com.example.pruebamongodbcss to javafx.fxml;
    exports com.example.pruebamongodbcss.AppChat;
    exports com.example.pruebamongodbcss;
    exports com.example.pruebamongodbcss.Carrusel;
    opens com.example.pruebamongodbcss.Carrusel to javafx.fxml;
}