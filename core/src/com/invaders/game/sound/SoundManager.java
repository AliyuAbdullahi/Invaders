package com.invaders.game.sound;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.audio.Sound;

/**
 * Created by aliyuabdullahi on 9/7/16.
 */
public class SoundManager {
    public static Sound GAME_MENU_SOUND = Gdx.audio.newSound(Gdx.files.internal("menu.mp3"));
    public static Sound GAME_SOUND = Gdx.audio.newSound(Gdx.files.internal("gamesoundmenu.mp3"));
    public static Sound BOSS_FIGHT_SOUND = Gdx.audio.newSound(Gdx.files.internal("gamesoundboss.mp3"));
    public static Sound PLAYER_DEAD = Gdx.audio.newSound(Gdx.files.internal("playerdead.wav"));
    public static Sound ENEMY_DEAD = Gdx.audio.newSound(Gdx.files.internal("enemydead.wav"));
    public static Sound DEFAULT_GUN = Gdx.audio.newSound(Gdx.files.internal("defaultgun"));
    public static Sound WAR_HAMMER = Gdx.audio.newSound(Gdx.files.internal("warhammer.wav"));
    public static Sound POWER_UP = Gdx.audio.newSound(Gdx.files.internal("powerup.wav"));
    public static Sound HEAVY_CANON = Gdx.audio.newSound(Gdx.files.internal("heavygun.wav"));
    public static Sound BOSS_IMMINENT = Gdx.audio.newSound(Gdx.files.internal("bossimminent.wav"));
}
