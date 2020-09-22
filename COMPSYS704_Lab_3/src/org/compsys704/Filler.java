package org.compsys704;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class Filler extends JFrame {
	private JPanel panel;

	public Filler() {
//		this.setPreferredSize(new Dimension(200, 300));
		panel = new CanvasFiller();
		panel.setPreferredSize(new Dimension(960, 720));
		panel.setBackground(Color.WHITE);
		JButton enable = new JButton("enable");
		enable.addActionListener(new SignalClient(PortsFiller.PORT_LOADER_PLANT, PortsFiller.ENABLE_SIGNAL));
		JPanel ss = new JPanel();
		ss.add(enable);
		this.setLayout(new GridBagLayout());
		GridBagConstraints c = new GridBagConstraints();
		c.gridx = 0;
		c.gridy = 0;
		this.add(panel,c);
		c.gridx = 0;
		c.gridy = 1;
		this.add(ss,c);
		
		// Radio buttons
		SignalRadioClient src = new SignalRadioClient(PortsFiller.PORT_LOADER_CONTROLLER, PortsFiller.SIGNAL_Mode);
		JRadioButton mmode = new JRadioButton("Manual");
		mmode.setActionCommand("1");
		mmode.addActionListener(src);
		JRadioButton amode = new JRadioButton("Auto");
		amode.setActionCommand("0");
		amode.addActionListener(src);
		amode.setSelected(true);
		ButtonGroup bg = new ButtonGroup();
		bg.add(mmode);
		bg.add(amode);
		
		JPanel pan = new JPanel(new GridLayout(1, 0));
		pan.add(amode);
		pan.add(mmode);
		c.gridx = 0;
		c.gridy = 2;
		pan.setBorder(BorderFactory.createTitledBorder("Mode selector"));

		// Checkboxes
		JCheckBox pe = new JCheckBox("injector");
		pe.setEnabled(false);
		pe.addItemListener(new SignalCheckBoxClient(PortsFiller.PORT_LOADER_CONTROLLER, PortsFiller.SIGNAL_INJECTOR_ON));
		JCheckBox vo = new JCheckBox("inlet");
		vo.setEnabled(false);
		vo.addItemListener(new SignalCheckBoxClient(PortsFiller.PORT_LOADER_CONTROLLER, PortsFiller.SIGNAL_INLET_ON));
		JCheckBox as = new JCheckBox("valve retract");
		as.setEnabled(false);
		as.addItemListener(new SignalCheckBoxClient(PortsFiller.PORT_LOADER_CONTROLLER, PortsFiller.SIGNAL_VALVE_RETRACT));
		JCheckBox ad = new JCheckBox("valve extend");
		ad.setEnabled(false);
		ad.addItemListener(new SignalCheckBoxClient(PortsFiller.PORT_LOADER_CONTROLLER, PortsFiller.SIGNAL_VALVE_EXTEND));

		JPanel pan2 = new JPanel(new GridLayout(2, 2));
		pan2.add(pe);
		pan2.add(vo);
		pan2.add(as);
		pan2.add(ad);
		pan2.setBorder(BorderFactory.createTitledBorder("Manual control"));
		src.setCheckBoxComponent(pan2);

		JPanel pan3 = new JPanel(new GridLayout(0, 2));
		pan3.add(pan);
		pan3.add(pan2);
		c.gridx = 0;
		c.gridy = 2;
		this.add(pan3,c);
		
		this.setTitle("Filler");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setResizable(false);
	}

	public static void main(String[] args) {
		Filler cl = new Filler();
		cl.pack();
		cl.setVisible(true);
		
		SignalServer<FillerVizWorker> server = new SignalServer<FillerVizWorker>(PortsFiller.PORT_LOADER_VIZ, FillerVizWorker.class);
		new Thread(server).start();
		while(true){
			try {
				cl.repaint();
				Thread.sleep(5);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
