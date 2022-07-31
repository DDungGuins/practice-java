package abstractClass;

public class AbstractClassInheritance {

	public static void main(String[] args) {
		// 어류 fish (이름,  
		// 고래상어, 백상아리
		
		Fish jinbe = new JinbeZame ("고래상어");
		Fish aAron = new WhiteShark ("백상아리");
		jinbe.habit();
		aAron.habit();
		
//		Shark shaark = new Shark ("김상어");
		
		// 추상클래스로는 인스턴스 생성을 못한다. 왜 못할까? 말그대로 구체적인 대상이 아니기 때문
		// 추상화 된 메소드를 가지고 있기때문이다..?
		// 메서드가 정의(초기화)되어있지 않았기 떄문에 
		// 추상클래스로 인스턴스를 어떻게 생성할 수 있을까? 
		// 상속을 통해 자식클래스를 인스턴스로 구현한다..
		// 손자클래스를 만들어 
				
		
	}

}
//fish 이름, 해빗
abstract class Fish {
	String name;
	
	Fish (String name){
		this.name=name;
	}
	
	abstract void habit();
	
}

abstract class Shark extends Fish {
	
	Shark (String name) {
		super(name);
	}
	
	abstract void habit(); 
}


class JinbeZame extends Shark {
	
	JinbeZame (String name) {
		super (name);
	}
	
	void habit () {
		System.out.println(this.name+"는 매우 온순하며 플랑크톤과 작은 새우 등을 먹습니다.");
	}
}

class WhiteShark extends Shark{
	
	WhiteShark (String name) {
		super(name);
	}
	
	void habit() {
		System.out.println(this.name+"는 매우 사나우며 고래나 대형 어류를 사냥하여 먹습니다.");

	}
}