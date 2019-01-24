package com.company.book3.task4;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {
  public static void main(String[] args) {
    try {
      Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
    } catch (Exception ex) {
      System.out.println("Не найден");
      ex.printStackTrace();
    }
    Connection conn = null;
    try {
      conn =DriverManager.getConnection("jdbc:mysql://localhost:3306/sanya", "root","1234");

    } catch (SQLException ex) {
      // handle any errors
      System.out.println("SQLException: " + ex.getMessage());
      System.out.println("SQLState: " + ex.getSQLState());
      System.out.println("VendorError: " + ex.getErrorCode());
      ex.printStackTrace();
    }
  }
}
