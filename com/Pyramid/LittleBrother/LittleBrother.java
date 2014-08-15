package com.Pyramid.LittleBrother;

import java.util.List;

import org.bukkit.plugin.java.JavaPlugin;

public class LittleBrother extends JavaPlugin{
	private ServerThread thread;
	private ConfigAccessor config;
	static String Motd;
	static int port;
	
	@Override
	public void onEnable(){
		this.thread = new ServerThread(getLogger());
		this.config = new ConfigAccessor(this,"config.yml");
		this.config.saveDefaultConfig();
		getLogger().info("LittleBrother插件已被加载！");
		this.getCommand("LittleBrother").setExecutor(new LBCommands(this));
		Motd = this.getConfig().getString("motd");
		port = this.getConfig().getInt("port"); 
		getLogger().info("MCPE服务器Motd:" + Motd);
		getLogger().info("MCPE服务器Port:" + port);
	}
	
	@Override
    	public void onDisable() {
        	getLogger().info("LittleBrother插件已被卸载！");
    	}
}
