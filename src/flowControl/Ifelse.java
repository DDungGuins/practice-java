package flowControl;

public class Ifelse {

	public static void main(String[] args) {
		// ������ �ð�ǥ
		// ���ƴ� 5�ú��� 14�ñ��� ��ϴ�.
		// ���ƴ� 14�ú��� 22�ñ��� �������� �մϴ�.
		// ���ƴ� 22�ú��� 24�ñ��� ���θ� �մϴ�.
		// �� ���� �ð��� ���ƴ� �����ֽ��ϴ�.
		// �ϳ��� ������ �ð��� �����ؼ� �ش��� �ð��� ������ ������ ����϶�.

		int time = 16;
		System.out.println("���ƴ� ������ �ϰ� �ִ�?");
		if (time >= 5 && time < 14) {
			System.out.println("zZZ������");
		} else if (time >= 14 && time < 22) {
			System.out.println("����Ʈ����Ʈ �� 4����");
		} else if (time >= 22 && time < 24) {

			System.out.println("�ķα׶�ֱ�");
		} else {
			System.out.println("��<-<");
		}
	}
}
