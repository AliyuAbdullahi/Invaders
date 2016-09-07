package com.invaders.game.screen;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;

/**
 * Created by aliyuabdullahi on 9/6/16.
 */
public abstract class Screen {

    public abstract void create();

    public abstract void render(SpriteBatch spriteBatch);

    public abstract void resize(int width, int height);

    public abstract void dispose();

    public abstract void pause();

    public abstract void resume();

    public abstract void update();
}
