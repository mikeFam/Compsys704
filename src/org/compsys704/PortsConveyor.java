package org.compsys704;

public class PortsConveyor {
	//public static final String REQUEST_SIGNAL = "ControllerConveyorCD.request";
	public static final String REFILL_SIGNAL = "PlantConveyorCD.refill";
	public static final String ENABLE_SIGNAL = "PlantConveyorCD.enable";
	public static final int PORT_LOADER_PLANT = 10001;
	public static final int PORT_LOADER_CONTROLLER = 10000;
	public static final int PORT_LOADER_VIZ = 20000;
	
	// Manual 
	public static final String SIGNAL_MOTOR_ON   = "ControllerConveyorCD.motConveyorOnOffM";
	public static final String SIGNAL_Mode       = "ControllerConveyorCD.mode";
}
