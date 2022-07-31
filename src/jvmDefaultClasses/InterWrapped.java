package jvmDefaultClasses;

public class InterWrapped {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer number1 = Integer.valueOf("100");
		Integer number2 = 100;
		System.out.println(number1.equals(number2));
		
		int ppp = Integer.parseInt("10°³");
		System.out.println(ppp);
		
	}

}
