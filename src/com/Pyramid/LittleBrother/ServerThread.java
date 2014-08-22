package com.Pyramid.LittleBrother;

import java.util.logging.Logger;

/**
 * This thread will run background.
 * It's the main thread of LittleBrother.
 * 
 * @see Thread
 */
public class ServerThread extends Thread{
	private LittleBrother plugin;
	private Logger logger;
	private Server server;
	private String Motd;
	private int port;
	
	public ServerThread(LittleBrother plugin, Logger logger){
		this.plugin = plugin;
		this.logger = logger;
		Motd = plugin.Motd;
		port = plugin.port;
		this.start();
	}
	
	public void run(){
		this.server = new Server(this.logger, port, Motd);
	}
	
	/**
	 * Call when disable.
	 */
	public void onDisable(){
		
	}
}
