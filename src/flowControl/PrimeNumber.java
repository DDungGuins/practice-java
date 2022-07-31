package flowControl;

import java.util.ArrayList;
import java.util.HashSet;

public class PrimeNumber {

	public static void main(String[] args) {
		// 1부터 100까지 숫자가 있소
		// 소수가 아닌 수를 다 더한다. 
		// 문제 끝이니 
		//다했다
		HashSet <Integer> nososu = new HashSet<>();
		
		nososu.add(1);
		for (int i=2; i<=50; i++) {
			for (int j=2; i*j<=100 ;j++) {
				nososu.add(i*j);
			}
			//넌 뭐얼시키려했니....ㅇ<-< @_^  ^_@ 성팽과 유팽
		}
		ArrayList <Integer> nososu2 = new ArrayList<>(nososu);
		System.out.println(nososu2);

		int sum=0;
		for (int i=0; i<nososu2.size();i++) {
			sum=sum+nososu2.get(i);
		}
		System.out.println(sum);
	}

}
