package com.Pyramid.LittleBrother;

import org.bukkit.plugin.java.JavaPlugin;

/**
 * Main class of LittleBrother.
 * 
 * @see JavaPlugin
 */
public class LittleBrother extends JavaPlugin{
	private ServerThread thread;
	public ConfigAccessor config;
	public Language msgs;
	public ConfigAccessor Msg;
	public String Motd;
	public int port;
	private Language lang;
	
	//public void onload(){
	//	saveDefaultConfig();
	//}
	
	/**
	 * Call when enable.
	 */
	public void onEnable(){
		//if(!getDataFolder().exists())
		//{
		//	getDataFolder().mkdir();
		//	new File(getDataFolder(), "config.yml");
		//}
		saveDefaultConfig();
		lang = new Language(this);
		lang.loadmsg();//load message.
		
		getLogger().info(Language.msgLoadTip);
		this.thread = new ServerThread(this, getLogger());
		getLogger().info(Language.msgOnabledTip);
		Motd = this.config.getConfig().getString("motd");
		port = this.config.getConfig().getInt("port"); 
		getLogger().info(Language.msgServerMotd + Motd);
		getLogger().info(Language.msgServerPort + port);
		this.getCommand("LittleBrother").setExecutor(new LBCommands(this));
	}
	
	/**
	 * Call when disable.
	 */
    public void onDisable() {
        	getLogger().info(Language.msgOndisable);
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
