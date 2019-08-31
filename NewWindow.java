package sample;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.stage.Window;
import sample.Data.Contact;
import sample.Data.DataModel;

import javax.lang.model.type.ErrorType;
import javax.xml.crypto.Data;
import java.util.Optional;

public class NewWindow {
    @FXML
    private TextField firstNameField;
    @FXML
    private TextField lastNameField;
    @FXML
    private TextField phoneNumberField;
    @FXML
    GridPane gridPane;
    @FXML
    Button addButton;


    public void addContact(){
       Stage stage=(Stage) gridPane.getScene().getWindow();

        String firstName=firstNameField.getText();
        String lastName=lastNameField.getText();
        String phoneNumber=phoneNumberField.getText();
        if (lastName.isEmpty()||firstName.isEmpty()||phoneNumber.isEmpty()){
            Alert error=new Alert(Alert.AlertType.ERROR);
            error.setTitle("Incomplete fields");
            error.setHeaderText("Please fill all fields");
            error.showAndWait();
        }
        else {

            Contact contact = new Contact(firstName, lastName, phoneNumber);
            DataModel.getInstance().addData(contact);
            stage.close();
        }


    }

    public void cancelButton(){
        Stage stage=(Stage) lastNameField.getScene().getWindow();
        stage.close();
    }
}
