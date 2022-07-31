package inheritance;

import java.util.ArrayList;

public class SuddenInheritance {

	public static void main(String[] args) {
		Player player = new Player();
		Knife gibon = new GibonK();
		Knife gurka = new GurkaK();
		Knife tiger = new TigerK();

		ArrayList<Knife> knives = new ArrayList<>();
		knives.add(gibon);
		knives.add(gurka);
		knives.add(tiger);

		for (Knife k : knives) {
			if (k instanceof GibonK) {
				GibonK kk = (GibonK) k;
				player.useKnife(kk);
			}

			else if (k instanceof GurkaK) {
				GurkaK kk = (GurkaK) k;
				player.useKnife(kk);

			} else if (k instanceof TigerK) {
				TigerK kk = (TigerK) k;
				player.useKnife(kk);
			} else
				player.useKnife(k);

		}

	}

}

class Knife {
	String name;

	Knife(String name) {
		this.name = name;
	}

	void slash() {
		System.out.println("�������ϴ�");
	}

}

class GibonK extends Knife {

	GibonK() {
		super("�⺻Į");
	}

	void slash() {
		System.out.println("����ϰ� �������ϴ�");
	}

}

class GurkaK extends Knife {

	GurkaK() {
		super("����ī������");
	}

	void slash() {
		System.out.println("ũ�� �������ϴ�.");
	}
}

class TigerK extends Knife {
	TigerK() {
		super("Ÿ�̰ų�����");
	}

	void slash() {
		System.out.println("�� �������� ��������");
	}
}

class Player {

	void useKnife(Knife knife) {
		System.out.print(knife.name+"�� "); knife.slash();
		
	}

}
