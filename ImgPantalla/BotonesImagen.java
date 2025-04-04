
import javax.swing.*;
import java.awt.*;
import java.net.URL;

public class BotonesImagen {
    public static void main(String[] args) {
        // Crear ventana
        JFrame frame = new JFrame("Botones con Icono");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        frame.setLayout(null); // Posición absoluta

        // Cargar imagen desde la carpeta /img/
        URL imageURL = BotonesImagen.class.getResource("icono1.png");
        if (imageURL == null) {
            System.err.println("No se encontró la imagen en icono1.png");
            return;
        }

        // Redimensionar a 32x32 para usar como icono
        ImageIcon originalIcon = new ImageIcon(imageURL);
        Image image = originalIcon.getImage().getScaledInstance(32, 32, Image.SCALE_SMOOTH);
        ImageIcon icon = new ImageIcon(image);

        // Crear botón con el icono
        JButton boton1 = new JButton(icon);
        boton1.setBounds(10, 10, 50, 50); // Posición y tamaño del botón
        boton1.setToolTipText("Botón 1");

        JButton boton2 = new JButton(icon);
        boton2.setBounds(70, 10, 50, 50);
        boton2.setToolTipText("Botón 2");

        // Agregar los botones a la ventana
        frame.add(boton1);
        frame.add(boton2);

        frame.setLocationRelativeTo(null); // Centrar ventana
        frame.setVisible(true);
    }
}
