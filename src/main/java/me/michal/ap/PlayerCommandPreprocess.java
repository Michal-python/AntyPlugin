package me.michal.ap;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerCommandPreprocessEvent;

public class PlayerCommandPreprocess implements Listener {
    private Main plugin;

    public PlayerCommandPreprocess(Main plugin) {
        this.plugin = plugin;
        Bukkit.getPluginManager().registerEvents(this, plugin);
    }
    @EventHandler
    public void onCommand(PlayerCommandPreprocessEvent e) {
        Player p = e.getPlayer();
        String wiadomosc = "&cKomenda zablokowana";
        List<String> bl = new ArrayList<>();
        bl.add("/pl");
        bl.add("/bukkit:pl");
        bl.add("/help");
        bl.add("/?");
        bl.add("/bukkit:help");
        bl.add("/bukkit:?");
        bl.add("/bukkit:ver");
        bl.add("/ver");
        bl.add("/rl");
        bl.add("/reload");
        bl.add("/bukkit:reload");
        bl.add("/bukkit:rl");
        bl.add("/about");
        bl.add("/bukkit:about");
        for(String s : b;) {
            if(e.getMessage().contains(s)) {
                e.setCancelled(true);
                e.getPlayer().sendMessage(Main.chat(wiadomosc));
                wyslijdohelpopa(p, e);
            }
        }
    }

    public void wyslijdohelpopa(Player p, PlayerCommandPreprocessEvent e) {
        for(Player pl : Bukkit.getOnlinePlayers()) {
            if(pl.hasPermission("antyplugin.see")) {
                pl.sendMessage(Main.chat("&6[AntyPlugin] &eGracz "+p.getName()+" wpisał &6" + e.getMessage()));
            }
        }
    }
}
