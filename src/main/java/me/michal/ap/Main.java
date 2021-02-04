package me.michal.ap;

import org.bukkit.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerCommandSendEvent;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.ArrayList;
import java.util.List;

public final class Main extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        new PlayerCommandPreprocess(this);
        getServer().getPluginManager().registerEvents(this, this);
    }
    public static String chat(String s){
        return ChatColor.translateAlternateColorCodes('&', s);
    }

    @EventHandler
    public void onTab(PlayerCommandSendEvent e) {
        List<String> bl = new ArrayList<>();
        bl.add("version");
        bl.add("plugins");
        bl.add("ver");
        bl.add("pl");
        bl.add("?");
        bl.add("help");
        bl.add("bukkit:version");
        bl.add("bukkit:plugins");
        bl.add("bukkit:ver");
        bl.add("bukkit:pl");
        bl.add("bukkit:?");
        bl.add("bukkit:help");
        bl.add("bukkit:about");
        bl.add("about");
        e.getCommands().removeAll(bl);
    }

}
