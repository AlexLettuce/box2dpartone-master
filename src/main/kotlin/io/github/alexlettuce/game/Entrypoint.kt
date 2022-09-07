@file:JvmName("Entrypoint")
package io.github.alexlettuce.game

import com.badlogic.gdx.backends.lwjgl3.Lwjgl3Application
import com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration
import ktx.app.KtxGame
import ktx.app.KtxScreen


/** Launches the desktop (LWJGL3) application. */
fun main() {
	Lwjgl3Application(Game(), Lwjgl3ApplicationConfiguration().apply {
		setTitle("Game")
		setWindowedMode(640, 480)
	})
}

class Game: KtxGame<KtxScreen>() {
	override fun create() {
		// Game entrypoint
		addScreen(MainScreen())
		setScreen<MainScreen>()
	}
}

