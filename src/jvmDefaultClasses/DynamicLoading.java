package jvmDefaultClasses;

public class DynamicLoading {

	public static void main(String[] args) throws ClassNotFoundException {
		// TODO Auto-generated method stub

//		Class<?> ddunggin= Class.forName("jvmDefaultClasses.Eschool");
		Class<?> chalgin = Class.forName("jvmDefaultClasses.Mschool");
		Class<?> konggin = Class.forName("jvmDefaultClasses.Hschool");
		Eschool.jammin();
	}

}

class Eschool {
	static {
		System.out.println("초등학교 준비");
	}
	String name;
	int schNum;

	static void jammin() {
		System.out.println("나는 잼민이다.");
	}
}

class Mschool {
	static {
		System.out.println("중학교 준비");
	}
	String name;
	int schNum;
}

class Hschool {
	static {
		System.out.println("고등학교 준비");
	}
	String name;
	int schNum;
}