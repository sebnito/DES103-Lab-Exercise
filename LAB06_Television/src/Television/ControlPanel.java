package Television;

import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JPanel;

//Inherit appropriate superclass 
public class ControlPanel extends JPanel{
	public ControlPanel() {		
		setLayout(new FlowLayout());
		//create a On/Of button and add to the power panel 
		JButton bt_onoff = new JButton("On/Off");
		//create two adjust panels and add to the layout of this control Panel
		AdjustPanel panel_adjust_vol = new AdjustPanel("Vol");
		AdjustPanel panel_adjust_ch = new AdjustPanel("Ch");
		add(panel_adjust_ch);
		add(panel_adjust_vol);
		add(bt_onoff);
	}
}
