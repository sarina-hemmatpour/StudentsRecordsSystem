package com.company.model;

import com.company.controller.AccountFieldController;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

import java.util.ArrayList;

public class User
{
    private String name;
    private String lastname;
    private String id;
    private String username;
    private String password;


    public static int userINindex=-1    ;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public static boolean check(TextField usernameTF , PasswordField passwordTF , Label label)
    {
        boolean flag=false;
        int index=0;
        for (int i = 0; i< AccountFieldController.getUsers().size() ; i++)
        {
            if(usernameTF.getText().equals(AccountFieldController.getUsers().get(i).getUsername()))
            {
                flag=true;
                index=i;
                break;
            }
        }

        if (flag)
        {
            if (passwordTF.getText().equals(AccountFieldController.getUsers().get(index).getPassword()))
            {
                userINindex=index;
                return true;
            }
            else
            {
                //pwqame eshtebah budane passqword
                label.setText("The password is not correct");
                return false;
            }
        }
        else
        {
            //labele eshtebah budane username
            label.setText("There's no user with this username!");
            return false;
        }
    }

    public static void addINFO(User newuser, TextField name, TextField lastname, TextField id,
                               TextField username, PasswordField password)
    {
        newuser.setName(name.getText());
        newuser.setLastname(lastname.getText());
        newuser.setId(id.getText());
        newuser.setUsername(username.getText());
        newuser.setPassword(password.getText());

        AccountFieldController.getUsers().add(newuser);

    }



}
