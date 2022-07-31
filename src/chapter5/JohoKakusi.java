package chapter5;

public class JohoKakusi {

	public static void main(String[] args) {
		Charac yura = new Charac(5, 5000, "이율돈하세기");
		// yura.level = 400;
		// yura.setLevel(157);
		System.out.println(yura.getLevel());
		
		yura.setName("용");
		System.out.println(yura.getName());
		
	}

}
/*
 * level <=300 level >0 hp<=500000 hp>0 이름 4바이트 이상 16바이트 이하 setter(설정을 대신 세팅해주는
 * 아이) getter
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
		else System.out.println("입력값이 잘못되었습니다.");
		
	}

	void setLevel(int level) {
		if (level > 0 && level <= 300) {
			this.level = level;
		} else
			System.out.println("레벨을 정상적으로 입력하세요.");
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
			System.out.println("Hp를 정상적인 수치로 입력하세요.");
		}
	}

	int getHp() {
		return this.hp;
	}

	void setName(String name) {
		if (name.length() >= 2 && name.length() <= 6) {
			this.name = name;
		} else if (name.length() < 2) {
			System.out.println("이름의 길이가 너무 짧습니다.");
		} else
			System.out.println("이름의 길이가 너무 깁니다.");

	}

	String getName() {
		return this.name;
	}

}
