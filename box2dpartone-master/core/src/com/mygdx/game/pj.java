package com.mygdx.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.physics.box2d.Box2DDebugRenderer;
import com.badlogic.gdx.physics.box2d.World;
import com.badlogic.gdx.utils.ScreenUtils;
import com.badlogic.gdx.utils.viewport.ScreenViewport;
import com.badlogic.gdx.utils.viewport.Viewport;

import java.util.ArrayList;

import static java.lang.Math.round;

public class pj extends ApplicationAdapter {
    public static World world; // define a world named world
    public static ArrayList<EasyStaticShape> statics = new ArrayList<>();
    public static Vector2 gravity = new Vector2(0,50);
    SpriteBatch batch;
    public static OrthographicCamera camera = new OrthographicCamera();
    Box2DDebugRenderer debugRenderer;
    Player player;
    ScreenViewport viewport;

    @Override
    public void create() {
        debugRenderer = new Box2DDebugRenderer(true, false, false, true, false, false);
        camera.setToOrtho(true, 160, 90);
        world = new World(new Vector2(0, 100f), true);
        batch = new SpriteBatch();
        player = new Player(camera.viewportWidth/2, camera.viewportHeight/2, 1, 1, 5);
    }
    @Override
    public void render() {
        ScreenUtils.clear(0, 0, 0, 0);
        world.step(1 / 60f, 6, 2);
        batch.setProjectionMatrix(camera.combined);
        batch.begin();
        batch.end();
        moveit.move(player); // BADDDDDDDDD
        Level.Level(1);
        debugRenderer.render(world, camera.combined);
    }

    @Override
    public void dispose() {
        world.dispose();
        batch.dispose();
    }
}
