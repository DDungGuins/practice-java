package abstractClass;

public class MethodDeclarationAndDefinition {

	public static void main(String[] args) {
		// ����4���� �޾Ƽ� �ƹ����Գ� �����Ͽ� ���� �ϳ� ��ȯ�ϴ� ��ŧ�����͸� ������̴�.
		// ���ƴ� useCal�̶�� �޼��带 ������ �ִ�. �� �޼��带 ����ؼ� ������� ����ϴ� ���α׷��� ������
		// ������� ����϶�°� ��ü������ �������̴�
		// �޼����� ����� ������ ���̸� �� ������ ��.
		// ������ �ϸ� 
	}

}

abstract class MyCal {

	abstract int calculate(int a, int b, int c, int d);

}

//class PlusCal extends MyCal {
//
//	int calculate(int a, int b, int c, int d) {
//		int s = a + b + c + d;
//		return s;
//	}
//}
//
//class MinusCal extends MyCal {
//
//	int calculate(int a, int b, int c, int d) {
//		int s = a - b - c - d;
//		return s;
//	}
//}
//
//class MultiCal extends MyCal {
//
//	int calculate(int a, int b, int c, int d) {
//		int s = a * b * c * d;
//		return s;
//	}
//}

class Person {
	String name;

	void useCal(MyCal calculator, int a, int b, int c, int d) {
		int z = calculator.calculate(a, b, c, d); // �ƴ�? �޼��尡 ���ǵ��� �ʾҴµ� ������ �߻����� �ʾ��ݾ�
		System.out.println(a+","+b+","+c+","+d+"�� �Է��Ͽ����ϴ�.");
		System.out.println("����� "+z+"�Դϴ�.");
		System.out.println("���Ϸ�");
	}
	

}