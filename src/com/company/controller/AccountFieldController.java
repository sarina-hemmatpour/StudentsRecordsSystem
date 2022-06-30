package com.company.controller;

import com.company.model.Student;
import com.company.model.User;
import com.company.view.AccountField;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.stage.Stage;

import java.util.ArrayList;

public class AccountFieldController
{
    private AccountField accountField;


    private static ArrayList<Student> students=new ArrayList<>();

    public static ArrayList<Student> getStudents() {
        return students;
    }

    public static void setStudents(ArrayList<Student> students) {
        AccountFieldController.students = students;
    }



    private static ArrayList<User> users = new ArrayList<>();

    public static ArrayList<User> getUsers() {
        return users;
    }

    public static void setUsers(ArrayList<User> users) {
        AccountFieldController.users = users;
    }



    public AccountFieldController(Stage lStage)
    {
        accountField=new AccountField();
        initButton(lStage);
    }

    private void initButton(Stage lStage)
    {
        accountField.getExitButton().setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                accountField.getAccountStage().close();
                lStage.show();

            }
        });

        accountField.getAddStudentButton().setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent)
            {
                AddStudentFieldController addStudentFieldController=new AddStudentFieldController(accountField.getStudentsTable());
            }
        });

        accountField.getEditInfoButon().setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                EditStudentFieldController editStudentFieldController=new EditStudentFieldController(accountField.getStudentsTable());
            }
        });

        accountField.getRemoveStudentButton().setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                int indexToremove=AccountFieldController.getStudents().indexOf(accountField.getStudentsTable().getSelectionModel().getSelectedItem());
                AccountFieldController.getStudents().remove(indexToremove);
                for ( int i = 0; i<accountField.getStudentsTable().getItems().size(); i++) {
                    accountField.getStudentsTable().getItems().clear();
                }
                for (int i=0 ; i<AccountFieldController.getStudents().size() ; i++)
                {
                    accountField.getStudentsTable().getItems().add(AccountFieldController.getStudents().get(i));
                }
                accountField.getStudentsTable().refresh();
            }
        });

    }
}
