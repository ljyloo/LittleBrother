package com.Pyramid.LittleBrother;

public class Messages {
	private LittleBrother plugin;
	public ConfigAccessor Msg;
	
	//messages
	static String msgHelpVersion /*= "&a/LittleBrother version - Shows you the version of the plugin."*/;
	static String msgLoadTip;
	static String msgHelpCommand;
	static String msgHelpStatus;
	static String msgHelpReload;
	
	public Messages(LittleBrother plugin) {
		this.plugin = plugin; // Store the plugin in situations where you need it.
		this.Msg = this.plugin.Msg;
		this.loadmsg();
		//Motd = this.plugin.Motd;
		//port = this.plugin.port;
	}

	public void loadmsg() {
		msgLoadTip = this.Msg.getConfig().getString("msgLoadTip", msgLoadTip);
		msgHelpVersion = this.Msg.getConfig().getString("msgHelpVersion",msgHelpVersion);
		msgHelpCommand = this.Msg.getConfig().getString("msgHelpCommand",msgHelpCommand);
		msgHelpStatus = this.Msg.getConfig().getString("msgHelpStatus",msgHelpStatus);
		msgHelpReload =this.Msg.getConfig().getString("msgHelpReload",msgHelpReload);
	}

	/*private void savemsg() {
		
	}*/

}
