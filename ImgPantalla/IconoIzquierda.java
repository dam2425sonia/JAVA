
import javax.swing.*;
import java.awt.*;
import java.net.URL;

public class IconoIzquierda {
    public static void main(String[] args) {
        // Crear ventana
        JFrame frame = new JFrame("Ventana con Icono");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);
        frame.setLayout(null); // Usaremos posición absoluta

        // Cargar imagen desde la carpeta /img/
        URL imageURL = IconoIzquierda.class.getResource("icono1.png");
        if (imageURL == null) {
            System.err.println("No se encontró la imagen en icono1.png");
            return;
        }

        // Redimensionar la imagen a tamaño de icono (32x32)
        ImageIcon originalIcon = new ImageIcon(imageURL);
        Image image = originalIcon.getImage().getScaledInstance(32, 32, Image.SCALE_SMOOTH);
        ImageIcon icon = new ImageIcon(image);

        // Crear JLabel con la imagen
        JLabel label = new JLabel(icon);
        label.setBounds(5, 5, 32, 32); // Posición en esquina superior izquierda

        // Agregar imagen al frame
        frame.add(label);

        frame.setLocationRelativeTo(null); // Centrar ventana
        frame.setVisible(true);
    }
}
