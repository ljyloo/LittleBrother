package com.Pyramid.LittleBrother;

import java.util.logging.Logger;

public class Server {
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
