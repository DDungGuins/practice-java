package flowControl;

public class Q2 {

	public static void main(String[] args) {
		// 짝수단만 출력하세요

		for (int i = 2; i <= 9; i+=2) {
			
			System.out.println(i + "단 계산 시작");

			for (int j = 1; j <= 9; j++) {
				System.out.println(i + "x" + j + "=" + i * j);
			}

		}

	}

}
