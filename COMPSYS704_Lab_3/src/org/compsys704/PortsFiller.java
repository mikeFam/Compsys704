package org.compsys704;

public class PortsFiller {
	public static final String ENABLE_SIGNAL = "PlantFillerCD.enable";
	public static final int PORT_LOADER_PLANT = 10001;
	public static final int PORT_LOADER_CONTROLLER = 10000;
	public static final int PORT_LOADER_VIZ = 20000;
	
	// Manual 
	public static final String SIGNAL_INJECTOR_ON           = "ControllerFillerCD.valveInjectorOnOffM";
	public static final String SIGNAL_INLET_ON      		= "ControllerFillerCD.valveInletOnOffM";
	public static final String SIGNAL_VALVE_RETRACT        	= "ControllerFillerCD.dosUnitValveRetractM";
	public static final String SIGNAL_VALVE_EXTEND          = "ControllerFillerCD.dosUnitValveExtendM";
	public static final String SIGNAL_Mode       			= "ControllerFillerCD.mode";
	
}
