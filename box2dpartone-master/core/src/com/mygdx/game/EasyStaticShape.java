package com.mygdx.game;

import com.badlogic.gdx.physics.box2d.*;

public class EasyStaticShape {
    BodyDef bodyDef = new BodyDef();
    Body body;
    Fixture fixture;
    FixtureDef fixtureDef = new FixtureDef();


    public EasyStaticShape(float x, float y, Shape shape, float density, float restitution) {
        fixtureDef.shape = shape;
        fixtureDef.density = density;
        fixtureDef.restitution = restitution;
        bodyDef.type = BodyDef.BodyType.StaticBody;
        bodyDef.position.set(x, y);
        body = pj.world.createBody(bodyDef);
        fixture = body.createFixture(fixtureDef);
        shape.dispose();
    }
}
