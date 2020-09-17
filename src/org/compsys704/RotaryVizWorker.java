package org.compsys704;

import java.util.Arrays;
import java.util.List;

public class RotaryVizWorker extends Worker{

	@Override
	public void setSignal(boolean status) {
//		System.out.println(signame+"  "+status);
		switch(signame){
		case "bottleAtPos2E":
			States.BOTTLE_AT_POS_2 = status;
			break;
		case "dosUnitEvacE":
			States.VALVE_EXTEND = status;
			break;
		case "dosUnitFilledE":
			States.VALVE_RETRACT = status;
			break;
		case "injectorOnE":
			States.INJECTOR_ON = status;
			break;
		case "injectorOffE":
			States.INJECTOR_OFF = status;
			break;
		case "inletOnE":
			States.INLET_ON = status;
			break;
		case "inletOffE":
			States.INLET_OFF = status;
			break;
		case "jobDoneE":
			States.BOTTLE_FILLED = status;
			break;
		default: 
			System.err.println("Wrong sig name : "+signame);
			System.exit(1);
		}
	}
	
	
	static final List<String> signames = Arrays.asList("bottleAtPos2E","dosUnitEvacE","dosUnitFilledE","injectorOnE","injectorOffE","inletOnE","inletOffE","jobDoneE");
	
	@Override
	public boolean hasSignal(String sn) {
		return signames.contains(sn);
	}

}
