package arrayEx;

public class ValidElementEx {

	public static void main(String[] args) {
		// 캐릭3개 만들고 유니온 한번
		// 4개로 해서 핮번
		// 7개로 한번

		Chara yrs[] = new Chara[40];
		int size = 0;

		yrs[0] = new Chara("유라섬0");
		size++;
		yrs[1] = new Chara("유라섬1");
		size++;
		yrs[2] = new Chara("유라섬2");
		size++;

		for (int i = 0; i < size; i++) {
			yrs[i].attack();
		}
		yrs[3] = new Chara("유라섬3");
		size++;

		for (int i = 0; i < size; i++) {
			yrs[i].attack();

		}
		yrs[4] = new Chara("유라섬4");
		size++;

		yrs[5] = new Chara("유라섬5");
		size++;

		yrs[6] = new Chara("유라섬6");
		size++;

		for (int i = 0; i < size; i++) {
			yrs[i].attack();

		}
		
	}

}

class Chara {
	int lv;
	String nick;

	Chara(String nick) {
		this.nick = nick;
		lv = 1;
	}

	void attack() {
		System.out.println(this.nick + "님이 공격을 시전합니다.");
	}

}
