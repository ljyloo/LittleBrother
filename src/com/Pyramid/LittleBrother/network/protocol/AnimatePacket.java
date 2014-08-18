package com.Pyramid.LittleBrother.network.protocol;

class AnimatePacket extends DataPacket{
	public byte action;
	public int eid;

	public byte pid(){
		return Info.ANIMATE_PACKET;
	}

	public void decode(){
		action = this.getByte();
		eid = this.getInt();
	}

	public void encode(){
		this.reset();
		this.putByte(action);
		this.putInt(eid);
	}

}
