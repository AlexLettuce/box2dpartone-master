package com.mygdx.game;


import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.physics.box2d.CircleShape;

import java.awt.*;

public class Level {
    public static void Level(int levelId) {
        CircleShape shape = new CircleShape();
        shape.setRadius(5);
        if(Gdx.input.isButtonPressed(Input.Buttons.LEFT)) {
            EasyStaticShape g = new EasyStaticShape(((float) Gdx.input.getX()/Gdx.graphics.getWidth())*pj.camera.viewportWidth, ((float) Gdx.input.getY()/Gdx.graphics.getHeight())*pj.camera.viewportHeight, shape, 1, 1);
        }
    }
}
