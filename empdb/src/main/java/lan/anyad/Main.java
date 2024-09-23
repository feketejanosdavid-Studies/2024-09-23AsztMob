package lan.anyad;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {
        System.out.println("Adatbázis elérés");

        DataSource dataSource = new DataSource();
        dataSource.getEmployees();
    }
}