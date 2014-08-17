package com.Pyramid.LittleBrother.network.protocol;

import com.Pyramid.LittleBrother.network.Binary;

class UnknownPacket extends DataPacket{
	int packetID = -1;

	public byte pid(){
		return (byte)packetID;
	}

	public void decode(){

	}

	public void encode(){
		}
	}

}
