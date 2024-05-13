package jdbc;

import java.sql.*;

public class PreparedStatementExample {

    public static void main(String[] args) {
        String url = "jdbc:postgresql://localhost:5432/movies";
        String query = "select * from movies";

        try (Connection conn = DriverManager.getConnection(url, "username", "password");
             PreparedStatement ps  = conn.prepareStatement(query);
             ResultSet rs = ps.executeQuery();) {

            while (rs.next()) {
                int id = rs.getInt("id");
                String movieName = rs.getString("movie_name");
                System.out.println("Id: " + id + ", Movie name: " + movieName);
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
