package g6822781173_LAB04_TaxPayment;

public class PartTime extends Employee implements TaxPayer {
	String workplace;
	double numHrPerWeek;
	double hourlyRate;
	PartTime(String name, String position, String workplace, double numHrPerWeek, double hourlyRate){
		super(name, position);
		this.workplace = workplace;
		this.numHrPerWeek = numHrPerWeek;
		this.hourlyRate = hourlyRate;
	}
	void printWorkPlace( ) {
		System.out.println("Work at " + workplace);
	}
	double calculateMonthlyIncome( ) {
		return numHrPerWeek * hourlyRate * 4;
	}
	public double calculateYearlyIncome( ) {
		return this.calculateMonthlyIncome()*12;
	}
	public double calculateTax() {
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
