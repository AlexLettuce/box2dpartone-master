package com.mygdx.game;

import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.physics.box2d.Body;
import com.badlogic.gdx.physics.box2d.Fixture;
import com.badlogic.gdx.physics.box2d.FixtureDef;
import com.badlogic.gdx.physics.box2d.PolygonShape;

public class EasyBox {
    public Fixture fixtureName;
    public PolygonShape shape = new PolygonShape();
    public FixtureDef fixtureDef = new FixtureDef();
    double wX;
    double wY;
    float x;
    float y;
    Vector2 pos;

    public EasyBox(double wX, double wY, float x, float y, float density, float restitution, Body body) {
        this.wX = wX;
        this.wY = wY;
        this.x = x;
        this.y = y;
        this.pos = new Vector2(x, y);
        this.shape.setAsBox((float) wX, (float) wY, pos, 0f);
        this.fixtureDef.shape = shape;
        this.fixtureDef.density = density;
        this.fixtureDef.restitution = restitution;
        this.fixtureName = body.createFixture(this.fixtureDef);
        this.fixtureName.setUserData(this);
    }
}