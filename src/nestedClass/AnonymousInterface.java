package nestedClass;

public class AnonymousInterface {

	public static void main(String[] args) {
		/*
		 * 성아는 유희왕게임을 한다 한 턴은 DrawPhase, MainPhase, BattlePhase 로 이루어져 있다. 각각 draw(),
		 * mainPhaseAction(), battle() 메소드가 존재한다 mainPhase에는 몬스터 소환이나 마법카드 사용 등을 할 수 있다.
		 * Turn 클래스에는 playTurn 메소드가 존재하며, 전달인자로 DrawPhase, MainPhase, BattlePhase를 받아 그를
		 * 수행한다. 구현해보시오
		 * 
		 */
		Turn.playTurn(new DrawPhase() {
			// new + 인터페이스하면 인터페이스의 인스턴스가 생성되는게 아니라 인터페이스를 구현하는 클래스를 생성하는것까지 포함한다.
		}, new MainPhase() {
			public void mainPhaseAction() {
				System.out.println("몬스터를 한 장 뒷면 수비 표시로 내놓고 마법카드 두 장을 덮어둡니다.");
			}
		}, new BattlePhase() {
			public void battle() {
				System.out.println("전투를 실행하지않고 그냥 턴을 넘깁니다.");
			}
		});
	}// 클래스를 만들고 인스턴스를 생성하여 implements를 해야해
		//익명클래스(익명객체라고도 한다): 한번 쓰고 말아버릴 클래스는 이름이 필요없다.
	// 따라서 인스턴스가 필요한 자리에 이름없이 클래스를 정의하면서 동시에 인스턴스를 생성한다.
}

interface DrawPhase {
	default void draw() {
		System.out.println("카드를 한 장 뽑습니다.");
	}

}

interface MainPhase {
	void mainPhaseAction();

}

interface BattlePhase {
	void battle();

}

class Turn {

	static void playTurn(DrawPhase dp, MainPhase mp, BattlePhase bp) {
		dp.draw();
		mp.mainPhaseAction();
		bp.battle();
	}
}