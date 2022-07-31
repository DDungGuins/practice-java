package jvmDefaultClasses;

public class JVMtoString357 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student = new Student();
		student.name="±è¹Ùº¸";
		student.stuNum=12;
		System.out.println(student.toString());
				
	}

}

class Student {
	int stuNum;
	String name;
	
	public String toString () {
		return name+stuNum;
	}
	
}