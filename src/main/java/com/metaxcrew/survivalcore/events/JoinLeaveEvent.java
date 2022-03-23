package com.metaxcrew.survivalcore.events;

import net.md_5.bungee.api.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerLoginEvent;
import org.bukkit.event.player.PlayerQuitEvent;

public class JoinLeaveEvent implements Listener {

    @EventHandler
    private void onJoin(PlayerJoinEvent e){
        Player p = e.getPlayer();
        e.setJoinMessage(ChatColor.of("#DA1D1D")+ p.getDisplayName() + ChatColor.of("#D16666")+" has joined the survival!");
    }

    @EventHandler
    private void onLeave(PlayerQuitEvent event){
        Player p = event.getPlayer();
        event.setQuitMessage(ChatColor.of("#DA1D1D")+ p.getDisplayName() + ChatColor.of("#D16666")+" has left the survival!");
    }

}
