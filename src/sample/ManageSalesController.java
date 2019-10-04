package sample;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.Pane;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.awt.event.ActionEvent;


public class ManageSalesController {

    @FXML
    private Pane _sales;
    @FXML
    private ListView list;


    @FXML
    public void initialize(){

        list.getItems().clear();
        list.getItems().add("Flight");
        list.getItems().add("Hotel");
        list.getSelectionModel().setSelectionMode(SelectionMode.SINGLE);


    }



    public void add(){
        try {


            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("AddSale.fxml"));

            Parent root = fxmlLoader.load();
            Stage stage = new Stage();
            stage.setTitle("Add Sale");
            stage.setScene(new Scene(root));
            stage.sizeToScene();
            stage.show();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public void delete(){
     if(list.getSelectionModel().getSelectedItem().toString()== "Flight"){
         Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
         alert.setTitle("Delete");
         alert.setHeaderText("Cancelling flight will cost extra charges");
         alert.setContentText("Are you sure?");

         alert.showAndWait().ifPresent(response -> {
             if (response == ButtonType.OK) {

             initialize();
             }

         });

     }
     else{

         Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
         alert.setTitle("Delete");
         alert.setHeaderText("Deleting Product");
         alert.setContentText("Are you sure?");

         alert.showAndWait().ifPresent(response -> {
             if (response == ButtonType.OK) {

                 initialize();
             }

         });


     }
    }


    public void switchToMain() {

        SwitchScenes sw = new SwitchScenes(_sales);

        try {
            sw.switchScenes("MainMenu.fxml");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
