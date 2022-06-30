package com.company.view;

import com.company.controller.AccountFieldController;
import com.company.model.Student;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class EditStudentField extends VBox
{

    private Stage editStudentStage;
    private Label warning;
    private TextField nameTF;
    private TextField lastnameTF;
    private TextField idTF;
    private TextField majorTF;
    private TextField phoneNumberTF;
    private Button okButton;
    private Button cancelButton;


    public Stage getEditStudentStage() {
        return editStudentStage;
    }

    public void setEditStudentStage(Stage editStudentStage) {
        this.editStudentStage = editStudentStage;
    }

    public Label getWarning() {
        return warning;
    }

    public void setWarning(Label warning) {
        this.warning = warning;
    }

    public TextField getNameTF() {
        return nameTF;
    }

    public void setNameTF(TextField nameTF) {
        this.nameTF = nameTF;
    }

    public TextField getLastnameTF() {
        return lastnameTF;
    }

    public void setLastnameTF(TextField lastnameTF) {
        this.lastnameTF = lastnameTF;
    }

    public TextField getIdTF() {
        return idTF;
    }

    public void setIdTF(TextField idTF) {
        this.idTF = idTF;
    }

    public TextField getMajorTF() {
        return majorTF;
    }

    public void setMajorTF(TextField majorTF) {
        this.majorTF = majorTF;
    }

    public TextField getPhoneNumberTF() {
        return phoneNumberTF;
    }

    public void setPhoneNumberTF(TextField phoneNumberTF) {
        this.phoneNumberTF = phoneNumberTF;
    }

    public Button getOkButton() {
        return okButton;
    }

    public void setOkButton(Button okButton) {
        this.okButton = okButton;
    }

    public Button getCancelButton() {
        return cancelButton;
    }

    public void setCancelButton(Button cancelButton) {
        this.cancelButton = cancelButton;
    }

    public EditStudentField(TableView tableView , int indexTOedit)
    {
        editStudentStage = new Stage();
        editStudentStage.setTitle("Edit a Student");



        //warning
        warning=new Label("");
        BorderPane borderPane=new BorderPane();
        borderPane.setCenter(warning);
        this.getChildren().addAll(borderPane);
        warning.setStyle("-fx-background-color: red");

        //name area:
        Label nameLabel=new Label("Name :                 ");
        nameLabel.setStyle("-fx-font-weight: bold");
        nameTF=new TextField();
        nameTF.setText(AccountFieldController.getStudents().get(indexTOedit).getStudentName());

        HBox nameAreaHbox=new HBox();
        nameAreaHbox.getChildren().add(nameLabel);
        nameAreaHbox.getChildren().add(nameTF);

        nameAreaHbox.setPadding(new Insets( 0 , 0, 0 , 0));
        nameAreaHbox.setAlignment(Pos.CENTER);

        this.getChildren().add(nameAreaHbox);

        //lastname area:
        Label lastnameLabel=new Label("Lastname :          ");
        lastnameLabel.setStyle("-fx-font-weight: bold");
        lastnameTF=new TextField();
        lastnameTF.setText(AccountFieldController.getStudents().get(indexTOedit).getStudentLastname());

        HBox lastnameAreaHbox=new HBox();
        lastnameAreaHbox.getChildren().add(lastnameLabel);
        lastnameAreaHbox.getChildren().add(lastnameTF);

        lastnameAreaHbox.setPadding(new Insets( 0 , 0, 0 , 0));
        lastnameAreaHbox.setAlignment(Pos.CENTER);

        this.getChildren().add(lastnameAreaHbox);

        //id area:
        Label idLabel=new Label("ID :                       ");
        idLabel.setStyle("-fx-font-weight: bold");
        idTF=new TextField();
        idTF.setText(AccountFieldController.getStudents().get(indexTOedit).getStudentid());

        HBox idAreaHbox=new HBox();
        idAreaHbox.getChildren().add(idLabel);
        idAreaHbox.getChildren().add(idTF);

        idAreaHbox.setPadding(new Insets( 0 , 0, 0 , 0));
        idAreaHbox.setAlignment(Pos.CENTER);

        this.getChildren().add(idAreaHbox);

        //major area:
        Label majorLabel=new Label("Major :                ");
        majorLabel.setStyle("-fx-font-weight: bold");
        majorTF=new TextField();
        majorTF.setText(AccountFieldController.getStudents().get(indexTOedit).getStudentMajor());

        HBox majorAreaHbox=new HBox();
        majorAreaHbox.getChildren().add(majorLabel);
        majorAreaHbox.getChildren().add(majorTF);

        majorAreaHbox.setPadding(new Insets( 0 , 0, 0 , 0));
        majorAreaHbox.setAlignment(Pos.CENTER);

        this.getChildren().add(majorAreaHbox);

        //phone number area:
        Label phoneNumberLabel=new Label("Phone Number : ");
        phoneNumberLabel.setStyle("-fx-font-weight: bold");
        phoneNumberTF=new TextField();
        phoneNumberTF.setText(AccountFieldController.getStudents().get(indexTOedit).getStudentPhoneNumber());

        HBox phoneNumberAreaHbox=new HBox();
        phoneNumberAreaHbox.getChildren().add(phoneNumberLabel);
        phoneNumberAreaHbox.getChildren().add(phoneNumberTF);

        phoneNumberAreaHbox.setPadding(new Insets( 0 , 0, 0 , 0));
        phoneNumberAreaHbox.setAlignment(Pos.CENTER);

        this.getChildren().add(phoneNumberAreaHbox);

        //ok button:
        okButton=new Button("OK");
        BorderPane okButtonBP=new BorderPane();
        okButtonBP.setCenter(okButton);
        this.getChildren().add(okButtonBP);
        okButton.setStyle("-fx-background-color: green");


        //cancel button:
        cancelButton=new Button("Cancel");
        BorderPane cancelButtonBP=new BorderPane();
        cancelButtonBP.setCenter(cancelButton);
        this.getChildren().add(cancelButtonBP);
        cancelButton.setStyle("-fx-background-color: red");


        this.setPadding(new Insets(0,10,0,10));
        this.setAlignment(Pos.CENTER);

        this.setSpacing(5);

        Scene editStudentScene=new Scene(this);
        editStudentStage.setScene(editStudentScene);
        editStudentStage.show();
    }
}
