package com.invaders.game.texture;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;

/**
 * Created by aliyuabdullahi on 9/6/16.
 */
public class TextureManager {
    public static Texture PLAYER = new Texture(Gdx.files.internal("initplayer.png"));
    public static Texture MISSILE = new Texture(Gdx.files.internal("missile.png"));
    public static Texture ENEMY = new Texture(Gdx.files.internal("enemy.png") );
    public static Texture GAME_WON = new Texture("gamewon.png");
    public static Texture GAME_OVER = new Texture("gameover.png");
}
