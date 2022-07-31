package flowControl;

public class Q3 {

	public static void main(String[] args) {
		// 짝수단만 출력하세요

		for (int i = 2; i <= 9; i++) {
			
			System.out.println(i + "단 계산 시작");

			for (int j = 1; j <= 9; j++) {
				System.out.println(i + "x" + j + "=" + i * j);
				if (j>=i) break;

			}

		}

	}

}
