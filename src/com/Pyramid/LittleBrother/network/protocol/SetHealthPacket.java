package com.Pyramid.LittleBrother.network.protocol;

class SetHealthPacket extends DataPacket{
	public byte health;

	public byte pid(){
		return Info::SET_HEALTH_PACKET;
	}

	public void decode(){
		health = this.getByte();
	}

	public void encode(){
		this.reset();
		this.putByte(health);
	}

}
