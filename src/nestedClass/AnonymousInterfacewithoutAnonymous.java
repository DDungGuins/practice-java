package nestedClass;

public class AnonymousInterfacewithoutAnonymous {

	public static void main(String[] args) {
		/*
		 * ���ƴ� ����հ����� �Ѵ� �� ���� DrawPhase, MainPhase, BattlePhase �� �̷���� �ִ�. ���� draw(),
		 * mainPhaseAction(), battle() �޼ҵ尡 �����Ѵ� mainPhase���� ���� ��ȯ�̳� ����ī�� ��� ���� �� �� �ִ�.
		 * Turn Ŭ�������� playTurn �޼ҵ尡 �����ϸ�, �������ڷ� DrawPhase, MainPhase, BattlePhase�� �޾� �׸�
		 * �����Ѵ�. �����غ��ÿ�
		 * 
		 * �ϴٰ� �׳� �߾ȵǼ�.. �ϴ��غô�..
		 */

		Turnn.playTurn(new DrawTurn(), new MainTurn(), new BattleTurn());
		Turnn.playTurn(new DrawTurn2(), new MainTurn2(), new BattleTurn2());

	}

}
//... �߸𸣱��.. /��ü�� �ϳ� ����������

class DrawTurn implements DrawPhaze {
	// �׷� �̷��� �ϳ��� �����ϴ°� ���

		@Override
		public void draw() {
			System.out.println("ī�带 2�� ��ο�");
		}

	}

	class MainTurn implements MainPhaze {

		@Override
		public void mainPhaseAction() {
			System.out.println("�ҷ������� ��ȯ");
		}
	}
	class BattleTurn implements BattlePhaze{

		@Override
		public void battle() {
			System.out.println("��������");
		}

	}


class DrawTurn2 implements DrawPhaze {
// �׷� �̷��� �ϳ��� �����ϴ°� ���

	@Override
	public void draw() {
		System.out.println("ī�带 1�� ��ο�");
	}

}

class MainTurn2 implements MainPhaze {

	@Override
	public void mainPhaseAction() {
		System.out.println("�Ҿ�ū������ ��ȯ");
	}
}
class BattleTurn2 implements BattlePhaze{

	@Override
	public void battle() {
		System.out.println("��������");
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