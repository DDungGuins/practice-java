package flowControl;

import chapter5.JohoKakusi;

public class Diamond {

	public static void main(String[] args) {
		// ....け (414)
		// ...けけけ (333)
		// ..けけけけけ (252)
		// .けけけけけけけ (171)
		// けけけけけけけけけ (090)
		// .けけけけけけけ (171)
		// ..けけけけけ (252)
		// ...けけけ (333)
		// ....け (414)

		// ....け 41
		// ...けけ32
		// ..けけけ23
		// .けけけけ41
		// けけけけけ50
		//
		
		int a;
		for (a= 1; a <= 5; a++) {
			for (int b = 1; b <= 5 - a; b++) {
				System.out.print(".");
			}
			for (int c = 1; c <= a + a - 1; c++) {
				System.out.print("け");
			}
			for (int d = 1; d <= 5 - a; d++) {
				System.out.print(".");
			}
			System.out.println("");
		}
		
		int aa;
		for ( aa = 1; aa <= 4; aa++) {
			for ( int bb = 1; bb <= aa; bb++) {
				System.out.print(".");
			}
			for (int cc = 1; cc <= 9-aa-aa; cc++) {
				System.out.print("け");
			}
			for (int dd = 1; dd <= aa; dd++) {
				System.out.print(".");
			}
			System.out.println("");
		}
		
		
		

//		int a;
//		for (a = 1; a <= 5; a++) {
//			for (int b = 1; b <= 5 - a; b++) {
//				System.out.print(".");
//			}
//			for (int c = 1; c <= a; c++) {
//				System.out.print("a");
//			}
//			System.out.println("");
//
//		}

		/*
		 * ....a ...aa ..aaa .aaaa
		 * 
		 * ..... ..... ..... ..... .....
		 * 
		 * 
		 * 
		 */

//		int a;
//		for (a = 1; a <= 5; a++);{
//			
//			do System.out.print('y');
//			while (5-a=4)
//				
//			}
//			System.out.print(5 - a);
//
//			System.out.print(a + a - 1);
//
//			System.out.println(5 - a);
//		}
//
//		int b;
//		for (b = 1; b <= 4; b++)
//			;
//		{
//			System.out.print(b);
//
//			System.out.print(9 - b - b);
//
//			System.out.println(b);
//		}
//
////		char x = 'け';
////		char y = ' ';
//		int a;
//		int b;
//		int c;
//
//		for (a = 4; a >= 0; a--) {
//			System.out.print(y);
//		}
//		for (b = 1; b <= 9; b = b + 2) {
//			System.out.print(b);
//		}
//
//		for (c = 4; c >= 0; c--) {
//			System.out.print(c);
//		}
	}

}
