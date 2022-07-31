package chapter5.staticEx;

public class BasicSigleton {

	public static void main(String[] args) {
		// 발상: 인스턴스가 딱 하나만 필요할 때 , 인스턴스를 딱 하나만 만들도록 강제하는 것이다.
		/*
		 * 어떻게 강제하는가....... 스태틱을 활용하지않을까? 1. 모든사람들에게 알린다 (님들아 이건 하나만 만들거니까 님들은 만들지마세요~)
		 * 불가능 2. new 키워드를 못쓰게 막는다 (오... 이건 만들어야하는건데 왜안되는거지?) 3. 내가 미리 만들고 남들은 못 만들게
		 * 해버린다.(억덖계? 생성자를 막아버린다.)
		 * 
		 * 숙제: 싱글톤설명숙제+메모리공간에 어떻게 올라가는가(메모장에다가) 너무 어렵다... 난 부족하고
		 * 한심해.........................................
		 */

		// Company mobizen;
//		System.out.println(sawon.name); 	

		Company.getMobizen();
//		Company yrcomp = Company.getMobizen();
//		Company sa = Company.getMobizen();
//		System.out.println(sa);
//		System.out.println(yrcomp);

	}

}

class Company {
	String name = new String("이율돈회사");
	private static Company mobizen = new Company();// 여기서 만들어진거 아니니..

	private Company() {
	}

	public static Company getMobizen() {
		if (mobizen == null) {
			mobizen = new Company();
		}
		return mobizen;

	}

}

class Sawon {
	Sawon sangSa;
	String name = new String("이아무개");
	int id;

	void work() {
		// 일을 합니다.
	}

}