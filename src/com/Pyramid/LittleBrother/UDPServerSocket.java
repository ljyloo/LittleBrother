package com.Pyramid.LittleBrother;

import java.io.IOException;
import java.net.*;

/**
 * Used to connect MinecraftPE
 * 
 * @see DatagramSocket
 */
public class UDPServerSocket {
    private DatagramSocket socket = null;
    private Server server;
    
    private int port;
    
    public UDPServerSocket(Server server) {
        this.server = server;
    }

    public synchronized boolean createSocket(int port){
        try {
            this.socket = new DatagramSocket(port);
            return true;
        } catch (SocketException e){
            return false;
        }
    }

    public synchronized boolean writePacket(byte[] data, SocketAddress target){
        if (this.isValid()) {
            DatagramPacket packet = new DatagramPacket(data, data.length, target);
            try {
                this.getInternalSocket().send(packet);
                return true;
            } catch (IOException e) {
                return false;
            }
        }
        return false;
    }

    public synchronized DatagramPacket readPacket(){
        if(this.isValid()) {
            DatagramPacket packet = new DatagramPacket(new byte[65535], 65535);
            try {
                this.getInternalSocket().receive(packet);
                return packet;
            } catch (IOException e){
                return null;
            }
        }
        return null;
    }

    public synchronized boolean isValid(){
        return this.getServer().isRunning() && this.getInternalSocket() != null && this.getInternalSocket().isBound();
    }

    public synchronized void closeSocket() {
        this.socket.close();
    }
    
    public synchronized DatagramSocket getInternalSocket(){
    	return this.socket;
    }

    private synchronized Server getServer(){
        return this.server;
    }
    
}
