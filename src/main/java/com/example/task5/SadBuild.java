package com.example.task5;

import javafx.scene.layout.Pane;

public class SadBuild extends Pane implements Builder {
    private Smile smiley = new Smile();

    public SadBuild(){
        setHeight(400);
        setWidth(400);
    }

    @Override
    public void buildBrows() {
        Brows[] browns = new Brows[]{
                new Brows(),
                new Brows()
        };

        browns[0].SadRightBrow(this);
        browns[1].SadLeftBrow(this);

        this.smiley.setBrows(browns);
    }
    @Override
    public void buildHead() {
        Head head = new Head(this);
        head.HappySmiley(this);
        this.smiley.setHead(head);
    }

    @Override
    public void buildEyes() {
        Eyes [] eyes = new Eyes[]{
                new Eyes(),
                new Eyes()
        };
        eyes[0].LeftEye(this);
        eyes[1].RightEye(this);
        this.smiley.setEyes(eyes);
    }

    @Override
    public void buildNose() {
        Nose[] nose = new Nose[]{
                new Nose(),
                new Nose()
        };
        nose[0].Left(this);
        nose[1].Right(this);
        this.smiley.setNose(nose);
    }

    @Override
    public void buildMouth() {
        Mouth mouth = new Mouth();
        mouth.SadMouth(this);
        this.smiley.setMouth(mouth);
    }

    @Override
    public Smile getSmile() {
        return smiley;
    }
}