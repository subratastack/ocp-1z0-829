package jdbc;

import java.sql.*;

public class CallableStatementInOutParameter {

    public static void main(String[] args) {
        String url = "jdbc:postgresql://localhost:5432/movies";
        String procedureCall = "{call read_phone_by_name(?, ?)}";

        try (Connection conn = DriverManager.getConnection(url, "username", "password");
             CallableStatement cs = conn.prepareCall(procedureCall);) {

            cs.setString(1, "john");
            cs.registerOutParameter(2, Types.VARCHAR);
            cs.execute();

            String phone = cs.getString(2);
            System.out.println("phone" + phone);


        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
