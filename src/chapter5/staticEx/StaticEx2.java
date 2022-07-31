package chapter5.staticEx;

public class StaticEx2 {

	public static void main(String[] args) {
		// �䱸���׸��м� �� ���� �ϰ� �ִ�. ���ٳ��� ���� ����ũ�� ���� ���̴�.
		/* ���ٳ��� ���� ����ũ�� q��ų�� ���� �׸��� ������ ����� ���� ������ ���߱⸦ �ߴ�. 
		 * �� �߿� ����� ���⵵ �ߴ� 
		 * ����: ����ǥ�� class����� ��� ���� �� ���� �̰� ����ƽ�� ���谡 �ִ� ���̴�
		 ������... �͍����̸� ������ �ʾұ��� 
		 */
		
		Champion shyv = new Champion("���ٳ�",500,1);
		Champion lulu = new Champion("���",400,2);
		Champion pykk = new Champion("����ũ", 450, 3);
		
		shyv.qAttack(); Gamjong.dance(shyv); 
		lulu.qAttack(); Gamjong.dance(lulu); Gamjong.laugh(lulu);
		pykk.qAttack(); Gamjong.dance(pykk); Gamjong.laugh(pykk);
				
		
		
		//���ǿ��� �ƴ϶� §���� �����߾�...
		
	}

}


class Champion {
	String name;
	int hp;
	int champNum;
	
	Champion(String name, int hp, int champNum) {
		this.name=name;
		this.hp=hp;
		this.champNum=champNum;
	}
	
	void qAttack ( ) {
		System.out.println("q��ų�� �����߽��ϴ�.");
	}
}

class Gamjong {
	static void joke (Champion champ) {
		System.out.println(champ.name+"�� ����� �մϴ�.");
		
	}
	
	static void dobal (Champion champ) {
		System.out.println(champ.name+"���� �����մϴ�.");
	}
	
	static void dance (Champion champ) {
		System.out.println(champ.name+"�� ���� ��ϴ�.");
	}
	
	static void laugh (Champion champ) {
		System.out.println(champ.name+"�� �����ϴ�.");
	}
}











