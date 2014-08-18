package com.Pyramid.LittleBrother.network.protocol;

import com.Pyramid.LittleBrother.network.Binary;
import java.nio.charset.Charset;
class AddPlayerPacket extends DataPacket{
	public long clientID;
	public String username;
	public int eid;
	public float x;
	public float y;
	public float z;
	public float pitch;
	public float yaw;
	public Short unknown1;
	public Short unknown2;
	public byte[] metadata;

	public byte pid(){
		return Info.ADD_PLAYER_PACKET;
	}

	public void decode(){

	}

	public void encode(){
		this.reset();
		this.putLong(clientID);
		this.putString(username);
		this.putInt(eid);
		this.putFloat(x);
		this.putFloat(y);
		this.putFloat(z);
		this.putByte((byte) (yaw * (256 / 360)));
		this.putByte((byte) (pitch * (256 / 360)));
		this.putShort(unknown1);
		this.putShort(unknown2);
		this.put(Binary.writeMetadata(metadata));
	}

}
