package com.Pyramid.LittleBrother.network.protocol;

class PlayerActionPacket extends DataPacket{
	public int action;
	public int x;
	public int y;
	public int z;
	public int face;
	public int eid;

	public byte pid(){
		return Info.PLAYER_ACTION_PACKET;
	}

	public void decode(){
		action = this.getInt();
		x = this.getInt();
		y = this.getInt();
		z = this.getInt();
		face = this.getInt();
		eid = this.getInt();
	}

	public void encode(){

	}

}
