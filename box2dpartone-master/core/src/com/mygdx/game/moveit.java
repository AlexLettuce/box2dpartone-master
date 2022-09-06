package com.mygdx.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.physics.box2d.CircleShape;
import com.badlogic.gdx.physics.box2d.Shape;

public class moveit {
    public static int playerSpeed = 10000;
    public static int playerJump = 50;
    public static void move(Player player) {
        Vector2 direction = new Vector2(0, player.body.getLinearVelocity().y);
        if (Gdx.input.isKeyPressed(Input.Keys.A)) {
            if(direction.x>-500) {
                direction.x += -playerSpeed;
            }
            System.out.println(direction.x);
        }
        if (Gdx.input.isKeyPressed(Input.Keys.D)) {
            if(direction.x<500) {
                direction.x += playerSpeed;
            }
        }
        if (Gdx.input.isKeyJustPressed(Input.Keys.W) || Gdx.input.isKeyJustPressed(Input.Keys.SPACE)) {
//            direction.y = -playerJump;
        }
        if (Gdx.input.isKeyPressed(Input.Keys.S)) {
//            direction.y += playerSpeed;
        }
            player.body.applyForceToCenter(direction, true);

    }

}