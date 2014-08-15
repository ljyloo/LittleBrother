package com.Pyramid.LittleBrother.network.protocol;

class CLIENT_CONNECT_DataPacket extends Packet{
	public byte ID = 0x09;
	
	public long clientID;
	public long session;
	public byte unknown;
	
	public void encode(){
		super.encode();
		this.putLong(clientID);
		this.putLong(session);
		this.putByte((byte) 0x00);
	}
	
	public void decode(){
		super.decode();
		this.clientID = this.getLong();
		this.session = this.getLong();
		this.unknown = this.getByte();
	}
}
