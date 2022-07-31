package chapter5;

public class LocalVariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Adder yura = new Adder();
		Adder sungA = new Adder();
		yura.add(1, 2);
		yura.info();
		yura.info();
		yura.info();
		yura.info();
		yura.info();


		// 다른 클래스에서 만든 메소드를 사용할 때는 위와 같이 객체를 만들어야 사용할 수 있다.

	}

}

class Adder {
	int a;
	int b;

	int add(int a, int b) {
		int v = getA(a) + getB(b);
		return v;
	}

	int getA(int a) {
		return a;
	}

	int getB(int b) {
		return b;

	}

	void info() {
		System.out.println("유라");
		System.out.println("유라2");
		System.out.println("유라3");
		System.out.println("유라");
		System.out.println("유라2");
		System.out.println("유라3");
		System.out.println("유라");
		System.out.println("유라2");
		System.out.println("유라3");
		System.out.println("유라");
		System.out.println("유라2");
		System.out.println("유라3");
		System.out.println("유라");
		System.out.println("유라2");
		System.out.println("유라3");
		System.out.println("유라");
		System.out.println("유라2");
		System.out.println("유라3");
		System.out.println("유라");
		System.out.println("유라2");
		System.out.println("유라3");
		System.out.println("유라");
		System.out.println("유라2");
		System.out.println("유라3");
		System.out.println("유라");
		System.out.println("유라2");
		System.out.println("유라3");
	}

}