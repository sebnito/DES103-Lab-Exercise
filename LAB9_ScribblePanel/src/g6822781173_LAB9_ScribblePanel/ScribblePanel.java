package g6822781173_LAB9_ScribblePanel;
import javax.swing.*; import java.awt.*; import java.awt.event.*;
public class ScribblePanel extends JPanel implements MouseMotionListener, MouseListener{
	int x;
	int y;
	ScribblePanel() {
		this.addMouseMotionListener(this);
		this.addMouseListener(this);
		setFocusable(true);
	}
	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		Graphics g = getGraphics();
		if (e.getModifiersEx() == MouseEvent.BUTTON1_DOWN_MASK) {
			g.setColor(Color.BLACK);
			g.drawLine(x, y, e.getX(), e.getY());
			x = e.getX();
			y = e.getY();
		}
		else {
			g.setColor(getBackground());
			g.fillRect(e.getX(), 0, 50, this.getHeight());
		}
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		x = e.getX();
		y = e.getY();
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		repaint();
	}
	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		x = e.getX();
		y = e.getY();
	}
	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

}
