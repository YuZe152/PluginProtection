package de.yuze.pluginprotection.listener;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

/**
 * JavaDoc this file!
 * Created: 02.11.2022
 *
 * @author YuZe152
 */

public class CommandProt implements Listener {

    @EventHandler
    public void onCMDProt(AsyncPlayerChatEvent e) {
        Player p = e.getPlayer();
        if (e.getMessage().startsWith("/pl") ||
                e.getMessage().startsWith("/plugins") ||
                e.getMessage().startsWith("/bukkit:pl") ||
                e.getMessage().startsWith("/bukkit:plugins")) {

            e.setCancelled(true);
            p.sendMessage(ChatColor.AQUA + "Du hast nicht die Berechtigung das zu tun!");
        }
    }

}
