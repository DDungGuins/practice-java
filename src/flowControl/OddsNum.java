package flowControl;

public class OddsNum {

	public static void main(String[] args) {
		// 1���� 100���� ���� ���ض�
		// �� Ȧ �� �϶��� ���ϰ�, ¦���� ���� ����������.
		// continue���� Ȱ���ض�

		int num = 0;
		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0)
				continue;
			num += i;
		}
		System.out.println(num);
	}

}
