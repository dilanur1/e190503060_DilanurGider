package com.dilanur.dilanurkindergarten;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.PasswordField;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class LoginController {
    @FXML
    private Label label;
    @FXML
    private TextField benutzername;
    @FXML
    private PasswordField passwort;

    public Label getLabel() {
        return label;
    }

    public TextField getBenutzername() {
        return benutzername;
    }

    public PasswordField getPasswort() {
        return passwort;
    }

    public void login(){
        if(benutzername.getText().isBlank() ==false && passwort.getText().isBlank()){
            validateLogin();
        }
        else{
            label.setText("Bitte geben Sie ihre Benutzername und Passwort ein.");
        }


    }
    public void validateLogin() throws IOException {

        DatabaseConnection connectNow = new DatabaseConnection();
        Connection connectDb = connectNow.getConnection();

        boolean result = connectNow.validateLogin(benutzername.getText(),passwort.getText());

        if(result == true) {
            Main m = new Main();
            m.changeScene("homepage.fxml");
        }else {
            loginMessageLabel.setText("Falsch Passwort. Versuchen Sie wieder.!!!");
        }

    }


}
