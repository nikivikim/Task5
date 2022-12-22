package com.example.task5;

import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class Head extends Circle {
    public Head(Pane pane){
        super(100);
        super.setFill(Color.YELLOW);
        super.setStroke(Color.RED);
        super.setStrokeWidth(5);
        super.setCenterX(pane.getWidth() / 2);
        super.setCenterY(pane.getHeight() / 2);
    }
    public void HappySmiley(Pane pane){
        setFill(Color.YELLOW);
    }
}