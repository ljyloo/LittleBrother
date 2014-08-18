package com.Pyramid.LittleBrother.network.protocol;

class ContainerOpenPacket extends DataPacket{
	public byte windowid;
	public byte type;
	public short slots;
	public int x;
	public int y;
	public int z;

	public byte pid(){
		return Info.CONTAINER_OPEN_PACKET;
	}

	public void decode(){

	}

	public void encode(){
		this.reset();
		this.putByte(windowid);
		this.putByte(type);
		this.putShort(slots);
		this.putInt(x);
		this.putInt(y);
		this.putInt(z);
	}

}
