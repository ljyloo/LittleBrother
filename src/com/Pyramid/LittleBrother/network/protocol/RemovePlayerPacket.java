package com.Pyramid.LittleBrother.network.protocol;

class RemovePlayerPacket extends DataPacket{
	public int eid;
	public long clientID;

	public byte pid(){
		return Info.REMOVE_PLAYER_PACKET;
	}

	public void decode(){

	}

	public void encode(){
		this.reset();
		this.putInt(eid);
		this.putLong(clientID);
	}

}
