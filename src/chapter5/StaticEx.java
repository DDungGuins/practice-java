package chapter5;

public class StaticEx {

	public static void main(String[] args) {
		/*
		 * �������� �Ѵ�. ���� ���⸦ ��ȭ�Ѵ�. ��ȭ�� ��ȭ�⸦ ���� ����ȴ�. ��ȭ��� 30% Ȯ���� ���Ⱝȭ�� ������Ű�� �ƴϸ� �϶���Ų��.
		 * ���ƿ� ����� ���� 3���� ��ȭ�� ��Ų��.
		 * 
		 * 
		 * 
		 */

//		;
//		System.out.println((int) (Math.random()*100));
//		
//		

		Character sungA = new Character("����");
		Character yurA = new Character("����");

		sungA.equip(new Weapon2("����Ʈ����Ʈ��", 0));
		yurA.equip(new Weapon2("������ ���", 0));

		for (int a = 1; a <= 30; a++) {
//			sungA.tryinchant();
//			yurA.tryinchant();
			
			Inchanter.inchant(sungA.weapon);
			Inchanter.inchant(yurA.weapon);
		}

	}

}

class Character {
	String name;
	Weapon2 weapon;

	Character(String name) {
		this.name = name;
	}

	void equip(Weapon2 weapon) {
		this.weapon = weapon;
	}



}

class Weapon2 {
	String name;
	int grade;

	Weapon2(String name, int grade) {
		this.name = name;
		this.grade = grade;
	}

}
// ��ȭ��� ������ü�� �ʿ����� �ʾ�..
// ��ȭ���� ���(�޼ҵ�)���� ������ �� �ִ�
// ��ü���� ����

class Inchanter {
	String color;
	
	
	static void inchant(Weapon2 weapon) {
		System.out.println("- " + weapon.name + " " + weapon.grade + "��������  ��ȭ �õ�! - ");
		if ((int) (Math.random() * 100) < 30) {
			weapon.grade++;
			System.out.println(weapon.name + " ��ȭ�� �����߽��ϴ�. ���� ��ȭ �ܰ� = " + weapon.grade);
		} else {
			if (weapon.grade == 0) {
				System.out.println(weapon.name + " ��ȭ�� �����߽��ϴ�. ���� ��ȭ �ܰ� = " + weapon.grade);
			} else {
				weapon.grade--;
				System.out.println(weapon.name + " ��ȭ�� �����Ͽ� 1�ܰ� �϶��߽��ϴ�.  ���� ��ȭ �ܰ� = " + weapon.grade);
			}
		}

	}

}
