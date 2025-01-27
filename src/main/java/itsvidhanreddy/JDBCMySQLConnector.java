package itsvidhanreddy;

import java.sql.*;

public class JDBCMySQLConnector {
  public static void main(String[] args) {
    String url = "jdbc:mysql://localhost:3306/users";
    String username = "root";
    String password = "root";
    String query = "SELECT username FROM UserDetails;";

    try {
      Connection con = DriverManager.getConnection(url, username, password);
      Statement st = con.createStatement();
      ResultSet rs = st.executeQuery(query);

      while (rs.next()) {
        String name = rs.getString("username");
        System.out.println(name);
      }

      con.close();
      st.close();
      rs.close();
    } catch (SQLException e) {
      System.out.println("Something went wrong: \n" + e.getMessage());
    }
  }
}