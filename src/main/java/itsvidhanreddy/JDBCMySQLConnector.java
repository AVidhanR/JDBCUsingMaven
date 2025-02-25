package itsvidhanreddy;

import java.sql.*;

public class JDBCMySQLConnector {
  public static void main(String[] args) {
    String url = "jdbc:mysql://localhost:3306/users";
    String username = "root";
    String password = "root";
    int effectedRows = 0;

    String displayQuery = "SELECT id, username FROM user_details;";

    String insertQuery = """
        INSERT INTO
          user_details
        VALUES
          (4, "Sujay", "+92 9332929292");
        """;

    try {
      Connection con = DriverManager.getConnection(url, username, password);
      Statement st = con.createStatement();

      System.out.println("Inserting data into the db...");
      effectedRows = st.executeUpdate(insertQuery);

      ResultSet rs = st.executeQuery(displayQuery);
      System.out.println();

      while (rs.next()) {
        int id = rs.getInt("id");
        String name = rs.getString("username");
        System.out.println(id + " : " + name);
      }

      con.close();
      st.close();
      rs.close();
    } catch (SQLException e) {
      System.out.println("Something went wrong: \n" + e.getMessage());
    }
    finally {
      System.out.println();
      System.out.println(effectedRows + " is row effected");
    }
  }
}
// By A.Vidhan.R