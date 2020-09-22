package org.compsys704;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class ConveyorCanvas extends JPanel {
	BufferedImage conveyor;
	
	public ConveyorCanvas(){
		try {
			conveyor = ImageIO.read(new File("res/conveyor.png"));
		} catch (IOException e) {
			e.printStackTrace();
			System.exit(1);;
		}
	}
	
	@Override
	protected void paintComponent(Graphics g){
		super.paintComponent(g);
		g.drawImage(conveyor, 0, 100, null);
		
		if(States.BOTTLE_AT_LOADER) {
			g.setColor(Color.blue);
			g.fillOval(50, 240, 35, 35);
		}
		else if (States.BOTTLE_AT_POS_1) {
			g.setColor(Color.blue);
			g.fillOval(154, 240, 35, 35);
		}
		else{
			g.setColor(Color.blue);
			g.fillOval(268, 240, 35, 35);
		}
	}
}
