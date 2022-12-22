package com.example.task5;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HelloController {
    @FXML javafx.scene.layout.Pane myPane;
    Director direct = new Director();
    Smile smiley;
    public void OnBtnHappy(ActionEvent actionEvent) {
        myPane.getChildren().clear();
        smiley = direct.construct(new HappyBuild());
        myPane.getChildren().add(smiley);
    }

    public void OnBtnSad(ActionEvent actionEvent) {
        myPane.getChildren().clear();
        smiley = direct.construct(new SadBuild());
        myPane.getChildren().add(smiley);
    }

    public void OnBtnStatic(ActionEvent actionEvent) {
        myPane.getChildren().clear();
        smiley = direct.construct(new StaticBuild());
        myPane.getChildren().add(smiley);
    }

    public void OnBtnDelete(ActionEvent actionEvent) {
        myPane.getChildren().clear();
    }
}