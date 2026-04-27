package g6822781173_LAB06_Microwave;

import java.awt.*;
import javax.swing.*;

public class Microwave extends JFrame {

	public Microwave() {
		//Call the method: MicrowaveComponents
		MicrowaveComponents();
	}
	
	public void MicrowaveComponents() {
		setLayout(new BorderLayout());
		//Create the first panel of MicrowaveLayout to position its components
		JPanel panel01_MicrowaveLayout = new JPanel();
		panel01_MicrowaveLayout.setLayout(new BorderLayout());
		
		//Add the first panel into the EAST of MicrowaveLayout
		add(panel01_MicrowaveLayout, BorderLayout.EAST);
		
		//Create a button to place foods at the CENTER of MicrowaveLayout
		JButton button_Foods = new JButton("Food to be placed here");
		add(button_Foods, BorderLayout.CENTER);
		
		//Create the second panel and set GridLayout for adding the button's numbers  
		JPanel panel02_NumberLayout = new JPanel();
		panel02_NumberLayout.setLayout(new GridLayout(4, 3));
		
		//At the first panel, Create a textfield to display its time at the NORTH of MicrowaveLayout
		JTextField textfield_TimeDisplay = new JTextField("Microwave Time Display");
		panel01_MicrowaveLayout.add(textfield_TimeDisplay, BorderLayout.NORTH);
		
		//Use a FOR loop to add the button's numbers into the NumberLayout
		for (int i = 1; i < 10; i ++) {
			panel02_NumberLayout.add(new JButton(""+i));
		}

		//Create three button(Stop, 0, Start) and add them into the second JPanel
		JButton bt_start = new JButton("Start");
		JButton bt_stop = new JButton("Stop");
		JButton bt_zero = new JButton("0");
		panel02_NumberLayout.add(bt_start);
		panel02_NumberLayout.add(bt_zero);
		panel02_NumberLayout.add(bt_stop);

		//Add the second JPanel to the first panel at the CENTER of MicrowaveLayout
		panel01_MicrowaveLayout.add(panel02_NumberLayout, BorderLayout.CENTER);
		
	}
}