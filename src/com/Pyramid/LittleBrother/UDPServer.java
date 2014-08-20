package com.Pyramid.LittleBrother;

import java.util.logging.Logger;
import java.net.*;

/**
 * Used to connect MinecraftPE
 * 
 * @see DatagramSocket
 */
public class UDPServer {
    /** @var Logger */
    @SuppressWarnings("unused")
	private Logger logger;
    
    /** @var DatagramSocket */
    @SuppressWarnings("unused")
    private DatagramSocket socket;
    
    @SuppressWarnings("unused")
    private int port;
    
    public UDPServer(Logger logger, int port) {
        this.logger = logger;
        this.port = port;
        
        try {
			this.socket = new DatagramSocket(port);
		} catch (SocketException e) {
			e.printStackTrace();
		}
    }
}
