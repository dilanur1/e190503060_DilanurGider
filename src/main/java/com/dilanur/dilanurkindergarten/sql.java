package com.dilanur.dilanurkindergarten;

import java.io.IOException;
import java.sql.*;
import java.util.Set;


public class sql {
    public  static Connection conn = null;

    public Connection getConnection() {

        try {
            // db parameters
            String url = "jdbc:sqlite:C:\\Users\\Eylül\\IdeaProjects\\dilanurkindergarten\\sqlite-tools-win32-x86-3380200\\bilgiler.db";
            // create a connection to the database
            conn = DriverManager.getConnection(url);

            System.out.println("Connection to SQLite has been established.");

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return conn;
    }
    public boolean validateLogin(String username,String password) {


        Connection connectDb = this.getConnection();

        String verifyLogin = "SELECT count(1) FROM employee WHERE username =  '" + username + "' AND pass = '" + password + "'" ;

        try {
            Statement statement = connectDb.createStatement();
            ResultSet queryResult = statement.executeQuery(verifyLogin);

            while(queryResult.next()) {
                if(queryResult.getInt(1)==1) {
                    return true;
                }else {
                    return false;
                }
            }

        }catch(Exception e) {
            e.printStackTrace();
            e.getCause();
        }
        return false;


    }
}

