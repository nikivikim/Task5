package com.example.task5;

import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;

public class Nose extends Circle {
    public Nose(){
        super(5, Color.BLUE);
    }

    public void Left(Pane pane){
        super.setCenterX(pane.getWidth() / 2 - 10);
        super.setCenterY(pane.getHeight() / 2 + 30);
    }

    public void Right(Pane pane){
        super.setCenterX(pane.getWidth() / 2 + 10);
        super.setCenterY(pane.getHeight() / 2 + 30);
    }
}