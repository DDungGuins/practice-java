package abstractClass;

public class MethodDeclarationAndDefinition {

	public static void main(String[] args) {
		// 숫자4개를 받아서 아무렇게나 연산하여 값을 하나 반환하는 컬큘레이터를 만들것이다.
		// 성아는 useCal이라는 메서드를 가지고 있다. 이 메서드를 사용해서 입출력을 출력하는 프로그램을 만들어라
		// 입출력을 출력하라는게 구체적으로 무슨말이니
		// 메서드의 선언과 정의의 차이를 잘 구별할 것.
		// 선언을 하면 
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
		int z = calculator.calculate(a, b, c, d); // 아니? 메서드가 정의되지 않았는데 에러가 발생하지 않았잖아
		System.out.println(a+","+b+","+c+","+d+"를 입력하였습니다.");
		System.out.println("결과는 "+z+"입니다.");
		System.out.println("계산완료");
	}
	

}