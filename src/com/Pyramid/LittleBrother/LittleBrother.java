package com.Pyramid.LittleBrother;

import org.bukkit.plugin.java.JavaPlugin;

/**
 * Main class of LittleBrother.
 * 
 * @see JavaPlugin
 */
public class LittleBrother extends JavaPlugin{
	/** @var ServerThread */
	private ServerThread thread;
	
	/** @var ConfigAccessor */
	public ConfigAccessor config;
	
	public String Motd;
	
	public int port;
	
	/** @var Language */
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
		lang = new Language(this, "english");
		lang.loadmsg();//load message.
		
		getLogger().info(lang("server.enable.tip"));
		
		//TODO
		this.thread = new ServerThread(this, getLogger(), "test", 19132);
		
		Motd = this.config.getConfig().getString("motd");
		port = this.config.getConfig().getInt("port");
		this.getCommand("LittleBrother").setExecutor(new LBCommands(this));
	}
	
	/**
	 * Get Language class
	 * @return String
	 */
	public String lang(String key){
		return lang.get(key);
	}
	
	/**
	 * Call when disable.
	 */
    public void onDisable() {
        getLogger().info(lang("server.disable"));
        thread.onDisable();
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
