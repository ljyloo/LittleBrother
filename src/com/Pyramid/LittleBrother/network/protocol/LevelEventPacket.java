package com.Pyramid.LittleBrother.network.protocol;

class LevelEventPacket extends DataPacket{
	public short evid;
	public int x;
	public short y;
	public int z;
	public int data;

	public byte pid(){
		return Info.LEVEL_EVENT_PACKET;
	}

	public void decode(){

	}

	public void encode(){
		this.reset();
		this.putShort(evid);
		this.putInt(x);
		this.putShort(y);
		this.putInt(z);
		this.putInt(data);
	}

}
