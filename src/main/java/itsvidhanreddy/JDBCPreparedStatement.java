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
      System.out.print("Enter id: ");
      int user_id = sc.nextInt();

      System.out.print("Enter username: ");
      String name = sc.nextLine();

      System.out.print("Enter phone_number: ");
      String phone_number = sc.nextLine();

      pst.setInt(1, user_id);
      pst.setString(2, name);
      pst.setString(3, phone_number);

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