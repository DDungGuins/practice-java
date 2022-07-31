package chapter5;

public class Homwork {

	public static void main(String[] args) {

		Person sungA = new Person();

		sungA.fingering(1, 3);
		sungA.introduce("이성아", 28);
		sungA.sangtae(18);

		Pasocom sungCom = new Pasocom();
		System.out.println(sungCom.gaming("메이플"));
		
		
		sungCom.booting(sungCom.onoff("on"));
		sungCom.booting(sungCom.onoff("off"));

	}

}

class Person {
	void fingering(int a, int b) {
		System.out.println(a + "와" + b + "를 손가락으로 나타내었습니다.");
	}

	void introduce(String name, int age) {
		System.out.println("제 이름은 " + name + "입니다. 나이는 " + age + "살입니다.");
	}

	void sangtae(int time) {
		if (time <= 5) {
			System.out.println("더 시드를 합니다.");

		} else if (time <= 15) {
			System.out.println("잠을 잡니다.");
		} else if (time <= 22) {
			System.out.println("주섬주섬 앉아서 메이플을 합니다.");
		} else {
			System.out.println("프로그래밍 공부를 합니다.");
		}
	}
	

	
}

class Pasocom {
	String gaming(String game) {
		game = game + "을 실행 중입니다.";
		return game;

	}
//이 메소드는 "on"을 넣으면 true (켜져있음)을 반환
	boolean onoff(String onOff) {
		if (onOff == "on") {
			return true;
		} else
			return false;
	}

	void booting(boolean turnOn) {
		if (turnOn == true) {
			System.out.println("재부팅합니다.");
		}

		else
			System.out.println("전원을 켭니다.");
	}
}
