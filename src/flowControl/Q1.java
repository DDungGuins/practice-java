package flowControl;

public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1 = 10;
		int num2 = 2;
		char ope = 'd';

//		if (ope == '+') {
//			System.out.println(num1 + num2);
//		} else if (ope == '-') {
//			System.out.println(num1 - num2);
//		} else if (ope == '*') {
//			System.out.println(num1 * num2);
//		} else if (ope == '/') {
//			System.out.println(num1 / num2);
//		} else
//			System.out.println("error");

		switch (ope) {

		case '+': case 'p': {
			System.out.println(num1 + num2);
			break;
		}
		case '-': case 'm': {
			System.out.println(num1 - num2);
			break;
		}
		case '*': case 't': {
			System.out.println(num1 * num2);
			break;
		}
		case '/': case 'd': {
			System.out.println(num1 / num2);
			break;
		}

		default: {
			System.out.println("error");
		}

		}

	}
}
