package flowControl;

public class Switch2 {

	public static void main(String[] args) {
		// �⺻Ÿ���� �ƴϴ�... �빮�ڸ� ���
		// ����Ʈ����Ʈ���� �԰� ����ġ ���̽��� �̿��� ���ڿ��� ��µǴ� ���ǹ��� �ۼ��϶�.
		// ���ڿ� ���� : LV4, LV3, LV2, LV1 �׸��� �ȳ���......�� ���� ����� ����϶�
		String rest = "����ġ ���� 3��";

		switch (rest) {

		case "LV4": // ���ͷ�......
			System.out.println("����Ʈ����Ʈ�� " + rest + " �Ծ �������");
			break;

		case "LV3":
			System.out.println("����Ʈ����Ʈ�� " + rest + " �ʹ� �Ʊ���...");
			break;

		case "LV2":
			System.out.println("����Ʈ����Ʈ�� " + rest + " ��... �� �̰� �ǳ�����");
			break;

		case "LV1":
			System.out.println("����Ʈ����Ʈ��" + rest + " ���� �Ʊ����� �ʴ�.");
			break;

		default:
			System.out.println("�� �ƹ��͵� �ȳ���?");

		}

	}

}
