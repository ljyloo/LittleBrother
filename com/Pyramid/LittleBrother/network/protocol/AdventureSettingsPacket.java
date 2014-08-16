package com.Pyramid.LittleBrother.network.protocol;

class AdventureSettingsPacket extends DataPacket{
	public int flags;

	public void pid(){
		return Info::ADVENTURE_SETTINGS_PACKET;
	}

	public void decode(){

	}

	public void encode(){
		this.reset();
		this.putInt(flags);
	}

}
