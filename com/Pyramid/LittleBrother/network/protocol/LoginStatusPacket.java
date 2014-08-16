package com.Pyramid.LittleBrother.network.protocol;

class LoginStatusPacket extends DataPacket{
	public int status;

	@Override
	public byte pid() {
		return Info.LOGIN_STATUS_PACKET;
	}

	@Override
	public void encode() {
		this.reset();
		this.putInt(status);
	}

	@Override
	public void decode() {
		
	}
	
}
