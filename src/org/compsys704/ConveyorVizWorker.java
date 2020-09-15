package org.compsys704;

import java.util.Arrays;
import java.util.List;

public class ConveyorVizWorker extends Worker{

	@Override
	public void setSignal(boolean status) {
//		System.out.println(signame+"  "+status);
		switch(signame){
		case "bottleAtPos1E":
			States.BOTTLE_AT_POS_1 = status;
			System.out.println("Pos 1 = " + States.BOTTLE_AT_POS_1);
			break;
		case "bottleLeftPos5E":
			States.BOTTLE_AT_POS_5 = status;
			System.out.println("Pos 5 = " +States.BOTTLE_AT_POS_5);
			break;
		case "bottleAtLoadE":
			System.out.println("Pos Load = " + States.BOTTLE_AT_LOADER);
			States.BOTTLE_AT_LOADER = status;
			System.out.println("Pos Load = " + States.BOTTLE_AT_LOADER);
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
