package com.Pyramid.LittleBrother;

import java.io.File;
import java.io.IOException;

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.plugin.java.JavaPlugin;

public class LittleBrother extends JavaPlugin{
	private ServerThread thread;
	static ConfigAccessor config;
	static String Motd;
	static int port;
	
	//public void onload(){
	//	saveDefaultConfig();
	//}
	
	@Override
	public void onEnable(){
		//if(!getDataFolder().exists())
		//{
		//	getDataFolder().mkdir();
		//	new File(getDataFolder(), "config.yml");
		//}
		this.thread = new ServerThread(getLogger());
		this.config = new ConfigAccessor(this,"config.yml");
		this.config.saveDefaultConfig();
		getLogger().info("LittleBrother插件已被加载！");
		Motd = this.getConfig().getString("motd");
		port = this.getConfig().getInt("port"); 
		getLogger().info("MCPE服务器Motd:" + Motd);
		getLogger().info("MCPE服务器Port:" + port);
		this.getCommand("LittleBrother").setExecutor(new LBCommands(this));
	}
	
	@Override
    public void onDisable() {
        	getLogger().info("LittleBrother插件已被卸载！");
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
