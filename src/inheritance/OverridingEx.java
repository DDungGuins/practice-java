package inheritance;

public class OverridingEx {

	public static void main(String[] args) {
// �θ�Ŭ������ �޼ҵ� �� A��� �޼ҵ带 �ڽ�Ŭ������ ������ �̸����� , �ٸ� ����� �������ִ� �޼ҵ带 �����ϴ°�? �´�^^7
		/*
		 * ������ ĳ������ �⺻��ų�� "�⺻��ų�� ����մϴ�" ���, �Ƶ��� ����̵�, ������ ��Ű������ ����մϴ� ���
		 * 
		 */

		MapleChara2 adele = new Adele2();
		MapleChara2 thief = new Thief2();
		MapleChara2 chusang = new MapleChara2();

		usebasicSkill(adele);
		usebasicSkill(thief);
		usebasicSkill(chusang);

		// �θ� �ʵ尪�� �ν��Ѵ�

	}

//�� ������ ����������2�� �Ű������� �޾Ƽ� �� ��ų�� ����Ű�� �޼����		
	// �ʵ尪�� �������̵尡 �ȵǼ� �ʵ尪�� �θ��ʵ尪�� ����,
	// 1. ���� �Ű������� ����Ÿ���� �ν��Ͻ��ΰ�?
	// 2. ���� ������ �˾Ҵٸ� ������Ұ��ΰ�? -> �ڽ��� �ʵ尪�� ���� �ʿ䰡 �ִ�.
	// usebasicSkill�� �Ű������� �θ�Ŭ������ MapleChara2�� �޴´ٴ°� �����̴�.
	// ������... �ʵ尪�� �������̵��� �ȵȴٴ� �;ƴϱ��...
	// ����ȯ�� �Ͼ ��, �ڽ�Ŭ���� ������ �ʵ尪�� ������°� �ƴϱ��
	static void usebasicSkill(MapleChara2 mpcr) {
		if (mpcr instanceof Adele2) {
			Adele2 mpcr2 = (Adele2) mpcr;
			System.out.print(mpcr2.jobName + "��/�� ");
			mpcr.basicSkill();
		}

		else if (mpcr instanceof Thief2) {
			Thief2 mpcr2 = (Thief2) mpcr;
			System.out.print(mpcr2.jobName + "��/�� ");
			mpcr.basicSkill();
		}

		else {
			System.out.print(mpcr.jobName + "��/�� ");
			mpcr.basicSkill();
		}
	}
}

class MapleChara2 {
	String jobName = "";

	void basicSkill() {
		System.out.println("������ų�� ����մϴ�.");
	}

}

class Adele2 extends MapleChara2 {
	String jobName = "�Ƶ�";

	@Override
	void basicSkill() {
		System.out.println("����̵带 ����մϴ�.");
	}
}

class Thief2 extends MapleChara2 {
	String jobName = "����";

	void basicSkill() {
		System.out.println("��Ű������ ����մϴ�.");
	}

}
