package pl.vhcf.me.utils;

import net.md_5.bungee.api.ChatColor;
import pl.vhcf.me.Main;

public class SBUtils {
	public static final String TITLE = ChatColor.translateAlternateColorCodes('&', Main.getInstance().getConfig().getString("scoreboard.title"));
	public static final String ENDERPEARL_TITLE = ChatColor.translateAlternateColorCodes('&', Main.getInstance().getConfig().getString("scoreboard.enderpearl-title"));
	public static final int ENDERPEARL_MAX_TIMER = Main.getInstance().getConfig().getInt("cooldown.max-pearl-timer");
	public static final int PEARL_COOLDOWN = Main.getInstance().getConfig().getInt("cooldown.pearl-timer");
	public static final String PEARL_COOLDOWN_TITLE = PEARL_COOLDOWN + ENDERPEARL_TITLE;

}
