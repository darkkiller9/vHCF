package pl.vhcf.me.listeners.timers;


import org.bukkit.entity.EnderPearl;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.ProjectileLaunchEvent;

import pl.vhcf.me.Main;
import pl.vhcf.me.listeners.Timer;
import pl.vhcf.me.utils.SBUtils;



public class PlayerPearl extends Timer implements Listener {

	/**
	 * Constructor
	 * @param plugin
	 */
	public PlayerPearl(Main plugin) {
		super(plugin);
	}
	
	@EventHandler(priority = EventPriority.HIGHEST)
    public void onProjectileLaunch(ProjectileLaunchEvent event) {
        if (!(event.getEntity() instanceof EnderPearl) || !(event.getEntity().getShooter() instanceof Player) || event.isCancelled()) {
            return;
        }
        
        Player player = (Player) event.getEntity().getShooter();
        
        if(this.map.containsKey(player) && this.map.get(player) != null) {
    		super.cancel(super.map.get(player));
    	}
        super.cooldown(player, SBUtils.ENDERPEARL_MAX_TIMER, (super.plugin.getConfig().getString(SBUtils.PEARL_COOLDOWN_TITLE)));
    }
}