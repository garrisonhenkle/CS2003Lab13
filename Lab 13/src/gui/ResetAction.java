package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ResetAction implements ActionListener {

	private ColorAction action;
	private ColorWindow window;

	public ResetAction(ColorAction colorAct, ColorWindow colorWin) {
		action = colorAct;
		window = colorWin;
	} // end Constructor ResetAction

	// resets the counter variable to 0 and sets the background color to the
	// original color (black)
	public void actionPerformed(ActionEvent action) {
		// reset the counter variable
		this.action.reset();
		// select the first color
		this.action.advColor();
		// set the background to that color
		window.panel.setBackground(this.action.background);
	} // end method actionPerformed
}
