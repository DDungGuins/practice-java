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


		// �ٸ� Ŭ�������� ���� �޼ҵ带 ����� ���� ���� ���� ��ü�� ������ ����� �� �ִ�.

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
		System.out.println("����");
		System.out.println("����2");
		System.out.println("����3");
		System.out.println("����");
		System.out.println("����2");
		System.out.println("����3");
		System.out.println("����");
		System.out.println("����2");
		System.out.println("����3");
		System.out.println("����");
		System.out.println("����2");
		System.out.println("����3");
		System.out.println("����");
		System.out.println("����2");
		System.out.println("����3");
		System.out.println("����");
		System.out.println("����2");
		System.out.println("����3");
		System.out.println("����");
		System.out.println("����2");
		System.out.println("����3");
		System.out.println("����");
		System.out.println("����2");
		System.out.println("����3");
		System.out.println("����");
		System.out.println("����2");
		System.out.println("����3");
	}

}