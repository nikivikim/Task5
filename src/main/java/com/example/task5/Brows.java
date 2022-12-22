package com.example.task5;

import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;

public class Brows extends Line {

    public Brows(){
        setStroke(Color.BLACK);
        super.setStrokeWidth(2);
    }
    public void HappyRightBrow(Pane pane){
        super.setStartY(150);
        super.setEndY(150);

        super.setStartX(pane.getWidth() / 2 + 20);
        super.setEndX(pane.getWidth() / 2 + 60);
    }


    public void HappyLeftBrow(Pane pane){
        super.setStartY(150);
        super.setEndY(150);

        super.setStartX(pane.getWidth() / 2 - 65);
        super.setEndX(pane.getWidth() / 2 - 25);

    }
    public void StaticLeftBrow(Pane pane){
        super.setStartY(160);
        super.setEndY(137);

        super.setStartX(pane.getWidth() / 2 - 25);
        super.setEndX(pane.getWidth() / 2 - 65);

    }
    public void StaticRightBrow(Pane pane){
        super.setStartY(137);
        super.setEndY(150);

        super.setStartX(pane.getWidth() / 2 + 60);
        super.setEndX(pane.getWidth() / 2 + 20);
    }

    public void SadLeftBrow(Pane pane){
        super.setStartY(160);
        super.setEndY(137);

        super.setStartX(pane.getWidth() / 2 - 65);
        super.setEndX(pane.getWidth() / 2 - 25);

    }

    public void SadRightBrow(Pane pane){
        super.setStartY(137);
        super.setEndY(150);

        super.setStartX(pane.getWidth() / 2 + 20);
        super.setEndX(pane.getWidth() / 2 + 60);
    }
}
