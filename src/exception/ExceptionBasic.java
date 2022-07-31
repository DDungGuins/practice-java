package exception;

import java.util.Scanner;

public class ExceptionBasic {

	public static void main(String[] args) {
		// a�� b�� �Է¹޴´�.
		// �� ���� c�� ����Ѵ�.
		// ���ѹݺ�??? Ȥ�� try catch�� ����ϴ�
		// ���� a�� exit�� �Է��ϸ� ���α׷� ���� ������
		// ����
		Scanner aScanner = new Scanner(System.in);

		for (;;) {
			// ��Ʈ���� ������ ��� �����ϰ� �׿� ���ڿ��� ���� ���α׷����Ḧ ��Ű�� �ʹ�. if ���� �������� �ƴ����� üũ�ϴ°� �ִ°Ͱ�����

			System.out.println("���������� ���� �Է��ϼ���. (EXIT�� �Է��Ͻø� ���α׷��� ����˴ϴ�.)");
			String x = aScanner.nextLine();
			int a = 0;

			if (x.toUpperCase().equals("EXIT")) {
				System.out.println("���α׷��� �����մϴ�.");
				break;
			} else {
				// ����ó���� �� ����: EXIT�̿��� �ٸ� ���ڿ��� �� ����ġ�� ��츦 �����ϱ� ����
				try {
					a = Integer.parseInt(x);
				}
				// �Ϲ������� ������ �߻��ϸ� �� �ؿ��ٺ��ʹ� �����̾ȵ����ʴ�

				catch (NumberFormatException e) {
					System.out.println("����ġ��������");
					continue;
				}
				// �¾� ������ �־� EXIT �� �ƴ� �̻��� �ٸ� ���ڿ��� ġ�� ���������� ����� ������ġ�� ������ �߻���
			}
//			String y; 
//			for (;;) {
//				System.out.println("������ ���� �Է��ϼ���.");
//				y = aScanner.nextLine();
//				if (y.equals("0")) { ����� �Է°��� ���������� ���ں񱳿����� �Ź��Ѵ�!
//					System.out.println("0���δ� ���� �� �����ϴ�.");
//					continue;
//				} else {
//					break;
//				}
//			}
			for (;;) {
				System.out.println("������ ���� �Է��ϼ���.");

				int b = Integer.parseInt(aScanner.nextLine());

				try {//����� �����¼��� 0�϶��� ���ϸ�ȴ�
					System.out.println(DivisionCalculator.divide(a, b));
					break;
				} catch (RuntimeException e) {
					System.out.println("0�� ������ ���� �� �� ����!");
					continue;
					//����� ���������� �������ʿ䰡���⋚���̴�
				}
			}
		}
//��ĳ�� ������ �߸��� (����ι������ ���⶧����) �׳� �Է¹޴� �����ϳ��� �ϳ��� ����ϴ��پ˾Ҵµ� �ƴѰ�������.. 
	}
}

// �ֳĸ� c�� �����̰� , a�� b��� �����̸� / ���� ������ �����ϴ� �������̱� ������ ��û�� �����Ϸ��� ��������� �̰� ������Ȳ����
// �˼�����.

class DivisionCalculator {
	static int divide(int a, int b) {

		int c = a / b;
		return c;

		// ó���� �̷��� �Ϸ����ߴµ� ������ ��Ʈ���̴ٺ��ϱ� ĳġ���� ������ ������ϴµ� ��������������� �𸣰ڴ�
	}
}