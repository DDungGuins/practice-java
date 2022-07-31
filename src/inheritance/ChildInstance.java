package inheritance;

public class ChildInstance {

	public static void main(String[] args) {
		// �����͸� ����� ������Ŭ������ �����, �Ｚ����Ʈ�� �ֵ�. �Ｚ�������߿�����
		// �����Ϳ��Դ� booleanŸ���� �Ӽ��� �ִ�. �μⰡ�ɿ��� ��ĵ���ɿ��� , �Ｚ�����
//		�� �ǵ��ϴ��� �߸𸣰ھ�..
		// �Ｚ�������� �ν��Ͻ��� ������, �� ������ȣ�⸶�� ȣ��ƴٰ� �޽��� �־�

		SamSungP ddongsung = new SamSungP(true, false, false);
		SamSungP godsung = new SamSungP(true, true, true);
		ddongsung.printerInfor();
		godsung.printerInfor();
	}

}

class Printer {
	String company;
	boolean canPrint;
	boolean canScan;

	Printer() {
		System.out.println("===������ �⺻������ ȣ��====");
	};

	Printer(String company, boolean canPrint, boolean canScan) {
		this.company = company;
		this.canPrint = canPrint;
		this.canScan = canScan;
		System.out.println("===������ �Ű����� ������ ȣ��===="); // �̰� �߸� �Ȱžƴϱ��
	}

	void printerInfor() {
		System.out.println("made by " + this.company);
		if (this.canPrint)
			System.out.println("�μ��� �� �ֽ��ϴ�.");
		if (this.canScan)
			System.out.println("��ĵ�� �� �ֽ��ϴ�.");

	}

}

class SamSungP extends Printer {
	// �׷����� �ߴµ� ��¥�� �Ｚ����Ʈ�� ȸ�絵�������ְ� ��ɵ� �� �������־ ���� �Ű������� �ʿ���� �� ���Ƽ� �̷����ߴ�..]
	boolean isSamsungThings;

	//���������� super()�����ڸ� ȣ��
//	SamSungP(boolean canPrint, boolean canScan, boolean isSamsungThings) { 
//		System.out.println("===�Ｚ ������ ������ȣ�� ===");
//		this.canPrint= canPrint;
//		this.canScan = canScan;
//		this.isSamsungThings = isSamsungThings;
//	}
	
	SamSungP(boolean canPrint, boolean canScan, boolean isSamsungThings){
		super("Samsung", canPrint, canScan); 
		this.isSamsungThings=isSamsungThings;
		System.out.println("===�Ｚ ������ ������ȣ�� ===");
	}

	void printerInfor() {
		super.printerInfor();
		if (this.isSamsungThings) {
			System.out.println("�Ｚ��� �����մϴ�.");
		}
	}
}