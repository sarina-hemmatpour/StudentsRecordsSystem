package com.company.model;

import com.company.controller.AccountFieldController;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


import java.util.ArrayList;


public class Student
{
    private String studentName;
    private String studentLastname;
    private String studentid;
    private String studentMajor;
    private String studentPhoneNumber;





    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentLastname() {
        return studentLastname;
    }

    public void setStudentLastname(String studentLastname) {
        this.studentLastname = studentLastname;
    }

    public String getStudentid() {
        return studentid;
    }

    public void setStudentid(String studentid) {
        this.studentid = studentid;
    }

    public String getStudentMajor() {
        return studentMajor;
    }

    public void setStudentMajor(String studentMajor) {
        this.studentMajor = studentMajor;
    }

    public String getStudentPhoneNumber() {
        return studentPhoneNumber;
    }

//    ../viwe/accountfield
    public void setStudentPhoneNumber(String studentPhoneNumber) {
        if (studentPhoneNumber.substring(0,1).equals("0"))
        {
            String temp="+98";
            temp+=studentPhoneNumber.substring(1);
            this.studentPhoneNumber = temp;
        }
        else
        {
            this.studentPhoneNumber=studentPhoneNumber;
        }

    }


    public static void addINFO(Student newStudent, TextField name, TextField lastname, TextField id,
                               TextField major, TextField phoneNumber)
    {
        newStudent.setStudentName(name.getText());
        newStudent.setStudentLastname(lastname.getText());
        newStudent.setStudentid(id.getText());
        newStudent.setStudentMajor(major.getText());
        newStudent.setStudentPhoneNumber(phoneNumber.getText());

        AccountFieldController.getStudents().add(newStudent);
    }



}
