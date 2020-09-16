package org.compsys704;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class RotaryTableCanvas extends JPanel {
	BufferedImage rotaryTable;
	
	public RotaryTableCanvas(){
		try {
			rotaryTable = ImageIO.read(new File("res/rotaryTable.png"));
		} catch (IOException e) {
			e.printStackTrace();
			System.exit(1);;
		}
	}
	
	@Override
	protected void paintComponent(Graphics g){
		
	}
}
