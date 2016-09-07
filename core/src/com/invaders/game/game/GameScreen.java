package com.invaders.game.game;

import com.badlogic.gdx.audio.Sound;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.invaders.game.camera.OrthoCamera;
import com.invaders.game.entity.EntityManager;
import com.invaders.game.screen.Screen;
import com.invaders.game.sound.SoundProvider;

/**
 * Created by aliyuabdullahi on 9/6/16.
 */
public class GameScreen extends Screen {
    private OrthoCamera camera;
    private Sound sound;
    private EntityManager entityManager;
    @Override
    public void create() {
        camera = new OrthoCamera();

        entityManager = new EntityManager(10);

        SoundProvider.playSound(SoundProvider.InvaderSound.GAME_SOUND, true);
    }

    @Override
    public void render(SpriteBatch spriteBatch) {
        spriteBatch.setProjectionMatrix(camera.combined);
        spriteBatch.begin();
        entityManager.render(spriteBatch);
        spriteBatch.end();
    }

    @Override
    public void update() {
        camera.update();
        entityManager.update();
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
}
