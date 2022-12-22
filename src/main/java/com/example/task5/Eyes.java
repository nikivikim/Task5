package com.example.task5;

import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class Eyes extends Circle {
    public Eyes(){
        super(15, Color.GREEN);
    }

    public void LeftEye(Pane pane){
        super.setCenterX(pane.getWidth() / 2 - 20);
        super.setCenterY(pane.getHeight() / 2 - 20);
    }

    public void RightEye(Pane pane){
        super.setCenterX(pane.getWidth() / 2 + 20);
        super.setCenterY(pane.getHeight() / 2 - 20);
    }
}
