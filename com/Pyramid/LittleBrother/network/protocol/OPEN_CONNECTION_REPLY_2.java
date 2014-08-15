package com.Pyramid.LittleBrother.network.protocol;

import com.Pyramid.LittleBrother.network.Binary;

class OPEN_CONNECTION_REPLY_2 extends Packet{
	public byte ID = 0x08;
	//0x043f57fefd
	public byte[] SC = {(byte)0x04, (byte)0x3f, (byte)0x57, (byte)0xfe, (byte)0xfd};
	
	public long serverID;
	public short clientPort;
	public short mtuSize;
	
	public void encode(){
		super.encode();
		this.put(Binary.MAGIC);
		this.putLong(serverID);
		this.putShote(clientPort);
		this.putShort(mtuSize);
		this.put(this.SC); //server security
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
