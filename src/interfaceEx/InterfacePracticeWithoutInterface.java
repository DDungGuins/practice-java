package interfaceEx;

public class InterfacePracticeWithoutInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Naver2 sungNN = new Naver2();
		sungNN.viewMailList();
		sungNN.sendmail("이율돈", "이율돈은 바보다");
		System.out.println("=================");
		sungNN.searchWord("Babo");
		sungNN.translation("Bakayarou");
		System.out.println("=================");

		sungNN.viewWebtoon("유라툰");
		sungNN.addComment("유라툰");
		System.out.println("=================");

		System.out.println("좌파성아는 네이버에서 다음으로 갈아탑니다.");
		System.out.println("=================");

		Daum2 sungDD=new Daum2();
		sungDD.listMails(20);
		sungDD.send("이율돈","yrd9494","카드탁");
		System.out.println("=================");

		sungDD.search("Babo","한국어");
		sungDD.translation("Bakayarou","일본어","한국어");

		System.out.println("=================");

		sungDD.getToon("유라툰");
		
	}

}
class Portal {
	//근데 얘내는 메서드 이름 다르게 하라고 하지않았니 그게 여장쿤-직업군인(하사-양주시) / 리델키-하남시 거주 (자동차검사) / 이렐 D(삼성전자 뭐더라 얘도 그 프로그래밍쪽임)
	//탕수고기 (는... 일이 정해지지 않은걸로보아 그냥 이일저일 전전하는듯 하는일이 매번바뀐다......)//
} //그럼 네이버랑 다음은 똑같은 인터페이스 A라는 걸 보고 각자 구현을 하는거니

class Naver2 extends Portal {
	void viewMailList() {
		System.out.println("네이버 메일 목록을 봅니다.");
	}

	void sendmail(String toPerson, String content) {
		System.out.println(toPerson + "에게" + content + "내용의 메일을 보냅니다.");
	}

	void searchWord(String word) {
		System.out.println("네이버 사전에서 " + word + "의 뜻을 검색합니다");
	}

	void translation(String text) {
		System.out.println("네이버파파고로 " + text + "를 번역합니다.");
	}

	void viewWebtoon(String webtoonName) {
		System.out.println("네이버웹툰 " + webtoonName + "을 감상합니다");
	}

	void addComment(String webtoonName) {

		System.out.println("네이버 웹툰 " + webtoonName + "에 불꽃같은 일침댓글을 작성합니다");
	}
}

class Daum2 extends Portal {
	void listMails(int countMail) {

		System.out.println(countMail + "개의 이메일을 목록에서 불러옵니다.");
	}

	void send(String toPerson, String toMail, String content) {
		System.out.println("주소: " + toMail + ", 받는사람: " + toPerson + "에게 " + content + "라는 메일을 작성합니다.");
	}

	void search(String word, String language) {
		System.out.println(word + "를 " + language + "사전에서 찾습니다.");
	}

	void translation(String text, String sourceLang, String TargetLang) {
		System.out.println("번역 전 언어: " + sourceLang);
		System.out.println("번역할 문장: " + text);
		System.out.println("번역할 언어: " + TargetLang);
	}

	void getToon(String name) {
		System.out.println("웹툰 " + name + "을 봅니다.");
	}
}

//class SJsInternetSurfing {
//	 void surf(){
//	   //구현할 내용
//	    }
