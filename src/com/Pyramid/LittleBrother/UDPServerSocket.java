package com.Pyramid.LittleBrother;

import java.util.logging.Logger;
import java.net.*;

/**
 * Used to connect MinecraftPE
 * 
 * @see DatagramSocket
 */
public class UDPServerSocket {
    /** @var Logger */
	private Logger logger;
    
    /** @var DatagramSocket */
    private DatagramSocket socket;
    
    private int port;
    
    public UDPServerSocket(Logger logger, int port) {
        this.logger = logger;
        this.port = port;
        
        try {
			this.socket = new DatagramSocket(port);
		} catch (SocketException e) {
			e.printStackTrace();
		}
    }
    
    public DatagramSocket getSocket(){
    	return this.socket;
    }
    
    public void close(){
    	this.socket.close();
    }
    
    
}
