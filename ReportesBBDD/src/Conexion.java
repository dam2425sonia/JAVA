import java.sql.Connection;
import java.sql.DriverManager;

public class Conexion {
    public static Connection getConnection() {
        String url = "jdbc:mysql://185.101.225.45:3306/a7rpj4xs_dam";
        String user = "a7rpj4xs_dam";
        String password = "bXAQ95)JNmlj";
        String dataBase="a7rpj4xs_dam";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            return DriverManager.getConnection(url, user, password);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}