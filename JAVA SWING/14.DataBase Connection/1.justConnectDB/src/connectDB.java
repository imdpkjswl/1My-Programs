import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
 
public class connectDB {
    public static void main(String[] args) {
        String databaseURL = "jdbc:mysql://localhost:3306/testing?useSSL=false&serverTimezone=UTC";
        String user = "root";
        String password = "";
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(databaseURL, user, password);
            if (conn != null) {
                System.out.println("Connected to the database");
            }
        } catch (SQLException ex) {
            System.out.println("An error occurred. Maybe user/password is invalid");
            ex.printStackTrace();
        } finally {
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
        }
    }
}