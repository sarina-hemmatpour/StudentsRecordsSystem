package com.company.controller;

import com.company.view.RgisterMassageField;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class RegisterMassageFieldController
{
    private RgisterMassageField  registerMassageField;

    public RegisterMassageFieldController()
    {
        registerMassageField= new RgisterMassageField();


        registerMassageField.getRmButton().setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                registerMassageField.getRmStage().close();
            }
        });
    }
}
