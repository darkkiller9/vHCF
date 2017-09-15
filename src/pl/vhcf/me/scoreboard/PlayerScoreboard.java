package pl.vhcf.me.scoreboard;

import org.bukkit.entity.Player;

import pl.vhcf.me.Main;
import pl.vhcf.me.utils.SBUtils;

public class PlayerScoreboard {
	
	public Main plugin;
	private Player player;
	
	/**
	 * Constructor
	 * @param plugin
	 * @param player
	 */
	public PlayerScoreboard(Main plugin, Player player) {
		this.plugin = plugin;
		this.player = player;
	}
	
	/**
	 * Create Scoreboard for player.
	 */
	public void createPlayerBoard() {
		ScoreboardWrapper sw = new ScoreboardWrapper(SBUtils.TITLE);
		sw.addLine(SBUtils.ENDERPEARL_TITLE + ":" + SBUtils.PEARL_COOLDOWN);
		player.setScoreboard(sw.getScoreboard());
	}
}