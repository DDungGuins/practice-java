package nestedClass;

public class AnonymousInterfacewithoutAnonymous {

	public static void main(String[] args) {
		/*
		 * 성아는 유희왕게임을 한다 한 턴은 DrawPhase, MainPhase, BattlePhase 로 이루어져 있다. 각각 draw(),
		 * mainPhaseAction(), battle() 메소드가 존재한다 mainPhase에는 몬스터 소환이나 마법카드 사용 등을 할 수 있다.
		 * Turn 클래스에는 playTurn 메소드가 존재하며, 전달인자로 DrawPhase, MainPhase, BattlePhase를 받아 그를
		 * 수행한다. 구현해보시오
		 * 
		 * 하다가 그냥 잘안되서.. 일단해봤다..
		 */

		Turnn.playTurn(new DrawTurn(), new MainTurn(), new BattleTurn());
		Turnn.playTurn(new DrawTurn2(), new MainTurn2(), new BattleTurn2());

	}

}
//... 잘모르깃다.. /객체를 하나 더만들어야해

class DrawTurn implements DrawPhaze {
	// 그럼 이렇게 하나씩 구현하는건 어떠니

		@Override
		public void draw() {
			System.out.println("카드를 2장 드로우");
		}

	}

	class MainTurn implements MainPhaze {

		@Override
		public void mainPhaseAction() {
			System.out.println("불랙매지숀 소환");
		}
	}
	class BattleTurn implements BattlePhaze{

		@Override
		public void battle() {
			System.out.println("나랑뜨자");
		}

	}


class DrawTurn2 implements DrawPhaze {
// 그럼 이렇게 하나씩 구현하는건 어떠니

	@Override
	public void draw() {
		System.out.println("카드를 1장 드로우");
	}

}

class MainTurn2 implements MainPhaze {

	@Override
	public void mainPhaseAction() {
		System.out.println("불알큰매지션 소환");
	}
}
class BattleTurn2 implements BattlePhaze{

	@Override
	public void battle() {
		System.out.println("나랑하자");
	}

}

interface DrawPhaze {
	void draw();
}

interface MainPhaze {
	void mainPhaseAction();

}

interface BattlePhaze {
	void battle();

}

class Turnn {

	static void playTurn(DrawPhaze dp, MainPhaze mp, BattlePhaze bp) {
		dp.draw();
		mp.mainPhaseAction();
		bp.battle();
	}
}