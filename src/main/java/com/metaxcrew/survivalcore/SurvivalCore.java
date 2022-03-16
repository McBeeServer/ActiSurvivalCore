package com.metaxcrew.survivalcore;

import com.metaxcrew.survivalcore.core.ScoreBoard;
import org.bukkit.plugin.java.JavaPlugin;

public final class SurvivalCore extends JavaPlugin {
    private static SurvivalCore instance;
    @Override
    public void onEnable() {
        instance = this;
        getServer().getPluginManager().registerEvents(new ScoreBoard(), this);
    }

    @Override
    public void onDisable() {

    }

    public static SurvivalCore getInstance() {
        return instance;
    }
}
