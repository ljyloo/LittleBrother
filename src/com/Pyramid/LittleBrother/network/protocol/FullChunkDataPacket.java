package com.Pyramid.LittleBrother.network.protocol;

class FullChunkDataPacket extends DataPacket{

	@Override
	public byte pid() {
		return Info.FULL_CHUNK_DATA_PACKET;
	}

	@Override
	public void encode() {
		
	}

	@Override
	public void decode() {
		
	}
	
}