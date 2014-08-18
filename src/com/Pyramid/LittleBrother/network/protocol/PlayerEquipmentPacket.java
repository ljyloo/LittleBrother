package com.Pyramid.LittleBrother.network.protocol;

class PlayerEquipmentPacket extends DataPacket{
	public int eid;
	public short item;
	public short meta;
	public byte slot;

	public byte pid(){
		return Info.PLAYER_EQUIPMENT_PACKET;
	}

	public void decode(){
		eid = this.getInt();
		item = this.getShort();
		meta = this.getShort();
		slot = this.getByte();
	}

	public void encode(){
		this.reset();
		this.putInt(eid);
		this.putShort(item);
		this.putShort(meta);
		this.putByte(slot);
	}

}
