package org.compsys704;

public class Ports {
	public static final String REQUEST_SIGNAL = "ControllerCapLoaderCD.request";
	public static final String REFILL_SIGNAL = "PlantCapLoaderCD.refill";
	public static final String ENABLE_SIGNAL = "PlantCapLoaderCD.enable";
	public static final int PORT_LOADER_PLANT = 10001;
	public static final int PORT_LOADER_CONTROLLER = 10000;
	public static final int PORT_LOADER_VIZ = 20000;
	
	// Manual 
	public static final String SIGNAL_PUSHER_EXTEND   = "ControllerCapLoaderCD.pusherExtendM";
//	public static final String SIGNAL_VACOFF          = "ControllerCD.vacOffM";
	public static final String SIGNAL_VACON           = "ControllerCapLoaderCD.vacOnM";
	public static final String SIGNAL_ARM_SOURCE      = "ControllerCapLoaderCD.armSourceM";
	public static final String SIGNAL_ARM_DEST        = "ControllerCapLoaderCD.armDestM";
	public static final String SIGNAL_Mode            = "ControllerCapLoaderCD.mode";
}
