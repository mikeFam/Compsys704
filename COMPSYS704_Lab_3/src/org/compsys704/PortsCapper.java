package org.compsys704;
public class PortsCapper {
	public static final String ENABLE_SIGNAL = "PlantCapperCD.enable";
	public static final int PORT_LOADER_PLANT = 10001;
	public static final int PORT_LOADER_CONTROLLER = 10000;
	public static final int PORT_LOADER_VIZ = 20000;
	
	// Manual 
	public static final String SIGNAL_GRIPPER_EXTEND   = "ControllerCapperCD.cylPos5ZaxisExtendM";
	public static final String SIGNAL_GRIPPER_HOME     = "ControllerCapperCD.gripperTurnRetractM";
	public static final String SIGNAL_GRIPPER_FINAL    = "ControllerCapperCD.gripperTurnExtendM";
	public static final String SIGNAL_GRIPPER_GRIP     = "ControllerCapperCD.capGripperPos5ExtendM";
	public static final String SIGNAL_CLAMP            = "ControllerCapperCD.cylClampBottleExtendM";
	public static final String SIGNAL_Mode             = "ControllerCapperCD.mode";
}
