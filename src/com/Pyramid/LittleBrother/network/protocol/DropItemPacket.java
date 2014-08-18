package com.Pyramid.LittleBrother.network.protocol;

import com.Pyramid.LittleBrother.Item;

class DropItemPacket extends DataPacket{
	public int eid;
	public byte unknown;
	public Item item;

	public byte pid(){
		return Info.DROP_ITEM_PACKET;
	}

	public void decode(){
		eid = this.getInt();
		unknown = this.getByte();
		item = this.getSlot();
	}

	public void encode(){

	}

}
