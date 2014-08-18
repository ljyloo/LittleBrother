package com.Pyramid.LittleBrother;

import java.io.File;
import java.io.IOException;

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.plugin.java.JavaPlugin;

public class LittleBrother extends JavaPlugin{
	private ServerThread thread;
	public ConfigAccessor config;
	public String Motd;
	public int port;
	
	//public void onload(){
	//	saveDefaultConfig();
	//}

	public void onEnable(){
		//if(!getDataFolder().exists())
		//{
		//	getDataFolder().mkdir();
		//	new File(getDataFolder(), "config.yml");
		//}
		this.thread = new ServerThread(this, getLogger());
		this.config = new ConfigAccessor(this,"config.yml");
		this.config.saveDefaultConfig();
		getLogger().info("LittleBrother have been onabled！");
		Motd = this.getConfig().getString("motd");
		port = this.getConfig().getInt("port"); 
		getLogger().info("MCPE Server Motd:" + Motd);
		getLogger().info("MCPE Server Port:" + port);
		this.getCommand("LittleBrother").setExecutor(new LBCommands(this));
	}

    public void onDisable() {
        	getLogger().info("LittleBrother have been disabled！");
    	}
	
	public FileConfiguration load(File file){
		if(!file.exists()){
			try{
				file.createNewFile();
			}catch(IOException e){
				e.printStackTrace();
			}
		}
		return YamlConfiguration.loadConfiguration(file);
	}
	
	public FileConfiguration load(String path){
		File file=new File(path);
			if(!file.exists()){
				try{
					file.createNewFile();
				}catch(IOException e){
					e.printStackTrace();
				}
			}
		return YamlConfiguration.loadConfiguration(new File(path));
	}

}
