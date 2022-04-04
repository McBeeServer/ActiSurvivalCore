package com.metaxcrew.survivalcore;

import com.metaxcrew.survivalcore.commands.HatCommand;
import com.metaxcrew.survivalcore.commands.NightVisionCommand;
import com.metaxcrew.survivalcore.core.ScoreBoard;
import com.metaxcrew.survivalcore.events.JoinLeaveEvent;
import com.metaxcrew.survivalcore.guis.CustomItems;
import org.bukkit.plugin.java.JavaPlugin;

public final class SurvivalCore extends JavaPlugin {
private static SurvivalCore instance;
@Override
public void onEnable() {
    instance = this;
    getServer().getPluginManager().registerEvents(new ScoreBoard(), this);
    getServer().getPluginManager().registerEvents(new JoinLeaveEvent(), this);
    getServer().getPluginManager().registerEvents(new CustomItems(), this);


    getCommand("ci").setExecutor(new CustomItems());
    getCommand("nv").setExecutor(new NightVisionCommand());
    getCommand("hat").setExecutor(new HatCommand());

}

@Override
public void onDisable() {

}

public static SurvivalCore getInstance() {
    return instance;
}
}
