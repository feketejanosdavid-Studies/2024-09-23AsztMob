package lan.anyad;

import java.sql.Connection;
import java.sql.SQLException;

public interface iDatabase {
    public Connection connectDB() throws SQLException;
    public void closeDB(Connection con);
}
