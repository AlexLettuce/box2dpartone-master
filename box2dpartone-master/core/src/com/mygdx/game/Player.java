package com.mygdx.game;

import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.physics.box2d.*;

public class Player {
    BodyDef bodyDef = new BodyDef();
    Body body;
    Fixture fixture;
    CircleShape circle = new CircleShape();
    FixtureDef fixtureDef = new FixtureDef();

    public Player(float x, float y, float density, float restitution, float radius) {
        Vector2 pos = new Vector2(x, y);
        circle.setRadius(radius);
        circle.setPosition(pos);
        bodyDef.type = BodyDef.BodyType.DynamicBody;
        bodyDef.position.set(x, y);
        body = pj.world.createBody(bodyDef);
        fixtureDef.shape = circle;
        fixtureDef.density = density;
        fixtureDef.restitution = restitution;
        fixture = body.createFixture(fixtureDef);
        circle.dispose();
    }
}
