package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class AddCustomerController {

    @FXML
    private Button Confirm;

    public TextField getText1() {
        return text1;
    }

    public void setText1(TextField text1) {
        this.text1 = text1;
    }

    public TextField getText2() {
        return text2;
    }

    public void setText2(TextField text2) {
        this.text2 = text2;
    }

    @FXML
    private TextField text1;
    @FXML
    private TextField text2;


    public void confirm() {

        if (text1.getText().isEmpty()) {

            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setContentText("Please enter the customer name");
            alert.setTitle("Invalid Input");

            alert.showAndWait().ifPresent(response -> {
                if (response == ButtonType.OK) {

                }

            });

        }else if(text2.getText().isEmpty()){

            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setContentText("Please enter the credit card number");
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
