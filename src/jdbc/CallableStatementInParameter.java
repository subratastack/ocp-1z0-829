package jdbc;

import java.sql.*;

public class CallableStatementInParameter {

    public static void main(String[] args) {

        String url = "jdbc:postgresql://localhost:5432/movies";
        String procedureCall = "{call read_phone_by_name(?)}";

        try (Connection conn = DriverManager.getConnection(url, "username", "password");
             CallableStatement cs = conn.prepareCall(procedureCall);) {

            cs.setString(1, "john");
            boolean hasResultSet = cs.execute();

            if (hasResultSet) {
                ResultSet rs = cs.getResultSet();
                while(rs.next()) {
                    System.out.println(rs.getString("phone"));
                }
            } else {
                System.out.println("No result");
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

    }
}
