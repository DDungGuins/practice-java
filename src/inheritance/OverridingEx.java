package inheritance;

public class OverridingEx {

	public static void main(String[] args) {
// 부모클래스의 메소드 중 A라는 메소드를 자식클래스가 동일한 이름으로 , 다른 기능을 가질수있는 메소드를 설정하는거? 맞니^^7
		/*
		 * 메이플 캐릭터의 기본스킬은 "기본스킬을 사용합니다" 출력, 아델은 디바이드, 도적은 럭키세븐을 사용합니다 출력
		 * 
		 */

		MapleChara2 adele = new Adele2();
		MapleChara2 thief = new Thief2();
		MapleChara2 chusang = new MapleChara2();

		usebasicSkill(adele);
		usebasicSkill(thief);
		usebasicSkill(chusang);

		// 부모 필드값만 인식한다

	}

//이 변수는 메이플차라2를 매개변수로 받아서 그 스킬을 사용시키는 메서드다		
	// 필드값은 오버라이드가 안되서 필드값을 부모필드값만 사용됨,
	// 1. 들어온 매개변수가 누구타입의 인스턴스인가?
	// 2. 만약 누군지 알았다면 뭘어떻게할거인가? -> 자식의 필드값을 들고올 필요가 있다.
	// usebasicSkill의 매개변수가 부모클래스인 MapleChara2를 받는다는게 원인이다.
	// 원인은... 필드값은 오버라이딩이 안된다는 것아니깃니...
	// 형변환이 일어날 때, 자식클래스 고유의 필드값은 사라지는것 아니깃니
	static void usebasicSkill(MapleChara2 mpcr) {
		if (mpcr instanceof Adele2) {
			Adele2 mpcr2 = (Adele2) mpcr;
			System.out.print(mpcr2.jobName + "이/가 ");
			mpcr.basicSkill();
		}

		else if (mpcr instanceof Thief2) {
			Thief2 mpcr2 = (Thief2) mpcr;
			System.out.print(mpcr2.jobName + "이/가 ");
			mpcr.basicSkill();
		}

		else {
			System.out.print(mpcr.jobName + "이/가 ");
			mpcr.basicSkill();
		}
	}
}

class MapleChara2 {
	String jobName = "";

	void basicSkill() {
		System.out.println("끼본스킬을 사용합니다.");
	}

}

class Adele2 extends MapleChara2 {
	String jobName = "아델";

	@Override
	void basicSkill() {
		System.out.println("비바이드를 사용합니다.");
	}
}

class Thief2 extends MapleChara2 {
	String jobName = "도적";

	void basicSkill() {
		System.out.println("로키세븐을 사용합니다.");
	}

}
