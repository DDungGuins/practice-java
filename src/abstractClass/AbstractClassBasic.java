package abstractClass;

import java.util.ArrayList;

public class AbstractClassBasic {

	public static void main(String[] args) {
		// 애니멀 클래스를 만들고, 이름, 울음소리, 울기(메서드)]
		// 메서드니
		// 
		
		
		Zoo zoo = new Zoo();
		Animal usagi = new Usagi ();
		Animal daramgi = new Daramgy();
		Animal nurungi = new Nurungi();
//		Animal yura = new Animal("유라"); 
		
		
		zoo.dobutsu.add(usagi);
		zoo.dobutsu.add(daramgi);
		zoo.dobutsu.add(nurungi);
		
		
		for (Animal abc : zoo.dobutsu) {
			System.out.print(abc.name+"가 "); abc.habit();
		}
		
//		yura.habit(); 
		
//		for (Animal abc : zoo.dobutsu) {
//			if (abc instanceof Usagi) {
//				Usagi abcd = (Usagi) abc;
//				abcd.habit();
//			}
//			else if (abc instanceof Daramgy) {
//				Daramgy abcd = (Daramgy) abc;
//				abcd.habit();
//			}
//			
//			else if (abc instanceof Nurungi) {
//				Nurungi abcd = (Nurungi) abc;
//				abcd.habit();
//			}
//			
//			
//				
//		}
		
		
		
		
		
		
		
	}

}
// Zoo에는 activity라는 메서드가있다. 애니멀 하나에 대해 습성을 실행하는 것이다. 
class Zoo{
	ArrayList <Animal> dobutsu = new ArrayList<>();
	
	void activity (Animal animal) {
		animal.habit();
	}
}

abstract class Animal {
	String name;
	
	
	Animal (String name){
		this.name=name;
	}
	
//	void ulgi ( ) {
//		System.out.println(this.name+"이/가  웁니다.");
//	}
	
	
	// 메소드를 선언만 하고 정의는 하지 않겠다
	abstract void habit(); 
	//habit이라는 메서드를 가지고 있긴하다 이뜻아니니..매개변수+반환타입의 정보를 포함한다.
	
	
}


class Usagi extends Animal {
	
	Usagi ( ){
		super("토끼");
	}
	
	void habit () {
		System.out.println("귀를 쫑긋 세웁니다.");
	}
	
	
}

class Daramgy extends Animal {
	
	Daramgy () {
		super("다람기");
	}
	void habit () {
		System.out.println("나무를 탑니다.");
	}
	
}

class Nurungi extends Animal{
	
	Nurungi () {
		super ("누룽기");
	}
	void habit () {
		System.out.println("누룽지를 먹습니다.");
	}
}
