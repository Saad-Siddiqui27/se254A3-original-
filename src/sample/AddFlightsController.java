package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class AddFlightsController {

    @FXML
    private Button Confirm;
    @FXML
    private TextField text1;
    @FXML
    private TextField text2;
    @FXML
    private TextField text3;
    @FXML
    private TextField text4;

    public void confirm(){


        if (text1.getText().isEmpty()) {

            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setContentText("Please enter the Departure destination");
            alert.setTitle("Invalid Input");

            alert.showAndWait().ifPresent(response -> {
                if (response == ButtonType.OK) {

                }

            });

        }else if(text2.getText().isEmpty()){

            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setContentText("Please enter the destination");
            alert.setTitle("Invalid Input");

            alert.showAndWait().ifPresent(response -> {
                if (response == ButtonType.OK) {

                }

            });

        }else if(text3.getText().isEmpty()){

            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setContentText("Please enter the airline name");
            alert.setTitle("Invalid Input");

            alert.showAndWait().ifPresent(response -> {
                if (response == ButtonType.OK) {

                }

            });

        }else if(text4.getText().isEmpty()){

            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setContentText("Please enter the price");
            alert.setTitle("Invalid Input");

            alert.showAndWait().ifPresent(response -> {
                if (response == ButtonType.OK) {

                }

            });


        }
        else {
            Stage stage = (Stage) Confirm.getScene().getWindow();
            stage.close();

        }
    }



    public void cancel(){

        Stage stage = (Stage) Confirm.getScene().getWindow();
        stage.close();


    }

}
