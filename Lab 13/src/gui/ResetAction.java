package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ResetAction implements ActionListener {

	private ColorAction action;
	private ColorWindow window;

	public ResetAction(ColorAction colorAct, ColorWindow colorWin) {
		action = colorAct;
		window = colorWin;
	}

	public void actionPerformed(ActionEvent action) {
		this.action.reset();
		this.action.advColor();
		window.panel.setBackground(this.action.background);
	}
}
