package arrayEx;

public class ArrayCopy {

	public static void main(String[] args) {
		//

		int a = 3;
		Student[] hakS = new Student[10];

		for (int i = 0; i < hakS.length; i++) {
			hakS[i] = new Student();
			hakS[i].name = "�л�" + (i + 1);
//			System.out.println(hakS[i].name);
//			System.out.println(hakS); //
//			System.out.println(hakS[i]);//�迭 �� ������ �ּҰ�
//		
		}

		Student[] haKKs = new Student[13];

		// �䱸����:3���� ������ �Դ�.
//		hakS [10] = new Student();//�ڱ׷� �غ��ô�...
//		hakS [11] = new Student();
//		hakS [12] = new Student();
//		hakS[10].name = "�л�11";
//		hakS[11].name = "�л�12";
//		hakS[12].name = "�л�13";
//		for (int i=0; i<hakS.length; i++) {
//			System.out.println(hakS[i].name);
//	}
		System.arraycopy(hakS, 0, haKKs, 0, 10);
//�迭�� ���� �ű���� ���ε�� �����Ѵ�.		
		haKKs [10] = new Student();//�ڱ׷� �غ��ô�...
		haKKs [11] = new Student();
		haKKs [12] = new Student();
		haKKs[10].name = "�л�11";
		haKKs[11].name = "�л�12";
		haKKs[12].name = "�л�13";

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
