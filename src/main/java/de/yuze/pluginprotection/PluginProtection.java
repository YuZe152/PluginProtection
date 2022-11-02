package de.yuze.pluginprotection;

import de.yuze.pluginprotection.utils.Register;
import org.bukkit.plugin.java.JavaPlugin;

public final class PluginProtection extends JavaPlugin {

    private static PluginProtection instance;

    @Override
    public void onEnable() {
        instance = this;
        new Register();
    }

    public static PluginProtection getInstance() {
        return instance;
    }
}
