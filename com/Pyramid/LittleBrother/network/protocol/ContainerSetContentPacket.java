
class ContainerSetContentPacket extends DataPacket{
	public byte windowid;
	public short slots[];
	public int hotbar[];

	public void pid(){
		return Info.CONTAINER_SET_CONTENT_PACKET;
	}

	public void decode(){
		this.windowid = this.getByte();
		short count = this.getShort();
                slots = new Item[count];
                int s;
		for(s = 0; s < count and !this.feof(); ++s){
			this.slots[s] = this.getSlot();
		}
		if(this.windowid == 0){
			count = this.getShort();
                        hotbar = new int[count];
			for(s = 0; s < count and !this.feof(); ++s){
				this.hotbar[s] = this.getInt();
			}
		}
	}

	public void encode(){
		this.reset();
		this.putByte(this.windowid);
		this.putShort(slots.length);
		foreach(Item slot : slots){
			this.putSlot(slot);
		}
		if(this.windowid == 0 and this.hotbar.length > 0){
			this.putShort(this.hotbar.length);
			foreach(int slot : this.hotbar){
				this.putInt(slot);
			}
		}else{
			this.putShort(0);
		}
	}
｝
