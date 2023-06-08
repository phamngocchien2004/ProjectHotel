package Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import main.Main;

public class HomeController {

    public void goToManageRoom(ActionEvent actionEvent) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("../hotelfxml/home.fxml"));
        Main.mainStage.setScene(new Scene(root,700,700));

    }

    public void ManageRoom(ActionEvent actionEvent) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("../hotelfxml/manageRoom.fxml"));
        Main.mainStage.setScene(new Scene(root,1000,650));

    }
}
