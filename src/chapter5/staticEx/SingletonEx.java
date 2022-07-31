package chapter5.staticEx;

public class SingletonEx {

	public static void main(String[] args) {
//		// ���繫�ǿ� �����Ͱ� 1���ִ�
//		�ϳ��δٳ�������Ѵ�
//		�����ʹ� �� �ø�������
//		5���� ������ ���ʴ�� �����͸� ����ϴ°����� ����Ͽ���

		Zikwon yr1 = new Zikwon(); //���� Ŭ������ �ν��Ͻ� ���� (�������)
		Zikwon yr2 = new Zikwon();
		Zikwon yr3 = new Zikwon();
		Zikwon yr4 = new Zikwon();
		Zikwon yr5 = new Zikwon();

		yr1.usePrint("����"); //���� Ŭ������ �޼ҵ� ��� =>��������?
 		yr2.usePrint("����");
		yr3.usePrint("����");
		yr4.usePrint("�̸�");
		yr5.usePrint("������");
		
	}

}

class Printer {

	private static Printer instance= new Printer(); //-> ���α׷� ���� �� �������� ����

	private Printer() { //->�������� (�Լ�����) ����
	}

	public static Printer getPrinter(){ //->���α׷� ������ �� �������� �����
		if (instance==null) {
			instance = new Printer();
		}
		return instance;
	}
	
	void printing (String abc) {        //->���� ���� (�Լ�����)����
		System.out.println(abc+"�� �μ��߽��ϴ�.");
	}
}

class Zikwon {
	int num; //�ν��Ͻ� ������ �� ���� (�������)
	String name;
	
	void usePrint(String abc) {  //�������� (�Լ�����)����
		System.out.println("�μ⸦ �����մϴ�.");
		Printer.getPrinter().printing(abc);
		
	}
	
}
