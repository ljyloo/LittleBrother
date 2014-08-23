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
	private String motd;
	private int port;
	
	public ServerThread(LittleBrother plugin, Logger logger, String motd, int port){
		this.plugin = plugin;
		this.logger = logger;
		this.motd = motd;
		this.port = port;
		this.start();
	}
	
	public void run(){
		this.server = new Server(this.logger, this.port, this.motd);
	}
	
	/**
	 * Call when disable.
	 */
	public void onDisable(){
		
	}
}
