package com.Pyramid.LittleBrother.network.protocol;

class PlayerArmorEquipmentPacket extends DataPacket{
	public int eid;
	public byte[] slots = [];

	public byte pid(){
		return Info.PLAYER_ARMOR_EQUIPMENT_PACKET;
	}

	public void decode(){
		eid = this.getInt();
		slots[0] = thi.getByte();
		slots[1] = this.getByte();
		slots[2] = this.getByte();
		slots[3] = this.getByte();
	}

	public void encode(){
		this.reset();
		this.putInt(eid);
		this.putByte(slots[0]);
		this.putByte(slots[1]);
		this.putByte(slots[2]);
		this.putByte(slots[3]);
	}

}
