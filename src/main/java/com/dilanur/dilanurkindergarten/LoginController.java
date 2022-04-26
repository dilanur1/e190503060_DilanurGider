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
    public void validateLogin(){
        DatabaseConnection connectNow=new DatabaseConnection();
        Connection connectDb=connectNow.getConnection();
        String verifyLogin="SELECT count(1) FROM users WHERE username = '" + benutzername.getText() + "' AND passwort'" + passwort.getText() +" '";
        try {
            Statement statement=connectDb.createStatement();
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
