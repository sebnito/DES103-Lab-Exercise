package Television;

import java.awt.*;
import javax.swing.*;

//Inherit appropriate superclass 
public class AdjustPanel extends JPanel{

	public AdjustPanel(String centerText) {
		//create three buttons: Less, center text, and more 
		JButton button_decrease = new JButton("<<");
		JButton button_text = new JButton(centerText);
		JButton button_increase = new JButton(">>");
		//Add to this AdjustPanel panel
		setLayout(new FlowLayout());
		add(button_decrease);
		add(button_text);
		add(button_increase);
	}
}
