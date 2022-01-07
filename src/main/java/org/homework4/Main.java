package org.homework4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {
    public static void main(String[] args) throws SQLException {
        int number;
        String name;
        System.out.println("Hello World");
        String hw = "HELLO WORLDDD";
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
        statement.execute(createPersonTableString);
        System.out.println("Table created successfully...");
        connection.close();
    }
}
