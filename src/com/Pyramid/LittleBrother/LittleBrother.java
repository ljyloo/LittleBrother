package com.Pyramid.LittleBrother;

import org.bukkit.plugin.java.JavaPlugin;

public class LittleBrother extends JavaPlugin{
	private ServerThread thread;
	public ConfigAccessor config;
	public Messages msgs;
	public ConfigAccessor Msg;
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
		saveDefaultConfig();
		Msg = new ConfigAccessor(this,"msg.yml");
		//Msg.getConfig().options().header("This is Messages.");
		Msg.saveDefaultConfig();
		//this.Msg.saveConfig();;
		this.config = new ConfigAccessor(this,"config.yml");
		//this.Msg.saveDefaultConfig();
		Messages msgs = new Messages(this);
		getLogger().info(Messages.msgLoadTip);
		this.thread = new ServerThread(this, getLogger());
		getLogger().info(Messages.msgOnabledTip);
		Motd = this.config.getConfig().getString("motd");
		port = this.config.getConfig().getInt("port"); 
		getLogger().info(Messages.msgServerMotd + Motd);
		getLogger().info(Messages.msgServerPort + port);
		this.getCommand("LittleBrother").setExecutor(new LBCommands(this));
	}

    public void onDisable() {
        	getLogger().info(Messages.msgOndisable);
    	}
	
	/*public FileConfiguration load(File file){
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
	}*/

}
