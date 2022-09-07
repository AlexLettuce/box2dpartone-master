package io.github.alexlettuce.game

import com.badlogic.gdx.physics.box2d.Contact
import com.badlogic.gdx.physics.box2d.ContactImpulse
import com.badlogic.gdx.physics.box2d.ContactListener
import com.badlogic.gdx.physics.box2d.Manifold

class CollisionListener : ContactListener {
	override fun beginContact(contact: Contact) {
		val fa = contact.fixtureA
		val fb = contact.fixtureB
		if (fa == null || fb == null) return
		if (fa.userData == null || fa.userData == null) return
	}

	override fun endContact(contact: Contact) {}

	//don't worry about these two
	override fun preSolve(contact: Contact, oldManifold: Manifold) {}
	override fun postSolve(contact: Contact, impulse: ContactImpulse) {}
}