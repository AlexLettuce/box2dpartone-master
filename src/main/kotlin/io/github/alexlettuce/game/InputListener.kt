package io.github.alexlettuce.game

import com.badlogic.gdx.Gdx
import com.badlogic.gdx.Input
import com.badlogic.gdx.InputProcessor
import com.badlogic.gdx.math.Vector2
import io.github.alexlettuce.game.MainScreen.Companion.player

class InputListener : InputProcessor {

	private val playerSpeed = 10000

	override fun keyDown(keycode: Int): Boolean = false
	override fun keyUp(keycode: Int): Boolean = false
	override fun keyTyped(character: Char): Boolean = false
	override fun touchDown(screenX: Int, screenY: Int, pointer: Int, button: Int): Boolean {

		val direction = Vector2(0f, player.linearVelocity.y)
		if (Gdx.input.isKeyPressed(Input.Keys.A)) {
			if (direction.x > -500) {
				direction.x += -playerSpeed.toFloat()
			}
			println(direction.x)
		}
		if (Gdx.input.isKeyPressed(Input.Keys.D)) {
			if (direction.x < 500) {
				direction.x += playerSpeed.toFloat()
			}
		}

		player.applyForceToCenter(direction, true)
		return true
	}

	override fun touchUp(screenX: Int, screenY: Int, pointer: Int, button: Int): Boolean = false
	override fun touchDragged(screenX: Int, screenY: Int, pointer: Int): Boolean = false
	override fun mouseMoved(screenX: Int, screenY: Int): Boolean = false
	override fun scrolled(amountX: Float, amountY: Float): Boolean = false
}
