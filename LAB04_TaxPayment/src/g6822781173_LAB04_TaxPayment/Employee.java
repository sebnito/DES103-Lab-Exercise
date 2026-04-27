package g6822781173_LAB04_TaxPayment;

public abstract class Employee {
	String name;
	String position;
	Employee(String name, String position){
		this.name = name;
		this.position = position;
	}
	abstract double calculateMonthlyIncome();
	abstract void printWorkPlace( );
	void printInfo() {
		System.out.println(name + " is a " + position);
	}
	double calculateTaxRate(double salary) {
		if (salary <= 200000) {
			return salary * 0.0;
		}
		else if (salary <= 400000) {
			return salary * 0.05;
		}
		else if (salary <= 600000) {
			return salary * 0.1;
		}
		else if (salary <= 800000) {
			return salary * 0.15;
		}
		else {
			return salary * 0.2;
		}
	}
}
