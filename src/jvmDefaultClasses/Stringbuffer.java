package jvmDefaultClasses;

public class Stringbuffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyDog dog = new MyDog("�۸���", "������");
				
		System.out.println(dog);
		//�̰� ��Ʈ�����۷� ���� �ϴ� ���..
				
	}

}//�ϱ� �ߴµ� �̰ɿ��ߴ��� �߸𸣰ڴ�..

class MyDog{
	String name;
	String type;
	
	MyDog (String name, String type) {
		this.name = name;
		this.type = type;
		
	}

	
	public String toString () {
		StringBuffer buffer = new StringBuffer(this.type);
		buffer.append(" ");
		buffer.append(this.name);
		
		return buffer.toString();
	}
}

