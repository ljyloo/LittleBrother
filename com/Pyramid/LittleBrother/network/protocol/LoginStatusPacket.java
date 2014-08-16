package com.Pyramid.LittleBrother.network.protocol;
import com.Pyramid.LittleBrother.network.Binary;
import java.nio.charset.Charset;

class LoginStatusPacket extends DataPacket{
	public int status;

	public void pid(){
		return Info.LOGIN_STATUS_PACKET;
	}

	public void decode(){

	}

	public void encode(){
		this.reset();
		this.putInt(this.status);
	}

}
