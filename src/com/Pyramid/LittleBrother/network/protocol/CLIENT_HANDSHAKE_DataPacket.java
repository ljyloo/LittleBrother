package com.Pyramid.LittleBrother.network.protocol;

class CLIENT_HANDSHAKE_DataPacket extends Packet{
	public byte ID = 0x13;
	
	public byte[] cookie;
	public byte security;
	public short port;
	public byte[] dataArray0;
	public byte[][] dataArray;
	public byte[] timestamp;
	public long session2;
	public long session;
	
	public void encode(){
		super.encode();
	}
	
	public void decode(){
		super.decode();
		this.cookie = this.get(4);
		this.security = this.getByte();
		this.port = this.getShort();
		this.dataArray0 = this.get(this.getByte());
		this.dataArray = this.getDataArray(9);
		this.timestamp = this.get(2);
		this.session2 = this.getLong();
		this.session = this.getLong();
	}
	
	private byte[][] getDataArray(int len){
		byte[][] data = new byte[len][];
		for(int n = 1; (n < len) && (!this.feof()); ++n){
			data[n - 1] = this.get(this.getTriad());
		}
		
		return data;
	}
}

