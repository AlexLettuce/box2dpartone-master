package com.mygdx.game;

import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.physics.box2d.Body;

public class Gravity {
    public static void applyGravity(Player player, float constantOfGravity){
        Vector2 gravity = new Vector2(0,constantOfGravity);
        player.body.applyForceToCenter(gravity,true);
    };
}
