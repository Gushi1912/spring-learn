package com.gushi.sb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @Author ${USER}
 * @Version 1.0.0
 * @Time ${DATE} ${TIME}
 */
public class Main {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        Class.forName("com.mysql.jdbc.Driver");
        Connection connection = DriverManager.getConnection("", "", "");

        System.out.println("Hello world!");
    }
}