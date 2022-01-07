package org.homework4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {
    public static void main(String[] args) throws SQLException {
         String shahed;
        Connection connection = DriverManager.getConnection
                ("jdbc:postgresql://localhost:5432/postgres", "postgres", "admin");
        Statement statement = connection.createStatement();
        String createPersonTableString = "CREATE TABLE IF NOT " +
                "    EXISTS person (" +
                "    nationalcode char(10) primary key," +
                "    first_name   varchar(100)," +
                "    last_name    varchar(100)," +
                "    birthday     date," +
                "    phone_number  bigInt," +
                "    age    integer" +
                ")";
        System.out.println("Hello Group 2!");
        statement.execute(createPersonTableString);
        System.out.println("Table created successfully...");
        connection.close();
    }
}
