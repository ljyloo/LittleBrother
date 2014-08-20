package com.Pyramid.LittleBrother.network;

import java.nio.charset.Charset;

/**
 * Binary class.
 */
public class Binary{
	/** Current protocol of Minecraft: Pocket Edition */
	public static byte PROTOCOL = 0x05;
	/** The magic packet */
	public static byte[] MAGIC = {(byte)0x00, (byte)0xff, (byte)0xff, (byte)0x00, (byte)0xfe, (byte)0xfe, (byte)0xfe, (byte)0xfe, (byte)0xfd, (byte)0xfd, (byte)0xfd, (byte)0xfd, (byte)0x12, (byte)0x34, (byte)0x56, (byte)0x78};
	public static byte[] SC = {(byte)0x04, (byte)0x3f, (byte)0x57, (byte)0xfe, (byte)0xfd};
	
	/**
	 * Used to get NULL payload.
	 * 
	 * @param len
	 * @return byte[]
	 */
	public static byte[] getNullPayload(int len){
		byte[] np = new byte[len];
		for(int n = 0; n < np.length; n++){
			np[n] = 0x00;
		}
		return np;
	}
	
	/**
	 * Encode 2 bytes of short data.
	 * Big-Endian
	 * 
	 * @param data
	 * @return byte[]
	 */
	public static byte[] getBytes(short data){
		byte[] bytes = new byte[2];
        	bytes[0] = (byte) (data & 0xff);
        	bytes[1] = (byte) ((data & 0xff00) >> 8);
        	return bytes;
	}
	
	/**
	 * Encode 2 bytes of char data.
	 * Big-Endian
	 * 
	 * @param data
	 * @return byte[]
	 */
	public static byte[] getBytes(char data){
		byte[] bytes = new byte[2];
		bytes[0] = (byte) (data);
		bytes[1] = (byte) (data >> 8);
		return bytes;
	}
	
	/**
	 * Encode 3 bytes of triad.
	 * Big-Endian
	 * 
	 * @param data
	 * @return byte[]
	 */
	public static byte[] writeTriad(int data){
		byte[] bytes = new byte[3];
		bytes[0] = (byte) (data & 0xff);
		bytes[1] = (byte) ((data & 0xff00) >> 8);
		bytes[2] = (byte) ((data & 0xff0000) >> 16);
		return bytes;
	}
	
	/**
	 * Encode 4 bytes of int data.
	 * Big-Endian
	 * 
	 * @param data
	 * @return byte[]
	 */
	public static byte[] getBytes(int data){
		byte[] bytes = new byte[4];
		bytes[0] = (byte) (data & 0xff);
		bytes[1] = (byte) ((data & 0xff00) >> 8);
		bytes[2] = (byte) ((data & 0xff0000) >> 16);
		bytes[3] = (byte) ((data & 0xff000000) >> 24);
		return bytes;
	}
	
	/**
	 * Encode 8 bytes of long data.
	 * Big-Endian
	 * 
	 * @param data
	 * @return byte[]
	 */
	public static byte[] getBytes(long data){
		byte[] bytes = new byte[8];
		bytes[0] = (byte) (data & 0xff);
		bytes[1] = (byte) ((data >> 8) & 0xff);
		bytes[2] = (byte) ((data >> 16) & 0xff);
		bytes[3] = (byte) ((data >> 24) & 0xff);
		bytes[4] = (byte) ((data >> 32) & 0xff);
		bytes[5] = (byte) ((data >> 40) & 0xff);
		bytes[6] = (byte) ((data >> 48) & 0xff);
		bytes[7] = (byte) ((data >> 56) & 0xff);
		return bytes;
	}
	
	/**
	 * Encode 4 bytes float.
	 * IEEE 754
	 * 
	 * @param data
	 * @return byte[]
	 */
	public static byte[] getBytes(float data){
		int intBits = Float.floatToIntBits(data);
		return getBytes(intBits);
	}
	
	/**
	 * Encode 4 bytes double.
	 * 
	 * @param data
	 * @return byte[]
	 */
	public static byte[] getBytes(double data){
		long intBits = Double.doubleToLongBits(data);
		return getBytes(intBits);
	}
	
	/**
	 * Encode string by charsetName.
	 * 
	 * @param data
	 * @param charsetName
	 * @return byte[]
	 */
	public static byte[] getBytes(String data, String charsetName){
		Charset charset = Charset.forName(charsetName);
		return data.getBytes(charset);
	}
	
	/**
	 * Encode string.
	 * 
	 * @param data
	 * @return byte
	 */
	public static byte[] getBytes(String data){
		return getBytes(data, "UTF8");
	}
    
	/**
	 * Read short.
	 * 
	 * @param bytes
	 * @return short
	 */
	public static short getShort(byte[] bytes){
		return (short) ((0xff & bytes[0]) | (0xff00 & (bytes[1] << 8)));
	}
	
	/**
	 * Read char.
	 * 
	 * @param bytes
	 * @return char
	 */
	public static char getChar(byte[] bytes){
		return (char) ((0xff & bytes[0]) | (0xff00 & (bytes[1] << 8)));
	}
	
	/**
	 * Read triad.
	 * 
	 * @param bytes
	 * @return int
	 */
	public static int readTriad(byte[] bytes){
		return (0xff & bytes[0]) | (0xff00 & (bytes[1] << 8)) | (0xff0000 & (bytes[2] << 16));
	}
	
	/**
	 * Read int.
	 * 
	 * @param bytes
	 * @return int
	 */
	public static int getInt(byte[] bytes){
		return (0xff & bytes[0]) | (0xff00 & (bytes[1] << 8)) | (0xff0000 & (bytes[2] << 16)) | (0xff000000 & (bytes[3] << 24));
	}
   
	/**
	 * Read long.
	 * 
	 * @param bytes
	 * @return
	 */
	public static long getLong(byte[] bytes){
		return(0xffL & (long)bytes[0]) | (0xff00L & ((long)bytes[1] << 8)) | (0xff0000L & ((long)bytes[2] << 16)) | (0xff000000L & ((long)bytes[3] << 24)) | (0xff00000000L & ((long)bytes[4] << 32)) | (0xff0000000000L & ((long)bytes[5] << 40)) | (0xff000000000000L & ((long)bytes[6] << 48)) | (0xff00000000000000L & ((long)bytes[7] << 56));
	}
	
	/**
	 * Read float.
	 * 
	 * @param bytes
	 * @return
	 */
	public static float getFloat(byte[] bytes){
		return Float.intBitsToFloat(getInt(bytes));
	}
	
	/**
	 * Read double.
	 * 
	 * @param bytes
	 * @return
	 */
	public static double getDouble(byte[] bytes){
		long l = getLong(bytes);
		return Double.longBitsToDouble(l);
	}
	
	/**
	 * Read string by charset name.
	 * 
	 * @param bytes
	 * @param charsetName
	 * @return
	 */
	public static String getString(byte[] bytes, String charsetName){
		return new String(bytes, Charset.forName(charsetName));
	}
	
	/**
	 * Read string by UTF-8 encoding.
	 * 
	 * @param bytes
	 * @return
	 */
	public static String getString(byte[] bytes){
		return getString(bytes, "UTF8");
	}
}
