package com.Pyramid.LittleBrother.network.protocol;

class AddPaintingPacket extends DataPacket{
	public int eid;
	public int x;
	public int y;
	public int z;
	public int direction;
	public String title;

	public byte pid(){
		return Info.ADD_PAINTING_PACKET;
	}

	public void decode(){

	}

	public void encode(){
		this.reset();
		this.putInt(eid);
		this.putInt(x);
		this.putInt(y);
		this.putInt(z);
		this.putInt(direction);
		this.putString(title);
	}

}
