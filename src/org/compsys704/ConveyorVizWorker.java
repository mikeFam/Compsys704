package org.compsys704;

import java.util.Arrays;
import java.util.List;

public class ConveyorVizWorker extends Worker{

	@Override
	public void setSignal(boolean status) {
//		System.out.println(signame+"  "+status);
		switch(signame){
		case "bottleAtLoadE":
			States.BOTTLE_AT_LOADER = status;
			break;	
		case "bottleAtPos1E":
			States.BOTTLE_AT_POS_1 = status;
			break;
		case "bottleLeftPos5E":
			States.BOTTLE_AT_POS_5 = status;
			break;
		default: 
			System.err.println("Wrong sig name : "+signame);
			System.exit(1);
		}
	}
	
	
	static final List<String> signames = Arrays.asList("bottleAtPos1E","bottleLeftPos5E", "bottleAtLoadE");
	
	@Override
	public boolean hasSignal(String sn) {
		return signames.contains(sn);
	}
}
