package com.Pyramid.LittleBrother.network.protocol;

import com.Pyramid.LittleBrother.network.Binary;

class OPEN_CONNECTION_REQUEST_2 extends Packet{
	public byte ID = 0x07;
	//0x043f57fefd
	public static byte[] SC = {(byte)0x04, (byte)0x3f, (byte)0x57, (byte)0xfe, (byte)0xfd};
	
	public long clientID;
	public short serverPort;
	public short mtuSize;
	
	public void encode(){
		super.encode();
		this.put(Binary.MAGIC);
		this.put(Binary.SC); //client security (5 bytes?)
		this.putShort(serverPort);
		this.putShort(mtuSize);
		this.putLong(clientID);
	}
	
	public void decode(){
		super.decode();
		this.offset += 16; //Magic
		this.get(5); //Client security
		this.serverPort = this.getShort();
		this.mtuSize = this.getShort();
		this.clientID = this.getLong();
	}
}
