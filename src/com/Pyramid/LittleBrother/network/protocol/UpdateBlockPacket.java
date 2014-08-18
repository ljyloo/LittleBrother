package com.Pyramid.LittleBrother.network.protocol;

import com.Pyramid.LittleBrother.network.Binary;

class UpdateBlockPacket extends DataPacket{
	public int x;
	public int z;
	public byte y;
	public byte block;
	public byte meta;

	public byte pid(){
	    return Info.UPDATE_BLOCK_PACKET;
	}

	public void decode(){

	}

	public void encode(){
	    this.reset();
	    this.putInt(x);
	    this.putInt(z);
	    this.putByte(y);
	    this.putByte(block);
            this.putByte(meta);
	}

}
