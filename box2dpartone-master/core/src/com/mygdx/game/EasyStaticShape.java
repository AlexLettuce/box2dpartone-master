package com.mygdx.game;

import com.badlogic.gdx.physics.box2d.*;

public class EasyStaticShape {
    BodyDef bodyDef = new BodyDef();
    public EasyStaticShape(float x, float y, Shape shape, float density, float restitution) {
        FixtureDef fixtureDef = new FixtureDef();
        fixtureDef.shape = shape;
        fixtureDef.density = density;
        fixtureDef.restitution = restitution;
        bodyDef.type = BodyDef.BodyType.StaticBody;
        bodyDef.position.set(x, y);
        Body body = pj.world.createBody(bodyDef);
        body.createFixture(fixtureDef);
        shape.dispose();
    }
}
