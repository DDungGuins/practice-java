package chapter5.vehicle;

public class Homework168p {

	public static void main(String[] args) {

		Mydate.hwakIn(new Mydate(1, 1, -1).isValid());
	}

}

class Mydate {
	private int day;
	private int month;
	private int year;

	Mydate(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;

	}

	public boolean isValid() {
		if (year < 0) {
			return false;
		}

		
			switch (month) {
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12: {
				if (day <= 31 && day > 0) {
					return true;
				} else {
					return false;
				}
			}
			case 4:
			case 6:
			case 9:
			case 11: {
				if (day <= 30 && day > 0) {
					return true;
				} else {
					return false;
				}

			}
			case 2: {
				if (year % 4 == 0) {
					if (day <= 29 && day > 0) {
						return true;
					} else {
						return false;
					}
				}
				if (year % 4 != 0) {
					if (day <= 28 && day > 0) {
						return true;
					} else {
						return false;
					}

				}
			}
			default:
				return false;
			
		}
	}

	public void setDay(int day) {
		this.day = day;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public void setYear(int year) {
		this.year = year;
	}

	int getDay() {
		return day;
	}

	int getMonth() {
		return month;
	}

	int getYear() {
		return year;
	}

	static void hwakIn(boolean t) {
		if (t) {
			System.out.println("유효한 날짜입니다.");
		} else {
			System.out.print("유효하지 않은 날짜입니다.");
		}

	}

}