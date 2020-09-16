package org.compsys704;

import java.util.Arrays;
import java.util.List;

public class CapperVizWorker extends Worker{

	@Override
	public void setSignal(boolean status) {
//		System.out.println(signame+"  "+status);
		switch(signame){
		case "gripperZAxisLiftedE":
			States.GRIPPER_RETRACTED = status;
			break;
		case "gripperZAxisLoweredE":
			States.GRIPPER_EXTENDED = status;
			break;
		case "clampRetractedE":
			States.CLAMP_RETRACT = status;
			break;
		case "clampExtendedE":
			States.CLAMP_EXTEND = status;
			break;
		case "gripperTurnFinalPosE":
			States.GRIPPER_AT_DEST = status;
			break;
		case "gripperTurnHomePosE":
			States.GRIPPER_AT_SOURCE = status;
			break;
		default: 
			System.err.println("Wrong sig name : "+signame);
			System.exit(1);
		}
	}
	
	
	static final List<String> signames = Arrays.asList("bottleAtPos4E", "gripperZAxisLoweredE", "gripperZAxisLiftedE", "gripperTurnHomePosE", "gripperTurnFinalPosE", "clampRetractedE", "clampExtendedE");
	
	@Override
	public boolean hasSignal(String sn) {
		return signames.contains(sn);
	}

}
