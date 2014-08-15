package com.Pyramid.LittleBrother.network.protocol;

import com.Pyramid.LittleBrother.network.Binary;

class OPEN_CONNECTION_REQUEST_2 extends Packet{
	public byte ID = 0x07;
	
	public int clientID;
	public int serverPort;
	public int mtuSize;
	
	public void encode(){
		super.encode();
		this.put(Binary.MAGIC);
		this.putByte((byte)0); //client security (5 bytes?)
		this.putShort(this.serverPort);
		this.putShort(this.mtuSize);
		this.putLong(this.clientID);
	}

	public void decode(){
		super.decode();
		this.offset += 16; //Magic
		this.getByte((byte)5); //Client security
		this.serverPort = this.getShort(false);
		this.mtuSize = this.getShort(false);
		this.clientID = this.getLong();
	}
}
