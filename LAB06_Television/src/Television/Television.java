package Television;

import java.awt.*;
import javax.swing.*;

//Inherit appropriate superclass 
public class Television extends JFrame {
	
	public Television(String title) {
		setLayout(new BorderLayout());
		//Call a method TelevisionComponents
		TelevisionComponents();
		//set JFrame
		setTitle(title);
		setSize(900, 600);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public void TelevisionComponents() {
		//create abutton_TelevisionScreen and panal_TelevisionButtonBar
		BarPanel panel_TelevisionButtonBar = new BarPanel();
		JButton abutton_TelevisionScreen = new JButton();
		//Add to this Television
		add(panel_TelevisionButtonBar, BorderLayout.SOUTH);
		add(abutton_TelevisionScreen, BorderLayout.CENTER);
	}
}
