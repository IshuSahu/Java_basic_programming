// this programm will fetch data from student name database
package com.mycompany.mavenprojecet;
import java.sql.*;

class SelectRecord{
    public static void main(String[] args) {
        try{
            String query="Select * from student";
            // driver registration with name of the driver
            class.forName("com.mysql.jdbc.Driver");

            // getConnection() establishes a connection
            Connection conn = DriverManager.getConnection("jsbc:mysql://localhost:3306/demo","root","password");
            
            // create.Statement() creates statement object
            Statement st = conn.createStatement();
            
            // executeUpdate() is used for INSERT, UPDATE,
			// DELETE statements.
            ResultSet rs = st.executeQuery(query);

            while (rs.next()){
                int id = rs.getInt("roll No.");
                String name - rs.getString("sName");
                System.out.println(id);
                System.out.println(name);
            }
            conm.close();
        }
        catch (SQLException e) {
			System.out.println(e);
		}
    }
}