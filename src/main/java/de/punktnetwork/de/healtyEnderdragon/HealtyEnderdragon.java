package de.punktnetwork.de.healtyEnderdragon;

import org.bukkit.Bukkit;
import org.bukkit.World;
import org.bukkit.entity.EnderDragon;
import org.bukkit.entity.Entity;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.entity.EntityDeathEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class HealtyEnderdragon extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        Bukkit.getServer().getPluginManager().registerEvents(this, this);

    }

    @Override
    public void onDisable() {
        getLogger().info("Disabling HealtyEnderdragon");
    }

    @EventHandler
    public void onDragonDamage(EntityDamageEvent event) {
        Entity entity = event.getEntity();
        if (entity instanceof EnderDragon) {
            event.setCancelled(true);
        }
    }
}
