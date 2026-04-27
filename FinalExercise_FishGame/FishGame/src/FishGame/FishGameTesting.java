package FishGame;
import javax.swing.*; import java.awt.*;
public class FishGameTesting {
	public static void main(String [] args) {
		JFrame frame = new JFrame("My FishGame");
		FishGame fish = new FishGame();
		frame.add(fish);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(1000, 500);
	}
}
