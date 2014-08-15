package com.Pyramid.LittleBrother.network.protocol;

import com.Pyramid.LittleBrother.network.Binary;

class UNCONNECTED_PONG extends Packet{

        public byte ID = 0x05;

        public byte protocol = 5;
        public mtuSize;

        public void encode(){
            super.encode();
            this.put(Binary.MAGIC;
            this.putByte(this.protocol);
            char str = (char)0x00;
            String fstr;
            for(i = 1;i <= this.mtuSize - 18;i++){
              fstr += str;
            }
            this.put(sfstr);
        }
        public void decode(){
            super.decode();
            this.offset += 16; //magic
            this.protocol = this.getByte();
            int n = this.get(true);
            this.mtuSize = n.length() + 18
        }
}
