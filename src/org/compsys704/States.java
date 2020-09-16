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

	
	//states for rotaryTable
	public static volatile boolean BOTTLE_ROTARY_1 = false;
	public static volatile boolean BOTTLE_ROTARY_2 = false;
	public static volatile boolean BOTTLE_ROTARY_3 = true;
	public static volatile boolean BOTTLE_ROTARY_4 = true;
	public static volatile boolean BOTTLE_ROTARY_5 = true;
	
	//States for Capper
	public static volatile boolean BOTTLE_AT_CAPPER = true;
	public static volatile boolean CLAMP_EXTEND = false;
	public static volatile boolean CLAMP_RETRACT = !CLAMP_EXTEND;
	public static volatile boolean GRIPPER_EXTENDED = false;
	public static volatile boolean GRIPPER_RETRACTED = !GRIPPER_EXTENDED;
	public static volatile boolean GRIPPER_GRIPPED = false;
	public static volatile boolean GRIPPER_UNGRIPPED = !GRIPPER_GRIPPED;
	public static volatile boolean GRIPPER_AT_DEST = false;
	public static volatile boolean GRIPPER_AT_SOURCE = !GRIPPER_AT_DEST;
}
