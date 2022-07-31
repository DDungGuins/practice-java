package jvmDefaultClasses;

public class Stringbuffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyDog dog = new MyDog("멍멍이", "진돗개");
				
		System.out.println(dog);
		//이걸 스트링버퍼로 무얼 하는 기니..
				
	}

}//하긴 했는데 이걸왜했는지 잘모르겠다..

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

