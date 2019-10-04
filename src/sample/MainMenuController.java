package sample;

import javafx.fxml.FXML;
import javafx.scene.layout.Pane;

import java.io.IOException;

public class MainMenuController {

    @FXML
    private Pane menu;





    public void switchToSales()  {

        try {
            SwitchScenes sw = new SwitchScenes(menu);
            sw.switchScenes("ManageSales.fxml");
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    public void switchToCustomers()  {

        try {
            SwitchScenes sw = new SwitchScenes(menu);
            sw.switchScenes("ManageCustomers.fxml");
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    public void switchToProducts()  {

        try {
            SwitchScenes sw = new SwitchScenes(menu);
            sw.switchScenes("ManageProducts.fxml");
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

}
