import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class ZookeeperDB {
    public void create(Zookeeper zookeeper) {
        Connection connection = DataBaseConnection.connect();
        try {
            Statement myStmt = connection.createStatement();
            String sql = "INSERT INTO zookeeper (name, specialty, age, gender)" +
                    "VALUES ('" + zookeeper.getName() +  "','" + zookeeper.getSpecialty() + "' , '" + zookeeper.getAge() + "', '" + zookeeper.getGender() + "');";
            System.out.println(sql);
            myStmt.executeUpdate(sql);



        } catch (  SQLException ex) {
            System.out.println("ERROR " + ex.getMessage());
        }
    }



    public void update(Zookeeper zookeeperExist, String zookeeperName) {
        Connection connection = DataBaseConnection.connect();
        try {
            Statement myStmt = connection.createStatement();
            String sql = "UPDATE zookeeper SET name = \'" + zookeeperName + "\'   WHERE name = \' " + zookeeperExist.getName() + "\'";
            System.out.println(sql);
            myStmt.executeUpdate(sql);



        } catch (  SQLException ex) {
            System.out.println("ERROR " + ex.getMessage());
        }
    }

}
