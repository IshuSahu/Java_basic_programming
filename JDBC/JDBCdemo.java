import java.sql.*;

public class JDBCDemo {
  public static void main(String[] args) {
    String url = "jdbc:mysql://localhost/mydatabase";
    String username = "root";
    String password = "password";

    try {
      Connection con = DriverManager.getConnection(url, username, password);
      Statement stmt = con.createStatement();
      ResultSet rs = stmt.executeQuery("SELECT * FROM DEPARTMENT");
      while (rs.next()) {
        int id = rs.getInt("id");
        String name = rs.getString("name");
        String location = rs.getString("location");
        System.out.println(id + "\t" + name + "\t" + location);
      }
      con.close();
    } catch (Exception e) {
      System.out.println(e);
    }
  }
}


