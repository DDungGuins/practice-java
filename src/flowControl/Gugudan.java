package flowControl;

public class Gugudan {

	public static void main(String[] args) {
		// 2단에서 9단까지 구구단 출력
		// - 2단 시작 -
		// 2 x 1 = 2
		// 2 x 2 = 4
		// ...
		// 2 x 9 = 18
		// - 3단 시작 -
		// 3 x 1 = 3
		// ...
		// 9 x 9 = 81

		int dan;

		for (dan = 9; dan >= 2; dan--) {
			System.out.println("-" + dan + "단 시작 -");
			for (int gop = 9; gop >= 1; gop--) {
				System.out.println(dan + "x" + gop + "=" + dan * gop);

			}

		}
	}
}

//-2단 시작-
// 2x1=2*1 2x2=2*2 ...2x8=16,2*9=18
// -3단시작-
// 