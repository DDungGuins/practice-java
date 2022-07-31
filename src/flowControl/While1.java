package flowControl;

public class While1 {

	public static void main(String[] args) {
		// 반복문을 써서 1부터 100까지 곱하기
		// 49는 곱하지말고 건너뛰어라
		// 80~100 breakpoint를 정해서 거기서 끝나게????????????????????해보자
		long gop = 1; // 결과값
		long var = 1;
		long bk = 6;
	
		
		while (var < 100) {
			if (var == 49) {
//				gop = gop / 49;
				var++;
				continue;//한번의 반복을 스킵한다
			}
			if (var==bk) break;
			var += 1;
			gop = gop * var; 
		} 
		
		
		System.out.println(gop);

		// (1,1),(1*2,2),(1*2*3,3),(1*2*3*4*,4)...(1*2*3*4*...*48,48),
		// (1*2*3*...*49,49),(1*2*3*...*48,49)
		// (1*2*3*...*48*50,50),(1*2*3*...*48*50*51,51)
		// (1*2*3*4.*48*50*51*..98*99,99),(1*2*3*.*48*50*51..100,100)

	}

}
