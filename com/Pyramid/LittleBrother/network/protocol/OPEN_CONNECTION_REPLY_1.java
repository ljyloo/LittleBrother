package com.Pyramid.LittleBrother.network.protocol;

import com.Pyramid.LittleBrother.network.Binary;

class OPEN_CONNECTION_REPLY_1 extends Packet{
	public byte ID = 0x06;
	
	public long serverID;
	public short mtuSize;
	
	public void encode(){
		super.encode();
		this.put(Binary.MAGIC);
		this.putLong(this.serverID);
		this.putByte((byte) 0); //Server security
		this.putShort(this.mtuSize);
	}
	
	public void decode(){
		super.decode();
		this.offset += 16; //Magic
		this.serverID = this.getLong();
		this.getByte(); //security
		this.mtuSize = this.getShort();
	}
}

