package sjpackage;

public class Logical {

	public static void main(String[] args) {
		//성쟁뷔페가 있다.나이가 9세 이하 Or 65세 이상 이면 돈을 반값만 받는다.
		//당신은 할인 대상인가?
		int age=50000; //너의 나이는 몇살입니까?
		boolean waribiki=(age<=9||age>=65); //9세 이하 또는 65세 이상이냐? 라는 논리합을 waribiki에다가 대입한다(와라비끼는 논리형 변수니까)
		if (waribiki) {//만약 와리비끼 변수가 참이라면 (9세이하, 65세이상) 이라면->반값 
			System.out.println("반값만 주이소");
		}else {
			System.out.println("돈 가져온나");//아니라면 넌 돈을 내야합니다.
		}
	}//30세니까 돈을 가져와야겠죠?

}
