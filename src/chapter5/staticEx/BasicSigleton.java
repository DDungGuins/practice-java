package chapter5.staticEx;

public class BasicSigleton {

	public static void main(String[] args) {
		// �߻�: �ν��Ͻ��� �� �ϳ��� �ʿ��� �� , �ν��Ͻ��� �� �ϳ��� ���鵵�� �����ϴ� ���̴�.
		/*
		 * ��� �����ϴ°�....... ����ƽ�� Ȱ������������? 1. ������鿡�� �˸��� (�Ե�� �̰� �ϳ��� ����Ŵϱ� �Ե��� ������������~)
		 * �Ұ��� 2. new Ű���带 ������ ���´� (��... �̰� �������ϴ°ǵ� �־ȵǴ°���?) 3. ���� �̸� ����� ������ �� �����
		 * �ع�����.(�����? �����ڸ� ���ƹ�����.)
		 * 
		 * ����: �̱��漳�����+�޸𸮰����� ��� �ö󰡴°�(�޸��忡�ٰ�) �ʹ� ��ƴ�... �� �����ϰ�
		 * �ѽ���.........................................
		 */

		// Company mobizen;
//		System.out.println(sawon.name); 	

		Company.getMobizen();
//		Company yrcomp = Company.getMobizen();
//		Company sa = Company.getMobizen();
//		System.out.println(sa);
//		System.out.println(yrcomp);

	}

}

class Company {
	String name = new String("������ȸ��");
	private static Company mobizen = new Company();// ���⼭ ��������� �ƴϴ�..

	private Company() {
	}

	public static Company getMobizen() {
		if (mobizen == null) {
			mobizen = new Company();
		}
		return mobizen;

	}

}

class Sawon {
	Sawon sangSa;
	String name = new String("�̾ƹ���");
	int id;

	void work() {
		// ���� �մϴ�.
	}

}