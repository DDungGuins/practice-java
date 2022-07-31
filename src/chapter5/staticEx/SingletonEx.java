package chapter5.staticEx;

public class SingletonEx {

	public static void main(String[] args) {
//		// 성사무실에 프린터가 1개있다
//		하나로다나눠써야한다
//		프린터는 더 늘릴수없다
//		5명의 직원이 차례대로 프린터를 사용하는과정을 출력하여라

		Zikwon yr1 = new Zikwon(); //직원 클래스의 인스턴스 생성 (멤버변수)
		Zikwon yr2 = new Zikwon();
		Zikwon yr3 = new Zikwon();
		Zikwon yr4 = new Zikwon();
		Zikwon yr5 = new Zikwon();

		yr1.usePrint("이율"); //직원 클래스의 메소드 사용 =>지역변수?
 		yr2.usePrint("돈은");
		yr3.usePrint("성쟁");
		yr4.usePrint("이를");
		yr5.usePrint("좋어해");
		
	}

}

class Printer {

	private static Printer instance= new Printer(); //-> 프로그램 시작 시 정적으로 선언

	private Printer() { //->지역변수 (함수내부) 선언
	}

	public static Printer getPrinter(){ //->프로그램 시작할 떄 정적으로 선언됨
		if (instance==null) {
			instance = new Printer();
		}
		return instance;
	}
	
	void printing (String abc) {        //->지역 변수 (함수내부)선언
		System.out.println(abc+"를 인쇄했습니다.");
	}
}

class Zikwon {
	int num; //인스턴스 생성될 떄 선언 (멤버변수)
	String name;
	
	void usePrint(String abc) {  //지역변수 (함수내부)선언
		System.out.println("인쇄를 시작합니다.");
		Printer.getPrinter().printing(abc);
		
	}
	
}
