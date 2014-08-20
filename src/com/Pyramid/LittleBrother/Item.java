package com.Pyramid.LittleBrother;

/**
 * Pocket item class.
 */
public class Item {
	public short id;
	public short meta = 0;
	public byte count = 1;
	public String name = "unknow";
	
	public Item(short id, short meta, byte count, String name){
		this.id = id;
		this.meta = meta;
		this.count = count;
		this.name = name;
	}
	
	/**
	 * Translate Pocket item into Bukkit item.
	 * @param id
	 * @param meta
	 * @param count
	 * @return
	 */
	public static Item get(short id, short meta, byte count){
		return new Item(id, meta, count, "unknow");
	}
	
	/**
	 * Return the id of this item.
	 * @return short
	 */
	public short getID(){
		return this.id;
	}
	
	/**
	 * Return damage.
	 * @return short
	 */
	public short getDamage(){
		return this.meta;
	}
	
	/**
	 * Return count.
	 * @return byte
	 */
	public byte getCount(){
		return this.count;
	}
}
