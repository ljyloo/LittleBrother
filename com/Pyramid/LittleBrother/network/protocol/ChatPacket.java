com.Pyramid.LittleBrother.network.protocol;

class ChatPacket extends DataPacket{
	public String message;

	public byte pid(){
		return Info.CHAT_PACKET;
	}

	public void decode(){

	}

	public void encode(){
		this.reset();
		this.putString(message);
	}

}
