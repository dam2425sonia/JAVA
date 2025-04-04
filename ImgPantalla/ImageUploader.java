import java.io.*;
import java.sql.*;
import java.util.Scanner;

public class ImageUploader {
    private static final String URL = "jdbc:mysql://localhost:3306/alumnos";
    private static final String USER = "root";
    private static final String PASSWORD = "12345";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la ruta de la imagen: ");
        String imagePath = scanner.nextLine();
        
        File imageFile = new File(imagePath);
        if (!imageFile.exists()) {
            System.out.println("El archivo no existe.");
            return;
        }
        
        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
             FileInputStream fis = new FileInputStream(imageFile);
             PreparedStatement stmt = conn.prepareStatement("INSERT INTO alumnos (dni, img_nombre, img) VALUES (?,?, ?)");) {
            
            stmt.setString(1, "30667335G");
            stmt.setString(2, imageFile.getName());
            stmt.setBinaryStream(3, fis, (int) imageFile.length());
            
            int rowsInserted = stmt.executeUpdate();
            if (rowsInserted > 0) {
                System.out.println("Imagen almacenada correctamente en la base de datos.");
            } else {
                System.out.println("Error al almacenar la imagen.");
            }
        } catch (SQLException | IOException e) {
            e.printStackTrace();
        }
    }
}