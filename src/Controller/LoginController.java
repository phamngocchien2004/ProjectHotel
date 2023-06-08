package Controller;

import database.Connector;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import main.Main;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class LoginController {
    public TextField txtUser;
    public TextField txtPassword;

    private PreparedStatement prepare;
    private Connection conn;

    private ResultSet result;
    public void login(ActionEvent actionEvent) throws Exception {
        Connection conn = new Connector().getConn();
        String user = txtUser.getText();
        String pass = txtPassword.getText();
        String sql = "SELECT * FROM admin WHERE user = '"+user+"' and password ='" +pass+"";
        try {
            prepare = conn.prepareStatement(sql);
            prepare.setString(1,user);
            prepare.setString(2,pass);
            result = prepare.executeQuery();
            if (result.next()) {
                Parent root = FXMLLoader.load(getClass().getResource("../hotelfxml/home.fxml"));
                Main.mainStage.setScene(new Scene(root,700,700));
            }
        } catch (Exception e) {

        }

    }
}
