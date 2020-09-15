package org.compsys704;

public class States {
	
	public static volatile boolean ARM_AT_DEST = true;
	public static volatile boolean ARM_AT_SOURCE = !ARM_AT_DEST;
	public static volatile boolean PUSHER_RETRACTED = true;
	public static volatile boolean PUSHER_EXTENDED = !PUSHER_RETRACTED;
	public static volatile boolean GRIPPED = false;
	public static volatile boolean MAG_EMPTY = false;
	
	public static volatile boolean CAP_READY = false;
	
	//states for conveyor
	
	public static volatile boolean BOTTLE_AT_POS_1 = false;
	public static volatile boolean BOTTLE_AT_POS_5 = false;
	public static volatile boolean BOTTLE_AT_LOADER = true;

}
