package chapter5;
public class HukushuuEx {

	public static void main(String[] args) {
		// ������Ʈ��� Ŭ�󽺸� ����Ŵ�
		/*
		 * �Ӽ���... �̸� ���� �й� �ڱ�Ұ��� �� �� �ȴ� �л��� 5���� �ִ� (�������������� �ߴ�)
		 */

		Student[] yura = new Student[5];

		yura[0] = new Student(001, 29, "������");
		yura[1] = new Student(002, 39, "������");
		yura[2] = new Student(003, 49, "������");
		yura[3] = new Student(004, 59, "������");
		yura[4] = new Student(005, 69, "������");
// ������ ���̺���, ������ �Ǽ�, ���̸� 300����... ���⿡ ����2�� ���̸� �Ұ� �ǰ���
		

		yura[2].setNai(300);//����2�� ���̿� 300�� �����϶� �Ȱ���... ���� �����Ҷ���

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
			System.out.println("���̸� �ٽ� �Է��ϼ���");
			return;
		}
		this.stuNo = stuNo;
		this.nai = nai;
		this.name = name;
	}

	Student() {
	}

	void introduce() {
		System.out.println("�� �̸���" + this.name + "�Դϴ�.");
		System.out.println("���̴�" + this.nai + "�� �Դϴ�.");
		System.out.println("�� �й���" + this.stuNo + "�Դϴ�.");
	}

	public int getNai() {
		return nai;
	}

	public void setNai(int nai) {
		if (nai >= 100) {
			System.out.println(this.name+"�� ���̸� �ٽ� �Է��ϼ���");
			return;
		}
		this.nai = nai;
	}

}