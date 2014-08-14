package com.Pyramid.LittleBrother;

import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;

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
    	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if (cmd.getName().equalsIgnoreCase("lb")) { // If the player typed /basic then do the following...
			// doSomething
			return true;
		} //If this has happened the function will return true. 
        // If this hasn't happened the value of false will be returned.
		return false; 
	}
}
