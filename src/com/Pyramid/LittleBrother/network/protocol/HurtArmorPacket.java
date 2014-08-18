package com.Pyramid.LittleBrother.network.protocol;

class HurtArmorPacket extends DataPacket{
	public byte health;

	public byte pid(){
		return Info.HURT_ARMOR_PACKET;
	}

	public function decode(){

	}

	public function encode(){
		this.reset();
		this.putByte(health);
	}

}
