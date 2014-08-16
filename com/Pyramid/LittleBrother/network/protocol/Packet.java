package com.Pyramid.LittleBrother.network.protocol;

import java.util.ArrayList;

import com.Pyramid.LittleBrother.network.Binary;

abstract class Packet{
	public byte ID = -1;
	
	protected int offset = 0;
	public ArrayList<Byte> buffer = new ArrayList<Byte>();
	public int sendTime;
	
	protected int getLen(){
		return this.buffer.size();
	}
	
	protected byte[] get(int len){
		if(len < 0){
			this.offset = this.buffer.size() - 1;
			return null;
		}

		byte[] buffer = new byte[len];
		for(int i = 0; len > 0; --len, ++this.offset, ++i){
			buffer[i] = this.buffer.get(this.offset);
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
	
	protected int getTriad(){
		return Binary.readTriad(this.get(3));
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
		return this.offset > (this.buffer.size() - 1);
	}
	
	protected void put(byte[] bytes){
		for(int i = 0; i < bytes.length; i++){
			this.buffer.add(bytes[i]);
		}
	}
	
	protected void putByte(byte b){
		byte[] bs = new byte[1];
		bs[0] = b;
		this.put(bs);
	}
	
	protected void putShort(short s){
		this.put(Binary.getBytes(s));
	}
	
	protected void putTriad(int v){
		this.put(Binary.writeTriad(v));
	}
	
	protected void putLong(long l){
		this.put(Binary.getBytes(l));
	}
	
	protected void putString(String s){
		this.put(Binary.getBytes((short)s.length()));
		this.put(Binary.getBytes(s));
	}
	
	protected void encode(){
		this.putByte(this.ID);
	}
	
	protected void decode(){
		this.offset = 1;
	}
}
