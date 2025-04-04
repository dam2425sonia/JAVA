import javax.swing.*;
import java.awt.*;
import java.net.URL;

public class BotonesImagenCentro {
    public static void main(String[] args) {
        // Crear ventana
        JFrame frame = new JFrame("Botones Centrados");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLayout(new GridBagLayout()); // Layout centrado y flexible

        // Cargar imagen como icono escalado
        URL imageURL = BotonesImagenCentro.class.getResource("icono1.png");
        if (imageURL == null) {
            System.err.println("No se encontró la imagen en icono1.png");
            return;
        }

        ImageIcon originalIcon = new ImageIcon(imageURL);
        Image image = originalIcon.getImage().getScaledInstance(32, 32, Image.SCALE_SMOOTH);
        ImageIcon icon = new ImageIcon(image);

        // Panel interno para contener los botones
        JPanel botonesPanel = new JPanel(new GridLayout(1, 2, 20, 0)); // 1 fila, 2 columnas, espacio horizontal
        botonesPanel.setOpaque(false); // Transparente para dejar fondo de la ventana

        // Crear botones con icono
        JButton boton1 = new JButton("Botón 1", icon);
        JButton boton2 = new JButton("Botón 2", icon);

        // Estilo de botones (relleno + expansión)
        boton1.setPreferredSize(new Dimension(120, 50));
        boton2.setPreferredSize(new Dimension(120, 50));

        // Añadir botones al panel
        botonesPanel.add(boton1);
        botonesPanel.add(boton2);

        // Añadir panel de botones al centro de la ventana
        frame.add(botonesPanel, new GridBagConstraints());

        frame.setLocationRelativeTo(null); // Centrar pantalla
        frame.setVisible(true);
    }
}

