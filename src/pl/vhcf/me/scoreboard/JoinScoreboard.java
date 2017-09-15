package pl.vhcf.me.scoreboard;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

import pl.vhcf.me.Main;
import pl.vhcf.me.utils.Messages;
import pl.vhcf.me.utils.SBUtils;

public class JoinScoreboard implements Listener {
	
	public Main plugin;
	private Player player;
	
	/**
	 * Constructor
	 * @param plugin
	 */
	public JoinScoreboard(Main plugin) {
		this.plugin = plugin;
	}
	
	/**
	 * Create board for joining player.
	 * @param event
	 */
	@EventHandler
    public void Join(PlayerJoinEvent event) {
		ScoreboardWrapper sw = new ScoreboardWrapper(SBUtils.TITLE);
		sw.addLine(SBUtils.ENDERPEARL_TITLE + ":" + SBUtils.PEARL_COOLDOWN);
		sw.addLine("§6Name:" + player.getName());
		sw.addBlankSpace();
		sw.setLine(0, "new line 2");
		player.setScoreboard(sw.getScoreboard());
        if(!player.hasPlayedBefore()){
			
			Bukkit.getServer().broadcastMessage(Messages.FIRST_JOIN.replace("{player}", player.getName()));
        }
    }
}