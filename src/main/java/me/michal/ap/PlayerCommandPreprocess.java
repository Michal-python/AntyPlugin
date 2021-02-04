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
        if(e.getMessage().contains("/pl")) {
            e.setCancelled(true);
            e.getPlayer().sendMessage(Main.chat(wiadomosc));
            wyslijdohelpopa(p, e);
        } else if(e.getMessage().contains("/bukkit:pl")) {
            e.setCancelled(true);
            e.getPlayer().sendMessage(Main.chat(wiadomosc));
            wyslijdohelpopa(p, e);
        } else if(e.getMessage().contains("/help")) {
            e.setCancelled(true);
            e.getPlayer().sendMessage(Main.chat(wiadomosc));
            wyslijdohelpopa(p, e);
        } else if(e.getMessage().contains("/?")) {
            e.setCancelled(true);
            e.getPlayer().sendMessage(Main.chat(wiadomosc));
            wyslijdohelpopa(p, e);
        } else if(e.getMessage().contains("/bukkit:help")) {
            e.setCancelled(true);
            e.getPlayer().sendMessage(Main.chat(wiadomosc));
            wyslijdohelpopa(p, e);
        } else if(e.getMessage().contains("/bukkit:?")) {
            e.setCancelled(true);
            e.getPlayer().sendMessage(Main.chat(wiadomosc));
            wyslijdohelpopa(p, e);
        }  else if(e.getMessage().contains("/bukkit:ver")) {
            e.setCancelled(true);
            e.getPlayer().sendMessage(Main.chat(wiadomosc));
            wyslijdohelpopa(p, e);
        } else if(e.getMessage().contains("/ver")) {
            e.setCancelled(true);
            e.getPlayer().sendMessage(Main.chat(wiadomosc));
            wyslijdohelpopa(p, e);
        } else if(e.getMessage().equalsIgnoreCase("/bukkit:rl")) {
            e.setCancelled(true);
            e.getPlayer().sendMessage(Main.chat(wiadomosc));
            wyslijdohelpopa(p, e);
        } else if(e.getMessage().contains("/rl")) {
            e.setCancelled(true);
            e.getPlayer().sendMessage(Main.chat(wiadomosc));
            wyslijdohelpopa(p, e);
        } else if(e.getMessage().contains("/bukkit:reload")) {
            e.setCancelled(true);
            e.getPlayer().sendMessage(Main.chat(wiadomosc));
            wyslijdohelpopa(p, e);
        } else if(e.getMessage().equalsIgnoreCase("/reload")) {
            e.setCancelled(true);
            e.getPlayer().sendMessage(Main.chat(wiadomosc));
            wyslijdohelpopa(p, e);
        } else if(e.getMessage().contains("/about")) {
            e.setCancelled(true);
            e.getPlayer().sendMessage(Main.chat(wiadomosc));
            wyslijdohelpopa(p, e);
        }
        else if(e.getMessage().contains("/bukkit:about")) {
            e.setCancelled(true);
            e.getPlayer().sendMessage(Main.chat(wiadomosc));
            wyslijdohelpopa(p, e);
        } else if(e.getMessage().contains("/bukkit:pl")) {
            e.setCancelled(true);
            e.getPlayer().sendMessage(Main.chat(wiadomosc));
            wyslijdohelpopa(p, e);
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
