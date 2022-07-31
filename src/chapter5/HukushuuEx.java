package chapter5;
public class HukushuuEx {

	public static void main(String[] args) {
		// 스투던트라는 클라스를 만들거다
		/*
		 * 속성은... 이름 나이 학번 자기소개를 할 줄 안다 학생은 5명이 있다 (차례차례입학을 했다)
		 */

		Student[] yura = new Student[5];

		yura[0] = new Student(001, 29, "일유라");
		yura[1] = new Student(002, 39, "이유라");
		yura[2] = new Student(003, 49, "삼유라");
		yura[3] = new Student(004, 59, "사유라");
		yura[4] = new Student(005, 69, "오유라");
// 삼유라씨 나이변경, 직원의 실수, 나이를 300으로... 저기에 유라2는 나이를 잃게 되겠지
		

		yura[2].setNai(300);//유라2의 나이에 300을 대입하라 안갈듯... 저건 생성할때만

		for (int i = 0; i < 5; i++) {
			yura[i].introduce();
		}
	}

}

class Student {
	private int stuNo;
	private int nai;
	private String name;

	Student(int stuNo, int nai, String name) {
		if (nai >= 100) {
			System.out.println("나이를 다시 입력하세요");
			return;
		}
		this.stuNo = stuNo;
		this.nai = nai;
		this.name = name;
	}

	Student() {
	}

	void introduce() {
		System.out.println("제 이름은" + this.name + "입니다.");
		System.out.println("나이는" + this.nai + "살 입니다.");
		System.out.println("제 학번은" + this.stuNo + "입니다.");
	}

	public int getNai() {
		return nai;
	}

	public void setNai(int nai) {
		if (nai >= 100) {
			System.out.println(this.name+"의 나이를 다시 입력하세요");
			return;
		}
		this.nai = nai;
	}

}