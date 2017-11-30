package gui;

import javax.swing.JFrame;

public class ColorFrame extends JFrame {
	// default height and width of the frame
	public static final int WIDTH = 600;
	public static final int HEIGHT = 300;

	// sets the size of the window
	public ColorFrame() {
		setSize(WIDTH, HEIGHT);
	} // end Constructor ColorFrame()

	// sets the size and title of the window
	public ColorFrame(String name) {
		setSize(WIDTH, HEIGHT);
		setTitle(name);
	} // end Constructor ColorFrame(String)
}
