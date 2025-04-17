package com.example.pruebamongodbcss;

import java.io.IOException;

import com.mongodb.client.MongoDatabase;

import Utilidades.GestorConexion;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class AppChatMain extends Application {
    @Override
    public void start(Stage stage) throws IOException {

        // Crear un contenedor para el mensaje
        StackPane root = new StackPane();
        
        // Crear un Label con el texto "hola"
        Label mensaje = new Label("hola");
        mensaje.setStyle("-fx-font-size: 24px; -fx-font-weight: bold;");
        
        // Añadir el Label al contenedor
        root.getChildren().add(mensaje);
        
        // Crear la escena con el contenedor
        Scene scene = new Scene(root, 320, 240);
        scene.getStylesheets().add(getClass().getResource("/Estilos/chatOscuro.css").toExternalForm());
        stage.setTitle("App1!");
        
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
        MongoDatabase baseMongo=GestorConexion.conectarBD();
        try{
            baseMongo.createCollection("Prueba");
            System.out.println("Colección creada exitosamente.");
        }catch (Exception ex){
            System.out.println("Error");
        }
    }
}