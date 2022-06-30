package com.company.view;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class RgisterMassageField extends VBox
{
    private Stage rmStage;
    private Button rmButton;

    public Stage getRmStage() {
        return rmStage;
    }

    public void setRmStage(Stage rmStage) {
        this.rmStage = rmStage;
    }

    public Button getRmButton() {
        return rmButton;
    }

    public void setRmButton(Button rmButton) {
        this.rmButton = rmButton;
    }

    public RgisterMassageField()
    {
        rmStage=new Stage();
        rmStage.setTitle("register");


        Label rmLabel=new Label("Congrates!!! You registered successfully.");
        this.getChildren().add(rmLabel);

        rmButton=new Button("OK");
        BorderPane rmBP=new BorderPane();
        rmBP.setCenter(rmButton);
        this.getChildren().add(rmBP);
        rmButton.setStyle("-fx-background-color: green");

        Scene rmScene=new Scene(this);
        rmStage.setScene(rmScene);
        rmStage.show();
    }
}
