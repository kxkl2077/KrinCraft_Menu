package org.krincraft.menu;

import org.bukkit.plugin.java.JavaPlugin;

public final class Menu extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        System.out.println("&7插件启动中");
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        System.out.println("&7插件关闭中");
    }
}
