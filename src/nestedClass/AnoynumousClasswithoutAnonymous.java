package nestedClass;

public class AnoynumousClasswithoutAnonymous {

	public static void main(String[] args) {
		/*
		 * 오늘은 플랭크톤 군단이 모였습니다 오합지졸이라 가만히 있질 못하고 adhd마냥 어떠한 짓을 합니다 (노래부르기, 춤추기 등) 몇천만의
		 * 플랭크톤이 존재하는데, 열명이 추가로 참가합니다 플랭크톤은 참가하자마자 행위를 시작합니다
		 * 
		 * 코드 정보 플랭크톤 클래스에는 play() 라는 추상 메소드가 선언되어 있다
		 * 
		 * 플랭크톤 군단 클래스에는 join(Plenkton plenkton) 메소드가 존재하며, 플랭크톤은 join되자마자 자신의 play를
		 * 실행한다
		 */

		Planktongundan planks = new Planktongundan();

		planks.join(new DanceP());
		planks.join(new SingP());
		planks.join(new MumP());


	}

}

abstract class Plankton {
	abstract void play();
}

class DanceP extends Plankton{
	void play() {
		System.out.println("춤추는 블랑크톤~");

	}
}

class SingP extends Plankton{
	void play() {
		System.out.println("노래하는 블랑크톤~");

	}
}

class MumP extends Plankton{
	void play() {
		System.out.println("멈 블랑크톤~");

	}
}



class Planktongundan {

	

	void join(Plankton plankton) {
		plankton.play();
	}

}