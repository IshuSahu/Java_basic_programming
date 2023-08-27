

public class jasp {
    <%@ page import="java.sql.*" %>
<%
  String driver = "com.mysql.jdbc.Driver";
  String url = "jdbc:mysql://localhost/mydatabase";
  String username = "root";
  String password = "password";
  String name = request.getParameter("name");
  String email = request.getParameter("email");

  try {
    Class.forName(driver);
    Connection con = DriverManager.getConnection(url, username, password);
    PreparedStatement ps = con.prepareStatement("INSERT INTO mytable (name, email) VALUES (?, ?)");
    ps.setString(1, name);
    ps.setString(2, email);
    int result = ps.executeUpdate();
    if (result > 0) {
      out.println("Record inserted successfully");
    }
    con.close();
  } catch (Exception e) {
    out.println(e);
  }
%>

}

