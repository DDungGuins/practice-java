package arrayEx;

public class ArrayHomework230_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] evenNum = new int[5];
		
		for (int i = 0 ; i<evenNum.length; i++) {
			evenNum[i] = 2*i+2;
		}
		
		int sum=0
				;
		for (int i = 0 ; i<evenNum.length; i++) {
			  sum += evenNum[i];
		
		}
		
		
		System.out.println(sum);
		
	}

}
