package sjpackage;

public class BitOperation {

	public static void main(String[] args) {
		int num1 = 6;
		// 00000000 00000000 00000000 00000110
		int num2 = 10;
		// 00000000 00000000 00000000 00001010
		
		// ����                                                    00000000  
		int result1 = num1&num2;
		System.out.println(result1);		
		
		// ����                                                    00001111
		int result2 = num1|num2;
		System.out.println(result2);
		// ��Ÿ�� �� �� (XOR) 00001100
		System.out.println(num1^num2);//12
		System.out.println(~num1);//11111111 11111111 11111111 11111001  -7
								 
	}

}
