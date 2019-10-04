package sample;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class ManageCustomerController {


    @FXML
    private ListView list;
    @FXML private Pane _customer;


    public void add(){
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("AddCustomer.fxml"));

            Parent root = fxmlLoader.load();
            Stage stage = new Stage();
            stage.setTitle("Add customer");
            stage.setScene(new Scene(root));
            stage.sizeToScene();
            stage.show();



        } catch (Exception e) {
            e.printStackTrace();
        }


    }


    public void modify(){
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("AddCustomer.fxml"));

            Parent root = fxmlLoader.load();
            Stage stage = new Stage();
            stage.setTitle("Add customer");
            stage.setScene(new Scene(root));
            stage.sizeToScene();
            stage.show();



        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public void switchToMain() {

                SwitchScenes sw = new SwitchScenes(_customer);

                try {
                    sw.switchScenes("MainMenu.fxml");
                } catch (Exception e) {
                    e.printStackTrace();
                }

    }

}
