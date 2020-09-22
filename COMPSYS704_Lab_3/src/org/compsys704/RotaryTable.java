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

public class RotaryTable extends JFrame {
	private JPanel panel;

	public RotaryTable() {
		panel = new RotaryTableCanvas();
		panel.setPreferredSize(new Dimension(960, 720));
		panel.setBackground(Color.WHITE);
		JButton enable = new JButton("enable");
		enable.addActionListener(new SignalClient(RotaryTablePorts.PORT_LOADER_PLANT, RotaryTablePorts.ENABLE_SIGNAL));
		JButton refill = new JButton("refill");
		refill.addActionListener(new SignalClient(RotaryTablePorts.PORT_LOADER_PLANT, RotaryTablePorts.REFILL_SIGNAL));
		JPanel ss = new JPanel();
		ss.add(enable);
		ss.add(refill);
		this.setLayout(new GridBagLayout());
		GridBagConstraints c = new GridBagConstraints();
		c.gridx = 0;
		c.gridy = 0;
		this.add(panel,c);
		c.gridx = 0;
		c.gridy = 1;
		this.add(ss,c);
		
		// Radio buttons
		SignalRadioClient src = new SignalRadioClient(RotaryTablePorts.PORT_LOADER_CONTROLLER, RotaryTablePorts.SIGNAL_Mode);
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
		JCheckBox pe = new JCheckBox("sensor alligned");
		pe.setEnabled(true);
		pe.addItemListener(new SignalCheckBoxClient(RotaryTablePorts.PORT_LOADER_PLANT, RotaryTablePorts.ALIGNEDSENSOR_SIGNAL));
		JCheckBox vo = new JCheckBox("capped bottle at pos 1");
		vo.setEnabled(false);
		vo.addItemListener(new SignalCheckBoxClient(RotaryTablePorts.PORT_LOADER_PLANT, RotaryTablePorts.CAP_AT_POS_1_SIGNAL));
		JCheckBox as = new JCheckBox("bottle at pos 5");
		as.setEnabled(false);
		as.addItemListener(new SignalCheckBoxClient(RotaryTablePorts.PORT_LOADER_PLANT, RotaryTablePorts.BOTTLE_POS_5_SIGNAL));
		JCheckBox ad = new JCheckBox("rotary on");
		ad.setEnabled(false);
		ad.addItemListener(new SignalCheckBoxClient(RotaryTablePorts.PORT_LOADER_CONTROLLER, RotaryTablePorts.SIGNAL_ROTARY_ON));

		JPanel pan2 = new JPanel(new GridLayout(2, 2));
		pan.add(pe);
		pan2.add(vo);
		pan2.add(as);
		pan2.add(ad);
		pan2.setBorder(BorderFactory.createTitledBorder("Manual control"));
		src.setCheckBoxComponent(pan);
		src.setCheckBoxComponent(pan2);

		JPanel pan3 = new JPanel(new GridLayout(0, 2));
		pan3.add(pan);
		pan3.add(pan2);
		c.gridx = 0;
		c.gridy = 2;
		this.add(pan3,c);
		
		this.setTitle("RotaryTable");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setResizable(false);
	}

	public static void main(String[] args) {
		RotaryTable cl = new RotaryTable();
		cl.pack();
		cl.setVisible(true);
		
		SignalServer<RotaryVizWorker> server = new SignalServer<RotaryVizWorker>(RotaryTablePorts.PORT_LOADER_VIZ, RotaryVizWorker.class);
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
