package com.stefnaolupo.ndngame.libgdx;

import com.badlogic.gdx.physics.box2d.*;

public class MyContactListener implements ContactListener {

    private Model parent;

    public MyContactListener(Model parent) {
        this.parent = parent;
    }

    @Override
    public void beginContact(Contact contact) {
        Fixture fa = contact.getFixtureA();
        Fixture fb = contact.getFixtureB();
        System.out.println(fa.getBody().getType()+" has hit "+ fb.getBody().getType());
    }

    @Override
    public void endContact(Contact contact) {

    }

    @Override
    public void preSolve(Contact contact, Manifold oldManifold) {

    }

    @Override
    public void postSolve(Contact contact, ContactImpulse impulse) {

    }
}
