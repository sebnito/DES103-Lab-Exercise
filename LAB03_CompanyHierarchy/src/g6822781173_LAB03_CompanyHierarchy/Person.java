package g6822781173_LAB03_CompanyHierarchy;

public class Person {
	Name name;
	Date date;
	static int numPerson=0;
	Person(String firstName, String lastName, int day, int month, int year) {
		name = new Name(firstName, lastName);
		date = new Date(day, month, year);
		numPerson += 1;
	}
	void printInfo() {
		System.out.print("Name: ");
		name.printName();
		System.out.println();
		System.out.print("DOB: ");
		date.printDate();
		this.printAgeAtYear(date.year);;
	}
	void printAgeAtYear(int year) {
		System.out.printf("Age: %d%n", 2026-date.year);
	}
	static void printNumberOfPerson() {
		System.out.printf("The total number of Persons is %d persons.%n", numPerson);
	}
}