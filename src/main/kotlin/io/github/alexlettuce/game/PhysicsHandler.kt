package io.github.alexlettuce.game

import io.github.alexlettuce.game.MainScreen.Companion.world


object PhysicsHandler {
	const val TIME_STEP = 1 / 60f
	const val POS_ITER = 2
	const val VEL_ITER = 6
	private var accumulator = 0f

	fun doPhysicsStep(deltaTime: Float) {
		// fixed time step
		// max frame time to avoid spiral of death (on slow devices)
		val frameTime = deltaTime.coerceAtMost(0.25f)
		accumulator += frameTime
		while (accumulator >= TIME_STEP) {
			world.step(TIME_STEP, VEL_ITER, POS_ITER)
			accumulator -= TIME_STEP
		}
	}
}