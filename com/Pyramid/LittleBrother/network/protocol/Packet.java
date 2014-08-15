package com.Pyramid.LittleBrother.network.protocol;

import com.Pyramid.LittleBrother.network.Binary;

abstract class Packet{
	public int ID = -1;
	
	protected int offset = 0;
	public byte[] buffer;
	public int sendTime;
	
	protected byte[] get(int len){
		if(len < 0){
			this.offset = this.buffer.length - 1;
			return null;
		}

		byte[] buffer = new byte[len];
		for(int i = 0; len > 0; --len, ++this.offset, ++i){
			buffer[i] = this.buffer[this.offset];
		}

		return buffer;
	}
	
	protected byte getByte(){
		byte[] bytes = this.get(1);
		return bytes[0];
	}
	
	protected short getShort(){
		return Binary.getShort(this.get(2));
	}
	
	protected byte[] getTriad(){
		return this.get(3);
	}
	
	protected int getInt(){
		return Binary.getInt(this.get(4));
	}
	
	protected long getLong(){
		return Binary.getLong(this.get(8));
	}
	
	protected String getString(){
		return Binary.getString(this.get(Binary.getShort(this.get(2))));
	}
	
	protected boolean feof(){
		return this.offset > (this.buffer.length - 1);
	}
	
	protected void put(byte[] bytes){
		for(int i = 0, n = this.buffer.length; i < bytes.length; i++, n++){
			
		}
	}
}
