package org.compsys704;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class CanvasCapper extends JPanel {
	BufferedImage clamp1;
	BufferedImage clamp2;
	BufferedImage bottleCap;
	BufferedImage gripper1;
	BufferedImage gripper2;
	BufferedImage gripper3;
	BufferedImage gripper4;
	
	public CanvasCapper(){
		try {
			bottleCap = ImageIO.read(new File("res/bottle_cap.png"));
			gripper1 = ImageIO.read(new File("res/gripper_source.png"));
			gripper2 = ImageIO.read(new File("res/gripper_extend.png"));
			gripper3 = ImageIO.read(new File("res/gripper_gripped.png"));
			gripper4 = ImageIO.read(new File("res/gripper_twist.png"));
			clamp1 = ImageIO.read(new File("res/clamp_open.png"));
			clamp2 = ImageIO.read(new File("res/clamp_close.png"));
		} catch (IOException e) {
			e.printStackTrace();
			System.exit(1);;
		}
	}
	
	@Override
	protected void paintComponent(Graphics g){
		super.paintComponent(g);
		g.drawImage(bottleCap, 0, 0, null);
	
		if(States.CLAMP_RETRACT) {
			g.drawImage(clamp1, 50, 30, null);
		} else {
			g.drawImage(clamp2, 50, 30, null);
		}
		
		if(States.GRIPPER_RETRACTED) {
			g.drawImage(gripper1, 50, 0, null);
		} else {
			if (States.GRIPPER_GRIPPED) {
				if (States.GRIPPER_AT_DEST) {
					g.drawImage(gripper4, 50, 0, null);
				} else {
					g.drawImage(gripper3, 50, 0, null);
				}
			}
			else {
				g.drawImage(gripper2, 50, 0, null);
			}
		}
	}
}
