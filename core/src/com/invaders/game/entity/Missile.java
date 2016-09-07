package com.invaders.game.entity;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.Vector2;
import com.invaders.game.Invaders;
import com.invaders.game.texture.TextureManager;

/**
 * Created by aliyuabdullahi on 9/7/16.
 */
public class Missile extends Entity {

    public Missile(Vector2 position){
        super(TextureManager.MISSILE, position, new Vector2(0, 5));
    }
    @Override
    public void update() {
        position.add(direction);
    }

    public boolean checkEnd(){
        return position.y >= Invaders.HEIGHT;
    }
}
