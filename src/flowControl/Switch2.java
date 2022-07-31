package flowControl;

public class Switch2 {

	public static void main(String[] args) {
		// 기본타입이 아니니... 대문자를 써라
		// 리스트레인트링을 먹고 스위치 케이스를 이용해 문자열이 출력되는 조건문을 작성하라.
		// 문자열 종류 : LV4, LV3, LV2, LV1 그리고 안나옴......에 따른 기분을 출력하라
		String rest = "경험치 쿠폰 3장";

		switch (rest) {

		case "LV4": // 리터럴......
			System.out.println("리스트레인트링 " + rest + " 먹어서 기분좋다");
			break;

		case "LV3":
			System.out.println("리스트레인트링 " + rest + " 너무 아깝다...");
			break;

		case "LV2":
			System.out.println("리스트레인트링 " + rest + " 아... 왜 이게 또나오냐");
			break;

		case "LV1":
			System.out.println("리스트레인트링" + rest + " 이젠 아깝지도 않다.");
			break;

		default:
			System.out.println("왜 아무것도 안나옴?");

		}

	}

}
