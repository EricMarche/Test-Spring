package Hello.JDBC;

import java.sql.*;

public class DAL {
    private Connection conn;
    private Statement stmt;
    public DAL(Connection conn) {
        this.conn = conn;
    }

    public void listEmployee() {
        try {
            //STEP 4: Execute a query
            System.out.println("Creating statement...");
            stmt = conn.createStatement();
            String sql;
            sql = "SELECT id, first_name, last_name, salary FROM EMPLOYEE";
            ResultSet rs = stmt.executeQuery(sql);

            //STEP 5: Extract data from result set
            while (rs.next()) {
                //Retrieve by column name
                int id = rs.getInt("id");
                int salary = rs.getInt("salary");
                String first_name = rs.getString("first_name");
                String last_name = rs.getString("last_name");

                //Display values
                System.out.print("ID: " + id);
                System.out.print(", Salary: " + salary);
                System.out.print(", First name: " + first_name);
                System.out.println(", Last name: " + last_name);
            }

            rs.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            //finally block used to close resources
            try {
                    stmt.close();
            } catch (SQLException se2) {
            }
        }
    }

    public void createEmployee(String fname, String lname, int salary) {
        try {
            //STEP 4: Execute a query
            System.out.println("Creating statement...");
            stmt = conn.createStatement();

            PreparedStatement stmt= conn.prepareStatement("INSERT INTO EMPLOYEE " +
                    "VALUES(?,?,?)");

            stmt.setString(1,fname);
            stmt.setString(2, lname);
            stmt.setInt(3,salary);//1 specifies the first parameter in the query
            stmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            //finally block used to close resources
            try {
                stmt.close();
            } catch (SQLException se2) {
            }
        }
    }
}
