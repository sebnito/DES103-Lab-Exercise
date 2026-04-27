package g6822781173_LAB09_BMICalculator;
import javax.swing.*; import java.awt.*; import java.awt.event.*;
public class BMICalculator extends JPanel {
	JPanel p1 = new JPanel();
	JPanel p2 = new JPanel();
	JPanel p3 = new JPanel();
	JTextField height = new JTextField();
	JTextField weight = new JTextField();
	JButton button_BMIcalculation = new JButton("Compute BMI");
	double result = 0;
	JLabel show_result = new JLabel("BMI =");
	BMICalculator() {
		p1.setLayout(new GridLayout());
		p1.add(new JLabel("Enter your information"));
		p2.setLayout(new GridLayout(3,2));
		p2.add(new JLabel("Your height(cm):"));
		p2.add(height);
		p2.add(new JLabel("Your weight(kg):"));
		p2.add(weight);
		p3.setLayout(new GridLayout(2, 1));
		p3.add(button_BMIcalculation);
		p3.add(show_result);
		setLayout(new GridLayout(3,3));
		add(p1);
		add(p2);
		add(p3);
		button_BMIcalculation.addActionListener(new ActionInterpretor());
	}
	class ActionInterpretor implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			double w = Double.parseDouble(weight.getText());
			double h = Double.parseDouble(height.getText())/100;
			if (e.getSource() == button_BMIcalculation) {
				result = w / (h * h);
				show_result.setText(String.format("BMI = %.2f" ,result));
			}
		}
	}
}
