package chapter5;

public class JohoKakusi {

	public static void main(String[] args) {
		Charac yura = new Charac(5, 5000, "�������ϼ���");
		// yura.level = 400;
		// yura.setLevel(157);
		System.out.println(yura.getLevel());
		
		yura.setName("��");
		System.out.println(yura.getName());
		
	}

}
/*
 * level <=300 level >0 hp<=500000 hp>0 �̸� 4����Ʈ �̻� 16����Ʈ ���� setter(������ ��� �������ִ�
 * ����) getter
 */

class Charac {
	private int level;
	private int hp;
	private String name;

	public Charac(int level, int hp, String name) {
		if (level>0&&level <= 300&&hp>0&&hp<=500000&&name.length()>=2&&name.length()<=6) {
			this.level = level;
			this.hp = hp;
			this.name = name;
		}
		else System.out.println("�Է°��� �߸��Ǿ����ϴ�.");
		
	}

	void setLevel(int level) {
		if (level > 0 && level <= 300) {
			this.level = level;
		} else
			System.out.println("������ ���������� �Է��ϼ���.");
	}

	void printLevel() {
		System.out.println(this.level);
	}

	int getLevel() {
		return this.level;
	}

	void setHp(int hp) {
		if (hp > 0 && hp <= 500000) {
			this.hp = hp;
		} else {
			System.out.println("Hp�� �������� ��ġ�� �Է��ϼ���.");
		}
	}

	int getHp() {
		return this.hp;
	}

	void setName(String name) {
		if (name.length() >= 2 && name.length() <= 6) {
			this.name = name;
		} else if (name.length() < 2) {
			System.out.println("�̸��� ���̰� �ʹ� ª���ϴ�.");
		} else
			System.out.println("�̸��� ���̰� �ʹ� ��ϴ�.");

	}

	String getName() {
		return this.name;
	}

}
