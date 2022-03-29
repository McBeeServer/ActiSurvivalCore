package com.metaxcrew.survivalcore.commands;

import net.md_5.bungee.api.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;
import org.jetbrains.annotations.NotNull;

public class NightVisionCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (sender instanceof Player) {
            Player p = (Player) sender;
            if (p.hasPermission("acti.nightvision")) {

                if(p.hasPotionEffect(PotionEffectType.NIGHT_VISION)) {
                    p.removePotionEffect(PotionEffectType.NIGHT_VISION);
                    p.sendMessage(ChatColor.of("#D16666") + "Night Vision has been disabled!");
                }else{
                    p.sendMessage(ChatColor.of("#D16666") + "Night Vision has been enabled!");
                    p.addPotionEffect(new PotionEffect(PotionEffectType.NIGHT_VISION, 9999999, 1,true,false));
                }}
        }
        return true;}
}
