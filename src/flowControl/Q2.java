package flowControl;

public class Q2 {

	public static void main(String[] args) {
		// ¦���ܸ� ����ϼ���

		for (int i = 2; i <= 9; i+=2) {
			
			System.out.println(i + "�� ��� ����");

			for (int j = 1; j <= 9; j++) {
				System.out.println(i + "x" + j + "=" + i * j);
			}

		}

	}

}
