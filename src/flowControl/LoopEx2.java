package flowControl;

public class LoopEx2 {

	public static void main(String[] args) {
		// 1~100숫자가있다
		//1번문제 : 1~100숫자중 5의 배수를 제외한 나머지 수를 모두 더하라
		//2번문제 : 1~100까지 순차적으로 더하는데 한 수를 더했을 때, 그 결과의  일의자리수가 3의 배수면 그 수는 더하지 않기
		// 맞니 문제 
		
		int sum=0;
		for (int i=0 ; i<=100;i++) {
			if (i%5==0) {
				continue;
			}
			sum+=i;
			
		}
		//그니까 예를들어 1+2를 해야하는 차례면 1+2=3이니까 그건 스킵하고 1+3을 하는거니
		
		System.out.println(sum);
		
		int sum2=0;
		for (int i=0; i<=100; i++) {
			if(sum2+i%10%3==0) {
				continue;
			}
			else sum2+=i;
		}
		System.out.println(sum2);

	}

	
	
		
}
