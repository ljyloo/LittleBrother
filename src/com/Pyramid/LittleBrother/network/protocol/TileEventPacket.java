package com.Pyramid.LittleBrother.network.protocol;

import com.Pyramid.LittleBrother.network.Binary;

class TileEventPacket extends DataPacket{
	public int x;
	public int y;
	public int z;
	public int case1;
	public int case2;

	public byte pid(){
		return Info.TILE_EVENT_PACKET;
	}

	public void decode(){

	}

	public void encode(){
		this.reset();
		this.putInt(x);
		this.putInt(y);
		this.putInt(z);
		this.putInt(case1);
		this.putInt(case2);
		}
	}

}
