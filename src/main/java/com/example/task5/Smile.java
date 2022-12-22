package com.example.task5;


import javafx.scene.layout.Pane;

import java.util.Calendar;

public class Smile extends Pane {
    public void setHead(Head head) {getChildren().add(head);}
    public void setEyes(Eyes[] eyes) {
        for (Eyes eye : eyes) getChildren().add(eye);
    }
    public void setNose(Nose[] nose) { for (Nose nos : nose) getChildren().add(nos);}
    public void setMouth(Mouth mouth) {getChildren().add(mouth);}

    public void setBrows(Brows[] brows) {
        for (Brows brow : brows) {
            getChildren().addAll(brow);
        }
    }


}
