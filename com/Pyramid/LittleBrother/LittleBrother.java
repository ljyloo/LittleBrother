package com.Pyramid.LittleBrother;

import org.bukkit.plugin.java.JavaPlugin;

public class LittleBrother extends JavaPlugin{
	private serverThread thread;
	
	@Override
	public void onEnable(){
		this.thread = new serverThread(getLogger());
		getLogger().info("LittleBrother插件已被加载！");
		this.getCommand("lb").setExecutor(new LBCommands(this));
	}
	
	@Override
    	public void onDisable() {
        	getLogger().info("LittleBrother插件已被卸载！");
    	}
}
