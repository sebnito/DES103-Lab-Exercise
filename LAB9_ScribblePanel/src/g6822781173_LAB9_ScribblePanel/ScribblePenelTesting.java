package g6822781173_LAB9_ScribblePanel;
import javax.swing.*; import java.awt.*; import java.awt.event.*;
public class ScribblePenelTesting {
	public static void main(String [] arg) {
		JFrame frame = new JFrame("Scribble Panel");
		frame.setLayout(new BorderLayout());
		ScribblePanel sp = new ScribblePanel(); //create an object of ScribblePenel
		frame.add(sp , BorderLayout.CENTER); //add the object into CENTER of JFrame
		frame.setSize(300, 300); //set a frame's resolution
		frame.setLocationRelativeTo(null); //set a location at center the frame
		frame.setVisible(true); //set visible
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //set default Close Operation
	}
}
