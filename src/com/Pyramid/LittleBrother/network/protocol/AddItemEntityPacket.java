package com.Pyramid.LittleBrother.network.protocol;

import com.Pyramid.LittleBrother.Item;

class AddItemEntityPacket extends DataPacket{
	public int eid;
	public Item item;
	public float x;
	public float y;
	public float z;
	public byte yaw;
	public byte pitch;
	public byte roll;

	public byte pid(){
		return Info.ADD_ITEM_ENTITY_PACKET;
	}

	public void decode(){

	}

	public void encode(){
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
