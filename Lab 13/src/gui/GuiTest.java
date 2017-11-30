package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;

public class GuiTest {

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				ColorWindow frame = new ColorWindow();
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.setVisible(true);
			}
		});

	}

}
