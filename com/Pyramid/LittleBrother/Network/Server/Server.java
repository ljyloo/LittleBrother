package com.Pyramid.LittleBrother.Network.Server.Server;

import java.util.logging.Logger;

public class Server {
	private Logger logger;
	private int port;
	private String motd;
	
	public Server(Logger logger, int port, String motd){
		this.logger = logger;
		this.port = port;
		this.motd = motd;
	}
}
