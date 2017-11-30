package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;

public class GuiTest {

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				// create the frame
				ColorWindow frame = new ColorWindow();
				// set the frame to close when prompted
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				// set the frame to visible
				frame.setVisible(true);
			} // end method run
		});

	} // end method main

}
