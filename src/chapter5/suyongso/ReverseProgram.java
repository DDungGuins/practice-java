package chapter5.suyongso;

public class ReverseProgram {

	public static void main(String[] args) {
		Student student1 = new Student() ; //ù ��° �л� ����
		student1. studentName = "�ȿ��� " ;
		System.out.println(student1.getStudentName()) ; 
		Student student2 = new Student( ) ; // �� ��° �л� ����
		student2.studentName = "�Ƚ¿� ";
		System.out.println(student2. getStudentName()) ;

		
	}

}



class Student {
	
	String studentName;
	int ki;
	int mom;
	
	int bmi () {
		
		int bmi =(ki+mom)/2;
		return bmi;
	}
	
	
	String getStudentName() {
		
		return studentName; 
	}
	
	//bmi = (������ + Ű)/2
	
}
