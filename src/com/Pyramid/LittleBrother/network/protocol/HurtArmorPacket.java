package com.Pyramid.LittleBrother.network.protocol;

class HurtArmorPacket extends DataPacket{
	public byte health;

	public byte pid(){
		return Info.HURT_ARMOR_PACKET;
	}

	public void decode(){

	}

	public void encode(){
		this.reset();
		this.putByte(health);
	}

}
