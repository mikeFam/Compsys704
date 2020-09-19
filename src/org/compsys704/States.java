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
	public static volatile boolean ALIGNED = true;
	public static volatile boolean BOTTLE_ROTARY_1 = true;
	public static volatile boolean BOTTLE_ROTARY_2 = false;
	public static volatile boolean BOTTLE_ROTARY_3 = false;
	public static volatile boolean BOTTLE_ROTARY_4 = false;
	public static volatile boolean BOTTLE_ROTARY_5 = false;
	public static volatile boolean CAP_AT_1 = false;
	
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

	//States for Filler
	public static volatile boolean BOTTLE_AT_POS_2 = true;
	public static volatile boolean BOTTLE_FILLED = false;
	public static volatile boolean VALVE_EXTEND = false;
	public static volatile boolean VALVE_RETRACT = !VALVE_EXTEND;
	public static volatile boolean INJECTOR_ON = false;
	public static volatile boolean INJECTOR_OFF = !INJECTOR_ON;
	public static volatile boolean INLET_ON = false;
	public static volatile boolean INLET_OFF = !INLET_ON;
}
