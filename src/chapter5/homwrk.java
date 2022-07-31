package chapter5;

public class homwrk {

	public static void main(String[] args) {

		Personi james = new Personi(40, "James", true, 3);

		james.introduce();

		Order shopping = new Order(201803120001L, "abc123", 180312, "홍길순", "PD0345-12", "서울시 영등포구 여의도동 20번지");

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
		System.out.println(this.name + "의 나이는 " + this.age + "살 입니다.");
		if (this.isMarried) {
			System.out.println(this.name + "는 기혼입니다.");
		} else {
			System.out.println(this.name + "는"
					+ " 미혼입니다.");
		}

		System.out.println(this.name + "의 아이는 " + this.children + "명 입니다.");
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
		System.out.println("주문번호: " + num);
		System.out.println("주문자 아이디: " + this.iD);
		System.out.println("주문 날짜: " + this.date);
		System.out.println("주문자 이름: " + this.ordername);
		System.out.println("주문 상품 번호: " + this.goodsnum);
		System.out.println("배송주소: " + this.address);

	}

}