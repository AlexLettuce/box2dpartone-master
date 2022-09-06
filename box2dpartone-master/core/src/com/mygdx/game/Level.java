package com.mygdx.game;


import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.physics.box2d.CircleShape;
import com.badlogic.gdx.physics.box2d.PolygonShape;


public class Level {
    public static void Level(int levelId,Player player) {
        Vector2[] vertices = new Vector2[3];
        vertices[0] = new Vector2(0  , -2  );
        vertices[1] = new Vector2(-10 , 10  );
        vertices[2] = new Vector2(10 , 10  );
        PolygonShape shape = new PolygonShape();
        shape.set(vertices);
        shape.setAsBox(3,3);
        float x = ((float) Gdx.input.getX()/Gdx.graphics.getWidth())*pj.camera.viewportWidth+player.body.getPosition().x-pj.camera.viewportWidth/2;
        float y = ((float) Gdx.input.getY()/Gdx.graphics.getHeight())*pj.camera.viewportHeight+player.body.getPosition().y-pj.camera.viewportHeight/2;
        if(Gdx.input.isButtonPressed(Input.Buttons.LEFT)) {
            //((float) Gdx.input.getX()/Gdx.graphics.getWidth())*pj.camera.viewportWidth, ((float) Gdx.input.getY()/Gdx.graphics.getHeight())*pj.camera.viewportHeight
            EasyStaticShape g = new EasyStaticShape(x,y, shape, 1, 1f);
        }
    }
}
