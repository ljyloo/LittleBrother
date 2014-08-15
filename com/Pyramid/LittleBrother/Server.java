package com.Pyramid.LittleBrother;

import java.util.logging.Logger;

public class Server {
	private Logger logger;
	private int port;
	private static String motd;
	
	public Server(Logger logger, int port, String motd){
		this.logger = logger;
		this.port = port;
		this.motd = motd;
	}
	
	public static String getMotd(){
		return motd;
	}
}
