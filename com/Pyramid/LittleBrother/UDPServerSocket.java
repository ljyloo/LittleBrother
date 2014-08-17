package com.Pyramid.LittleBrother;

import java.util.logging.Logger;
import java.net.*;

public class UDPServerSocket {
    /** @var Logger */
    private logger;
    /** @var DatagramSocket */
    private socket;
    private port;
    
    public UDPServerSocket(Logger logger, int port) {
        this.logger = logger;
        this.port = port;
        
        this.socket = new DatagramSocket(port);
    }
    
    public byte[] readPacket(int length){
        return new Byte[1];
    }
    
    public int writePacket(byte data[]){
        return 0;
    }
}
