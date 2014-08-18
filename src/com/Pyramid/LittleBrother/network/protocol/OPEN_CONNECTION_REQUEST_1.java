package com.Pyramid.LittleBrother.network.protocol;

import com.Pyramid.LittleBrother.network.Binary;

class OPEN_CONNECTION_REQUEST_1 extends Packet{
	public byte ID = 0x05;
	
	public byte protocol = Binary.PROTOCOL;
	public short mtuSize;
	
	public void encode(){
		super.encode();
		this.put(Binary.MAGIC);
		this.putByte(protocol);
		this.put(Binary.getNullPayload(this.mtuSize - 18));
	}
	
	public void decode(){
		super.decode();
		this.offset += 16; //Magic
		this.protocol = this.getByte();
		this.mtuSize = (short) this.getLen();
	}
}
