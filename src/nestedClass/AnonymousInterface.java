package nestedClass;

public class AnonymousInterface {

	public static void main(String[] args) {
		/*
		 * ���ƴ� ����հ����� �Ѵ� �� ���� DrawPhase, MainPhase, BattlePhase �� �̷���� �ִ�. ���� draw(),
		 * mainPhaseAction(), battle() �޼ҵ尡 �����Ѵ� mainPhase���� ���� ��ȯ�̳� ����ī�� ��� ���� �� �� �ִ�.
		 * Turn Ŭ�������� playTurn �޼ҵ尡 �����ϸ�, �������ڷ� DrawPhase, MainPhase, BattlePhase�� �޾� �׸�
		 * �����Ѵ�. �����غ��ÿ�
		 * 
		 */
		Turn.playTurn(new DrawPhase() {
			// new + �������̽��ϸ� �������̽��� �ν��Ͻ��� �����Ǵ°� �ƴ϶� �������̽��� �����ϴ� Ŭ������ �����ϴ°ͱ��� �����Ѵ�.
		}, new MainPhase() {
			public void mainPhaseAction() {
				System.out.println("���͸� �� �� �޸� ���� ǥ�÷� ������ ����ī�� �� ���� ����Ӵϴ�.");
			}
		}, new BattlePhase() {
			public void battle() {
				System.out.println("������ ���������ʰ� �׳� ���� �ѱ�ϴ�.");
			}
		});
	}// Ŭ������ ����� �ν��Ͻ��� �����Ͽ� implements�� �ؾ���
		//�͸�Ŭ����(�͸�ü��� �Ѵ�): �ѹ� ���� ���ƹ��� Ŭ������ �̸��� �ʿ����.
	// ���� �ν��Ͻ��� �ʿ��� �ڸ��� �̸����� Ŭ������ �����ϸ鼭 ���ÿ� �ν��Ͻ��� �����Ѵ�.
}

interface DrawPhase {
	default void draw() {
		System.out.println("ī�带 �� �� �̽��ϴ�.");
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