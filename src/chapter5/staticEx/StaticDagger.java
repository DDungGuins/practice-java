package chapter5.staticEx;

public class StaticDagger {

	public static void main(String[] args) {
		/* 숙제: 이 수대딕의 성질을 사용하여 학번을 일일이 지정하지 않고 1씩 증가시키면서 각 학생들한테 부여할 수 있다......?
  		 * 이 방식으로 뚱귄 콩귄 찰귄 펭수를 입학 시켜보거라
		 * 
		 * 
		 * 
		 * 학생 성쟁 , 유쟁, 배쳐 가 있다 뚱귄교대 출신이다. 입학한 순서대로 하나씩 학번이 부여된다 뚱귄스투던트라는 엔티티에 여러 속성이 있다.
		 * 근데 인스턴스를 생성하지 않고 접근할 수 있을까.....? 무슨말인지잘모르겟다
		 */
		DgStudent sj = new DgStudent("성쟁");
		DgStudent yr = new DgStudent("유돌");
		DgStudent bc = new DgStudent("배쳐");
		DgStudent dg = new DgStudent("뚱귄");
		DgStudent kg = new DgStudent("콩귄");
		DgStudent cg = new DgStudent("찰귄");
		DgStudent ps = new DgStudent("펭수");
		
		sj.jagisogae();
		yr.jagisogae();
		bc.jagisogae();
		dg.jagisogae();
		kg.jagisogae();
		cg.jagisogae();
		ps.jagisogae();

//		// 성쟁이가 다니는 학교이름이 바꼈다. 그러면 배쟁이가 다니는 학교 이름은?
//		sj.schoolName="콩귄학교";
//		System.out.println(bc.schoolName);
		// 스태틱은.. 정적이란 뜻이다 (모든 객체가 마치 한몸인양 공유한다)
	}
}

class DgStudent {
	static int saengsung = 0;
	int stuNo;
	String name;
	static String schoolName = "뚱귄학교";

	DgStudent(String name) {
		this.name = name;
		stuNo=saengsung;
		saengsung++;
	}

	DgStudent() {

	}

	void jagisogae() {
		System.out.println("난" + this.stuNo+"번" +this.name + "이다.");
	}

	// 속성에는 이름 학번 출신학교이름다시

}