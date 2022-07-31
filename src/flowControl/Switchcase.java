package flowControl;

public class Switchcase {

	public static void main(String[] args) {
		int score = 60;
		int mok = score / 10;
		char grade;

		switch (mok) {
		//case 10: 
//			grade = 'A';
//			break;
		case 10: case 9:
			grade = 'A';
			break;
		case 8:
			grade = 'B';
			break;
		case 7:
			grade = 'C';
			break;
		case 6:
			grade = 'D';
			break;
		default:
			grade = 'F';
		}
		System.out.println("니점수는 " + grade + "이다.");
	}
}