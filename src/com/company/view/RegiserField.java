package com.company.view;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class RegiserField extends VBox
{

    private Stage registerStage;
    private Label warning;
    private TextField nameTF;
    private TextField lastnameTF;
    private TextField idTF;
    private TextField usernameTF;
    private PasswordField passwordTF;
    private PasswordField passwordTF2;
    private Button okButton;
    private Button cancelButton;

    public void setWarning(Label warning) {
        this.warning = warning;
    }

    public void setNameTF(TextField nameTF) {
        this.nameTF = nameTF;
    }

    public void setLastnameTF(TextField lastnameTF) {
        this.lastnameTF = lastnameTF;
    }

    public void setIdTF(TextField idTF) {
        this.idTF = idTF;
    }

    public void setUsernameTF(TextField usernameTF) {
        this.usernameTF = usernameTF;
    }

    public void setPasswordTF(PasswordField passwordTF) {
        this.passwordTF = passwordTF;
    }

    public void setPasswordTF2(PasswordField passwordTF2) {
        this.passwordTF2 = passwordTF2;
    }


    public Stage getRegisterStage() {
        return registerStage;
    }

    public Label getWarning() {
        return warning;
    }

    public TextField getNameTF() {
        return nameTF;
    }

    public TextField getLastnameTF() {
        return lastnameTF;
    }

    public TextField getIdTF() {
        return idTF;
    }

    public TextField getUsernameTF() {
        return usernameTF;
    }

    public PasswordField getPasswordTF() {
        return passwordTF;
    }

    public PasswordField getPasswordTF2() {
        return passwordTF2;
    }

    public Button getOkButton() {
        return okButton;
    }

    public Button getCancelButton() {
        return cancelButton;
    }

    public  RegiserField()
    {
        registerStage=new Stage();

        //warning label:
        warning=new Label("");
        BorderPane borderPane=new BorderPane();
        borderPane.setCenter(warning);
        this.getChildren().add(borderPane);
        warning.setStyle("-fx-background-color: red");

        //name area:
        Label nameLabel=new Label("Name :        ");
        nameLabel.setStyle("-fx-font-weight: bold");
        nameTF=new TextField();

        HBox nameAreaHbox=new HBox();
        nameAreaHbox.getChildren().add(nameLabel);
        nameAreaHbox.getChildren().add(nameTF);

        nameAreaHbox.setPadding(new Insets( 0 , 0, 0 , 0));
        nameAreaHbox.setAlignment(Pos.CENTER);

        this.getChildren().add(nameAreaHbox);

        //lastname area:
        Label lastnameLabel=new Label("Lastname : ");
        lastnameLabel.setStyle("-fx-font-weight: bold");
        lastnameTF=new TextField();

        HBox lastnameAreaHbox=new HBox();
        lastnameAreaHbox.getChildren().add(lastnameLabel);
        lastnameAreaHbox.getChildren().add(lastnameTF);

        lastnameAreaHbox.setPadding(new Insets( 0 , 0, 0 , 0));
        lastnameAreaHbox.setAlignment(Pos.CENTER);

        this.getChildren().add(lastnameAreaHbox);

        //id area:
        Label idLabel=new Label("ID :               ");
        idLabel.setStyle("-fx-font-weight: bold");
        idTF=new TextField();

        HBox idAreaHbox=new HBox();
        idAreaHbox.getChildren().add(idLabel);
        idAreaHbox.getChildren().add(idTF);

        idAreaHbox.setPadding(new Insets( 0 , 0, 0 , 0));
        idAreaHbox.setAlignment(Pos.CENTER);

        this.getChildren().add(idAreaHbox);

        //username area:
        Label usernameLabel=new Label("Username : ");
        usernameLabel.setStyle("-fx-font-weight: bold");
        usernameTF=new TextField();

        HBox usernameAreaHbox=new HBox();
        usernameAreaHbox.getChildren().add(usernameLabel);
        usernameAreaHbox.getChildren().add(usernameTF);

        usernameAreaHbox.setPadding(new Insets( 0 , 0, 0 , 0));
        usernameAreaHbox.setAlignment(Pos.CENTER);

        this.getChildren().add(usernameAreaHbox);

        //password area:
        Label passwordLabel=new Label("Password : ");
        passwordLabel.setStyle("-fx-font-weight: bold");
        passwordTF=new PasswordField();

        HBox passwordAreaHbox=new HBox();
        passwordAreaHbox.getChildren().add(passwordLabel);
        passwordAreaHbox.getChildren().add(passwordTF);

        passwordAreaHbox.setPadding(new Insets( 0 , 0, 0 , 0));
        passwordAreaHbox.setAlignment(Pos.CENTER);

        this.getChildren().add(passwordAreaHbox);

        //repear password area:
        Label passwordLabel2=new Label("Password : ");
        passwordLabel2.setStyle("-fx-font-weight: bold");
        passwordTF2=new PasswordField();

        HBox passwordAreaHbox2=new HBox();
        passwordAreaHbox2.getChildren().addAll(passwordLabel2,passwordTF2);

        passwordAreaHbox2.setPadding(new Insets( 0 , 0, 0 , 0));
        passwordAreaHbox2.setAlignment(Pos.CENTER);

        this.getChildren().add(passwordAreaHbox2);

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


        ////////////////////////////////////

        this.setPadding( new Insets( 0 , 10 , 0 , 10 ));
        this.setAlignment(Pos.CENTER);

        this.setSpacing(5);


        BorderPane registerBP=new BorderPane();
        registerBP.setCenter(this);

        Scene registerScene=new Scene(registerBP);
        registerStage.setScene(registerScene);
        registerStage.setTitle("Register");
        registerStage.show();

    }
}
