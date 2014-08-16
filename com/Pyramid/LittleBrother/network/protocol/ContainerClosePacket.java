com.Pyramid.LittleBrother.network.protocol;

class ContainerClosePacket extends DataPacket{
	public byte windowid;

	public byte pid(){
		return Info.CONTAINER_CLOSE_PACKET;
	}

	public void decode(){
		windowid = this.getByte();
	}

	public void encode(){
		this.reset();
		this.putByte(windowid);
	}

}
