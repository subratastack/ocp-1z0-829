package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectingToDatabase {

    public static void main(String[] args) {

        String url = "jdbc:postgresql://localhost:5432/movies";
        try (Connection conn = DriverManager.getConnection(url)) {
            if (conn != null) System.out.println("Connection established");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
