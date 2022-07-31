package arrayEx;

public class ArrayCopy {

	public static void main(String[] args) {
		//

		int a = 3;
		Student[] hakS = new Student[10];

		for (int i = 0; i < hakS.length; i++) {
			hakS[i] = new Student();
			hakS[i].name = "학생" + (i + 1);
//			System.out.println(hakS[i].name);
//			System.out.println(hakS); //
//			System.out.println(hakS[i]);//배열 속 원소의 주소값
//		
		}

		Student[] haKKs = new Student[13];

		// 요구사항:3명이 전학을 왔다.
//		hakS [10] = new Student();//자그럼 해봅시다...
//		hakS [11] = new Student();
//		hakS [12] = new Student();
//		hakS[10].name = "학생11";
//		hakS[11].name = "학생12";
//		hakS[12].name = "학생13";
//		for (int i=0; i<hakS.length; i++) {
//			System.out.println(hakS[i].name);
//	}
		System.arraycopy(hakS, 0, haKKs, 0, 10);
//배열은 이제 옮기려면 짐싸들고 가야한다.		
		haKKs [10] = new Student();//자그럼 해봅시다...
		haKKs [11] = new Student();
		haKKs [12] = new Student();
		haKKs[10].name = "학생11";
		haKKs[11].name = "학생12";
		haKKs[12].name = "학생13";

		for (int j = 0; j < haKKs.length; j++) {
			System.out.println(haKKs[j].name);
		}
		System.out.println(haKKs.length);
		
		
	}
}

class Student {
	int stuNum;
	String name;

}
