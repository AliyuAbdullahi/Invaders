package com.invaders.game.gameover;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.invaders.game.Invaders;
import com.invaders.game.camera.OrthoCamera;
import com.invaders.game.screen.Screen;
import com.invaders.game.texture.TextureManager;

/**
 * Created by aliyuabdullahi on 9/7/16.
 */
public class GameOver extends Screen {

    private Texture texture;

    public GameOver(boolean won){
        if(won){
            texture = TextureManager.GAME_WON;
        }
        else{
            texture = TextureManager.GAME_OVER;
        }
    }

    OrthoCamera camera;
    @Override
    public void create() {
        camera = new OrthoCamera();
        camera.resize();
    }

    @Override
    public void render(SpriteBatch spriteBatch) {
        spriteBatch.setProjectionMatrix(camera.combined);
        spriteBatch.begin();
        spriteBatch.draw(texture, Invaders.WIDTH/2 - texture.getWidth()/2 + 25, Invaders.HEIGHT/2 - texture.getHeight()/2);
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
