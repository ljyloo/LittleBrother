package com.Pyramid.LittleBrother.network.protocol;

import com.Pyramid.*;

class ContainerSetContentPacket extends DataPacket{
	public byte windowid;
	public Item slots[];
	public int hotbar[];

	public byte pid(){
		return Info.CONTAINER_SET_CONTENT_PACKET;
	}

	public void decode(){
        this.windowid = this.getByte();
        short count = this.getShort();
        this.slots = new Item[count];
        for(int s = 0; s < count && !this.feof(); ++s){
        	this.slots[s] = this.getSlot();
        }
        if(this.windowid == 0){
        	count = this.getShort();
        	for(int s = 0; s < count && !this.feof(); ++s){
        		this.hotbar[s] = this.getInt();
        	}
        }
	}

	public void encode(){
		this.reset();
		this.putByte(this.windowid);
		this.putShort((short)this.slots.length);
		for(Item slot : this.slots){
			this.putSlot(slot);
		}
		if(this.windowid == 0 && this.hotbar.length > 0){
			this.putShort((short) this.hotbar.length);
			for(int slot : this.hotbar){
				this.putInt(slot);
			}
		}
	}

}
