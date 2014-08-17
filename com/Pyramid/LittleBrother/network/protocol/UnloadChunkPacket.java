package com.Pyramid.LittleBrother.network.protocol;

import com.Pyramid.LittleBrother.network.Binary;

class UnloadChunkPacket extends DataPacket{
	public int chunkX;
	public int chunkZ;
	
	public byte pid(){
		return Info.UnloadChunkPacket;
	}

	public void decode(){

	}

	public void encode(){
	    this.reset();
            this.putInt(chunkX);
	    this.putInt(chunkZ);
		
	}

}
