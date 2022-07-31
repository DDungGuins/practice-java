package chapter5;

public class Function {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Sachic sachic = new Sachic();

//		Sachic yeonsan = new Sachic();
//		
//		int v=yeonsan.add(70, 6);
//		
//		System.out.print(v);
//		
//		int w=yeonsan.take(70, 5);
//		System.out.print(w);
		
				Sachic yeonsan = new Sachic();
		System.out.println(yeonsan.divide(100, 5));
		
	
		yeonsan.infor("유라라라라");
	}

}

class Sachic {
	int add(int a, int b) {

		return a + b;
	}

	int take(int x, int y) {

		return x - y;
	}

	int time(int a, int b) {
		return a * b;
	}

	int divide(int a, int b) {
		return a / b;
	}

	void infor(String aa) {
		System.out.println(aa+"바보");
				
	}
}