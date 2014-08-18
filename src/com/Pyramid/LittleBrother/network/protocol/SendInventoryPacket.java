package com.Pyramid.LittleBrother.network.protocol;

class SendInventoryPacket extends DataPacket{

	@Override
	public byte pid() {
		return Info.SEND_INVENTORY_PACKET;
	}

	@Override
	public void encode() {
		
	}

	@Override
	public void decode() {
		
	}
	
}