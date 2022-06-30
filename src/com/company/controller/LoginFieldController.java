package com.company.controller;

import com.company.model.User;
import com.company.view.LoginField;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class LoginFieldController {

    LoginField loginField;

    public LoginFieldController()
    {
        loginField=new LoginField();
        initButton();

    }

    private void initButton()
    {
        loginField.getOkButton().setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                if(User.check(loginField.getUsernameTF(),loginField.getPasswordTF(),loginField.getWarningLabel()))
                {
                    loginField.getLoginstage().close();
                    //enter the acount
                    AccountFieldController accountFieldController=new AccountFieldController(loginField.getLoginstage());

                }
            }
        });

        loginField.getRegisterButton().setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                loginField.getLoginstage().close();
                User newuser=new User();
                RegisterFieldController registerFieldController=new RegisterFieldController(newuser,loginField.getLoginstage());
            }
        });
    }
}
