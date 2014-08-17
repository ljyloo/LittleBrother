/*
class ContainerSetContentPacket extends DataPacket{
	public byte windowid;
	public byte[] slots[];
	public byte[] hotbar[];

	public byte pid(){
		return Info.CONTAINER_SET_CONTENT_PACKET;
	}

	public void decode(){
		windowid = this.getByte();
		short count = this.getShort();
                //slots = new Item[count];
		for(int s = 0; s < count; ++s){
			slots[s] = this.getSlot();
		}
		if(windowid == 0){
			count = this.getShort();
                        //hotbar = new int[count];
			for(int j = 0; j < count; ++j){
				hotbar[j] = this.getInt();
			}
		}
	}

	public void encode(){
		this.reset();
		this.putByte(windowid);
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
*/
