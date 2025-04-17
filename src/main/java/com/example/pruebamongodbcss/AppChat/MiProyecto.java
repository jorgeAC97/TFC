package com.example.pruebamongodbcss.AppChat;

import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MiProyecto {
    public static void main(String[] args) {
        // Crear la ventana
        JFrame ventana = new JFrame("Mi Ventana");
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setSize(300, 200);
        ventana.setLocationRelativeTo(null); // Centrar la ventana

        // Crear el panel con el mensaje
        JPanel panel = new JPanel();
        JLabel mensaje = new JLabel("hola mundo");
        mensaje.setFont(new Font("Arial", Font.BOLD, 20));
        panel.add(mensaje);

        // Agregar el panel a la ventana
        ventana.add(panel);
        
        // Hacer la ventana visible
        ventana.setVisible(true);
    }
} 