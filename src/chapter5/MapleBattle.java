package chapter5;

public class MapleBattle {
	// class:mapleChara
    // class:weapon
    // class:monster
    // ����: ������ ĳ���� OO�� �⺻ ���ݷ��� ������ ������
    // ���⸦ ���� ���ݷ��� �ö󰣴�
    // ���ʹ� ü���� ������ �������� ������ "�������� �޾���"�� ����Ѵ�.
    // ���� ü�� �̻��� �������� ������ �ߴ´�...
    // �̰� �ķα׶������ ����..................................
	public static void main(String[] args) {
		
		Chara sungA = new Chara();
		sungA.charaAtk = 10;
		sungA.charaHp = 1000;
		sungA.nameChara = "��������";

		Weapon rest = new Weapon();
		rest.atkPoint = 40;
		rest.nameTem = "����Ʈ����Ʈ�� LV4";

		Monster gumma = new Monster();
		gumma.mobAtk = 50;
		gumma.mobHp = 200;
		gumma.nameMob = "����������";

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
		System.out.println(tem.nameTem + " �����߽��ϴ�.");
		System.out.println("");
		System.out.println("���ݷ��� " + tem.atkPoint+" �ö����ϴ�." + "(���� ���ݷ� =" + charaAtk+")");
		System.out.println("");

	}

	void charaAttack(Monster mob) {
		if (charaHp <= 0) {
			return;
		}

		System.out.println(nameChara + "��(��) " + mob.nameMob + "��(��) �����մϴ�.");

		mob.mobHp = mob.mobHp - charaAtk;

		System.out.println(mob.nameMob + "���� " + charaAtk + "�� �������� �־����ϴ�." + "(���� " + mob.nameMob + "�� ü���� "
				+ mob.mobHp + " ���ҽ��ϴ�.)");
		System.out.println("");

		if (mob.mobHp <= 0) {
			System.out.println(mob.nameMob + " óġ�߽��ϴ�.");
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
		System.out.println(chara.nameChara + "��(��) " + nameMob + "���� "
				+ "" + mobAtk + 
				"�� �������� �޾ҽ��ϴ�."+ "("+chara.nameChara + "�� ü���� " + chara.charaHp+ " ���ҽ��ϴ�.)");
			
		System.out.println("");

		if (chara.charaHp <= 0) {
			System.out.println(chara.nameChara + " ����߽��ϴ�.");
			System.out.println("");
;
		}
		
	}

}
