package com.Pyramid.LittleBrother.network.protocol;

import java.util.ArrayList;

import com.Pyramid.LittleBrother.Item;
import com.Pyramid.LittleBrother.network.Binary;

abstract class DataPacket{
	private int offset = 0;
	public ArrayList<Byte> buffer = new ArrayList<Byte>();
	
	abstract public byte pid();
	
	abstract public void encode();
	
	abstract public void decode();
	
	protected void reset(){
		byte[] reset = {this.pid()};
		this.setBuffer(reset);
	}
	
	public void setBuffer(byte[] buffer){
		this.buffer.clear();
		for(int i = 0; i < buffer.length; i++){
			this.buffer.add(buffer[i]);
		}
		this.offset = 0;
	}
	
	public Byte[] getBuffer(){
		return (Byte[])this.buffer.toArray(new Byte[0]);
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
	
	protected void put(byte[] bytes){
		for(int i = 0; i < bytes.length; i++){
			this.buffer.add(bytes[i]);
		}
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
	
	protected float getFloat(){
		return Binary.getFloat(this.get(4));
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
	
	protected void putFloat(float f){
		this.put(Binary.getBytes(f));
	}
	
	protected void putLong(long l){
		this.put(Binary.getBytes(l));
	}
	
	protected void putString(String s){
		this.put(Binary.getBytes((short)s.length()));
		this.put(Binary.getBytes(s));
	}
	
	protected byte[][] getDataArray(int len){
		byte[][] data = new byte[len][];
		for(int n = 1; (n < len) && (!this.feof()); ++n){
			data[n - 1] = this.get(this.getTriad());
		}
		
		return data;
	}
	
	protected void putDataArray(byte[][] data){
		for(int i = 0; i < data.length; i++){
			this.putTriad(data[i].length);
			this.put(data[i]);
		}
	}
	
	protected Item getSlot(){
		short id = this.getShort();
		byte cnt = this.getByte();
		short meta = this.getShort();
		
		return Item.get(
			id,
			meta,
			cnt
		);
	} 
	
	protected void putSlot(Item item){
		this.putShort(item.id);
		this.putByte(item.count);
		this.putShort(item.meta);
	}
}
