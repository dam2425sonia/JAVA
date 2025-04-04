import javax.swing.*;
import java.awt.*;
import java.net.URL;

public class IconoMostrar {
    public static void main(String[] args) {
        // Crear ventana
        JFrame frame = new JFrame("Ventana con Icono");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);
        frame.setLayout(new BorderLayout());

        // Cargar imagen desde la carpeta /img/
        URL imageURL = IconoMostrar.class.getResource("icono1.png");
        if (imageURL == null) {
            System.err.println("No se encontró la imagen en icono1.png");
            return;
        }

        ImageIcon icon = new ImageIcon(imageURL);
        JLabel label = new JLabel(icon);
        label.setHorizontalAlignment(SwingConstants.CENTER);
        label.setVerticalAlignment(SwingConstants.CENTER);

        // Agregar imagen a la ventana
        frame.add(label, BorderLayout.CENTER);
        frame.setLocationRelativeTo(null); // Centrar ventana
        frame.setVisible(true);
    }
}

