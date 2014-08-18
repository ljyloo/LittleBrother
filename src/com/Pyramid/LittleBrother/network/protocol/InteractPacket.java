package com.Pyramid.LittleBrother.network.protocol;

class InteractPacket extends DataPacket{
	public byte action;
	public int eid;
	public int target;

	public byte pid(){
		return Info.INTERACT_PACKET;
	}

	public void decode(){
		action = this.getByte();
		eid = this.getInt();
		target = this.getInt();
	}

	public void encode(){
		this.reset();
		this.putByte(action);
		this.putInt(eid);
		this.putInt(target);
	}

}
