package com.mygdx.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.physics.box2d.CircleShape;
import com.badlogic.gdx.physics.box2d.Shape;

public class moveit {
    public static int playerSpeed = 100;
    public static void move(Player player) {
        Vector2 direction = new Vector2(0, 0);
        if (Gdx.input.isKeyPressed(Input.Keys.A)) {
            direction.x += -playerSpeed;
        }
        if (Gdx.input.isKeyPressed(Input.Keys.D)) {
            direction.x += playerSpeed;
        }
        if (Gdx.input.isKeyPressed(Input.Keys.W)) {
            direction.y += -playerSpeed;
        }
        if (Gdx.input.isKeyPressed(Input.Keys.S)) {
            direction.y += playerSpeed;
        }
    }

}