package chapter5.vehicle;

public class Homework197 {

	public static void main(String[] args) {
		// 아침 출근길에 김 씨는 4,000원을 내고 별다방에서 아메리카노를 사 마셨습니다.
//		이 씨는 콩다방 에서 4,500원을 내고 라테를 사 마셨습니다. 
//		‘06-2 객체 간 협력’을 참고하여 이 과정을 객체 지향으로 프로그래밍해 보세요.

		Person kim = new Person("김 씨", 5000);
		Person lee = new Person("이 씨", 5500);
		Dabang star = new Dabang("별다방", 0);
		Dabang bean = new Dabang("콩다방", 0);

		kim.goCafe(star, "아메리카노", 4000);
		lee.goCafe(bean, "라떼", 4500);

	}
//왜 여기다했냐면 이거 저번에 예쩐에 교통카드 문제랑 비슷한것같하어 vehicle에다 했다 맞다...
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
		System.out.println(this.name+"은 "+dabang.name + "에서 " + price + "원을 지불하여 " + menu + "를 사 마셨습니다.");

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

