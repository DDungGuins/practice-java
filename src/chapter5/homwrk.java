package chapter5;

public class homwrk {

	public static void main(String[] args) {

		Personi james = new Personi(40, "James", true, 3);

		james.introduce();

		Order shopping = new Order(201803120001L, "abc123", 180312, "ȫ���", "PD0345-12", "����� �������� ���ǵ��� 20����");

		shopping.jumun();

	}

}

class Personi {
	int age;
	String name;
	boolean isMarried;
	int children;

	Personi(int age, String name, boolean isMarried, int children) {
		this.age = age;
		this.name = name;
		this.isMarried = isMarried;
		this.children = children;
	}

	void introduce() {
		System.out.println(this.name + "�� ���̴� " + this.age + "�� �Դϴ�.");
		if (this.isMarried) {
			System.out.println(this.name + "�� ��ȥ�Դϴ�.");
		} else {
			System.out.println(this.name + "��"
					+ " ��ȥ�Դϴ�.");
		}

		System.out.println(this.name + "�� ���̴� " + this.children + "�� �Դϴ�.");
		System.out.println("");
	}
}

class Order {

	long num;
	String iD;
	int date;
	String ordername;
	String goodsnum;
	String address;

	Order(long num, String iD, int date, String ordername, String goodsnum, String address) {
		this.num = num;
		this.iD = iD;
		this.date = date;
		this.ordername = ordername;
		this.goodsnum = goodsnum;
		this.address = address;
	}

	void jumun() {
		System.out.println("�ֹ���ȣ: " + num);
		System.out.println("�ֹ��� ���̵�: " + this.iD);
		System.out.println("�ֹ� ��¥: " + this.date);
		System.out.println("�ֹ��� �̸�: " + this.ordername);
		System.out.println("�ֹ� ��ǰ ��ȣ: " + this.goodsnum);
		System.out.println("����ּ�: " + this.address);

	}

}