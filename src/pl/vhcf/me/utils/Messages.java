package pl.vhcf.me.utils;

import org.bukkit.ChatColor;

import pl.vhcf.me.Main;

public class Messages {
	
	public static final String NO_PERM = ChatColor.translateAlternateColorCodes('&', Main.getInstance().getConfig().getString("general.no-perm"));
	public static final String PREFIX = ChatColor.translateAlternateColorCodes('&', Main.getInstance().getConfig().getString("general.prefix"));
	public static final String LINE1 = ChatColor.translateAlternateColorCodes('&', Main.getInstance().getConfig().getString("help.line1"));
	public static final String LINE2 = ChatColor.translateAlternateColorCodes('&', Main.getInstance().getConfig().getString("help.line2"));
	public static final String LINE3 = ChatColor.translateAlternateColorCodes('&', Main.getInstance().getConfig().getString("help.line3"));
	public static final String LINE4 = ChatColor.translateAlternateColorCodes('&', Main.getInstance().getConfig().getString("help.line4"));
	public static final String LINE5 = ChatColor.translateAlternateColorCodes('&', Main.getInstance().getConfig().getString("help.line5"));
	public static final String LINE6 = ChatColor.translateAlternateColorCodes('&', Main.getInstance().getConfig().getString("help.line6"));
	public static final String LINE7 = ChatColor.translateAlternateColorCodes('&', Main.getInstance().getConfig().getString("help.line7"));
	public static final String FIRST_JOIN = ChatColor.translateAlternateColorCodes('&', Main.getInstance().getConfig().getString("general.first-join"));
	

}
