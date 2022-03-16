package com.metaxcrew.survivalcore.core;

import com.metaxcrew.survivalcore.SurvivalCore;
import fr.mrmicky.fastboard.FastBoard;
import net.md_5.bungee.api.ChatColor;
import org.bukkit.Bukkit;
import org.bukkit.Statistic;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class ScoreBoard implements Listener {


    private final Map<UUID, FastBoard> boards = new HashMap<>();

    public ScoreBoard() {
        Bukkit.getServer().getScheduler().runTaskTimer(SurvivalCore.getInstance(), () -> {
            for (FastBoard board : this.boards.values()) {
                updateBoard(board);
            }
        }, 0, 20);
    }

    @EventHandler

    public void onJoin(PlayerJoinEvent e) {
        Player player = e.getPlayer();

        FastBoard lobbysb = new FastBoard(player);

        lobbysb.updateTitle(ChatColor.of("#0F7AD9") + "" + ChatColor.BOLD + "Survival");

        this.boards.put(player.getUniqueId(), lobbysb);


    }

    @EventHandler
    public void onQuit(PlayerQuitEvent e) {
        Player player = e.getPlayer();

        FastBoard lobbysb = this.boards.remove(player.getUniqueId());

        if (lobbysb != null) {
            lobbysb.delete();
        }

    }


    private void updateBoard(FastBoard lobbysb) {
        lobbysb.updateLines(
                "",
                ChatColor.of("#738291") + "» " + ChatColor.of("#89B6DE") + "Coin:" + ChatColor.of("#C4CDD6") + " Kingdoms",
                "",
                ChatColor.of("#738291") + "» " + ChatColor.of("#89B6DE") + "ACrytal: " + ChatColor.of("#C4CDD6") + lobbysb.getPlayer().getStatistic(Statistic.PLAYER_KILLS),
                ChatColor.of("#738291") + "» " + ChatColor.of("#89B6DE") + "Kills: " + ChatColor.of("#C4CDD6") + lobbysb.getPlayer().getStatistic(Statistic.PLAYER_KILLS),
                ChatColor.of("#738291") + "» " + ChatColor.of("#89B6DE") + "Kills: " + ChatColor.of("#C4CDD6") + lobbysb.getPlayer().getStatistic(Statistic.PLAYER_KILLS),
                ChatColor.of("#738291") + "» " + ChatColor.of("#89B6DE") + "Kills: " + ChatColor.of("#C4CDD6") + lobbysb.getPlayer().getStatistic(Statistic.PLAYER_KILLS),
                "",
                ChatColor.of("#738291") + "» " + ChatColor.of("#89B6DE") + "Kills: " + ChatColor.of("#C4CDD6") + lobbysb.getPlayer().getStatistic(Statistic.PLAYER_KILLS),
                "",
                ChatColor.of("#738291") + "» " + ChatColor.of("#89B6DE") + "Kills: " + ChatColor.of("#C4CDD6") + lobbysb.getPlayer().getStatistic(Statistic.PLAYER_KILLS),
                "",
                ChatColor.of("#738291") + "» " + ChatColor.of("#89B6DE") + "Kills: " + ChatColor.of("#C4CDD6") + lobbysb.getPlayer().getStatistic(Statistic.PLAYER_KILLS),
                "",
                ChatColor.of("#0F7AD9") + "" + ChatColor.BOLD + "www.acticraft.net"


        );
    }
}