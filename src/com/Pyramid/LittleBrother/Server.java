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
	
	protected UDPServer udp;
	
	public Server(Logger logger, int port, String motd){
		this.logger = logger;
		this.port = port;
		this.motd = motd;
	}
	
	public void run(){
		this.udp = new UDPServer(this.logger, this.port);
	}
	
	public String getMotd(){
		return motd;
	}
}
