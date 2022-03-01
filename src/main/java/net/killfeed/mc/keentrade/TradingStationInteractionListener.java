package net.killfeed.mc.keentrade;

import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.player.PlayerInteractEntityEvent;

public class TradingStationInteractionListener implements Listener {
    @EventHandler(priority = EventPriority.MONITOR)
    public void onEntityDamageEntity(EntityDamageByEntityEvent event) {

    }

    @EventHandler(priority = EventPriority.MONITOR)
    public void onPlayerInteractEntityEvent(PlayerInteractEntityEvent event) {

    }
}
