package flowControl;

public class Sukjae1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score = 100;
		char grade;

		if (score >= 90) {
			grade = 'A';
		} else if (score >= 80) {
			grade = 'B';
		} else if (score >= 70) {
			grade = 'C';
		} else if (score >= 60) {
			grade = 'D';
		} else {
			grade = 'F';
		}
		System.out.println("당신의 점수는 " + grade + "입니다.");
	}
}
