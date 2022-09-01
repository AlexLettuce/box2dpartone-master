package com.mygdx.game;

import com.badlogic.gdx.physics.box2d.*;

public class CollisionListener implements ContactListener {
    @Override
    public void beginContact(Contact contact) {
        Fixture fa = contact.getFixtureA();
        Fixture fb = contact.getFixtureB();
        if (fa == null || fb == null) return;
        if (fa.getUserData() == null || fa.getUserData() == null) return;

    }

    @Override
    public void endContact(Contact contact) {

    }

    @Override
    //don't worry about these two
    public void preSolve(Contact contact, Manifold oldManifold) {

    }

    @Override
    public void postSolve(Contact contact, ContactImpulse impulse) {

    }
}

