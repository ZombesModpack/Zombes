package net.minecraft.src;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class ZP250 extends Packet {

	public NBTTagCompound nbtData;
	public ZP250(){}

	public void readPacketData(DataInputStream in) throws IOException {
		nbtData = (NBTTagCompound) NBTTagCompound.readNamedTag(in);
	}

	public void writePacketData(DataOutputStream out) throws IOException {
		NBTTagCompound.writeNamedTag(nbtData, out);
	}

	public void processPacket(NetHandler handler) {
		ZMod.packet250Handle(this);
	}

	public int getPacketSize() {
		return 1;
	}
	
	public static void init(){
		// do nothing
        //register packet (250, true, true, ZP250.class); // found in parent class
	}
}
