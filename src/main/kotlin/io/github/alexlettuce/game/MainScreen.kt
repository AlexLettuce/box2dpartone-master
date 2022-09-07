package io.github.alexlettuce.game

import com.badlogic.gdx.Gdx
import com.badlogic.gdx.Input
import com.badlogic.gdx.graphics.OrthographicCamera
import com.badlogic.gdx.math.Vector2
import com.badlogic.gdx.math.Vector3
import com.badlogic.gdx.physics.box2d.BodyDef
import com.badlogic.gdx.physics.box2d.Box2DDebugRenderer
import com.badlogic.gdx.physics.box2d.World
import com.badlogic.gdx.utils.viewport.ScreenViewport
import ktx.app.KtxScreen
import ktx.app.clearScreen
import ktx.assets.disposeSafely
import ktx.box2d.body
import ktx.box2d.box
import ktx.box2d.circle

class MainScreen : KtxScreen {
	private var debugRenderer: Box2DDebugRenderer = Box2DDebugRenderer(true, false, false, true, false, false)
	var camera = OrthographicCamera()
	var viewport: ScreenViewport = ScreenViewport(camera)

	companion object {
		var world = World(Vector2(0f, -100f), true)
		var player = world.body {
			circle(radius = 2f) {
				restitution = 0.5f
			}
			this.type = BodyDef.BodyType.DynamicBody
		}
	}

	init {
		Gdx.input.inputProcessor = InputListener()
		viewport.unitsPerPixel = 0.06f // view scaling more or less
	}

	override fun render(delta: Float) {
		clearScreen(red = 0.0f, green = 0.0f, blue = 0f) // screen color
		PhysicsHandler.doPhysicsStep(delta) // tick physics
		camera.position[player.position] = 0f // que es?
		camera.update() // bad idea lol

		// handle box placing
		if (Gdx.input.isButtonPressed(Input.Buttons.LEFT)) {
			val loc = camera.unproject(Vector3(Gdx.input.x.toFloat(), Gdx.input.y.toFloat(), 0f))
			world.body {
				box(width = 3f, height = 3f) {
					restitution = 1f
				}
				position.set(loc.x, loc.y)
			}
		}
		debugRenderer.render(world, camera.combined)
	}


	override fun dispose() {
		world.disposeSafely()
	}

	override fun resize(width: Int, height: Int) {
		// called on window resize
		viewport.update(width, height)
	}
}