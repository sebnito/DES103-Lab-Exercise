package g6822781173_LAB08_MovingMessagePanel;

import java.awt.*;
import javax.swing.*;

public class MovingMessagePanelTesting {
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		MovingMessagePanel panel = new MovingMessagePanel();
		frame.add(panel);
		frame.setVisible(true);
		frame.setSize(1000, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
