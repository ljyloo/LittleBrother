package com.Pyramid.LittleBrother.network.protocol;

import com.Pyramid.LittleBrother.network.Binary;

class SERVER_HANDSHAKE_DataPacket extends Packet{
	public byte ID = 0x10;
	
	public short port;
	public long session;
	public long session2;
	
	public void encode(){
		super.encode();
		this.put(Binary.SC); //cookie + security flags
		this.putShort(this.port);
		byte[][] data = {
			{(byte)0xf5, (byte)0xff, (byte)0xff, (byte)0xf5},
			{(byte)0xff, (byte)0xff, (byte)0xff, (byte)0xff},
			{(byte)0xff, (byte)0xff, (byte)0xff, (byte)0xff},
			{(byte)0xff, (byte)0xff, (byte)0xff, (byte)0xff},
			{(byte)0xff, (byte)0xff, (byte)0xff, (byte)0xff},
			{(byte)0xff, (byte)0xff, (byte)0xff, (byte)0xff},
			{(byte)0xff, (byte)0xff, (byte)0xff, (byte)0xff},
			{(byte)0xff, (byte)0xff, (byte)0xff, (byte)0xff},
			{(byte)0xff, (byte)0xff, (byte)0xff, (byte)0xff},
			{(byte)0xff, (byte)0xff, (byte)0xff, (byte)0xff}
		};
		this.putDataArray(data);
		byte[] temp = {(byte)0x00, (byte)0x00};
		this.put(temp);
		this.putLong(session);
		this.putLong(session2);
	}
	
	public void decode(){
		super.decode();
		//TODO, not needed yet
	}
	
	private void putDataArray(byte[][] data){
		for(int n = 0; n < data.length; n++){
			this.putTriad(data[n].length);
			this.put(data[n]);
		}
	}
}
