package com.Pyramid.LittleBrother.network.protocol;

class RespawnPacket extends DataPacket{
	public int eid;
	public float x;
	public float y;
	public float z;

	public byte pid(){
		return Info.RESPAWN_PACKET;
	}

	public void decode(){
		eid = this.getInt();
		x = this.getFloat();
		y = this.getFloat();
		z = this.getFloat();
	}

	public void encode(){
		this.reset();
		this.putInt(eid);
		this.putFloat(x);
		this.putFloat(y);
		this.putFloat(z);
	}

}
