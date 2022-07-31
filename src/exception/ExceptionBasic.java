package exception;

import java.util.Scanner;

public class ExceptionBasic {

	public static void main(String[] args) {
		// a와 b를 입력받는다.
		// 그 나눈 c를 출력한다.
		// 무한반복??? 혹시 try catch를 써야하니
		// 만약 a에 exit를 입력하면 프로그램 종료 ㄷㄷㄷ
		// 버깅
		Scanner aScanner = new Scanner(System.in);

		for (;;) {
			// 인트값이 들어오면 계속 진행하고 그외 문자열이 들어가면 프로그램종료를 시키고 싶다. if 에서 정수인지 아닌지는 체크하는게 있는것같구나

			System.out.println("나누어지는 수를 입력하세요. (EXIT를 입력하시면 프로그램이 종료됩니다.)");
			String x = aScanner.nextLine();
			int a = 0;

			if (x.toUpperCase().equals("EXIT")) {
				System.out.println("프로그램을 종료합니다.");
				break;
			} else {
				// 예외처리를 쓴 이유: EXIT이외의 다른 문자열을 써 똥탕치는 경우를 방지하기 위해
				try {
					a = Integer.parseInt(x);
				}
				// 일반적으로 에러가 발생하면 그 밑에줄부터는 실행이안되지않니

				catch (NumberFormatException e) {
					System.out.println("똥탕치지마세요");
					continue;
				}
				// 맞아 문제가 있어 EXIT 가 아닌 이상한 다른 문자열을 치는 이율돈같은 사람이 똥탕을치면 에러가 발생해
			}
//			String y; 
//			for (;;) {
//				System.out.println("나누는 수를 입력하세요.");
//				y = aScanner.nextLine();
//				if (y.equals("0")) { 여기는 입력값을 받을때마다 문자비교연산을 매번한다!
//					System.out.println("0으로는 나눌 수 없습니다.");
//					continue;
//				} else {
//					break;
//				}
//			}
			for (;;) {
				System.out.println("나누는 수를 입력하세요.");

				int b = Integer.parseInt(aScanner.nextLine());

				try {//여기는 나누는수가 0일때만 비교하면된다
					System.out.println(DivisionCalculator.divide(a, b));
					break;
				} catch (RuntimeException e) {
					System.out.println("0은 나누는 수가 될 수 없음!");
					continue;
					//여기는 지역변수를 내보낼필요가없기떄문이다
				}
			}
		}
//스캐너 문법을 잘몰라서 (제대로배운적이 없기때문에) 그냥 입력받는 문자하나당 하나씩 써야하는줄알았는데 아닌가보구나.. 
	}
}

// 왜냐면 c는 정수이고 , a와 b모두 정수이며 / 역시 정수를 연산하는 연산자이기 때문에 멍청한 컴파일러는 계산전까진 이게 오류상황인지
// 알수없다.

class DivisionCalculator {
	static int divide(int a, int b) {

		int c = a / b;
		return c;

		// 처음엔 이렇게 하려고했는데 리턴이 인트형이다보니까 캐치에도 리턴을 해줘야하는데 뭘리턴해줘야할지 모르겠다
	}
}