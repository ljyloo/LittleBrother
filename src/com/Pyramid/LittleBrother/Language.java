package com.Pyramid.LittleBrother;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;

/**
 * Multi-languages system
 * 
 * TODO: Use onther format of language profile (Maybe ini?) and re-write this class. Add getter method (safe) instead of access the instance variables
(not safe)
 */
public class Language {
	/** @var LittleBrother */
	private LittleBrother plugin;
	
	/** @var HashMap */
	private Map<String, String> lang;
	
	private String name;
	
	//messages
	static String msgHelpVersion /*= "&a/LittleBrother version - Shows you the version of the plugin."*/;
	static String msgLoadTip;
	static String msgHelpCommand;
	static String msgHelpStatus;
	static String msgHelpReload;
	static String msgOnabledTip;
	static String msgOndisable;
	static String msgServerPort;
	static String msgServerMotd;
	
	public Language(LittleBrother plugin, String name) {
		this.plugin = plugin; // Store the plugin in situations where you need it.
		this.lang = new HashMap<String, String>();
		lang.clear();
		this.name = name;
	}
	
	/**
	 * Load message.
	 */
	public void loadmsg() {
		try{
			InputStream stream = this.plugin.getResource("languages/" + name + ".lang");
			BufferedReader reader = new BufferedReader(new InputStreamReader(stream));
			String buffer = "";
			int offset = 0;
			while(null != (buffer = reader.readLine())) {
				buffer = buffer.trim();
				if(buffer.isEmpty() || buffer.startsWith("#"))continue;
				//Line is empty or start with '#'
				offset = buffer.indexOf("=", 1);
				if(offset != -1 && offset >= 1) {
					lang.put(buffer.substring(0, offset - 1), buffer.substring(offset));
				}
			}
		} catch(Exception ex){
			plugin.getLogger().log(Level.WARNING, "Could not load language profile.");
		}
	}
}
