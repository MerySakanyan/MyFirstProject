package com.firstproject.connector;

import java.sql.Connection;
import java.sql.DriverManager;

public class MyConnector {
    private static Connection connection;

    private static String db_url = "jdbc:mysql://127.0.0.1:3306/test";
    private static String db_driver = "com.mysql.jdbc.Driver";
    private static String db_username = "root";
    private static String db_password = "";

    public static Connection getInstance() {

        try {
            if (connection == null || connection.isClosed()) {


                Class.forName(db_driver);
                connection = DriverManager.getConnection(db_url, db_username, db_password);


            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return connection;
    }
}
