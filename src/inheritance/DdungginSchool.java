package inheritance;

import java.util.ArrayList;

public class DdungginSchool {

	public static void main(String[] args) {
		// �ױ��ʿ� �����Ե��� �ִ�. ����� ����� ������(������ ���� �����̴�.)���ִ�. �ױ��̴� �����̰� ����̴� ���� ���ù����� �����̴�.
		// �̸�, ����, �ӿ���,(�������� ��� ������ �±��� )
		// ���� Ŭ������ �ִ�. addTeacher(Teacher teacher) �޼ҵ尡 �մ� (���� ����Ʈ�� �б��� ���縦 ���ϴ� ����̴�.)
		// �ױ����� �Ϸ縦 ����ϴ� �ķα׷��� �����϶�
		// ��ü �����ڿ� �����Ǿ��ٴ� ������ ����Ʈ�����϶�

		School school = new School("�ױ��ʵ��б�");
//������ Teacher�θ� ���� �ʰ� �Ẹ�� �ٶ� ����� Ȥ�� �������̵��̴�
		Teacher ddunggin = new Teacher("�ױ�", "�򱳻�", "09-06-03");
		Teacher chalgin = new Teacher("����", "���屳��", "13-08-08");
		Teacher pengsu = new Teacher("���", "���㱳��", "09-01-01");
		Teacher konggin = new SuperVisor("���", "����", "94-12-12", "05-11-11");
//�̰� �� ������ �־� ����� ������ �޼ҵ带 ����ϰ� �;� ��
		school.addTeacher(konggin);
		school.addTeacher(ddunggin);
		school.addTeacher(pengsu);
		school.addTeacher(chalgin);

//		konggin.jungMun();
		chalgin.teach();
		ddunggin.teach();
		pengsu.teach();
		konggin.teach();
		ddunggin.council();
		konggin.council();
//		konggin.galgugi(chalgin);

		for (Teacher teacher : school.tList) {
			teacher.goHome();
		}

	}

}

class School {
	String name;
	ArrayList<Teacher> tList = new ArrayList<>();

	School(String name) {
		this.name = name;
		System.out.println(this.name + " �����Ǿ����ϴ�.");
		System.out.println("----�����Ϸ�----");

	}
	//
	
	
	// ���� teacher�� �ν��Ͻ��� �ƴϸ� ���� �߻���Ű��
	// ex) SuperVisor�� ��ü�� ���� �߻���Ű��
	// hint ) intanceof ������ ...
	void addTeacher(Teacher teacher) {

		if (teacher instanceof Teacher == false) {
			System.out.println("������ �߻��߽��ϴ� - [Teacher Ŭ������ �Է��� �� �ֽ��ϴ�.]");
			return;
		} else
			tList.add(teacher);

	}
}

class Teacher {
	String name;
	String zikWi;
	String imDate;

	Teacher(String name, String zikWi, String imDate) {
		this.name = name;
		this.zikWi = zikWi;
		this.imDate = imDate;
		System.out.println(this.name + " �����Ǿ����ϴ�.");
		System.out.println("----�����Ϸ�----");

	}

	void teach() {
		System.out.println(this.name + "�������� ������ �մϴ�.");
	}

	void council() {
		System.out.println(this.name + "�������� �л��� ����� �մϴ�.");

	}

	void goHome() {
		System.out.println(this.name + "�������� ����մϴ�.");
	}
}

class SuperVisor extends Teacher {
	String sgDate;

	SuperVisor(String name, String zikWi, String imDate, String sgDate) {
		super(name, zikWi, imDate);
		this.sgDate = sgDate;
		System.out.println(this.name + " �����Ǿ����ϴ�.");
		System.out.println("----�����Ϸ�----");

	}

	void teach() {
		System.out.println(this.name + " " + this.zikWi + "�������� ���� ������ �մϴ�.");
	}

	void galgugi(Teacher teacher) {
		System.out.println(this.name + " " + this.zikWi + " �������� " + teacher.name + "�������� �����ϴ�.");
	}

	void council() {
		System.out.println(this.name + " " + this.zikWi + "�������� ����� �����԰� ����� �մϴ�.");
	}

	void jungMun() {
		System.out.println(this.name + " " + this.zikWi + "�������� �������� ����ô �λ縦 �մϴ�.");

	}
}
