package com.Pyramid.LittleBrother;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;

/**
 * Multi-languages system
 */
public class Language {
	private LittleBrother plugin;
	private Map<String, String> lang;
	
	private String name;

	public static Language instance;
	
	public Language(LittleBrother plugin, String name) {
		this.plugin = plugin; // Store the plugin in situations where you need it.
		this.lang = new HashMap<String, String>();
		lang.clear();
		this.name = name;
		Language.instance = this;
	}
	
	/**
	 * Get lang
	 * @param key
	 * @return String|null
	 */
	public String get(String key){
		return lang.get(key);
	}
	
	/**
	 * Get lang
	 * @param key
	 * @return String|null
	 */
	public static String find(String key){
		return Language.getInstance().get(key);
	}

	public static Language getInstance(){
		return Language.instance;
	}
	
	/**
	 * Load message.
	 */
	public void load() {
		try{
			InputStream stream = this.plugin.getResource("languages/" + name.toLowerCase() + ".lang");
			if(stream == null){
				plugin.getLogger().warning("Loading language: " + name + " error! Trying to load english.");
				stream = this.plugin.getResource("languages/english.lang");
			}
			BufferedReader reader = new BufferedReader(new InputStreamReader(stream));
			String buffer;
			int offset;
			while(null != (buffer = reader.readLine())) {
				buffer = buffer.trim();
				if(buffer.isEmpty() || buffer.startsWith("#"))continue;
				//Line is empty or start with '#'
				offset = buffer.indexOf("=", 1);
				if(offset != -1 && offset >= 1) {
					lang.put(buffer.substring(0, offset - 1), buffer.substring(offset));
				}
			}
			try{
				stream.close();
			} catch(IOException ignored){}
		} catch(Exception ex){
			plugin.getLogger().log(Level.WARNING, "Could not load language profile.");
		}
	}
}
