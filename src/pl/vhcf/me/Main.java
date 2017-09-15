package pl.vhcf.me;

import java.io.File;

import org.bukkit.Bukkit;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import pl.vhcf.me.commands.CommandHelp;
import pl.vhcf.me.listeners.timers.PlayerPearl;
import pl.vhcf.me.scoreboard.JoinScoreboard;


public class Main extends JavaPlugin {
	private static Main instance;

	public static FileConfiguration config;
	public static File conf;
	

	public void onEnable() {
		instance = this;
		config = getConfig();
		config.options().copyDefaults(true);
		conf = new  File(getDataFolder(), "config.yml");;
		
		
		
		saveConfig();
		saveDefaultConfig();
		register();
		
		
	}
	public void register(){
		getCommand("help").setExecutor(new CommandHelp());
		PluginManager pm = Bukkit.getServer().getPluginManager();
		pm.registerEvents(new PlayerPearl(this), this);
		pm.registerEvents(new JoinScoreboard(this), this);
	}
	public static Main getInstance(){
    	return instance;
	}
}