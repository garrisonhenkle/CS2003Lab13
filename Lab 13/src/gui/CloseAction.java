package gui;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CloseAction implements ActionListener {

	public CloseAction() {
	} // end Constructor CloseAction()

	// closes the window
	public void actionPerformed(ActionEvent action) {
		System.exit(0);
	} // end method actionPerformed
}
