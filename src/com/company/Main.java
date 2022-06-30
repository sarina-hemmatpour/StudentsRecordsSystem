package com.company;

import com.company.controller.LoginFieldController;
import javafx.application.Application;
import javafx.stage.Stage;

public class Main extends Application {


    @Override
    public void start(Stage stage) throws Exception {

        LoginFieldController loginFieldController=new LoginFieldController();

    }

    public static void main(String[] args) {
        launch(args);
    }

}
