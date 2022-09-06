package com.mygdx.game;


import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.physics.box2d.CircleShape;
import com.badlogic.gdx.physics.box2d.PolygonShape;

import java.awt.*;

public class Level {
    public static void Level(int levelId,Player player) {
        PolygonShape shape = new PolygonShape();
        shape.setAsBox(3,3);
        float x = ((float) Gdx.input.getX()/Gdx.graphics.getWidth())*pj.camera.viewportWidth+player.body.getPosition().x-pj.camera.viewportWidth/2;
        float y = ((float) Gdx.input.getY()/Gdx.graphics.getHeight())*pj.camera.viewportHeight+player.body.getPosition().y-pj.camera.viewportHeight/2;
        if(Gdx.input.isButtonPressed(Input.Buttons.LEFT)) {
            //((float) Gdx.input.getX()/Gdx.graphics.getWidth())*pj.camera.viewportWidth, ((float) Gdx.input.getY()/Gdx.graphics.getHeight())*pj.camera.viewportHeight
            EasyStaticShape g = new EasyStaticShape(x,y, shape, 1, 1);
        }
    }
}
