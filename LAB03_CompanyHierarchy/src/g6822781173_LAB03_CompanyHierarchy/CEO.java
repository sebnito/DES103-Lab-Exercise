package g6822781173_LAB03_CompanyHierarchy;

public class CEO extends  Executive {
	String positionVehicle;
	CEO(String firstName, String lastName, int day, int month, int year, String workplace, String position, double salary, double bonus, String positionVehicle){
		super(firstName, lastName, day, month, year, workplace, position, salary, bonus);
		this.positionVehicle = positionVehicle;
	}
	void printInfo() {
		super.printInfo();
		System.out.printf("Position Vehicle: %s%n", positionVehicle);
	}
	void showVision(String vision) {
		name.printName();
		System.out.print(" shows ");
		System.out.println(vision);
	}
}
