package chapter5.vehicle;

public class Homework197 {

	public static void main(String[] args) {
		// ��ħ ��ٱ濡 �� ���� 4,000���� ���� ���ٹ濡�� �Ƹ޸�ī�븦 �� ���̽��ϴ�.
//		�� ���� ��ٹ� ���� 4,500���� ���� ���׸� �� ���̽��ϴ�. 
//		��06-2 ��ü �� ���¡��� �����Ͽ� �� ������ ��ü �������� ���α׷����� ������.

		Person kim = new Person("�� ��", 5000);
		Person lee = new Person("�� ��", 5500);
		Dabang star = new Dabang("���ٹ�", 0);
		Dabang bean = new Dabang("��ٹ�", 0);

		kim.goCafe(star, "�Ƹ޸�ī��", 4000);
		lee.goCafe(bean, "��", 4500);

	}
//�� ������߳ĸ� �̰� ������ ��¾�� ����ī�� ������ ����ѰͰ��Ͼ� vehicle���� �ߴ� �´�...
}

class Person {
	String name;
	int pMoney;

	Person(String name, int money) {
		this.name = name;
		this.pMoney = money;
	}

	void goCafe(Dabang dabang, String menu, int price) {
		this.pMoney = this.pMoney - price;
		dabang.dMoney = dabang.dMoney + price;
		System.out.println(this.name+"�� "+dabang.name + "���� " + price + "���� �����Ͽ� " + menu + "�� �� ���̽��ϴ�.");

	}
}

class Dabang {
	int dMoney;
	String name;

	Dabang(String name, int money) {
		this.name = name;
		this.dMoney = money;

	}

}

