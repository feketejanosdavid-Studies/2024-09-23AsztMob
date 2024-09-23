package lan.anyad;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class DataSource {

    public void getEmployees() {
        try {
            TryGetEmployees();
        } catch (SQLException e) {
            System.out.println("Hiba a dolgozók lekérdezése sikertelen!");
            System.out.println(e.getMessage());
        }
    }

    public void TryGetEmployees() throws SQLException {
        MariaDB mariadb = new MariaDB();
        Connection con = mariadb.connectDB();
        
        Statement st = con.createStatement();
        String sol = "SELECT * FROM employee";
        ResultSet rs = st.executeQuery(sol);

        ArrayList<Employee> employeeList = new ArrayList<>();

        while (rs.next() ) {
            Employee employee = new Employee();
            
            employee.setId(rs.getInt("id"));
            employee.setName(rs.getString("name"));
            employee.setCity(rs.getString("city"));
            employee.setSalary(rs.getDouble("salary"));

            employeeList.add(employee);
        }


        mariadb.closeDB(con);
    }
}
