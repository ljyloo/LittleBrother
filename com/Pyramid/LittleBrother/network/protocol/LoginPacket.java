package com.Pyramid.LittleBrother.network.protocol;

import com.Pyramid.LittleBrother.network.Binary;
import java.nio.charset.Charset;

class LoginPacket extends DataPacket{
	public String username;
	public int protocol1;
	public int protocol2;
	public int clientId;
	public String loginData;
	
	public void pid(){
	    return Info.LOGIN_PACKET;
	}
	
	public void decode(){
		this.username = this.getString();
		this.protocol1 = this.getInt();
		this.protocol2 = this.getInt();
		this.clientId = this.getInt();
		this.loginData = this.getString();
	}
	
	public void encode(){

	}
	
}
