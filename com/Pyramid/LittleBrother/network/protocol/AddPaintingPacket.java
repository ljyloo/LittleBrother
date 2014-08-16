package com.Pyramid.LittleBrother.network.protocol;

class AddPaintingPacket extends DataPacket{
	public int eid;
	public int x;
	public int y;
	public int z;
	public int direction;
	public String title;

	public function pid(){
		return Info.ADD_PAINTING_PACKET;
	}

	public function decode(){

	}

	public function encode(){
		this.reset();
		this.putInt(eid);
		this.putInt(x);
		this.putInt(y);
		this.putInt(z);
		this.putInt(direction);
		this.putString(title);
	}

}
