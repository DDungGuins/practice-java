package flowControl;

public class DoWhile {

	public static void main(String[] args) {
		// 성아는 밥을 먹습니다.
		// 밥은 상했을 수도 있고 안 상했을 수 도 있습니다.
		// 안 상한 밥을 먹었다면 살아남을 것이고, 상한 밥을 먹었다면 아야 할 것입니다.
		// 그런데 178번째로 먹은 밥은 무조건 상했습니다.
		// 성아는 이제 아프기 때문에... 밥 먹는걸 멈추고 병원을 가야합니다.
		// 조건1: 반복문의 조건식으로 sungAisSuv 활용한다.

		boolean sungAisSuv;
		int tab = 0;
		final int DOK = 178;

		// do while사용시
		do {
			tab++;
			System.out.println("성아는 " + tab + "번째 밥을 먹었다.");

			if (tab == DOK) {
				sungAisSuv = false;
			} else {
				sungAisSuv = true;
			}
		}

		while (sungAisSuv);
		System.out.println("병원가야지");

		// while 사용시
//		while (sungAisick == false) {
//			if (tab == DOK) {
//				sungAisSick = true;
//				continue;
//			}
//			tab++;
//			System.out.println("성아는 "+tab+"번째 밥을 먹었다.");
//		}
//		if (sungAisSick == true)
//			System.out.println("병원가야지");
//		else
//			System.out.println("배부르다.");

	}
}
