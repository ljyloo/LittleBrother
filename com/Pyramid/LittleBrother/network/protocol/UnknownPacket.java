package com.Pyramid.LittleBrother.network.protocol;

import com.Pyramid.LittleBrother.network.Binary;

class UnknownPacket extends DataPacket{
	packetID = -1;

	public byte pid(){
		return packetID;
	}

	public void decode(){

	}

	public void encode(){
		}
	}

}
