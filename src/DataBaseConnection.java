import java.sql.Connection;
import java.sql.DriverManager;

public class DataBaseConnection {
    public static Connection connect() {
        try {
            return DriverManager.getConnection(
                    "jdbc:postgresql://localhost:5432/oop",
                    "postgres",
                    "6395"
            );
        } catch (Exception e) {
            System.out.println("Connection error");
            return null;
        }
    }


}
