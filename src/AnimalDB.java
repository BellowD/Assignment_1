import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class AnimalDB {
    public void create(Animal animal) {
        Connection connection = DataBaseConnection.connect();
        try {
            Statement myStmt = connection.createStatement();
            String sql = "INSERT INTO animal (name, age, weight, species, gender)" +
                    "VALUES ('" + animal.getName() +  "','" + animal.getAge() + "' , '" + animal.getWeight() + "','" + animal.getSpecies() + "' , '" + animal.getGender() + "');";
            System.out.println(sql);
            myStmt.executeUpdate(sql);



        } catch (  SQLException ex) {
            System.out.println("ERROR " + ex.getMessage());
        }

    }
}
