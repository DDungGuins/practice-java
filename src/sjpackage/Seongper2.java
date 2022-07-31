package sjpackage;

public class Seongper2 {

	public static void main(String[] args) {
		int sug = 58000;
		System.out.println(+sug);//58000
		System.out.println(-sug);//-58000
		System.out.println(sug);//58000
		
		sug = -sug;//sug<--58000
	
		System.out.println(-sug);//+58000
		System.out.println(sug);//-58000
	
		
		//
		int val=3;
		int res1=val+1;
		System.out.println(val);//3
		System.out.println(res1);//4
		int res2=++val;//4
		System.out.println(res2);//4
		System.out.println(val);//4
		int res3=val++;
		System.out.println(res3);//4
		System.out.println(val);//5
		
		
		int x = 5;
		int a = --x + x++ + ++x + x--; 
		//      4 + 4 + 6 + 6
		
		System.out.println(--x);// 5->4
		System.out.println(a++);//20
		System.out.println(a);
		
		int sAge= 19;//관계연산자
		boolean tf;
		tf = (sAge>=19);//명제의 결과를 대입할기야...
		if (tf) {//if명령안에는 논리형 변수가 (True of False)가 들어간다.
			System.out.println("담배팝니다.");
		}else {
			System.out.println("민증가져온나~");
		}
	}//a=2


}
