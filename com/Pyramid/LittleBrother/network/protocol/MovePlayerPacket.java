com.Pyramid.LittleBrother.network.protocol;

class MovePlayerPacket extends DataPacket{
	public int eid;
	public float x;
	public float y;
	public float z;
	public float yaw;
	public float pitch;
	public float bodyYaw;

	public byte pid(){
		return Info.MOVE_PLAYER_PACKET;
	}

	public void decode(){
		eid = this.getInt();
		x = this.getFloat();
		y = this.getFloat();
		z = this.getFloat();
		yaw = this.getFloat();
		pitch = this.getFloat();
		bodyYaw = this.getFloat();
	}

	public void encode(){
		this.reset();
		this.putInt(eid);
		this.putFloat(x);
		this.putFloat(y);
		this.putFloat(z);
		this.putFloat(yaw);
		this.putFloat(pitch);
		this.putFloat(bodyYaw);
	}

}
