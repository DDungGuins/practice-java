package sjpackage;

public class Jevibbobgi {

	public static void main(String[] args) {
//1~3000억번 중의 학생을 한명 뽑아서 그 학생의 뒷번호가 3이라면 수업이 끝난다.
		int stu=4458613;//0은 임시로..
		int stu2 = stu%10;//stu를 10으로 나눈 나머지를 stu에 대입하라 
		if(stu2==3) {//만약 stu가 3이면 수업끝을, 아니라면 책펴라를 출력하라
			System.out.println("수업끝");
		} else {
			System.out.println("책펴라");
		}
	
	}

}
//이건 아주 대단한거