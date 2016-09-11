package com.invaders.game.entity;

import com.badlogic.gdx.audio.Sound;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.MathUtils;
import com.badlogic.gdx.math.Vector2;
import com.invaders.game.Invaders;
import com.invaders.game.texture.TextureManager;

/**
 * Created by aliyuabdullahi on 9/7/16.
 */
public class Enemy extends Entity {
    public static Sound sound;
    public Enemy(Texture texture, Vector2 position, Vector2 direction){
        super(texture, position, direction);
    }

    @Override
    public void update() {
        position.add(direction);
        if(position.y <= -TextureManager.ENEMY.getHeight()){
            float x = MathUtils.random(0, Invaders.WIDTH - TextureManager.ENEMY.getWidth());
            position.set(x, Invaders.HEIGHT);
        }
    }
}
