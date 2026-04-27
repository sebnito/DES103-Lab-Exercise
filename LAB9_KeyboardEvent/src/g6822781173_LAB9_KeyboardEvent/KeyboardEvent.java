package g6822781173_LAB9_KeyboardEvent;
import javax.swing.*; import java.awt.*; import java.awt.event.*;
public class KeyboardEvent extends JPanel implements KeyListener{
	String text = "";
	KeyboardEvent() {
		this.addKeyListener(this);
		this.setFocusable(true);
	}
	public void paintComponent(Graphics g) {
		g.setFont(new Font("SansSerif", Font.BOLD, 100));
		g.setColor(Color.BLUE);
		g.drawString(text, 0, 100);
	}
	public void keyTyped(KeyEvent e) {
		text += "" + e.getKeyChar();
		repaint();
	}
	public void keyPressed(KeyEvent e) {}
	public void keyReleased(KeyEvent e) {}
}
