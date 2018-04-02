package ru.itpark;

import java.sql.*;

public class Main {
    public static void main(String[] args) throws SQLException {
        try {
            Connection conn = DriverManager.getConnection("jdbc:sqlite:db.sqlite");

            Statement stmt = conn.createStatement();

            ResultSet resultSet = stmt.executeQuery("SELECT id, name FROM managers");

            while  (resultSet.next ()) {
              int id =   resultSet.getInt("id");
              String name =   resultSet.getString("name");
                System.out.println(id + " : "+ name);
            }

            resultSet.close();
            stmt.close ();
            conn.close ();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
