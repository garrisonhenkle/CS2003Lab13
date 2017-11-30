package gui;

import javax.swing.JFrame;

public class ColorFrame extends JFrame {
	public static final int WIDTH = 600;
	public static final int HEIGHT = 300;

	public ColorFrame() {
		setSize(WIDTH, HEIGHT);
	}

	public ColorFrame(String name) {
		setSize(WIDTH, HEIGHT);
		setTitle(name);
	}
}
