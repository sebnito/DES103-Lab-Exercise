package FishGame;
import javax.swing.*; import java.awt.*; import java.awt.event.*;
public class FishGame extends JPanel implements ActionListener, MouseListener{
	int x = 100;
	int y = 100;
	static int speed = 5;
	int delay;
	int hp = 1000;
	JPanel p1 = new JPanel();
	JLabel hp_label = new JLabel("HP: 1000");
	Boolean colorch = true;
	Color color = Color.ORANGE;
	JButton start = new JButton("Update Speed");
	JButton restart = new JButton("Restart");
	JTextField input_speed = new JTextField();
	Timer timer = new Timer(delay, this);
	
	FishGame( ) {
		setFocusable(true);
		setBackground(Color.BLUE);
		this.setLayout(new BorderLayout());
		p1.setLayout(new GridLayout(2,2));
		p1.add(input_speed);
		p1.add(start);
		p1.add(hp_label);
		p1.add(restart);
		this.add(p1, BorderLayout.SOUTH);
		start.addActionListener(this);
		input_speed.addActionListener(this);
		restart.addActionListener(this);
		this.addMouseListener(this);
	}
	
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setColor(Color.WHITE);
		g.fillRect(500, 150, 10, 10);
		g.setColor(color);
		g.fillOval(x, y, 100, 100);
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		speed = -speed;
		repaint();
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
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

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == start) {
			delay = Integer.parseInt(input_speed.getText());
			timer.start();
		}
		if (e.getSource() == restart) {
			delay = 0;
			timer.stop();
			x = 100;
		}
		if (x == 500) {
			if (colorch) {
				color = Color.GREEN;
				colorch = false;
			}
			else {
				color = Color.ORANGE;
				colorch = true  ;
			}
		}
		if (e.getSource() == input_speed) {
			hp = Integer.parseInt(input_speed.getText()) * 100;
			hp_label.setText("HP: " + hp);
		}
		x += speed;
		repaint();
	}
}
