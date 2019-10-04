package sample;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import javax.swing.text.html.ListView;

public class ManageProductController {


    @FXML
    private ListView list;
    @FXML private Pane _product;


    public void addFlights(){
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("AddFlights.fxml"));

            Parent root = fxmlLoader.load();
            Stage stage = new Stage();
            stage.setTitle("Add flight");
            stage.setScene(new Scene(root));
            stage.sizeToScene();
            stage.show();



        } catch (Exception e) {
            e.printStackTrace();
        }


    }


    public void addHotels(){
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("AddHotels.fxml"));

            Parent root = fxmlLoader.load();
            Stage stage = new Stage();
            stage.setTitle("Add hotel");
            stage.setScene(new Scene(root));
            stage.sizeToScene();
            stage.show();



        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public void switchToMain() {

        SwitchScenes sw = new SwitchScenes(_product);

        try {
            sw.switchScenes("MainMenu.fxml");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}


