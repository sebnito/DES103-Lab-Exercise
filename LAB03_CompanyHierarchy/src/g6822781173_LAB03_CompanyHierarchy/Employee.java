package g6822781173_LAB03_CompanyHierarchy;

public class Employee extends Person {
	String workplace;
	String position;
	double salary;
	Employee(String firstName, String lastName, int day, int month, int year, String workplace, String position, double salary) {
		super(firstName, lastName, day, month, year);
		this.workplace = workplace;
		this.position = position;
		this.salary = salary;
	}
	void printInfo() {
		super.printInfo();
		System.out.printf("Work Place: %s%n", workplace);
		System.out.printf("Position: %s%n", position);
		System.out.printf("Salary: %.1f%n", salary);
	}
	void followRule(String rule) {
		System.out.print(position+": ");
		super.name.printName();
		System.out.println();
		System.out.printf("Followed: %s%n", rule);
	}
}
