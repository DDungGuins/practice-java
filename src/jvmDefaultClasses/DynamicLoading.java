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
		System.out.println("�ʵ��б� �غ�");
	}
	String name;
	int schNum;

	static void jammin() {
		System.out.println("���� ����̴�.");
	}
}

class Mschool {
	static {
		System.out.println("���б� �غ�");
	}
	String name;
	int schNum;
}

class Hschool {
	static {
		System.out.println("����б� �غ�");
	}
	String name;
	int schNum;
}