com.Pyramid.LittleBrother.network.protocol;

class RemoveEntityPacket extends DataPacket{
	public int eid;

	public byte pid(){
		return Info.REMOVE_ENTITY_PACKET;
	}

	public void decode(){

	}

	public void encode(){
		this.reset();
	    this.putInt(eid);
	}

}
