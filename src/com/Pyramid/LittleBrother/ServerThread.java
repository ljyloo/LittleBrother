package com.Pyramid.LittleBrother;

import java.util.logging.Logger;

/**
 * This thread will run background.
 * It's the main thread of LittleBrother.
 * 
 * @see Thread
 */
public class ServerThread extends Thread{
	private Server server;
	
	public ServerThread(Server server){
		this.server = server;
		this.start();
	}

	@Override
	public void run(){

	}
	
	/**
	 * Call when disable.
	 */
	public void onServerClose(){
		
	}

	private synchronized Server getServer(){
		return this.server;
	}
}
