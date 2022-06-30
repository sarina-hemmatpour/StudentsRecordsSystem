package com.company.view;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class LoginField extends VBox
{

    private Stage loginstage;
    private TextField usernameTF;
    private PasswordField passwordTF;
    private Label warningLabel;
    private Button okButton;
    private Button registerButton;

    public Stage getLoginstage() {
        return loginstage;
    }

    public TextField getUsernameTF() {
        return usernameTF;
    }

    public void setUsernameTF(TextField usernameTF) {
        this.usernameTF = usernameTF;
    }

    public PasswordField getPasswordTF() {
        return passwordTF;
    }

    public void setPasswordTF(PasswordField passwordTF) {
        this.passwordTF = passwordTF;
    }

    public Label getWarningLabel() {
        return warningLabel;
    }

    public void setWarningLabel(Label warningLabel) {
        this.warningLabel = warningLabel;
    }

    public Button getOkButton() {
        return okButton;
    }

    public Button getRegisterButton() {
        return registerButton;
    }


    public LoginField()
    {

        loginstage =new Stage();

        //warning area
        warningLabel=new Label("");
        BorderPane borderPane=new BorderPane();
        borderPane.setCenter(warningLabel);
        this.getChildren().add(borderPane);
        warningLabel.setStyle("-fx-background-color: red");

        //username area:
        Label usernameLabel=new Label("Username : ");
        usernameLabel.setStyle("-fx-font-weight: bold");
        BorderPane usernameLabelBP=new BorderPane();
        usernameLabelBP.setCenter(usernameLabel);
        this.getChildren().add(usernameLabelBP);

        usernameTF=new TextField();
        this.getChildren().add(usernameTF);

        //Passwprd area:
        Label passwordLabel=new Label("Password : ");
        passwordLabel.setStyle("-fx-font-weight: bold");
        BorderPane passwordLabelBP=new BorderPane();
        passwordLabelBP.setCenter(passwordLabel);
        this.getChildren().add(passwordLabelBP);

        passwordTF=new PasswordField();
        this.getChildren().add(passwordTF);

        //buttton for ok:
        okButton =new Button("OK");
        BorderPane okButtonBP=new BorderPane();
        okButtonBP.setCenter(okButton);
        this.getChildren().add(okButtonBP);
        okButton.setStyle("-fx-background-color: green");

        //button for register:
        registerButton=new Button("Register");
        BorderPane registerButtonBP=new BorderPane();
        registerButtonBP.setCenter(registerButton);
        this.getChildren().add(registerButtonBP);
        registerButton.setStyle("-fx-background-color: yellow;");


        this.setSpacing(5);

        BorderPane loginBP=new BorderPane();
        loginBP.setCenter(this);

        Scene loginScene= new Scene(loginBP);

        loginstage.setScene(loginScene);
        loginstage.setTitle("Login");
        loginstage.show();
    }
}
