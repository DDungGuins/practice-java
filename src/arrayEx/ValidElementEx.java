package arrayEx;

public class ValidElementEx {

	public static void main(String[] args) {
		// ĳ��3�� ����� ���Ͽ� �ѹ�
		// 4���� �ؼ� �F��
		// 7���� �ѹ�

		Chara yrs[] = new Chara[40];
		int size = 0;

		yrs[0] = new Chara("����0");
		size++;
		yrs[1] = new Chara("����1");
		size++;
		yrs[2] = new Chara("����2");
		size++;

		for (int i = 0; i < size; i++) {
			yrs[i].attack();
		}
		yrs[3] = new Chara("����3");
		size++;

		for (int i = 0; i < size; i++) {
			yrs[i].attack();

		}
		yrs[4] = new Chara("����4");
		size++;

		yrs[5] = new Chara("����5");
		size++;

		yrs[6] = new Chara("����6");
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
		System.out.println(this.nick + "���� ������ �����մϴ�.");
	}

}
