package chapter5;

public class Homwork {

	public static void main(String[] args) {

		Person sungA = new Person();

		sungA.fingering(1, 3);
		sungA.introduce("�̼���", 28);
		sungA.sangtae(18);

		Pasocom sungCom = new Pasocom();
		System.out.println(sungCom.gaming("������"));
		
		
		sungCom.booting(sungCom.onoff("on"));
		sungCom.booting(sungCom.onoff("off"));

	}

}

class Person {
	void fingering(int a, int b) {
		System.out.println(a + "��" + b + "�� �հ������� ��Ÿ�������ϴ�.");
	}

	void introduce(String name, int age) {
		System.out.println("�� �̸��� " + name + "�Դϴ�. ���̴� " + age + "���Դϴ�.");
	}

	void sangtae(int time) {
		if (time <= 5) {
			System.out.println("�� �õ带 �մϴ�.");

		} else if (time <= 15) {
			System.out.println("���� ��ϴ�.");
		} else if (time <= 22) {
			System.out.println("�ּ��ּ� �ɾƼ� �������� �մϴ�.");
		} else {
			System.out.println("���α׷��� ���θ� �մϴ�.");
		}
	}
	

	
}

class Pasocom {
	String gaming(String game) {
		game = game + "�� ���� ���Դϴ�.";
		return game;

	}
//�� �޼ҵ�� "on"�� ������ true (��������)�� ��ȯ
	boolean onoff(String onOff) {
		if (onOff == "on") {
			return true;
		} else
			return false;
	}

	void booting(boolean turnOn) {
		if (turnOn == true) {
			System.out.println("������մϴ�.");
		}

		else
			System.out.println("������ �մϴ�.");
	}
}
