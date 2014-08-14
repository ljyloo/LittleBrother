package com.Pyramid.LittleBrother;

import java.util.logging.Logger;

public class server {
	private Logger logger;
	private int port;
	private String motd;
	
	public server(Logger logger, int port, String motd){
		this.logger = logger;
		this.port = port;
		this.motd = motd;
	}
}
