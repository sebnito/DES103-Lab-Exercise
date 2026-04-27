package g6822781173_LAB04_TaxPayment;
public class TaxPaymentTest {
	public static void main(String[] args) {
		// Ex5 Part a)
        /* Employee's information is:

        Erika Parker is a secretary
		Work at InfoTech
		Yearly income is 390000.0
		Pay tax $19500.0
		--------------------
		Brian Lee is a driver
		Work at InfoTech
		Yearly income is 72000.0 Pay tax $0.0
		--------------------
		James Knein is a technician
		Work at InfoTech
		Yearly income is 426000.0
		Pay tax $42600.0
		--------------------
		Anne Lin is an accountant
		Work at InfoTech
		Yearly income is 216000.0
		Pay tax $10800.0
		--------------------
		Jamie Fox is a manager
		Work at InfoTech
		Yearly income is 687600.0
		Pay tax $103140.0
		--------------------
        */
		FullTime employee01_FullTime = new FullTime("Erika Parker", "secretary", "InfoTech", 32500.00);
		PartTime employee02_PartTime = new PartTime("Brian Lee", "driver", "InfoTech", 15, 100);
		Employee employee03 = new FullTime("James Knein", "technician", "InfoTech", 35500.00);
		Employee employee04 = new PartTime("Anne Lin", "accountant", "InfoTech", 30, 150);
		TaxPayer employee05_TaxPayer = new FullTime("Jamie Fox", "Manager", "InfoTech", 57300.00);
		// Print them out here
		employee01_FullTime.printInfo();
		System.out.println("--------------------");
		employee02_PartTime.printInfo();
		System.out.println("--------------------");
		((FullTime) employee03).printInfo();
		System.out.println("--------------------");
		((PartTime) employee04).printInfo();
		System.out.println("--------------------");
		((FullTime) employee05_TaxPayer).printInfo();
		System.out.println("--------------------");
		// Ex5 Part b) 
		// Without changing the class-types declaration of the following variables:
		// what do you need to do to be able to call payTax() of ft, pt, and t1. (Hint: casting)
		((FullTime) employee03).payTax();
		((PartTime) employee04).payTax();
		((FullTime) employee05_TaxPayer).payTax();
	}
}
