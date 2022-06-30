package com.company.view;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class EditMassageField extends VBox
{
    private Stage asmStage;
    private Button asmButton;

    public Stage getAsmStage() {
        return asmStage;
    }

    public void setAsmStage(Stage asmStage) {
        this.asmStage = asmStage;
    }

    public Button getAsmButton() {
        return asmButton;
    }

    public void setAsmButton(Button asmButton) {
        this.asmButton = asmButton;
    }

    public EditMassageField()
    {
        asmStage=new Stage();
        asmStage.setTitle("Add a Student");


        Label asmLabel=new Label("Congrates!!! The student is added successfully.");
        this.getChildren().add(asmLabel);

        Button asmButton=new Button("OK");
        BorderPane asmBP=new BorderPane();
        asmBP.setCenter(asmButton);
        this.getChildren().add(asmBP);
        asmButton.setStyle("-fx-background-color: green");

        Scene asmScene=new Scene(this);
        asmStage.setScene(asmScene);
        asmStage.show();
    }
}
