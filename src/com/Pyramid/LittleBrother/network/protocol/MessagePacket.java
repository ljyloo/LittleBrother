package com.Pyramid.LittleBrother.network.protocol;

class MessagePacket extends DataPacket{
	public String source;
	public String message;

	public byte pid(){
		return Info.MESSAGE_PACKET;
	}

	public void decode(){
		source = this.getString();
		message = this.getString();
	}

	public void encode(){
		this.reset();
		this.putString(source);
		this.putString(message);
	}

}
