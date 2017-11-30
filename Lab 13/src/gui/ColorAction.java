package gui;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ColorAction implements ActionListener {

	// holds the current background color of the panel
	protected Color background;
	// holds the counter variable that decides the color of the panel
	protected int count;
	private ColorWindow window;

	public ColorAction(ColorWindow colorWin) {
		count = -1;
		window = colorWin;
	} // end Constructor ColorAction (ColorWindow)

	// resets the counter to 0
	public void reset() {
		count = -1;
	} // end method reset

	// advances the counter variable by one and assigns the proper color to
	// background
	public void advColor() {
		count++;

		// determines the color background should be
		switch (count % 4) {
		case 0:
			background = Color.BLACK;
			break;
		case 1:
			background = Color.GREEN;
			break;
		case 2:
			background = Color.ORANGE;
			break;
		case 3:
			background = Color.PINK;
			break;
		}
	} // end method advColor

	// selects the proper color then sets the background to that color
	public void actionPerformed(ActionEvent action) {
		advColor();
		window.panel.setBackground(background);
	} // end method actionPerformed
}
