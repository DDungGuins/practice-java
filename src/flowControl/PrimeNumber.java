package flowControl;

import java.util.ArrayList;
import java.util.HashSet;

public class PrimeNumber {

	public static void main(String[] args) {
		// 1���� 100���� ���ڰ� �ּ�
		// �Ҽ��� �ƴ� ���� �� ���Ѵ�. 
		// ���� ���̴� 
		//���ߴ�
		HashSet <Integer> nososu = new HashSet<>();
		
		nososu.add(1);
		for (int i=2; i<=50; i++) {
			for (int j=2; i*j<=100 ;j++) {
				nososu.add(i*j);
			}
			//�� �����Ű���ߴ�....��<-< @_^  ^_@ ���ذ� ����
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
