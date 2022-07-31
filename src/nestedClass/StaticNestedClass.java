package nestedClass;

import java.util.HashSet;
import java.util.Set;

//import nestedClass.GCard.MChip; //�׷� ����Ʈ ���ϰ� �����մ¹�����ִ�

public class StaticNestedClass {

	public static void main(String[] args) {
		// �� ������� ���ΰ� ������ ���� �ڹٱ�� �����ž�
		// ����ī�带 ������̴�.
		// ����ī�忡�� �Ϸù�ȣ�� �ְ� �ܾ��� �ִ�.
		// ��米��ī�� ������ ���׳�ƽĨ�� �ִ�
		// Ĩ ������ ��� ����ī�尡 �Ȱ��ٰ� ����
		// �� ī�带 ���߱��� ������ ���ٴ�� ����� ����������.
		// �� Ż�Ϳ� ��������� �ִ�
		// �̰� �����غ���
		// �̰� ����Ŭ������ �����ؾ��ϴ°ų�

		// ���󿡼� ����ī�带 ����� ���� Ĩ�� ���Ű�� �����޽��ϴ�.
		// ���� ���� ��� ȸ��� �׿� �����ؾ��մϴ�
		// ���� �ϸ��Ͱ�����..
		// �������� Ĩ�� �� �Ұ� ���ξ��°Ű�����.. 
		GCard card = new GCard(10000, "ĳ�ú�");
		GCard ccard = new GCard(10000, "ĳ�ú�");//��Īȸ���
		Vehicle bus = new Vehicle(1000);
		bus.jjik(card);		bus.jjik(ccard);

		
	}

}

class GCard {
	static int seNum = 0;
	int cardSerial;
	int janEk;
	MChip mChip;
	String company;

	GCard(int janEk, String company) {
		cardSerial = seNum;
		seNum++;
		this.janEk = janEk;
		this.company = company;
		MChip mChip = new MChip();
		this.mChip=mChip;
		mChip.company=company;
		
		// ��� ��� Ĩ�� ��ȣ�� �����ϱ�..
	}
	// ��¥Ĩ������ ���� ���ؼ� ��� Ĩ�� ������ �Ϸù�ȣ�� �����Ѵ� .
	// �� �Ϸù�ȣ�� Ȯ���ϴ� ��ü�� ���߱����� ������
	// �̰� Ȯ���� �Ǹ� ���߱��뿡 �����°Ŵ�
	// Ĩ�� �� ī�� �����簡 ���������.
	// �������� Ĩ�� ���۴ϸ� ī���� ���۴Ͽ� �°� �ٲ������..

	// ����μ�

	// MChipŬ������ ���� ����ƽ���� �����ؾ��ϴ� ������...
	//
	
	// ����ƽ�� �ڵ尡 �޸𸮿� �ö󰥶�, ����ȴ�.
	//���� MChip�� ����ƽ���� ������ ������,
	// MChip�� GCard�� �ν��Ͻ��� �������� �ʴ���, MChip�� ���縦 ���������ʴ´�.
	// �׷��� MChip�� �������� �ݵ�� �ʿ���ϴ� �ٸ� ��ü�� �޼ҵ尡 �����Ƿ� ����ƽ�� �����Ѵ�.
	static class MChip {
		static int chipKey = 06031212;
		String company;//���۴ϴ� �Ű��������� �ٴ޶�..

	}

}

class Vehicle {
	int yogeum;

	Set<String> allowedCompany = new HashSet<>();

	Vehicle(int yogeum) {
		this.yogeum = yogeum;
		allowedCompany.add("���̺�");
		allowedCompany.add("ĳ�ú�");
		allowedCompany.add("Ƽ�Ӵ�");
	}

	void jjik(GCard card) {
		if (this.validation(card)) {
			card.janEk = card.janEk - yogeum;
			System.out.println("�ݾ��� " + yogeum + "���Դϴ�.");
			System.out.println("�ܾ� " + card.janEk + "���� ���ҽ��ϴ�.");

		} else
			System.out.println("�߸��� ī���Դϴ�.");
	}

	// �㰡�� �������� �̸��� ��� ��ϵǾ� �ִ�.
	// ������ ����: Ƽ�Ӵ� ĳ�ú� ���̺�
	// ����ȸ�簡 ���߿� ���ԵǴ����� Ȯ���ؾ���
	//�׳� �ٷ� �������°žƴϴ� �ٷ� Ŭ���� �̸� ���� ���°Ű�����..

	boolean validation(GCard card) {
	//�븮���̼ǿ� card�� �Ű������� �־��ݴ�
	// �ٵ� �ؿ� ���Ͽ��� MChip.��¼�� �� ���� ��־��ݴ�
// �ٷ� Ŭ�����̸���� . ���  �ƴ��̷��� �Ű������� ���� �ǹ̰� ���°žƴѰ�... ī���� ��Ĩ�� ���۴ϸ� �ҷ����������...
		return card.mChip.chipKey == 06031212 && allowedCompany.contains(card.mChip.company);
	
	}

}