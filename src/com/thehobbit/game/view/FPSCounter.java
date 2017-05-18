package com.thehobbit.game.view;

import javafx.animation.AnimationTimer;
import javafx.geometry.Insets;
import javafx.scene.control.Label;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.paint.Color;

/**
 * Created by mintal on 18/05/2017.
 */
public class FPSCounter extends Label {

    private final long[] frameTimes = new long[100];
    private int frameTimeIndex = 0 ;
    private boolean arrayFilled = false ;

    public FPSCounter(){
        this.setTextFill(Color.LIMEGREEN);
        this.setBackground(new Background(new BackgroundFill(Color.BLACK, CornerRadii.EMPTY,new Insets(0,0,0,0))));
        Label label = this;
        AnimationTimer frameRateMeter = new AnimationTimer() {

            @Override
            public void handle(long now) {
                long oldFrameTime = frameTimes[frameTimeIndex] ;
                frameTimes[frameTimeIndex] = now ;
                frameTimeIndex = (frameTimeIndex + 1) % frameTimes.length ;
                if (frameTimeIndex == 0) {
                    arrayFilled = true ;
                }
                if (arrayFilled) {
                    long elapsedNanos = now - oldFrameTime ;
                    long elapsedNanosPerFrame = elapsedNanos / frameTimes.length ;
                    double frameRate = 1_000_000_000.0 / elapsedNanosPerFrame ;
                    label.setText(String.format("FPS: %.2f", frameRate));
                }
            }
        };

        frameRateMeter.start();
    }

}
