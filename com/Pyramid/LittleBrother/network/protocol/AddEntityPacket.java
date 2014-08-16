package com.Pyramid.LittleBrother.network.protocol;

import com.Pyramid.LittleBrother.network.Binary;

class AddEntityPacket extends DataPacket{
	public int eid;
	public byte type;
	public float x;
	public float y;
	public float z;
	public int did;
	public short speedX;
	public short speedY;
	public short speedZ;

	public byte pid(){
		return Info.ADD_ENTITY_PACKET;
	}

	public void decode(){

	}

	public void encode(){
		this.reset();
		this.putInt(eid);
		this.putByte(type);
		this.putFloat(x);
		this.putFloat(y);
		this.putFloat(z);
		this.putInt(did);
		if(did > 0){
			this.putShort(speedX * 8000);
			this.putShort(speedY * 8000);
			this.putShort(speedZ * 8000);
		}
	}

}
