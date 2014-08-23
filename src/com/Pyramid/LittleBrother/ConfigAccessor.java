package com.Pyramid.LittleBrother;

import java.io.File;

import java.io.IOException;
import java.util.logging.Level;
 
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.plugin.java.JavaPlugin;

/**
 * LittleBrother's config accessor.
 */
public class ConfigAccessor{
 
    private final String fileName;
    private final JavaPlugin plugin;
    
    /** @var File */
    private File configFile;
    
    /** @var FileConfiguration */
    private FileConfiguration fileConfiguration;
    
    /**
     * Init
     * @param plugin
     * @param fileName
     */
    public ConfigAccessor(JavaPlugin plugin, String fileName) {
        if (plugin == null)
            throw new IllegalArgumentException("plugin can not be null");
        this.plugin = plugin;
        this.fileName = fileName;
        File dataFolder = plugin.getDataFolder();
        if (dataFolder == null)
            //throw new IllegalStateException(plugin.lang("exception.config.init.datafolder"));
        this.configFile = new File(plugin.getDataFolder(), fileName);
    }
    
    /**
     * Use to reload config when needed.
     */
    public void reloadConfig() {        
        //plugin.reloadConfig();
    	//fileConfiguration = YamlConfiguration.loadConfiguration(configFile);
    	//super.reloadConfig();
        //Look for defaults in the jar
        /*InputStream defConfigStream = plugin.getResource(fileName);
        if (defConfigStream != null) {
        	//TODO
            YamlConfiguration defConfig = YamlConfiguration.loadConfiguration(new InputStreamReader(defConfigStream));
            fileConfiguration.setDefaults(defConfig);
        }
    		if (configFile == null)
    		{
    			File dataFolder = plugin.getDataFolder();
    			if (dataFolder == null)
    				throw new IllegalStateException();
    			configFile = new File(dataFolder, fileName);
    		}
    		fileConfiguration = YamlConfiguration.loadConfiguration(configFile);
    		InputStream defConfigStream = plugin.getResource(fileName);
    		if (defConfigStream != null)
    		{
    			YamlConfiguration defConfig = YamlConfiguration.loadConfiguration(defConfigStream);
    			fileConfiguration.setDefaults(defConfig);
    		}*/
    }
    
    /**
     * return configuration.
     * @return FileConfiguration
     */
    public FileConfiguration getConfig() {
        if (fileConfiguration == null) {
            this.reloadConfig();
        }
        return fileConfiguration;
    }
    
    /**
     * Save changes
     */
    public void saveConfig() {
        if (fileConfiguration != null && configFile != null) {
            try {
                getConfig().save(configFile);
            } catch (IOException ex) {
                //plugin.getLogger().log(Level.SEVERE, plugin.lang("exception.config.save") + " " + configFile, ex);
            }
        }
    }
    
    /**
     * Copy the default config from plugin packet.
     */
    public void saveDefaultConfig() {
        if (!configFile.exists()) {            
            this.plugin.saveResource(fileName, false);
        }
    }
    
}
