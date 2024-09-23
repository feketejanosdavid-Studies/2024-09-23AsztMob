package lan.anyad;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MariaDB implements iDatabase{

    public Connection connectDB() {
        try {
            return TryConnectDB();
        } catch (SQLException e) {
            System.err.println("Hiba! A kapcsolódás sikertelen...");
            System.err.println(e.getMessage());
            return null;
        }
        
    }

    public Connection TryConnectDB() throws SQLException {
        String url = "jdbc:mariadb://localhost:3306/surubt";
        return DriverManager.getConnection(url, "surubt", "titok");
    }

    @Override
    public void closeDB(Connection con) {
        try {
            con.close();
        } catch (SQLException e) {
            System.err.println("Hiba! A kapcsolódás sikertelen...");
            System.err.println(e.getMessage());
        }
    }
    
}
