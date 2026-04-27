
public class Rectangle {
	int width;
	int lenght;
	
	Rectangle(){
		width = 1;
		lenght = 1;
	}
	
	Rectangle(int x,int y){
		width = x;
		lenght = y;
	}
	
	double findArea(){
		return width * lenght;
	}
	
	double findPerimeter() {
		return width * 2 + lenght * 2;
	}
	
	double findDiagonal() {
		return Math.sqrt(Math.pow(width, 2) + Math.pow(lenght, 2));
	}
	
	boolean isSquare() {
		if (width == lenght) {
			return true;
		}
		else {
			return false;
		}
	}
	
	void printBasicInfo() {
		System.out.printf("The width is %d%n", width);
		System.out.printf("The lenght is %d%n", lenght);
	}
}
