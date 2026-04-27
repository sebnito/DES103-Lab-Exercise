package g6822781173_LAB08_MovingMessagePanel;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class MovingMessagePanel extends JPanel implements ActionListener, ItemListener, MouseMotionListener {
	JPanel messagePanel = new JPanel();
	JTextField messageField = new JTextField("TEST", 20);
	JPanel colorPanel = new JPanel();
	JRadioButton whiteBT = new JRadioButton("White");
	JRadioButton blackBT = new JRadioButton("Black");
	JRadioButton mouseBT = new JRadioButton("Use Mouse");
	JPanel RadioPanel = new JPanel();
	JPanel directionPanel = new JPanel();
	JButton leftBT = new JButton("Left");
	JButton rightBT = new JButton("Right");
	JButton upBT = new JButton("Up");
	JButton downBT = new JButton("Down");
	String text = messageField.getText();
	Color textColor = Color.BLACK;
	int x = 100;
	int y = 200;
	Boolean mouseAllow = false;
	MovingMessagePanel() {
		setBackground(Color.WHITE);
		messagePanel.add(new JLabel("Message to be displayed"));
		messagePanel.add(messageField);
		colorPanel.setLayout(new GridLayout(3,1));
		colorPanel.add(new JLabel("Background Color"));
		colorPanel.add(whiteBT);
		colorPanel.add(blackBT);
		directionPanel.add(leftBT);
		directionPanel.add(rightBT);
		directionPanel.add(upBT);
		directionPanel.add(downBT);
		setLayout(new BorderLayout());
		add(messagePanel, BorderLayout.NORTH);
		add(colorPanel, BorderLayout.WEST);
		add(mouseBT, BorderLayout.EAST);
		add(directionPanel, BorderLayout.SOUTH);
		messageField.addActionListener(this);
		whiteBT.addItemListener(this);
		blackBT.addItemListener(this);
		leftBT.addActionListener(this);
		rightBT.addActionListener(this);
		upBT.addActionListener(this);
		downBT.addActionListener(this);
		this.addMouseMotionListener(this);
		mouseBT.addActionListener(this);
	}
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setFont(new Font("SansSerif", Font.BOLD, 100));
		g.setColor(textColor);
		g.drawString(text, x, y);
		repaint();
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == messageField) {
			text = messageField.getText();
		}
		if (e.getActionCommand() == "Left") {
			x -= 1;
		}
		if (e.getActionCommand() == "Right") {
			x += 1;
		}
		if (e.getActionCommand() == "Up") {
			y -= 1;
		}
		if (e.getActionCommand() == "Down") {
			y += 1;
		}
		repaint();
	} 
	public void itemStateChanged(ItemEvent e) {
		if (e.getSource() == whiteBT) {
			blackBT.setSelected(false);
			textColor = Color.BLACK;
			setBackground(Color.WHITE);
		}
		if (e.getSource() == blackBT) {
			whiteBT.setSelected(false);
			textColor = Color.PINK;
			setBackground(Color.BLACK);
		}
		repaint();
	}

	public void mouseDragged(MouseEvent e) {
		if (mouseBT.isSelected()) {
			x = e.getX();
			y = e.getY();
		}
		repaint();
	}

	public void mouseMoved(MouseEvent e) {
	}
}
