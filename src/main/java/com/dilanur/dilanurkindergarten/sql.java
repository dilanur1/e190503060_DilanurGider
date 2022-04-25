package com.dilanur.dilanurkindergarten;

import java.io.IOException;
import java.sql.*;
import java.util.Set;


public class sql {
    public  static Connection conn = null;
    public void connect() {

        try {
            // db parameters
            String url = "jdbc:sqlite:C:\\Users\\Eylül\\IdeaProjects\\dilanurkindergarten\\sqlite-tools-win32-x86-3380200\\haushaltkaufer.db";
            // create a connection to the database
            conn = DriverManager.getConnection(url);

            System.out.println("Connection to SQLite has been established.");
            Statement stmt = conn.createStatement();
            ResultSet res = stmt.executeQuery("SELECT * FROM users");
            if(res.next()){
                System.out.println("username: "+res.getString("username")+" Pass: "+res.getString("passwort"));
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

    }
    public void validateLogin(){


        

        try {

            String url = "jdbc:sqlite:C:\\Users\\Eylül\\IdeaProjects\\dilanurkindergarten\\sqlite-tools-win32-x86-3380200\\haushaltkaufer.db";
            conn = DriverManager.getConnection(url);
            Statement statement=conn.createStatement();
            String verifyLogin="SELECT count(1) FROM users WHERE username = '" + benutzername.getText() + "' AND passwort'" + passwort.getText() +" '";
            ResultSet queryResult =statement.executeQuery(verifyLogin);

            while(queryResult.next()){
                if(queryResult.getInt( 1)==1){
                    Main m=new Main();
                    m.changeScene("homepage.fxml");

                }else{
                    label.setText("Falsch Passwort. Versuchen Sie wieder.!!!");
                }
            }
        }catch (Exception a){
            a.printStackTrace();
            a.getCause();

        }
    }
}

