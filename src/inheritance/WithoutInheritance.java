package inheritance;

import java.util.Arrays;

public class WithoutInheritance {

	public static void main(String[] args) {
		// ������ĳ���͸� ������̴�. ����, ����, �Ƶ�, ȣ��, ��ũ, ����, ����
		// ������ ��Ÿ,�ݱ�,����, ����Ÿ��, ������Ȩ
		// �ַ±�: ����-��Ű����/����-�Ŀ���Ʈ����ũ/�Ƶ�-����̵�/ȣ��-��ä�� / ��ũ-��ĵ� ������ �� / ����-���߱� / ����-��������
		// �� �����ض�...

		
//		Thief zldojuk = new Thief ();
//		
//		zldojuk.zupGi();
//		
//		Adele adele = new Adele ();
		
//		Adele adele = new Adele();
//		adele.skill();

		
		
		
//		MapleChara adelle = (MapleChara) adele; // �ٽø����ֱ�� ���⼭ ����ȯ�� �Ͼ��?
//		
//		//adelle.skill; ����� �� ���� (�ֳ�? �Ƶ� Ŭ���� �������µ� ����ȯ�Ǽ� ��ġ long���� int�� ��ȯ�ɋ�����©�������⋚��
//		
//		
//		System.out.println(adele);
//		System.out.println(adelle);
//		// �ν��Ͻ����ּҾƴϴ�...�Ƶ�Ŭ���� adele�� ����������Ŭ���� adelle��  �ּҴ� �ٸ��� ����Ű�� ��ü�� ����
		//mapleChara.pyungTa();
		//�����������κ��� ����� �޾Ѵ�
		
	
	// �޼ҵ� �������̵� �ƴϴ�...
 		MapleChara yura = new MapleChara();
		yura.basicSkill();
		yura = new Thief();
		yura.basicSkill();
		yura = new Warrior (); 
		yura.basicSkill();
		
//		�׷� ���̾� yura�� ���� Ÿ���� ���� �����������ΰŴ� Ÿ���� �θ�Ÿ���ε� ���� �ڽ��� �ν��Ͻ���.��ƴ�...
	
	
	
	
	
	
	}

}  

//������ĳ���ʹ� ��� ������ĳ���Ͱ� �������ִ� ����� �Ӽ��� ������ �ִ�. 
class MapleChara {
	String name;
	
	void basicSkill() {
		System.out.println("�ַ½�ų�� ����մϴ�.");
	}
	
	void pyungTa() {
		System.out.println("�⺻������ �մϴ�.");
	}
	
	
	
	void zupGi() {
		System.out.println("�ֿ����ϴ�.");
	}

	void batZul() {
		System.out.println("���ٿ� �Ŵ޷Ƚ��ϴ�.");
	}

	void goHome() {
		System.out.println("������ ���ư��ϴ�.");

	}
}  

class Thief extends MapleChara {
	void basicSkill() {
	System.out.println("��Ű������ �ܿ����ϴ�.");	
	}
	void darkSite() {
		System.out.println("��ũ����Ʈ�� �ܿ����ϴ�.");
	}

}

class Warrior extends MapleChara {
	
	void basicSkill() {
		System.out.println("����¡ ��ο츦 �ܿ����ϴ�.");}
	void powerGuard() {
		System.out.println("�Ŀ����带 �ܿ����ϴ�.");
	}

}

class Adele extends MapleChara {

	void blossom() {
		System.out.println("��μ��� �ܿ����ϴ�.");
	}

}

class Hoyung extends MapleChara {

	void potal() {
		System.out.println("�����θ� �ܿ����ϴ�.");
	}

}

class Arkk extends MapleChara {

	void gongPo() {
		System.out.println("���ٴϴ� ������ �����մϴ�.");
	}

}

class AnBur extends MapleChara {

	void timeStop() {
		System.out.println("�ð��� ������� ������..");
	}

}

class Shade extends MapleChara {

	void outsider() {
		System.out.println("���簨�� ������ϴ�.");
	}

}
