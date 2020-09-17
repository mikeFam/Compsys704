package org.compsys704;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class CanvasFiller extends JPanel {
	BufferedImage canister1;
	BufferedImage canister2;
	BufferedImage bottle1;
	BufferedImage bottle2;
	BufferedImage inlet1;
	BufferedImage inlet2;
	BufferedImage injector1;
	BufferedImage injector2;
	
	public CanvasFiller(){
		try {
			canister1 = ImageIO.read(new File("res/canister_retracted.png"));
			canister2 = ImageIO.read(new File("res/canister_extend.png"));
			bottle1 = ImageIO.read(new File("res/unfilled_bottle.png"));
			bottle2 = ImageIO.read(new File("res/filled_bottle.png"));
			inlet1 = ImageIO.read(new File("res/inlet_off.png"));
			inlet2 = ImageIO.read(new File("res/inlet_on.png"));
			injector1 = ImageIO.read(new File("res/valve_off.png"));
			injector2 = ImageIO.read(new File("res/valve_on.png"));
		} catch (IOException e) {
			e.printStackTrace();
			System.exit(1);;
		}
	}
	
	@Override
	protected void paintComponent(Graphics g){
		super.paintComponent(g);
		
		if(States.BOTTLE_AT_POS_2) {
			g.drawImage(bottle1, 0, 0, null);
		} 
		if(States.BOTTLE_FILLED) {
			g.drawImage(bottle2, 0, 0, null);
		}
		
		if(States.VALVE_EXTEND) {
			g.drawImage(canister2, 0, 0, null);
		} else {
			g.drawImage(canister1, 0, 0, null);
		}
		
		if(States.INJECTOR_ON) {
			g.drawImage(injector2, 0, 0, null);
		} else {
			g.drawImage(injector1, 0, 0, null);
		}
		
		if(States.INLET_ON) {
			g.drawImage(inlet2, 0, 0, null);
		} else {
			g.drawImage(inlet1, 0, 0, null);
		}
		
		
	}
}
