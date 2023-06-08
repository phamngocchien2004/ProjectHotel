package Controller;

import dataHotel.DataRoom;
import database.Connector;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ResourceBundle;

public class RoomController implements Initializable {
    public TableView<DataRoom> tbV;
    public TableColumn<DataRoom,String> tcRoom;
    public TableColumn<DataRoom,String> tcType;

    public TableColumn<DataRoom,Double> tcPrice;
    public TableColumn<DataRoom,String> tcStatus;
    public ComboBox<String> combobox;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        String [] item = {"VIP1" ,"VIP2"};
        combobox.getItems().addAll(item);
        tcRoom.setCellValueFactory(new PropertyValueFactory<>("room"));
        tcType.setCellValueFactory(new PropertyValueFactory<>("type"));
        tcPrice.setCellValueFactory(new PropertyValueFactory<>("price"));
        tcStatus.setCellValueFactory(new PropertyValueFactory<>("status"));
        try{
            Connection conn = new Connector().getConn();

            // query
            Statement stt = conn.createStatement();
            String sql = "select * from dataRoom";
            ResultSet rs = stt.executeQuery(sql);
            ObservableList<DataRoom> listRoom = FXCollections.observableArrayList();
            while (rs.next()){
                String room = rs.getString("room");
                String type = rs.getString("type");
                Double price= rs.getDouble("price");
                String st = rs.getString("st");
                DataRoom s = new DataRoom(room,type,price,st);
                listRoom.add(s);
            }
            tbV.setItems(listRoom);
        }catch (Exception e){
            System.out.println("error:"+e.getMessage());
        }
    }
}