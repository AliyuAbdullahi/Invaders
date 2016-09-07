package com.invaders.game.entity;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.MathUtils;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.utils.Array;
import com.invaders.game.Invaders;
import com.invaders.game.gameover.GameOver;
import com.invaders.game.screen.ScreenManager;
import com.invaders.game.sound.SoundProvider;
import com.invaders.game.texture.TextureManager;

/**
 * Created by aliyuabdullahi on 9/7/16.
 */
public class EntityManager {

    private final Array<Entity> entities = new Array<Entity>();
    private Player player;

    public EntityManager(int amount) {
        player = new Player(TextureManager.PLAYER, new Vector2(Invaders.WIDTH / 2, 15), new Vector2(0, 0), this);

        for (int i = 0; i < amount; i++) {
            float x = MathUtils.random(0, Invaders.WIDTH - TextureManager.ENEMY.getWidth());
            float y = MathUtils.random(Invaders.HEIGHT, Invaders.HEIGHT * 3);
            float speed = MathUtils.random(2, 5);
            addEntity(new Enemy(TextureManager.ENEMY, new Vector2(x, y), new Vector2(0, -speed)));
        }
    }

    public void update() {
        for (Entity entity : entities) {
            entity.update();
        }
        for(Missile missile: getMissiles()){
            if(missile.checkEnd())
                entities.removeValue(missile, false);
        }
        player.update();
        checkCollision();
    }

    public void render(SpriteBatch spriteBatch) {
        for (Entity entity : entities)
            entity.render(spriteBatch);

        player.render(spriteBatch);
    }

    public void addEntity(Entity entity) {
        entities.add(entity);
    }

    private Array<Enemy> getEnemies() {
        Array<Enemy> enemies = new Array<Enemy>();

        for (Entity entity : entities) {
            if (entity instanceof Enemy) {
                enemies.add((Enemy) entity);
            }
        }

        return enemies;
    }

    public boolean gameWon() {
        return getEnemies().size <= 0;
    }

    private Array<Missile> getMissiles() {
        Array<Missile> missiles = new Array<Missile>();

        for (Entity entity : entities) {
            if (entity instanceof Missile) {
                missiles.add((Missile) entity);
            }
        }

        return missiles;
    }

    private void checkCollision(){
        for(Enemy enemy: getEnemies()){
            for (Missile missile: getMissiles()){
                if(enemy.getBounds().overlaps(missile.getBounds())){
                    entities.removeValue(enemy, false);
                    entities.removeValue(missile, false);
                    SoundProvider.playSound(SoundProvider.InvaderSound.ENEMY_DEAD, false);
                    if(gameWon()){
                        ScreenManager.setScreen(new GameOver(true));
                    }
                }
            }

            if(enemy.getBounds().overlaps(player.getBounds())){
                ScreenManager.setScreen(new GameOver(false));
            }
        }
    }

}
