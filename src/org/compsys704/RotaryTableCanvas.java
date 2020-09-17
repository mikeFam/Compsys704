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
	BufferedImage rotaryTable2;
	BufferedImage rotaryTable3;
	BufferedImage rotaryTable4;
	BufferedImage rotaryTable5;
	BufferedImage rotaryTable6;
	
	public RotaryTableCanvas(){
		try {
			rotaryTable1 = ImageIO.read(new File("res/rotaryTable.png"));
			rotaryTable2 = ImageIO.read(new File("res/rotaryTable2.png"));
			rotaryTable3 = ImageIO.read(new File("res/rotaryTable3.png"));
			rotaryTable4 = ImageIO.read(new File("res/rotaryTable4.png"));
			rotaryTable5 = ImageIO.read(new File("res/rotaryTable5.png"));
			rotaryTable6 = ImageIO.read(new File("res/rotaryTable6.png"));
		} catch (IOException e) {
			e.printStackTrace();
			System.exit(1);;
		}
	}
	
	@Override
	protected void paintComponent(Graphics g){
		super.paintComponent(g);
		
		
	}
}
