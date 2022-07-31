package sjpackage;

public class ConditionalOperator {

	public static void main(String[] args) {
		//요구사항
		//조건연산자를 사용해서 몸무게가 70이 넘으면 돼지, 아니면 쥐돌이가 되도록 대입
		
		int wt=80;
		String str=(wt>70)?"돼지":"쥐돌이";
		System.out.println(str);
		
		if(wt>70) {
			System.out.println("돼지");
		}
		else {
			System.out.println("쥐돌이");
		}
	}

}
