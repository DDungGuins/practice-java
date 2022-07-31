package exception;

import java.util.ArrayList;

public class CustomException {

	public static void main(String[] args) {
		// 피크닉 클래스 에는 피크닉(소풍을 가는 메서드)이라는 메서드가 있다.
		// 내부적으로 피크닉을 갈 사람을 정하는 join(사람모으는 메서드)이라는 메서드가 잇다
		// 그런데, 성아와 김춘복이 같이있으면 이건 예외 상황이다.

		Picnic sybPicnic = new Picnic();

		sybPicnic.join("율쟁");
		sybPicnic.join("배쟁");
		sybPicnic.join("성아");
		sybPicnic.join("뚱귄");

		sybPicnic.goPicnic();
		sybPicnic.join("춘복");// ㅗㅗ
		sybPicnic.goPicnic(); // 프로그램 자체적으로 불가능한상황은 아니지만, 논리적으로 성쟁에겐 불가능한 (예외) 상황이다.

	}

}//

class Picnic {
	private ArrayList<String> picnicers = new ArrayList<>();

	void join(String picnicer) {
		picnicers.add(picnicer);
		System.out.println(picnicer + "이/가 합류했습니다.");
	}

	void goPicnic() {
		// 예를들어 춘복과 성아가 같이있는 상황이 발생시, 새로운 예외를 발생throw 시켜야한다
		try {
			if (picnicers.contains("성아") && picnicers.contains("춘복")) {

				throw new SungChunException("성아와 춘복은 함께할 수 없다.");
			}
			else {
				System.out.println(picnicers + "들이 즐거운 소풍을 갑니다.");

			}
		}

		catch (SungChunException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}

class SungChunException extends Exception {
	SungChunException() {
	}

	SungChunException(String message) {
		super(message);
	}

}