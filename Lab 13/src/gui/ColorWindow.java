package gui;

import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ColorWindow extends ColorFrame {

	protected JPanel panel;

	public ColorWindow() {
		// create frame
		super("Color Generator");

		// create panel
		panel = new JPanel();

		// create the three buttons
		JButton change = new JButton("Change");
		JButton reset = new JButton("Reset");
		JButton close = new JButton("Close");

		// add the buttons to the panel
		panel.add(change);
		panel.add(reset);
		panel.add(close);

		// Create the three different actions
		ColorAction colorAct = new ColorAction(this);
		ResetAction resetAct = new ResetAction(colorAct, this);
		CloseAction closeAct = new CloseAction();

		// assign the correct actions to each of the buttons
		change.addActionListener(colorAct);
		reset.addActionListener(resetAct);
		close.addActionListener(closeAct);

		// add panel to frame
		add(panel);

	}
}
