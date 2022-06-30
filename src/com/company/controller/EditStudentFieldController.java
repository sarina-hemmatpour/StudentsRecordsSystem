package com.company.controller;

import com.company.model.Student;
import com.company.view.EditStudentField;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.TableView;

public class EditStudentFieldController
{
    EditStudentField editStudentField;

    public EditStudentFieldController(TableView tableView )
    {
        int indexTOedit= AccountFieldController.getStudents().indexOf(tableView.getSelectionModel().getSelectedItem());
        editStudentField=new EditStudentField(tableView,indexTOedit);
        initButton(indexTOedit,tableView);

    }

    private void initButton(int indexTOedit , TableView tableView)
    {

        editStudentField.getOkButton().setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                if (!editStudentField.getMajorTF().getText().equals("") && !editStudentField.getNameTF().getText().equals("") &&
                        !editStudentField.getLastnameTF().getText().equals("") && !editStudentField.getIdTF().getText().equals("") &&
                        !editStudentField.getPhoneNumberTF().getText().equals(""))
                {
                    AccountFieldController.getStudents().get(indexTOedit).setStudentName(editStudentField.getNameTF().getText());
                    AccountFieldController.getStudents().get(indexTOedit).setStudentLastname(editStudentField.getLastnameTF().getText());
                    AccountFieldController.getStudents().get(indexTOedit).setStudentMajor(editStudentField.getMajorTF().getText());
                    AccountFieldController.getStudents().get(indexTOedit).setStudentid(editStudentField.getIdTF().getText());
                    AccountFieldController.getStudents().get(indexTOedit).setStudentPhoneNumber(editStudentField.getPhoneNumberTF().getText());

                    tableView.refresh();
                    editStudentField.getEditStudentStage().close();

                    EditMassageFieldController editMassageFieldController=new EditMassageFieldController();
                }
                else
                {
                    editStudentField.getWarning().setText("Complete all the fields!!!");
                }
            }
        });

        editStudentField.getCancelButton().setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                editStudentField.getEditStudentStage().close();
            }
        });
    }
}
