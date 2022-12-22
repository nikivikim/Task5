package com.example.task5;

import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;

public class Mouth extends Arc {

    public Mouth(){
        super.setFill(Color.TRANSPARENT);
        super.setStrokeWidth(4);
        super.setStroke(Color.BLACK);
        super.setType(ArcType.OPEN);
    }
    public void SadMouth(Pane pane){
        super.setCenterX(pane.getWidth() / 2);
        super.setCenterY(pane.getHeight() / 2 + 65);
        super.setRadiusX(20);
        super.setRadiusY(20);
        super.setStartAngle(360);
        super.setLength(180);
    }
    public void HappyMouth(Pane pane){
        super.setCenterX(pane.getWidth() / 2);
        super.setCenterY(pane.getHeight() / 2 + 60);
        super.setRadiusX(50);
        super.setRadiusY(20);
        super.setStartAngle(180);
        super.setLength(180);
    }
    public void StaticMouth(Pane pane){
        super.setFill(Color.RED);
        super.setCenterX(pane.getWidth() / 2);
        super.setCenterY(pane.getHeight() / 2 + 60);
        super.setRadiusX(50);
        super.setRadiusY(20);
        super.setStartAngle(360);
        super.setLength(360);
    }
}
