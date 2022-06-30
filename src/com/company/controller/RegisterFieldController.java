package com.company.controller;

import com.company.model.User;
import com.company.view.RegiserField;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.stage.Stage;

public class RegisterFieldController
{
    RegiserField regiserField;

    public RegisterFieldController(User newuser , Stage LS)
    {
        regiserField=new RegiserField();
        initButton(newuser,LS);
    }
    private void initButton(User newuser, Stage LS)
    {
        regiserField.getOkButton().setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent)
            {
                if (regiserField.getPasswordTF().getText().equals(regiserField.getPasswordTF2().getText()) && !regiserField.getPasswordTF().getText().equals("") &&
                        !regiserField.getNameTF().getText().equals("") && !regiserField.getLastnameTF().getText().equals("") && !regiserField.getIdTF().getText().equals("") &&
                        !regiserField.getUsernameTF().getText().equals("") )
                {
                    User.addINFO(newuser,
                            regiserField.getNameTF(),
                            regiserField.getLastnameTF(),
                            regiserField.getIdTF(),
                            regiserField.getUsernameTF(),
                            regiserField.getPasswordTF());
                    regiserField.getRegisterStage().close();
                    LS.show();

                    RegisterMassageFieldController registerMassageFieldController=new RegisterMassageFieldController();

                }
                else
                {
                    if (!regiserField.getPasswordTF().getText().equals(regiserField.getPasswordTF2().getText()) && !(regiserField.getPasswordTF().getText().equals("") ||
                            regiserField.getNameTF().getText().equals("") || regiserField.getLastnameTF().getText().equals("") || regiserField.getIdTF().getText().equals("") ||
                            regiserField.getUsernameTF().getText().equals("")))
                    {
                        regiserField.getWarning().setText("Passwords dont match!!!");
                    }
                    else if ((!regiserField.getPasswordTF().getText().equals(regiserField.getPasswordTF2().getText())) && (regiserField.getPasswordTF().getText().equals("") ||
                            regiserField.getNameTF().getText().equals("") || regiserField.getLastnameTF().getText().equals("") || regiserField.getIdTF().getText().equals("") ||
                            regiserField.getUsernameTF().getText().equals("")))
                    {
                        regiserField.getWarning().setText("Passwords dont match!!! Complete all the fields!!!");
                    }
                    else
                    {
                        regiserField.getWarning().setText("Complete all the fields!!!");
                    }
                }

            }
        });

        regiserField.getCancelButton().setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent)
            {
                regiserField.getRegisterStage().close();
                LS.show();
            }
        });
    }
}
