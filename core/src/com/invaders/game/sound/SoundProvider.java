package com.invaders.game.sound;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.audio.Sound;
import com.invaders.game.Invaders;

/**
 * Created by aliyuabdullahi on 9/7/16.
 */
public class SoundProvider {
    static Sound sound;

    public enum InvaderSound {
        GAME_SOUND("gamesoundmenu.mp3"),
        GAME_MENU_SOUND("menu.mp3"),
        BOSS_FIGHT_SOUND("gamesoundboss.mp3"),
        PLAYER_DEAD("playerdead.wav"),
        ENEMY_DEAD("enemydead.wav"),
        DEFAULT_GUN("defaultgun"),
        WAR_HAMMER("warhammer.wav"),
        POWER_UP("powerup.wav"),
        HEAVY_CANON("heavygun.wav"),
        BOSS_IMMINENT("bossimminent.wav");

        InvaderSound(String path) {
            this.path = path;
        }

        private String path;

        void setPath(String path) {
            this.path = path;
        }

        public String getPath() {
            return path;
        }
    }

    public static long playSound(InvaderSound snd, boolean loop) {
        sound = Gdx.audio.newSound(Gdx.files.internal(snd.getPath()));
        long id = sound.play();
        sound.setLooping(id, loop);
        return id;
    }

    public static void stopSound(long id) {
        sound.stop(id);
    }
}
