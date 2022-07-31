package abstractClass;

public class TemplateMethod {

	public static void main(String[] args) {
		// �����Ѹ�����
		// ĳ���� �ϳ��� Ǯ�޺��� �ֽ��ϴ�.
		// ����: ������ ������ų �ϳ� , �Ϲݽ�ų �ϳ� x2
		// �������� ��Ÿ�� �������մϴ�. �Ϲݽ�ų���̴�?

		Chara adele = new Adele();
		Chara hoyung = new Hoyung();
		
		adele.fullCombo();
		
		System.out.println(" ");
		
		hoyung.fullCombo();
		
		
	
	}

}

// fullcombo �޼���
abstract class Chara {
	String name;

	Chara(String name) {
		this.name = name;
	}

	abstract void buff();

	abstract void attack1();

	abstract void attack2();

	void fullCombo() {
		this.buff();
		this.attack1();
		this.attack2();
		this.pyungTa();
	};

	void pyungTa() {
		System.out.println("��Ÿ�� ���ϴ�.");
	};

}

class Adele extends Chara {

	Adele() {
		super("�Ƶ�");
	}
	@Override
	void buff() {
		System.out.println("������ ������ ����մϴ�.");
	}
	@Override
	void attack1() {
		System.out.println("����̵带 ����մϴ�.");
	}
	@Override
	void attack2() {
		System.out.println("�Դ���-��ν��� ����մϴ�.");
	}

	
}

class Hoyung extends Chara {

	Hoyung () {
		super("ȣ��");
	}
	@Override
	void buff() {
		System.out.println("�ƴϸ��� ������ ����մϴ�.");
	}
	@Override
	void attack1() {
		System.out.println("���ķ��� ����մϴ�.");
	}
	@Override
	void attack2() {
		System.out.println("�ݰ���� ����մϴ�.");
	}
	

}