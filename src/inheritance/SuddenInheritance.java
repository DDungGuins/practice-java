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
		System.out.println("º£¾ú½À´Ï´Ù");
	}

}

class GibonK extends Knife {

	GibonK() {
		super("±âº»Ä®");
	}

	void slash() {
		System.out.println("Æò¹üÇÏ°Ô º£¾ú½À´Ï´Ù");
	}

}

class GurkaK extends Knife {

	GurkaK() {
		super("±¸¸£Ä«³ªÀÌÇÁ");
	}

	void slash() {
		System.out.println("Å©°Ô º£¾ú½À´Ï´Ù.");
	}
}

class TigerK extends Knife {
	TigerK() {
		super("Å¸ÀÌ°Å³ªÀÌÇÁ");
	}

	void slash() {
		System.out.println("½µ ½µ½´½´½µ ½µ½´½´½µ");
	}
}

class Player {

	void useKnife(Knife knife) {
		System.out.print(knife.name+"·Î "); knife.slash();
		
	}

}
