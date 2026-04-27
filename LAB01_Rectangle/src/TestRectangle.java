
public class TestRectangle {
	public static void main(String [] args) {
		System.out.println("Box1:");
		Rectangle box1 = new Rectangle();
		double box1_perimeter = box1.findPerimeter();
		double box1_diagonal = box1.findDiagonal();
		box1.printBasicInfo();
		System.out.printf("The perimeter is %.2f.%n", box1_perimeter);
		System.out.printf("The diagonal is %.2f.%n", box1_diagonal);
		if (box1.isSquare()) {
			System.out.println("It is a square box.");
		}
		else {
			System.out.println("It is not a square box.");
		}
		
		System.out.println("Box2:");
		Rectangle box2 = new Rectangle(2, 3);
		double box2_perimeter = box2.findPerimeter();
		double box2_diagonal = box2.findDiagonal();
		box2.printBasicInfo();
		System.out.printf("The perimeter is %.2f.%n", box2_perimeter);
		System.out.printf("The diagonal is %.2f.%n", box2_diagonal);
		if (box2.isSquare()) {
			System.out.println("It is a square box.");
		}
		else {
			System.out.println("It is not a square box.");
		}
	}
}
