package arrayEx;

import java.util.ArrayList;

public class ArrayListt {

	public static void main(String[] args) {
		// ĳ������ �����ϴ� �迭�� ������~
		// ���� ĳ������ â�� ������ �ִ�.����� ��� â�� �ø� �� �ִ�.
		// �������� ���� ��� �þ��.
		// #���� �迭�� ����Ѵٸ�
		// ũ�Ⱑ 11�� �迭�� ���� �̻縦 ���������
		// 12�� �迭�� �Ǹ�������
//		CashTem [] chango = new CashTem[10];
		ArrayList<CashTem> chango = new ArrayList<>();
		// �Ф�
		CashTem cashtem1 = new CashTem("�����ǰ�");
		CashTem cashtem2 = new CashTem("�븶������");
		CashTem cashtem3 = new CashTem("��ö�ܵ�");
		// ĳ����..
		chango.add(cashtem1);
		chango.add(cashtem2);
		chango.add(cashtem3);

//		for (int i=0; i<chango.size(); i++) {
//			System.out.println(chango.get(i));
//		}

		for (int i = 3; i < 103; i++) {
			CashTem cashtem = new CashTem("����ܰ�" + (i - 2));
			chango.add(i, cashtem);
		}

//		for (int i=0; i<chango.size(); i++) {
//			System.out.println(chango.get(i));
//		}
//		�װԾƴ϶� �ε����� Ȱ���ؼ� for������ 

//		System.out.println(chango.get(5));
		// for (CashTem cash: chango)

//		
//		chango.remove(44);
//		for (int i = 0; i < chango.size(); i++) {
//			System.out.println(chango.get(i));
//		}
		
		for (CashTem cast : chango) {
			System.out.println(cast.name);
		}
		
		
		
	}

}

class IlbanTem {
	String name;

	IlbanTem(String name) {
		this.name = name;
	}

	public String toString() {
		return this.name + "�Դϴ�.";
	}
}

class CashTem {
	String name;

	CashTem() {
	}

	CashTem(String name) {
		this.name = name;
	}

	public String toString() {
		return this.name + "�Դϴ�.";
	}
}

//�迭�����̾�
//�ڷ��� ������ġ�� ��������ġ�� ���� ����.. å���þ�..
//�ֳĸ� �ڷᰡ �� ������ ���� �����ؾ��ϱ⋚���̴�..
//�����ι迭�̾ƴ϶� �׳� �ڷḦ ����� ��������ġ�� ������ ���������ֱ⶧���̴�...
//���������̾� �迭 �� ũ�⸦ ���� �ٲٱ� �����....
//�´� �� �迭�� ���� �̻縦 ������..

//�װ� �ٷ� ��̸���Ʈ��

// + 
// # �迭����, ���Ҹ� �߰��� ������ �Ϸ��� ����ؾ��ϴ°�?(��: ũ�Ⱑ 10�� �迭����, 4���� 5�� ���̿� ���ο� �ڷḦ �ְ� �ʹ�.)
//ũ�� 11¥�� �迭�� ���� �̻縦 ���������.. 0~4�� �״�� �̻��ϰ� 5-9������ ���ο� �迭�� 6-10�� �̻��Ű�� 5���ٰ� ����
//�߰��ҳ༮�� �־���..
//