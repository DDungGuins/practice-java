package chapter5.staticEx;

public class StaticSukje {

	public static void main(String[] args) {
		/*
		 * 메이플 인벤사이트가 있다. 공지사항이 올라왔다. 회원중에서는 유라섬 델키 여장 탕수고기 이렐D가 있다 그리고 저 5명과 이름모를 3명이
		 * 공지사항을 읽었다. 회원은 모두 공지사항을 읽는 기능이 있으며 읽을 때 마다 공지사항의 조회수가 1씩 올라간다. 이거를 구현해라.ㅋ
		 */
		Member yrs = new Member("유라섬");
		Member delki = new Member("리델키");
		Member yjk = new Member("여장남자전사");
		Member tsgg = new Member("탕수고기");
		Member irD = new Member("이렐D");
		Member nyo = new Member("는요");

		Gongzi gzsh = new Gongzi("필독게시글");

		yrs.viewGongzi(gzsh);
		delki.viewGongzi(gzsh);
		yjk.viewGongzi(gzsh);
		tsgg.viewGongzi(gzsh);
		irD.viewGongzi(gzsh);
		nyo.viewGongzi(gzsh);

		Member zap1 = new Member("지나가는사람1");
		Member zap2 = new Member("지나가는사람2");
		Member zap3 = new Member("지나가는사람3");

		
		zap1.viewGongzi(gzsh);
		zap2.viewGongzi(gzsh);
		zap3.viewGongzi(gzsh); 		}

	}

// 메모리상에 올라가야한다

class Member {
	int memNum;
	static int memNumSer = 0; //이거는 숙제내용은 아닌데 그냥 회원번호도 스태틱으로 1씩 늘어나게 만든 거다
	private String id;

	public String getId() {
		return id;
	}

	public void setId(String id) {

		this.id = id;
	}

	Member(String id) {
		memNum = memNumSer;
		memNumSer++;
		this.id = id;
	}

	void viewGongzi(Gongzi gongzi) {
		Gongzi.zohwosuSer++;
		gongzi.zohwosu = Gongzi.zohwosuSer;
		System.out.println(this.id+"님께서 "+gongzi.gongName+"을 읽었습"
				+ "니다.");
		System.out.println(gongzi.gongName+"의 조회수는 현재 "+gongzi.zohwosu+"입니다.");

	}

}

class Gongzi {
	String gongName;
	int gongNum;
	int zohwosu;
	static int gonNumSer = 0; //Serial
	static int zohwosuSer = 0;

	Gongzi(String gongName) {
		this.gongName = gongName;
	}
}
