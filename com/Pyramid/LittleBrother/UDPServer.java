package com.Pyramid.LittleBrother;

import java.util.logging.Logger;
import java.net.*;

public class UDPServer {
    /** @var Logger */
    private logger;
    /** @var DatagramSocket */
    private socket;
    private port;
    
    public UDPServer(Logger logger, int port) {
        this.logger = logger;
        this.port = port;
        
        this.socket = new DatagramSocket(port);
    }
}
