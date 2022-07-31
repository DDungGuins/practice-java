package nestedClass;

public class AnonymousClass {

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

		// 상속하라고 한거아니니
		PlenktonGundan planks = new PlenktonGundan();
		planks.join(new Plenkton() {
			@Override
			void play() {
				System.out.println("노래부르기");
			}
		});
		planks.join(new Plenkton() {//1
			@Override
			void play() {
				System.out.println("춤추기");
			}
		});
		planks.join(new Plenkton() {//2
			@Override
			void play() {
				System.out.println("봉팔씨 괴롭히기");
			}
		});
		planks.join(new Plenkton() {//3
			@Override
			void play() {
				System.out.println("저희가 플랭크톤 군단이여유");
			}
		});
		planks.join(new Plenkton() {//4
			@Override
			void play() {
				System.out.println("게살버거 비법 훔치기");
			}
		});
		planks.join(new Plenkton() {//5
			@Override
			void play() {
				System.out.println("밍밍거리기");
			}
		});
		planks.join(new Plenkton() {//6
			@Override
			void play() {
				System.out.println("박봉팔");
			}
		});
		planks.join(new Plenkton() {//7
			@Override
			void play() {
				System.out.println("칠칠이");
			}
		});
		planks.join(new Plenkton() {//8
			@Override
			void play() {
				System.out.println("팔팔이");
			}
		});
		
		planks.join(new Plenkton() { //9
			@Override
			void play() {
				System.out.println("띨띨이에");
			}
		});
		
		planks.join(new Plenkton() { //10
			@Override
			void play() {
				System.out.println("꼴꼴이");
			}
		});

	}

}

abstract class Plenkton {
	abstract void play();
}

class PlenktonGundan {
	void join(Plenkton plenkton) {
		plenkton.play();
	}

}