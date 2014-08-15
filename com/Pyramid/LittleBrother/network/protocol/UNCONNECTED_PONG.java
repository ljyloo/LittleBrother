package com.Pyramid.LittleBrother.network.protocol;

import com.Pyramid.LittleBrother.network.Binary;

class UNCONNECTED_PONG extends Packet{
	public byte ID = 0x1c;
	
	public long pingID;
	public long serverID;
	public String serverName;
	
	public void encode(){
		super.encode();
		this.putLong(pingID);
		this.putLong(serverID);
		this.put(Binary.getMAGIC());
		this.putString(serverName);
	}
	
	public void decode(){
		super.decode();
		this.pingID = this.getLong();
		this.serverID = this.getLong();
		this.offset += 16; //magic
		this.serverName = this.getString();
	}
}
