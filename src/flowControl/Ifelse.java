package flowControl;

public class Ifelse {

	public static void main(String[] args) {
		// 성아의 시간표
		// 성아는 5시부터 14시까지 잡니다.
		// 성아는 14시부터 22시까지 메이플을 합니다.
		// 성아는 22시부터 24시까지 공부를 합니다.
		// 그 외의 시간에 성아는 뉘어있습니다.
		// 하나의 변수에 시간을 지정해서 해당의 시간에 성아의 행위를 출력하라.

		int time = 16;
		System.out.println("성아는 무엇을 하고 있니?");
		if (time >= 5 && time < 14) {
			System.out.println("zZZ쿨쿨쿨");
		} else if (time >= 14 && time < 22) {
			System.out.println("리스트레인트 링 4레벨");
		} else if (time >= 22 && time < 24) {

			System.out.println("후로그라밍구");
		} else {
			System.out.println("ㅇ<-<");
		}
	}
}
