package arrayEx;

public class HomeWork230 {

	public static void main(String[] args) {
		// 2 0 6����I ���ĺ� ��� �������� �� �迭 ��� ���� �ҹ��ڿ��� �빮�ڷ� ��ȯ�� ����ϼ���

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
