package oracle;

import java.sql.*;

public class DatabaseConnection {

    public static void main(String[] args) throws SQLException {
        Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system", "1234");
        Statement statement = connection.createStatement();
        ResultSet rs = statement.executeQuery("select * from student");

        while (rs.next()) {
            System.out.println(rs.getInt(1) + " " + rs.getString(2));
        }
    }
}
