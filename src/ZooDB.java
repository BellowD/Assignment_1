import java.sql.*;
import java.util.ArrayList;

public class ZooDB {
public void create(Zoo zoo) {
    Connection connection = DataBaseConnection.connect();
    try {
        Statement myStmt = connection.createStatement();
        String sql = "INSERT INTO zoo (name, location, area, address)" +
                "VALUES ('" + zoo.getName() +  "','" + zoo.getLocation() + "' , '" + zoo.getArea() + "', '" + zoo.getAddress() + "');";
        System.out.println(sql);
        myStmt.executeUpdate(sql);



    } catch (  SQLException ex) {
        System.out.println("ERROR " + ex.getMessage());
    }

}
}
