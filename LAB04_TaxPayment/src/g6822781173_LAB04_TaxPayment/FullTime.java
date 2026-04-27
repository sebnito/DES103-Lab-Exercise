package g6822781173_LAB04_TaxPayment;

public class FullTime extends Employee implements TaxPayer {
	String workplace;
	double salary;
	FullTime(String name, String position, String workplace, double salary) {
		super(name, position);
		this.workplace = workplace;
		this.salary = salary;
	}
	void printWorkPlace( ) {
		System.out.println("Work at " + workplace);
	}
	double calculateMonthlyIncome( ) {
		return salary;
	}
	public double calculateYearlyIncome( ) {
		return 12 * salary;
	}
	public double calculateTax( ) {
		return super.calculateTaxRate(this.calculateYearlyIncome());
	}
	public void payTax( ) {
		System.out.println("Pay tax $" + this.calculateTax());
	}
	public void printInfo() {
		super.printInfo();
		this.printWorkPlace();
		System.out.println("Yearly income " + this.calculateYearlyIncome());
		this.payTax();
	}
}
