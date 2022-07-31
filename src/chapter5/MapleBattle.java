package chapter5;

public class MapleBattle {
	// class:mapleChara
    // class:weapon
    // class:monster
    // 조건: 성아의 캐릭터 OO은 기본 공격력을 가지고 있으며
    // 무기를 끼면 공격력이 올라간다
    // 몬스터는 체력이 있으며 데미지를 받으면 "데미지를 받았음"을 출력한다.
    // 만약 체력 이상의 데미지를 받으면 중는다...
    // 이걸 후로그라밍으로 구현..................................
	public static void main(String[] args) {
		
		Chara sungA = new Chara();
		sungA.charaAtk = 10;
		sungA.charaHp = 1000;
		sungA.nameChara = "지존유라";

		Weapon rest = new Weapon();
		rest.atkPoint = 40;
		rest.nameTem = "리스트레인트링 LV4";

		Monster gumma = new Monster();
		gumma.mobAtk = 50;
		gumma.mobHp = 200;
		gumma.nameMob = "검은마법사";

		sungA.equip(rest);

		while (sungA.charaHp > 0 && gumma.mobHp > 0) {
			sungA.charaAttack(gumma);
			gumma.mobAttack(sungA);

//			if (sungA.charaHp <= 0 || gumma.mobHp <= 0) {
//				break;
//			}
		}

	}
	

}

class Chara {
	int charaHp;
	int charaAtk;
	String nameChara;

	void equip(Weapon tem) {
		charaAtk = charaAtk + tem.atkPoint;
		System.out.println(tem.nameTem + " 착용했습니다.");
		System.out.println("");
		System.out.println("공격력이 " + tem.atkPoint+" 올랐습니다." + "(현재 공격력 =" + charaAtk+")");
		System.out.println("");

	}

	void charaAttack(Monster mob) {
		if (charaHp <= 0) {
			return;
		}

		System.out.println(nameChara + "이(가) " + mob.nameMob + "을(를) 공격합니다.");

		mob.mobHp = mob.mobHp - charaAtk;

		System.out.println(mob.nameMob + "에게 " + charaAtk + "의 데미지를 주었습니다." + "(현재 " + mob.nameMob + "의 체력이 "
				+ mob.mobHp + " 남았습니다.)");
		System.out.println("");

		if (mob.mobHp <= 0) {
			System.out.println(mob.nameMob + " 처치했습니다.");
		}
		
	}

}

class Weapon {
	int atkPoint;
	String nameTem;

}

class Monster {
	int mobHp;
	int mobAtk;
	String nameMob;

	void mobAttack(Chara chara) {
		if (mobHp <= 0) {
			return;
		}
		chara.charaHp = chara.charaHp - mobAtk;
		System.out.println(chara.nameChara + "은(는) " + nameMob + "에게 "
				+ "" + mobAtk + 
				"의 데미지를 받았습니다."+ "("+chara.nameChara + "의 체력이 " + chara.charaHp+ " 남았습니다.)");
			
		System.out.println("");

		if (chara.charaHp <= 0) {
			System.out.println(chara.nameChara + " 사망했습니다.");
			System.out.println("");
;
		}
		
	}

}
