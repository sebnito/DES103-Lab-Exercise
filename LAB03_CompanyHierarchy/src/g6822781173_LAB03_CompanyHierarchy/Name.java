package g6822781173_LAB03_CompanyHierarchy;

public class Name {
	String firstName;
	String lastName;
	Name(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}
	void printName() {
		System.out.printf("%s %s", firstName, lastName);
	}
}
