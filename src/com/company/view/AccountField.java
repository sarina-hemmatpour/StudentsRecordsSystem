package com.company.view;

import com.company.controller.AccountFieldController;
import com.company.model.Student;
import com.company.model.User;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class AccountField extends VBox
{

    private Button exitButton;
    private Button addStudentButton;
    private Button editInfoButon;
    private Button removeStudentButton;
    private Stage accountStage;
    private TableView studentsTable;

    public TableView getStudentsTable() {
        return studentsTable;
    }

    public void setStudentsTable(TableView studentsTable) {
        this.studentsTable = studentsTable;
    }

    public Stage getAccountStage() {
        return accountStage;
    }

    public void setAccountStage(Stage accountStage) {
        this.accountStage = accountStage;
    }

    public Button getExitButton() {
        return exitButton;
    }

    public void setExitButton(Button exitButton) {
        this.exitButton = exitButton;
    }

    public Button getAddStudentButton() {
        return addStudentButton;
    }

    public void setAddStudentButton(Button addStudentButton) {
        this.addStudentButton = addStudentButton;
    }

    public Button getEditInfoButon() {
        return editInfoButon;
    }

    public void setEditInfoButon(Button editInfoButon) {
        this.editInfoButon = editInfoButon;
    }

    public Button getRemoveStudentButton() {
        return removeStudentButton;
    }

    public void setRemoveStudentButton(Button removeStudentButton) {
        this.removeStudentButton = removeStudentButton;
    }

    public AccountField()
    {
        accountStage=new Stage();
        accountStage.setTitle("Account");


        BorderPane adminInfoBP=new BorderPane();

        //admins' infor mation
        String temp="";
        temp+= AccountFieldController.getUsers().get(User.userINindex).getName();
        temp+=" ";
        temp+=AccountFieldController.getUsers().get(User.userINindex).getLastname();
        Label adminInfo=new Label(temp);
        adminInfo.setFont(new Font("Arial",17));
        adminInfo.setStyle("-fx-font-weight: bold");
        adminInfoBP.setLeft(adminInfo);

        //exit button
        exitButton=new Button("Exit");
        adminInfoBP.setRight(exitButton);

        this.getChildren().add(adminInfoBP);
        exitButton.setStyle("-fx-background-color: red");

        //tabel
        studentsTable=new TableView();

        ///////////

        TableColumn<String, Student> tableColumnName=new TableColumn("Name");
        tableColumnName.setCellValueFactory(new PropertyValueFactory<>("studentName"));
        tableColumnName.prefWidthProperty().bind(studentsTable.widthProperty().divide(5));

        TableColumn tableColumnLastname=new TableColumn("Lastname");
        tableColumnLastname.setCellValueFactory(new PropertyValueFactory<>("studentLastname"));
        tableColumnLastname.prefWidthProperty().bind(studentsTable.widthProperty().divide(5));

        TableColumn tableColumnId=new TableColumn("ID");
        tableColumnId.setCellValueFactory(new PropertyValueFactory<>("studentid"));
        tableColumnId.prefWidthProperty().bind(studentsTable.widthProperty().divide(5));

        TableColumn tableColumnMajor=new TableColumn("Major");
        tableColumnMajor.setCellValueFactory(new PropertyValueFactory<>("studentMajor"));
        tableColumnMajor.prefWidthProperty().bind(studentsTable.widthProperty().divide(5));

        TableColumn tableColumnPhoneNmbr=new TableColumn("Phone Number");
        tableColumnPhoneNmbr.setCellValueFactory(new PropertyValueFactory<>("studentPhoneNumber"));
//        tableColumnPhoneNmbr.prefWidthProperty().bind(studentsTable.widthProperty().multiply(0.3));
        tableColumnPhoneNmbr.prefWidthProperty().bind(studentsTable.widthProperty().divide(5));
//        studentsTable.columnResizePolicyProperty(TableView.CONSTRAINED_RESIZE_POLICY);


        //////////

        studentsTable.getColumns().addAll(tableColumnName,tableColumnLastname,
                tableColumnMajor,tableColumnId,tableColumnPhoneNmbr);

        for (int i=0 ; i<AccountFieldController.getStudents().size() ; i++)
        {
            studentsTable.getItems().add(AccountFieldController.getStudents().get(i));
        }

        this.getChildren().add(studentsTable);


        //add a student button
        addStudentButton=new Button("Add a Student");
        BorderPane firstB=new BorderPane();
        firstB.setCenter(addStudentButton);
        addStudentButton.setStyle("-fx-background-color: green");


        //edit a student's info button
        editInfoButon=new Button("Edit a Student's info");
        BorderPane secB=new BorderPane();
        secB.setCenter(editInfoButon);
        editInfoButon.setStyle("-fx-background-color: yellow");


        //remove a student Button
        removeStudentButton = new Button("Remove a Student");
        BorderPane thirdB=new BorderPane();
        thirdB.setCenter(removeStudentButton);
        removeStudentButton.setStyle("-fx-background-color: gray;");


        this.setPadding(new Insets(0,10,0,10));
        this.setAlignment(Pos.CENTER);

        this.setSpacing(5);

        this.getChildren().addAll(firstB,secB,thirdB);

        Scene accountScene=new Scene(this);

        accountStage.setScene(accountScene);

        accountStage.show();

    }
}
