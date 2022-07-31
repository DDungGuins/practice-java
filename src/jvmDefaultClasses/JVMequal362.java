package jvmDefaultClasses;

public class JVMequal362 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyDate date1 = new MyDate(9, 18, 2004);
		MyDate date2 = new MyDate(9, 18, 2004);//20040918
		System.out.println(date1.equals(date2));
		System.out.println(date1.hashCode());
		System.out.println(date2.hashCode());
	}

}

class MyDate {
	int day;
	int month;
	int year;

	public MyDate(int month, int day, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}

	boolean equals(MyDate mydate) {
		if (this.day == mydate.day && this.month == mydate.month && this.year == mydate.year) {
			return true;
		}

		else
			return false;

	}
	
	public int hashCode() {
		int a = this.year*10000+this.month*100+this.day;
		return a;
	}
	
}