package chapter5;

public class StaticEx {

	public static void main(String[] args) {
		/*
		 * 메이플을 한다. 나는 무기를 강화한다. 강화는 강화기를 통해 진행된다. 강화기는 30% 확률로 무기강화를 성공시키고 아니면 하락시킨다.
		 * 성아와 유라는 각자 3번씩 강화를 시킨다.
		 * 
		 * 
		 * 
		 */

//		;
//		System.out.println((int) (Math.random()*100));
//		
//		

		Character sungA = new Character("성아");
		Character yurA = new Character("율아");

		sungA.equip(new Weapon2("리스트레인트링", 0));
		yurA.equip(new Weapon2("도루코 대거", 0));

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
// 강화기는 여러객체가 필요하지 않아..
// 강화기의 요소(메소드)만을 가져올 수 있다
// 객체생성 없이

class Inchanter {
	String color;
	
	
	static void inchant(Weapon2 weapon) {
		System.out.println("- " + weapon.name + " " + weapon.grade + "레벨에서  강화 시도! - ");
		if ((int) (Math.random() * 100) < 30) {
			weapon.grade++;
			System.out.println(weapon.name + " 강화에 성공했습니다. 현재 강화 단계 = " + weapon.grade);
		} else {
			if (weapon.grade == 0) {
				System.out.println(weapon.name + " 강화에 실패했습니다. 현재 강화 단계 = " + weapon.grade);
			} else {
				weapon.grade--;
				System.out.println(weapon.name + " 강화에 실패하여 1단계 하락했습니다.  현재 강화 단계 = " + weapon.grade);
			}
		}

	}

}
