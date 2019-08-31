package sample;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import sample.Data.Contact;
import sample.Data.DataModel;

public class NewWindow1 {
    @FXML
    private TextField firstNameField;
    @FXML
    private TextField lastNameField;
    @FXML
    private TextField phoneNumberField;
    @FXML
    GridPane gridPane;
    @FXML
    Button updateButton;

    public void editContact(Contact contact){

            firstNameField.setText(contact.getfName());
            lastNameField.setText(contact.getlName());
            phoneNumberField.setText(contact.getMobo());
            return;



    }
    public void updateContact(Contact contact){
        Stage stage=(Stage) gridPane.getScene().getWindow();
        updateButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
            contact.setfName(firstNameField.getText());
            contact.setlName(lastNameField.getText());
            contact.setMobo(phoneNumberField.getText());
            stage.close();
            }
        });
    }
}
