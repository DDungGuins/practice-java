package abstractClass;
import java.util.ArrayList;
public class GoodForTemplateMethod {

	public static void main(String[] args) {
		// 뚱귄초등학교 학생들의 일상을 만들어보자 (1,2,3학년만 있으며 5교시까지 수업한다.)

		School ddungin = new School();
		ddungin.student.add(new Grade1("찰귄"));
		ddungin.student.add(new Grade2("펭수"));
		ddungin.student.add(new Grade3("콩귄"));
		
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
		System.out.println(this.name+"이/가 귀가합니다.");
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
		System.out.println("1교시: "+this.name+"이/가 국어의 기본 수업을 듣습니다.");
	}
	void gyosi_2() {
		System.out.println("2교시: "+this.name+"이/가 수학의 기본 수업을 듣습니다.");

	}
	void gyosi_3() {
		System.out.println("3교시: "+this.name+"이/가 사회의 기본 수업을 듣습니다.");

	}
	void gyosi_4() {
		System.out.println("4교시: "+this.name+"이/가 과학의 기본 수업을 듣습니다.");

	}
	void gyosi_5() {
		System.out.println("5교시: "+this.name+"이/가 영어의 기본 수업을 듣습니다.");

	}
	void cleaning() {
		System.out.println("청소시간: "+this.name+"이/가 1학년의 담당 청소구역인 1~2층 복도를 청소합니다.");

	}
	
}

class Grade2 extends Student {
	Grade2(String name){
		super(name,2);
	}
	
	void gyosi_1() {
		System.out.println("1교시: "+this.name+"이/가 국어의 이해 수업을 듣습니다.");
	}
	void gyosi_2() {
		System.out.println("2교시: "+this.name+"이/가 수학의 이해 수업을 듣습니다.");

	}
	void gyosi_3() {
		System.out.println("3교시: "+this.name+"이/가 사회의 이해 수업을 듣습니다.");

	}
	void gyosi_4() {
		System.out.println("4교시: "+this.name+"이/가 과학의 이해 수업을 듣습니다.");

	}
	void gyosi_5() {
		System.out.println("5교시: "+this.name+"이/가 영어의 이해 수업을 듣습니다.");

	}
	void cleaning() {
		System.out.println("청소시간:  "+this.name+"이/가 2학년의 담당 청소구역인 3~4층 복도를 청소합니다.");

	}
}

class Grade3 extends Student {
	
	Grade3(String name){
		super(name,3);
	}
	
	void gyosi_1() {
		System.out.println("1교시: "+this.name+"이/가 국어의 심화 수업을 듣습니다.");
	}
	void gyosi_2() {
		System.out.println("2교시: "+this.name+"이/가 수학의 심화 수업을 듣습니다.");

	}
	void gyosi_3() {
		System.out.println("3교시: "+this.name+"이/가 사회의 심화 수업을 듣습니다.");

	}
	void gyosi_4() {
		System.out.println("4교시: "+this.name+"이/가 과학의 심화 수업을 듣습니다.");

	}
	void gyosi_5() {
		System.out.println("5교시: "+this.name+"이/가 영어의 심화 수업을 듣습니다.");

	}
	void cleaning() {
		System.out.println("청소시간: "+this.name+"이/가 "
				+ "3학년의 담당 청소구역인 교무실과 현관을 청소합니다.");

	}
	
}