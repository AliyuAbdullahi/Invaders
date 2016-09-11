package com.invaders.game.screen.game;

import com.badlogic.gdx.audio.Sound;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.invaders.game.camera.OrthoCamera;
import com.invaders.game.screen.Screen;

/**
 * Created by aliyuabdullahi on 9/11/16.
 */
public class IntroScreen extends Screen {
    private OrthoCamera camera;
    private Sound sound;

    @Override
    public void create() {
        camera = new OrthoCamera();
        camera.resize();
    }

    @Override
    public void render(SpriteBatch spriteBatch) {
        spriteBatch.setProjectionMatrix(camera.combined);
        spriteBatch.begin();

        spriteBatch.end();
    }

    @Override
    public void resize(int width, int height) {
        camera.resize();
    }

    @Override
    public void dispose() {

    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void update() {
        camera.update();
    }
}
