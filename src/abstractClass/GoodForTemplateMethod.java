package abstractClass;
import java.util.ArrayList;
public class GoodForTemplateMethod {

	public static void main(String[] args) {
		// �ױ��ʵ��б� �л����� �ϻ��� ������ (1,2,3�г⸸ ������ 5���ñ��� �����Ѵ�.)

		School ddungin = new School();
		ddungin.student.add(new Grade1("����"));
		ddungin.student.add(new Grade2("���"));
		ddungin.student.add(new Grade3("���"));
		
		for (Student student : ddungin.student) {
			student.Schedule();
		}
		
	}

}


class School  {
	String name;
	ArrayList <Student> student = new ArrayList<>();
}

abstract class Student {
	String name;
	int grade;
		
	Student(String name, int grade) {
		this.name=name;
		this.grade=grade;
	}
	
	abstract void gyosi_1();
	abstract void gyosi_2();
	abstract void gyosi_3();
	abstract void gyosi_4();
	abstract void gyosi_5();
	abstract void cleaning();
	
	void gohome() {
		System.out.println(this.name+"��/�� �Ͱ��մϴ�.");
	}
	
	final void Schedule (){
		gyosi_1();
		gyosi_2();
		gyosi_3();
		gyosi_4();
		gyosi_5();
		cleaning();
		gohome();
		System.out.println("=====================");
	}
	
}

class Grade1 extends Student {
	Grade1(String name){
		super(name,1);
	}
	
	
	void gyosi_1() {
		System.out.println("1����: "+this.name+"��/�� ������ �⺻ ������ ����ϴ�.");
	}
	void gyosi_2() {
		System.out.println("2����: "+this.name+"��/�� ������ �⺻ ������ ����ϴ�.");

	}
	void gyosi_3() {
		System.out.println("3����: "+this.name+"��/�� ��ȸ�� �⺻ ������ ����ϴ�.");

	}
	void gyosi_4() {
		System.out.println("4����: "+this.name+"��/�� ������ �⺻ ������ ����ϴ�.");

	}
	void gyosi_5() {
		System.out.println("5����: "+this.name+"��/�� ������ �⺻ ������ ����ϴ�.");

	}
	void cleaning() {
		System.out.println("û�ҽð�: "+this.name+"��/�� 1�г��� ��� û�ұ����� 1~2�� ������ û���մϴ�.");

	}
	
}

class Grade2 extends Student {
	Grade2(String name){
		super(name,2);
	}
	
	void gyosi_1() {
		System.out.println("1����: "+this.name+"��/�� ������ ���� ������ ����ϴ�.");
	}
	void gyosi_2() {
		System.out.println("2����: "+this.name+"��/�� ������ ���� ������ ����ϴ�.");

	}
	void gyosi_3() {
		System.out.println("3����: "+this.name+"��/�� ��ȸ�� ���� ������ ����ϴ�.");

	}
	void gyosi_4() {
		System.out.println("4����: "+this.name+"��/�� ������ ���� ������ ����ϴ�.");

	}
	void gyosi_5() {
		System.out.println("5����: "+this.name+"��/�� ������ ���� ������ ����ϴ�.");

	}
	void cleaning() {
		System.out.println("û�ҽð�:  "+this.name+"��/�� 2�г��� ��� û�ұ����� 3~4�� ������ û���մϴ�.");

	}
}

class Grade3 extends Student {
	
	Grade3(String name){
		super(name,3);
	}
	
	void gyosi_1() {
		System.out.println("1����: "+this.name+"��/�� ������ ��ȭ ������ ����ϴ�.");
	}
	void gyosi_2() {
		System.out.println("2����: "+this.name+"��/�� ������ ��ȭ ������ ����ϴ�.");

	}
	void gyosi_3() {
		System.out.println("3����: "+this.name+"��/�� ��ȸ�� ��ȭ ������ ����ϴ�.");

	}
	void gyosi_4() {
		System.out.println("4����: "+this.name+"��/�� ������ ��ȭ ������ ����ϴ�.");

	}
	void gyosi_5() {
		System.out.println("5����: "+this.name+"��/�� ������ ��ȭ ������ ����ϴ�.");

	}
	void cleaning() {
		System.out.println("û�ҽð�: "+this.name+"��/�� "
				+ "3�г��� ��� û�ұ����� �����ǰ� ������ û���մϴ�.");

	}
	
}