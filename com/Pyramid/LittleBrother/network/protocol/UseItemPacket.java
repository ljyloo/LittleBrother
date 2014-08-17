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
		return Info.USE_ITEM_PACKET;
	}

	public void decode(){
         x = this.getInt();
	 y = this.getInt();
	 z = this.getInt();
	 face = this.getInt();
	 item = this.getShort();
	 meta = this.getShort();
	 eid = this.getInt();
	 fx = this.getFloat();
	 fy = this.getFloat();
	 fz = this.getFloat();
	 posX = this.getFloat();
	 posY = this.getFloat();
	 posZ = this.getFloat();
	}

	public void encode(){

	}

}
