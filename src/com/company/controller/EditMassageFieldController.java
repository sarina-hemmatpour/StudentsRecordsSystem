package com.company.controller;

import com.company.view.EditMassageField;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class EditMassageFieldController
{
    private EditMassageField editMassageField;

    public EditMassageFieldController()
    {
        editMassageField=new EditMassageField();

        editMassageField.getAsmButton().setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                editMassageField.getAsmStage().close();
            }
        });
    }
}
