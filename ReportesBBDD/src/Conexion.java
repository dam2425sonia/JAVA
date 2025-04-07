import java.sql.Connection;
import java.sql.DriverManager;

public class Conexion {
    public static Connection getConnection() {
        String url = "jdbc:mysql://185.101.225.45:3306/aquitubbdd";
        String user = "aquituusuario";
        String password = "aquitucontraseña";


        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            return DriverManager.getConnection(url, user, password);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
