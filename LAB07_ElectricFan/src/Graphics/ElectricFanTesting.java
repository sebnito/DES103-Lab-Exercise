//ElectricFanTesting.java
package Graphics;

import javax.swing.JFrame;

public class ElectricFanTesting {
	public static void main(String[] args) {
		JFrame frame = new JFrame("My Drawing Fan");
		ElectricFan fan = new ElectricFan();
		frame.add(fan);
		frame.setSize(1000, 1000);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
