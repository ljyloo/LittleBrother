package com.Pyramid.LittleBrother.network.protocol;

class StartGamePacket extends DataPacket{
	public int seed;
	public int generator;
	public int gamemode;
	public int eid;
	public int spawnX;
	public int spawnY;
	public int spawnZ;
	public float x;
	public float y;
	public float z;

	public byte pid(){
		return Info.START_GAME_PACKET;
	}

	public void decode(){

	}

	public void encode(){
		this.reset();
		this.putInt(seed);
		this.putInt(generator);
		this.putInt(gamemode);
		this.putInt(eid);
		this.putInt(spawnX);
		this.putInt(spawnY);
		this.putInt(spawnZ);
		this.putFloat(x);
		this.putFloat(y);
		this.putFloat(z);
	}

}
