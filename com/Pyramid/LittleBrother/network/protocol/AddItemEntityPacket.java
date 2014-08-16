package com.Pyramid.LittleBrother.network.protocol;

import com.Pyramid.LittleBrother.network.Binary;//update

class AddItemEntityPacket extends DataPacket{
	public int eid;
	public Item item;
	public float x;
	public float y;
	public float z;
	public byte yaw;
	public byte pitch;
	public byte roll;

	public function pid(){
		return Info.ADD_ITEM_ENTITY_PACKET;
	}

	public function decode(){

	}

	public function encode(){
		this.reset();
		this.putInt(eid);
		this.putSlot(item);
		this.putFloat(x);
		this.putFloat(y);
		this.putFloat(z);
		this.putByte(yaw);
		this.putByte(pitch);
		this.putByte(roll);
	}

}
