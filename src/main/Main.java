package main;    

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
    public static void main(String[] args) {
        launch(args);
    }
    public static Stage mainStage;
    @Override
    public void start(Stage primaryStage) throws Exception {
        mainStage=primaryStage;
        Parent root = FXMLLoader.load(getClass().getResource("../hotelfxml/homehotel.fxml"));
        primaryStage.setScene(new Scene(root,1000,650));
        primaryStage.setTitle("Quản lí khách sạn");
        primaryStage.show();


    }
}
