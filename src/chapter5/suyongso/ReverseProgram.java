package chapter5.suyongso;

public class ReverseProgram {

	public static void main(String[] args) {
		Student student1 = new Student() ; //첫 번째 학생 생성
		student1. studentName = "안연수 " ;
		System.out.println(student1.getStudentName()) ; 
		Student student2 = new Student( ) ; // 두 번째 학생 생성
		student2.studentName = "안승연 ";
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
	
	//bmi = (몸무게 + 키)/2
	
}
