package com.invaders.game.entity;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.math.Vector2;

/**
 * Created by aliyuabdullahi on 9/6/16.
 */
public abstract class Entity {
    protected  Texture texture;
    protected  Vector2 position;
    protected  Vector2 direction;

    public Entity(Texture texture, Vector2 position, Vector2 direction){
        this.position = position;
        this.direction = direction;
        this.texture = texture;
    }

    public abstract void update();

    public Texture getTexture() {
        return texture;
    }

    public Vector2 getPosition() {
        return position;
    }

    public Vector2 getDirection() {
        return direction;
    }

    public void setTexture(Texture texture) {
        this.texture = texture;
    }

    public void setPosition(Vector2 position) {
        this.position = position;
    }

    public void setDirection(Vector2 direction) {
        this.direction = direction;
    }

    public void render(SpriteBatch spriteBatch){
        spriteBatch.draw(texture, position.x, position.y);
    }

    public void setDirection(float x, float y){
        direction.set(x, y);
        direction.scl(Gdx.graphics.getDeltaTime());
    }

    public Rectangle getBounds(){
        return new Rectangle(position.x, position.y - texture.getHeight(), texture.getWidth(), texture.getHeight());
    }

}
