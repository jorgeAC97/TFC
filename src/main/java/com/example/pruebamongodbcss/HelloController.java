package com.example.pruebamongodbcss;

import com.jfoenix.controls.JFXButton;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }

    @FXML
    private VBox sidebar;

    private boolean isCollapsed = false;

    @FXML
    private JFXButton btnMenuPrincipal, btnAnimales, btnFichaje, btnSalir;

    @FXML
    private void toggleSidebar() {
        if (isCollapsed) {
            expandSidebar();
        } else {
            collapseSidebar();
        }
    }

    private void collapseSidebar() {
        // Reduce el ancho
        sidebar.setPrefWidth(60);

        // Oculta textos
        btnMenuPrincipal.setText("");
        btnAnimales.setText("");
        btnFichaje.setText("");
        btnSalir.setText("");

        isCollapsed = true;
    }

    private void expandSidebar() {
        // Ancho normal
        sidebar.setPrefWidth(200);

        // Restaura textos
        btnMenuPrincipal.setText("Menú Principal");
        btnAnimales.setText("Animales");
        btnFichaje.setText("Fichaje");
        btnSalir.setText("SALIR");

        isCollapsed = false;
    }


}


