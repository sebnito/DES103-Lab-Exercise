package g6822781173_LAB03_CompanyHierarchy;

public class Executive extends Employee {
	double bonus;
	Executive(String firstName, String lastName, int day, int month, int year, String workplace, String position, double salary, double bonus){
		super(firstName, lastName, day, month, year, workplace, position, salary);
		this.bonus = bonus;
	}
	void printInfo() {
		super.printInfo();
		System.out.printf("Bonus: %.1f%n", bonus);
	}
	void annouceRlue(String rule) {
		System.out.print(position+": ");
		super.name.printName();
		System.out.println();
		System.out.printf("Announces rule: %s%n", rule);
	}
}
