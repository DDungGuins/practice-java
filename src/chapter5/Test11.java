package chapter5;

public class Test11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Abc abc=new Abc();
		int d =abc.sum(2,(abc.sum(1,2)));
		
	}

}

class Abc {	
	int sum (int a, int b) {
		int v=a+b;
		return v;
	}
}
