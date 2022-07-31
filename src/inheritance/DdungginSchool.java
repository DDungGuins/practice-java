package inheritance;

import java.util.ArrayList;

public class DdungginSchool {

	public static void main(String[] args) {
		// 뚱귄초에 선생님들이 있다. 교사는 교사와 관리자(관리자 역시 교사이다.)가있다. 뚱귄이는 교사이고 콩귄이는 아주 무시무시한 교장이다.
		// 이름, 직위, 임용일,(관리자의 경우 관리자 승급일 )
		// 스쿨 클래스가 있다. addTeacher(Teacher teacher) 메소드가 잇다 (내부 리스트에 학교의 교사를 더하는 기능이다.)
		// 뚱귄초의 하루를 출력하는 후로그램을 구현하라
		// 객체 생성자에 생성되었다는 문구를 프린트라인하라

		School school = new School("뚱귄초등학교");
//무적권 Teacher로만 생성 너가 써보길 바란 기능은 혹시 오버라이딩이니
		Teacher ddunggin = new Teacher("뚱귄", "평교사", "09-06-03");
		Teacher chalgin = new Teacher("찰귄", "부장교사", "13-08-08");
		Teacher pengsu = new Teacher("펭수", "전담교사", "09-01-01");
		Teacher konggin = new SuperVisor("콩귄", "교장", "94-12-12", "05-11-11");
//이걸 한 이유가 있어 교장샘 고유의 메소드를 사용하고 싶었 어
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
		System.out.println(this.name + " 생성되었습니다.");
		System.out.println("----생성완료----");

	}
	//
	
	
	// 조건 teacher의 인스턴스가 아니면 에러 발생시키기
	// ex) SuperVisor의 객체면 에러 발생시키기
	// hint ) intanceof 연산자 ...
	void addTeacher(Teacher teacher) {

		if (teacher instanceof Teacher == false) {
			System.out.println("에러가 발생했습니다 - [Teacher 클래스만 입력할 수 있습니다.]");
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
		System.out.println(this.name + " 생성되었습니다.");
		System.out.println("----생성완료----");

	}

	void teach() {
		System.out.println(this.name + "선생님이 수업을 합니다.");
	}

	void council() {
		System.out.println(this.name + "선생님이 학생과 상담을 합니다.");

	}

	void goHome() {
		System.out.println(this.name + "선생님이 퇴근합니다.");
	}
}

class SuperVisor extends Teacher {
	String sgDate;

	SuperVisor(String name, String zikWi, String imDate, String sgDate) {
		super(name, zikWi, imDate);
		this.sgDate = sgDate;
		System.out.println(this.name + " 생성되었습니다.");
		System.out.println("----생성완료----");

	}

	void teach() {
		System.out.println(this.name + " " + this.zikWi + "선생님이 수업 땜빵을 합니다.");
	}

	void galgugi(Teacher teacher) {
		System.out.println(this.name + " " + this.zikWi + " 선생님이 " + teacher.name + "선생님을 갈굽니다.");
	}

	void council() {
		System.out.println(this.name + " " + this.zikWi + "선생님이 저경력 선생님과 상담을 합니다.");
	}

	void jungMun() {
		System.out.println(this.name + " " + this.zikWi + "선생님이 정문에서 착한척 인사를 합니다.");

	}
}
