package com.Pyramid.LittleBrother;

import java.util.logging.Logger;

public class ServerThread extends Thread{
	private Logger logger;
	private Server server;
	
	public ServerThread(Logger logger){
		this.logger = logger;
		this.start();
	}
	
	public void run(){
		this.server = new Server(this.logger, 19132, "MCPE Server By LittleBrother");
	}
}
