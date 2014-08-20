package com.Pyramid.LittleBrother;

import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Level;

/**
 * Multi-languages system
 * 
 * TODO: Use onther format of language profile (Maybe ini?) and re-write this class. Add getter method (safe) instead of access the instance variables
(not safe)
 */
public class Language {
	private LittleBrother plugin;
	
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
	
	public Language(LittleBrother plugin) {
		this.plugin = plugin; // Store the plugin in situations where you need it.
	}
	
	/**
	 * Load message.
	 */
	public void loadmsg() {
		try{
			InputStream stream = this.plugin.getResource("languages/english.lang");
		} catch(IOException ex){
			plugin.getLogger().log(Level.SEVERE, "Could not load english language profile.");
		}
	}
}
