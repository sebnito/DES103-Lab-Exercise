//ElectricFan.java
package Graphics;

import java.awt.*;
import javax.swing.JPanel;

public class ElectricFan extends JPanel {
	public void paintComponent(Graphics g) {
		// Exercise 1: Fan's frame
		g.setColor(Color.GRAY);
		g.fillOval(295, 95, 210, 210);
		g.setColor(Color.WHITE);
		g.fillOval(300, 100, 200, 200);
		// Exercise 2: Fan's Blades
		g.setColor(Color.ORANGE);
		for (int i = 0; i < 5; i ++) {
			g.fillArc(310, 110,  180, 180, i*72, 36);
		}
//		g.fillArc(310, 110, 180, 180, 0, 36);
//		g.fillArc(310, 110, 180, 180, 72, 36);
//		g.fillArc(310, 110, 180, 180, 144, 36);
//		g.fillArc(310, 110, 180, 180, 216, 36);
//		g.fillArc(310, 110, 180, 180, 288, 36);
		// Exercise 3: Fan's neck 
		g.setColor(Color.GRAY);
		g.fillRect(380, 300, 45, 150);
		// Exercise 4: Fan's base
		int x [] = {350, 450, 500, 300};
		int y [] = {450, 450, 550, 550};
		g.setColor(Color.BLUE);
		g.fillPolygon(x, y, 4);
		// Exercise 5: Fan's speed buttons
		g.setColor(Color.RED);
		// Exercise 5: Four red round speed buttons
		g.fillRoundRect(360, 500, 17, 20, 20, 20);
		g.fillRoundRect(380, 500, 17, 20, 20, 20);
		g.fillRoundRect(400, 500, 17, 20, 20, 20);
		g.fillRoundRect(420, 500, 17, 20, 20, 20);
		g.setColor(Color.WHITE);
		g.drawString("0", 366, 514);
		g.drawString("1", 386, 514);
		g.drawString("2", 406, 514);
		g.drawString("3", 426, 514);
	}

	}