package itsvidhanreddy;

import java.sql.*;
import java.util.Scanner;

public class JDBCPreparedStatement {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int effectedRows = 0;

    String url = "jdbc:mysql://localhost:3306/users";
    String username = "root";
    String password = "root";

    String preparedQuery = """
        INSERT INTO
          user_details
        VALUES
          (?, ?, ?);
        """;

    try {
      Connection con = DriverManager.getConnection(url, username, password);
      PreparedStatement pst = con.prepareStatement(preparedQuery);

      pst.setInt(1, 7);
      pst.setString(2, "Anju");
      pst.setString(3, "+91 6372819187");

      effectedRows = pst.executeUpdate();

      ResultSet rs = pst.executeQuery("SELECT id, username FROM user_details;");

      while (rs.next()) {
        System.out.println(rs.getInt("id") + " : " + rs.getString("username"));
      }

    } catch (SQLException e) {
      System.out.println("Something went wrong: " + e.getMessage());
    } finally {
      System.out.println(effectedRows + " is row effected");
    }
  }
}
// By A.Vidhan.R