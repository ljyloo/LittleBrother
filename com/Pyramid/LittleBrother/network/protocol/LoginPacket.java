package com.Pyramid.LittleBrother.network.protocol;

class LoginPacket extends DataPacket{
	public String username;
	public int protocol1;
	public int protocol2;
	public int clientId;
	public String loginData;
	
	@Override
	public byte pid(){
		return Info.LOGIN_PACKET;
	}
	
	@Override
	public void encode(){
		this.username = this.getString();
		this.protocol1 = this.getInt();
		this.protocol2 = this.getInt();
		this.clientId = this.getInt();
		this.loginData = this.getString();
	}
	
	@Override
	public void decode(){
		
	}
}
