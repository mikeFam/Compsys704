package org.compsys704;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class RotaryTableCanvas extends JPanel {
	BufferedImage rotaryTable1;
	BufferedImage bottleAt1;
	BufferedImage bottleAt2;
	BufferedImage bottleAt3;
	BufferedImage bottleAt4;
	BufferedImage bottleAt5;
	BufferedImage capAt1;
	
	public RotaryTableCanvas(){
		try {
			rotaryTable1 = ImageIO.read(new File("res/rotaryTable.png"));
			capAt1 = ImageIO.read(new File("res/rotaryTableCap.png"));
			bottleAt1 = ImageIO.read(new File("res/BottleAt1.png"));
			bottleAt2 = ImageIO.read(new File("res/BottleAt2.png"));
			bottleAt3 = ImageIO.read(new File("res/BottleAt3.png"));
			bottleAt4 = ImageIO.read(new File("res/BottleAt4.png"));
			bottleAt5 = ImageIO.read(new File("res/BottleAt5.png"));
		} catch (IOException e) {
			e.printStackTrace();
			System.exit(1);;
		}
	}
	
	@Override
	protected void paintComponent(Graphics g){
		super.paintComponent(g);
		g.drawImage(rotaryTable1, 0, 0, null);
		
		if (States.CAP_AT_1) {
			g.drawImage(capAt1, 0 ,0, null);
		}
		
		if(States.BOTTLE_ROTARY_1 && States.ALIGNED) {
			g.drawImage(bottleAt1, 0, 0, null);
		}
		
		if(States.BOTTLE_ROTARY_2 && States.ALIGNED) {
			g.drawImage(bottleAt2, 0, 0, null);
		}
		
		if(States.BOTTLE_ROTARY_3 && States.ALIGNED) {
			g.drawImage(bottleAt3, 0, 0, null);
		}
		
		if(States.BOTTLE_ROTARY_4 && States.ALIGNED) {
			g.drawImage(bottleAt4, 0, 0, null);
		}
		
		if(States.BOTTLE_ROTARY_5 && States.ALIGNED) {
			g.drawImage(bottleAt5, 0, 0, null);
		}
	}
}
