package sample;

import javafx.application.Platform;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class ManageCustomerController {



    @FXML private Pane _customer;
    @FXML
    private TableView tabel;
    @FXML
    private TableColumn nameColumn;
    @FXML
    private TableColumn cardColumn;

    @FXML
    public void initialize(){

        nameColumn.setCellValueFactory(new PropertyValueFactory<Customers,String>("name"));
        cardColumn.setCellValueFactory(new PropertyValueFactory<Customers,String>("cardNum"));

        tabel.setItems(getCustomers());

    }


    //Get all of the products
    public ObservableList<Customers> getCustomers(){
        ObservableList<Customers> customer = FXCollections.observableArrayList();
        customer.add(new Customers("emma", "1234"));
        customer.add(new Customers("Bouncy Aiden", "12345"));
         customer.add(new Customers("Alexa", "87654"));
        customer.add(new Customers("Corny Corn", "123"));
        return customer;
    }



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
            stage.setTitle("Modify customer");
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
