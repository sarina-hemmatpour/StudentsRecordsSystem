package com.company.controller;

import com.company.model.Student;
import com.company.view.AddStudentField;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.TableView;
import javafx.scene.layout.BorderPane;

public class AddStudentFieldController
{
    private AddStudentField addStudentField;
    private Student newStudent;

    public AddStudentFieldController(TableView tableView)
    {
        addStudentField=new AddStudentField();
        newStudent=new Student();

        initButton(tableView);
    }

    private void initButton(TableView tableView)
    {
        addStudentField.getOkButton().setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                if (!addStudentField.getMajorTF().getText().equals("") && !addStudentField.getNameTF().getText().equals("") &&
                        !addStudentField.getLastnameTF().getText().equals("") && !addStudentField.getIdTF().getText().equals("") &&
                        !addStudentField.getPhoneNumberTF().getText().equals("") )
                {
                    Student.addINFO(newStudent,
                            addStudentField.getNameTF(),
                            addStudentField.getLastnameTF(),
                            addStudentField.getIdTF(),
                            addStudentField.getMajorTF(),
                            addStudentField.getPhoneNumberTF());
                    addStudentField.getAddStudentStage().close();
                    tableView.getItems().add(AccountFieldController.getStudents().get(AccountFieldController.getStudents().size()-1));
                    tableView.refresh();

                    AddMassageFieldController addMassageFieldController=new AddMassageFieldController();
                }
                else
                {
                    addStudentField.getWarning().setText("Complete all the fields!!!");
                }
            }
        });

        //cancel button:
        addStudentField.getCancelButton().setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                addStudentField.getAddStudentStage().close();
            }
        });
    }
}
