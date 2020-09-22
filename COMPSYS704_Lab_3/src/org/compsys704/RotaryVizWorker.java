package org.compsys704;

import java.util.Arrays;
import java.util.List;

public class RotaryVizWorker extends Worker{

	@Override
	public void setSignal(boolean status) {
//		System.out.println(signame+"  "+status);
		switch(signame){
		case "tableAlignedWithSensorE":
			States.ALIGNED = status;
			break;
		case "bottleAtPos5E":
			States.BOTTLE_ROTARY_5 = status;
			break;
		case "capOnBottleAtPos1E":
			States.CAP_AT_1 = status;
			break;
		case "bottleAtPos1E":
			States.BOTTLE_ROTARY_1 = status;
			break;
		case "bottleAtPos2E":
			States.BOTTLE_ROTARY_2 = status;
			break;
		case "bottleAtPos3E":
			States.BOTTLE_ROTARY_3 = status;
			break;
		case "bottleAtPos4E":
			States.BOTTLE_ROTARY_4 = status;
			break;
		default: 
			System.err.println("Wrong sig name : "+signame);
			System.exit(1);
		}
	}
	
	
	static final List<String> signames = Arrays.asList("tableAlignedWithSensorE","bottleAtPos5E","capOnBottleAtPos1E","bottleAtPos1E","bottleAtPos2E","bottleAtPos3E","bottleAtPos4E");
	
	@Override
	public boolean hasSignal(String sn) {
		return signames.contains(sn);
	}

}
