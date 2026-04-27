
public class Date {
	int day;
	int month;
	int year;
	Date(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}
	void printDate() {
		System.out.printf("%s-%s-%s%n", day, month, year);
	}
}
