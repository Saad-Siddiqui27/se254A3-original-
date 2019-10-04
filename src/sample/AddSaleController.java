package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class AddSaleController {

    @FXML
    private Button Confirm;

    public void confirm(){

        Stage stage = (Stage) Confirm.getScene().getWindow();
        stage.close();

    }


    public void cancel(){

        Stage stage = (Stage) Confirm.getScene().getWindow();
        stage.close();


    }

}
