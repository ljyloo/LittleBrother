com.Pyramid.LittleBrother.network.protocol;

class RemoveBlockPacket extends DataPacket{
	public int eid;
	public int x;
	public byte y;
	public int ;

	public byte pid(){
		return Info.REMOVE_BLOCK_PACKET;
	}

	public void decode(){
		eid = this.getInt();
		x = this.getInt();
		z = this.getInt();
		y = this.getByte();
	}

	public void encode(){

	}

}
