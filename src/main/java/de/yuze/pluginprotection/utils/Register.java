package de.yuze.pluginprotection.utils;

import de.yuze.pluginprotection.PluginProtection;
import de.yuze.pluginprotection.listener.CommandProt;
import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginManager;

/**
 * JavaDoc this file!
 * Created: 02.11.2022
 *
 * @author YuZe152
 */

public class Register {

    public Register() {
        PluginManager pm = Bukkit.getPluginManager();
        pm.registerEvents(new CommandProt(), PluginProtection.getInstance());
    }

}
