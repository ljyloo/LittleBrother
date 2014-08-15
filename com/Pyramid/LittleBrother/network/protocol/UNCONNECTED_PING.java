package com.Pyramid.LittleBrother.network.protocol;

import com.Pyramid.LittleBrother.network.Binary;

class UNCONNECTED_PING extends Packet{
	public byte ID = 0x01;
	
	public long pingID;
	
	public void encode(){
		super.encode();
		this.putLong(pingID);
		this.put(Binary.getMAGIC());
	}
	
	public void decode(){
		super.decode();
		this.pingID = this.getLong();
		//magic
	}
}
