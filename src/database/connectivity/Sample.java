package database.connectivity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Sample
{
    public static void main(String[] args)
    {
        // NOTE: Connection and Statement are AutoCloseable.
        //       Don't forget to close them both in order to avoid leaks.
        try
                (
                        // create a database connection
                        Connection connection = DriverManager.getConnection("jdbc:sqlite:src/database/sample.db");
                        Statement statement = connection.createStatement()
                )
        {
            statement.setQueryTimeout(30);  // set timeout to 30 sec.

            statement.executeUpdate("drop table if exists student");
            statement.executeUpdate("create table student (roll integer, name string)");
            statement.executeUpdate("insert into student values(141, 'Kavin')");
            statement.executeUpdate("insert into student values(171, 'Krishna')");
            ResultSet rs = statement.executeQuery("select * from student");

            System.out.println("Roll Number, Name");
            while(rs.next())
            {
                System.out.println(rs.getInt("roll") + ", " +rs.getString("name"));
            }
        }
        catch(SQLException e)
        {
            // if the error message is "out of memory",
            // it probably means no database file is found
            e.printStackTrace(System.err);
        }
    }
}