package gui;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ColorAction implements ActionListener {

	protected Color background;
	protected int count;
	private ColorWindow window;

	public ColorAction(ColorWindow colorWin) {
		count = -1;
		window = colorWin;
	}

	public void reset() {
		count = -1;
	}

	public void advColor() {
		count++;

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
	}

	public void actionPerformed(ActionEvent action) {
		advColor();
		window.panel.setBackground(background);
	}
}
