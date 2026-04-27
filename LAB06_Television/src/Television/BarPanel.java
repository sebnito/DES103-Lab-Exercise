package Television;

import java.awt.*;
import javax.swing.*;

//Inherit appropriate superclass 
public class BarPanel extends JPanel{
	public BarPanel() {
		//Create controlpanel and textfield_ChVolDisplay
		setLayout(new FlowLayout());
		ControlPanel panel_control = new ControlPanel();
		JTextField textfield_ChVolDisplay = new JTextField("Ch 35 Vol 45");
		//Add to this BarPanel panel
		add(textfield_ChVolDisplay);
		add(panel_control);
	}
}
