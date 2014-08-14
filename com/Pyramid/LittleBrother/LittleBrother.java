package com.Pyramid.LittleBrother;

import org.bukkit.plugin.java.JavaPlugin;

public class LittleBrother extends JavaPlugin{
	private serverThread thread;
	
	public void onEnable(){
		this.thread = new serverThread(getLogger());
		getLogger().info("LittleBrother插件已被加载！");
	}
}
