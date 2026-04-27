package g6822781173_FamilyMember;

public class FamilyMember {
	static String familyName = "Hilton";
	String firstName;
	static double commonFund = 100000.0;
	double privateFund;
	FamilyMember(String firstName , double privateFund) {
		this.firstName = firstName;
		this.privateFund = privateFund;
	}
	void printPrivateFund() {
		System.out.println(firstName + " " + familyName + " has $" + privateFund);
	}
	void contributeToCommonFund(double amount) {
		privateFund -= amount;
		commonFund += amount;
	}
	static void payFromCommonFund(double amount) {
		commonFund -= amount;
	}
	static void printFamilyFund() {
		System.out.println("The " + familyName + " family has $" + commonFund);
	}
}
