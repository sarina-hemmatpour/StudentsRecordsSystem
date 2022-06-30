package com.company.controller;

import com.company.view.AddMassageField;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class AddMassageFieldController
{

    private AddMassageField addMassageField;


    public AddMassageFieldController()
    {
        addMassageField=new AddMassageField();

        addMassageField.getAsmButton().setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                addMassageField.getAsmStage().close();
            }
        });

    }
}
