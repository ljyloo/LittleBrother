package com.Pyramid.LittleBrother;

import org.bukkit.plugin.java.JavaPlugin;

/**
 * Main class of LittleBrother.
 * 
 * @see JavaPlugin
 */
public class LittleBrother extends JavaPlugin{

	private Server server;

	@Override
	public void onLoad(){
		this.saveDefaultConfig();
		new Language(this, "english").load();
		this.server = new Server(this);
	}
	
	/**
	 * Call when enable.
	 */
	@Override
	public void onEnable() {
		this.getMinecraftPEServer().onEnable();
	}
	
	/**
	 * Call when disable.
	 */
	@Override
    public void onDisable() {
		this.getMinecraftPEServer().onDisable();
    }

	public synchronized Server getMinecraftPEServer() {
		return this.server;
	}

}
