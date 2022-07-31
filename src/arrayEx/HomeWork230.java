package arrayEx;

public class HomeWork230 {

	public static void main(String[] args) {
		// 2 0 6쪽으I 알파벳 출력 예제에서 각 배열 요소 값을 소문자에서 대문자로 변환해 출력하세요

		char [] alpha = new char [26];
		char ch= 'A';
		
		for (int i=0; i<alpha.length ; i++) {
			alpha[i]= (char) (ch+i+32);
		}
		
//		for (int i=0; i<alpha.length ; i++) {
//			alpha[i]= (char) (ch+i);
//		}
		
		for(int i=0; i<alpha.length ; i++) {
			System.out.println(alpha[i]+","+(int)alpha[i]);
		}
		
	}

}
