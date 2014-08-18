package com.Pyramid.LittleBrother.network.protocol;

class SetSpawnPositionPacket extends DataPacket{
	public int x;
	public int z;
	public byte y;

	public byte pid(){
		return Info.SET_SPAWN_POSITION_PACKET;
	}

	public void decode(){

	}

	public void encode(){
		this.reset();
		this.putInt(x);
		this.putInt(z);
		this.putByte(y);
	}

}
