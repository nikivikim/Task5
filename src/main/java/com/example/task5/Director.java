package com.example.task5;

public class Director {
    public Smile construct(Builder builder) {
        builder.buildHead();
        builder.buildEyes();
        builder.buildBrows();
        builder.buildNose();
        builder.buildMouth();
        return builder.getSmile();
    }
}
