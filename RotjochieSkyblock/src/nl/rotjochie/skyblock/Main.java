package nl.rotjochie.skyblock;

import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin{
	
	private static Main plugin;
	
	public void onEnable(){
		plugin = this;
	}
	
	public static Main getInstance(){
		return plugin;
	}

	



}
