
public class PeopleID {
	Name name;
	String ID;
	Date dateOfBirth;
	Address address;
	PeopleID(Name name, String iD) {
		this.name = name;
		this.ID = iD;
	}
	PeopleID(Name name, String iD, Date dateOfBirth, Address address) {
		this(name, iD);
		this.dateOfBirth = dateOfBirth;
		this.address = address;
	}
	void printPeopleID() {
		name.printName();
		System.out.println(ID);
		dateOfBirth.printDate();
		address.printFullAddress();
	}
}
