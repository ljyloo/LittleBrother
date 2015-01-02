package com.Pyramid.LittleBrother;

/**
 * The Server class.
 * 
 * @see ServerThread
 */
public class Server {
	private LittleBrother plugin;
	private UDPServerSocket socket = null;
	private ServerThread[] threads = null;
	private boolean isRunning;
	
	public Server(LittleBrother plugin){
		this.plugin = plugin;
		isRunning = false;
	}

	public void onEnable(){
		this.startServer();
	}

	public void onDisable(){
		this.shutServer();
	}

	public synchronized void startThreads(int count){
		if(this.isRunning() && this.threads == null){
			if(count < 1){
				count = 1;
			}
			this.threads = new ServerThread[count];
			while ((--count) >= 0){
				this.threads[count] = new ServerThread(this);
			}
		}
	}

	public synchronized void stopThreads(){
		if(this.isRunning()){
			for (int i = 0; i < this.countThreads(); ++i){
				this.getThreadAt(i).onServerClose();
			}
			this.threads = null;
		}
	}

	public synchronized ServerThread[] getThreads(){
		return this.threads;
	}

	public synchronized int countThreads(){
		return this.getThreads().length;
	}

	public synchronized ServerThread getThreadAt(int index){
		if(this.isRunning() && index >= 0 && index < this.countThreads()){
			return this.threads[index];
		}
		return null;
	}

	public synchronized void startServer(){
		if(!this.isRunning()){
			this.getSocket().createSocket(this.getPlugin().getConfig().getInt("Server.port", 19132));
			this.startThreads(this.getPlugin().getConfig().getInt("Server.thread", 3));
			this.isRunning = true;
		}
	}

	public synchronized void shutServer(){
		if(this.isRunning()){
			this.stopThreads();
			this.getSocket().closeSocket();
			this.isRunning = false;
		}
	}

	public synchronized boolean isRunning(){
		return this.isRunning;
	}

	public synchronized UDPServerSocket getSocket(){
		return this.socket;
	}

	public synchronized LittleBrother getPlugin(){
		return this.plugin;
	}
}
