package flowControl;

public class DoWhile {

	public static void main(String[] args) {
		// ���ƴ� ���� �Խ��ϴ�.
		// ���� ������ ���� �ְ� �� ������ �� �� �ֽ��ϴ�.
		// �� ���� ���� �Ծ��ٸ� ��Ƴ��� ���̰�, ���� ���� �Ծ��ٸ� �ƾ� �� ���Դϴ�.
		// �׷��� 178��°�� ���� ���� ������ ���߽��ϴ�.
		// ���ƴ� ���� ������ ������... �� �Դ°� ���߰� ������ �����մϴ�.
		// ����1: �ݺ����� ���ǽ����� sungAisSuv Ȱ���Ѵ�.

		boolean sungAisSuv;
		int tab = 0;
		final int DOK = 178;

		// do while����
		do {
			tab++;
			System.out.println("���ƴ� " + tab + "��° ���� �Ծ���.");

			if (tab == DOK) {
				sungAisSuv = false;
			} else {
				sungAisSuv = true;
			}
		}

		while (sungAisSuv);
		System.out.println("����������");

		// while ����
//		while (sungAisick == false) {
//			if (tab == DOK) {
//				sungAisSick = true;
//				continue;
//			}
//			tab++;
//			System.out.println("���ƴ� "+tab+"��° ���� �Ծ���.");
//		}
//		if (sungAisSick == true)
//			System.out.println("����������");
//		else
//			System.out.println("��θ���.");

	}
}
