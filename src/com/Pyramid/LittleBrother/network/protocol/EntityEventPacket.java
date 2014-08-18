package com.Pyramid.LittleBrother.network.protocol;

class EntityEventPacket extends DataPacket{
	public int eid;
	public byte event;

	public byte pid(){
		return Info.ENTITY_EVENT_PACKET;
	}

	public void decode(){
		eid = this.getInt();
		event = this.getByte();
	}

	public void encode(){
		this.reset();
		this.putInt(eid);
		this.putByte(event);
	}

}
