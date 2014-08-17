package com.Pyramid.LittleBrother.network.protocol;

import com.Pyramid.LittleBrother.network.Binary;

class UseItemPacket extends DataPacket{
	public int x;
	public int y;
	public int z;
	public int face;
	public short item;
	public short meta;
	public int eid;
	public float fx;
	public float fy;
	public float fz;
	public float posX;
	public float posY;
	public float posZ;

	public byte pid(){
		return UseItemPacket;
	}

	public void decode(){
     this.x = this.getInt();
	 this.y = this.getInt();
	 this.z = this.getInt();
	 this.face = this.getInt();
	 this.item = this.getShort();
	 this.meta = this.getShort();
	 this.eid = this.getInt();
	 this.fx = this.getFloat();
	 this.fy = this.getFloat();
	 this.fz = this.getFloat();
	 this.posX = this.getFloat();
	 this.posY = this.getFloat();
	 this.posZ = this.getFloat();
	}

	public void encode(){
		}
	}

}
