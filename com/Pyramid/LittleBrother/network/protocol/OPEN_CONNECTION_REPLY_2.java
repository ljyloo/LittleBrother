package com.Pyramid.LittleBrother.network.protocol;

import com.Pyramid.LittleBrother.network.Binary;

class OPEN_CONNECTION_REPLY_2 extends Packet{
	public byte ID = 0x08;
	
	public long serverID;
	public short clientPort;
	public short mtuSize;
	
	public void encode(){
		super.encode();
		this.put(Binary.MAGIC);
		this.putLong(serverID);
		this.putShote(clientPort);
		this.putShort(mtuSize);
		this.put(Binary.SC); //server security
	}
	
	public void decode(){
		super.decode();
		this.offset += 16; //Magic
		this.serverID = this.getLong();
		this.clientPort = this.getShort();
		this.mtuSize = this.getShort();
		//server security
	}
}
