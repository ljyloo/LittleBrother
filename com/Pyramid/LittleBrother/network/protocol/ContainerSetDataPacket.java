com.Pyramid.LittleBrother.network.protocol;


class ContainerSetDataPacket extends DataPacket{
	public byte windowid;
	public short property;
	public short value;

	public byte pid(){
		return Info.CONTAINER_SET_DATA_PACKET;
	}

	public void decode(){

	}

	public void encode(){
		this.reset();
		this.putByte(windowid);
		this.putShort(property);
		this.putShort(value);
	}

}
