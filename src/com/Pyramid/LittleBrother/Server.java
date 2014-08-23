package com.Pyramid.LittleBrother;

import java.util.logging.Logger;

/**
 * The Server class.
 * 
 * @see ServerThread
 */
public class Server {
	/** @var Logger */
	private Logger logger;
	private int port;
	private String motd;
	
	protected UDPServerSocket socket;
	
	public Server(Logger logger, int port, String motd){
		this.logger = logger;
		this.port = port;
		this.motd = motd;
		this.run();
	}
	
	public void run(){
		this.socket = new UDPServerSocket(this.logger, this.port);
	}
	
	public String getMotd(){
		return motd;
	}
}
