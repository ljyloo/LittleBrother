package com.Pyramid.LittleBrother;

import java.util.logging.Logger;

public class ServerThread extends Thread{
	private Logger logger;
	private Server server;
	private String Motd;
	private int port;
	
	public ServerThread(Logger logger){
		this.logger = logger;
		Motd = LittleBrother.Motd;
		port = LittleBrother.port;
		this.start();
	}
	
	public void run(){
		this.server = new Server(this.logger, port, Motd);
	}
}
