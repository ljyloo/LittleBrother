package com.Pyramid.LittleBrother;

import java.util.logging.Logger;

public class serverThread extends Thread{
	private Logger logger;
	private server server;
	
	public serverThread(Logger logger){
		this.logger = logger;
		this.start();
	}
	
	public void run(){
		this.server = new server(this.logger, 19132, "MCPE Server By LittleBrother");
	}
}
