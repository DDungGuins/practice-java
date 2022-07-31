package interfaceEx;

public class InterfacePractice {

	public static void main(String[] args) {
		// 네이버 클래스랑 다음 클래스를 상위 클래스인 포탈사이트 클래스를 만들어서 상속했어..
		// 난 성아의 인터넷생활이라는 메소드를 두번 반복해서 썼었으나, 네이버와 다음을 포탈사이트로 상속을 시켜줬기때문에 매개변수를
		// PortalSite로 통일 시켜줄 수 있어서 메소드를 하나만 만들어도 됐어..
		// 난 왜 인터페이스를 썼는지 도통 이해할 수 없어.....

//		
//		Naver sungN =new Naver(); 
//		sungN.viewMailList();
//		sungN.sendmail("이율돈");
//		System.out.println("=================");
//		sungN.searchWord("Babo");
//		sungN.translation("Bakayarou");
//		System.out.println("=================");
//
//		sungN.viewWebtoon("유라툰");
//		sungN.addComment("유라툰");
//		System.out.println("=================");
//
//		System.out.println("좌파성아는 네이버에서 다음으로 갈아탑니다.");
//		System.out.println("=================");
//
//		Daum sungD=new Daum();
//		sungD.viewMailList();
//		sungD.sendmail("이율돈");
//		System.out.println("=================");
//
//		sungD.searchWord("Babo");
//		sungD.translation("Bakayarou");
//
//		System.out.println("=================");
//
//		sungD.viewWebtoon("유라툰");
//		sungD.addComment("유라툰");
//		

		
		SJsInternetSurfing.surf(new Naver());
		System.out.println("좌파성아는 네이버에서 다음으로 갈아탑니다.");
		SJsInternetSurfing.surf(new Daum());

	}

}

interface Mailing {
	void viewMailList();

	void sendmail(String toPerson);
}

interface Dictionary {
	void searchWord(String word);

	void translation(String text);
}

interface WebtoonService {
	void viewWebtoon(String webtoonName);

	void addComment(String webtoonName);
}

class PortalSite implements Mailing, Dictionary, WebtoonService  {
	public void viewMailList() {
		System.out.println("메일 목록을 봅니다.");
	}
	
	public void sendmail(String toPerson) {
		System.out.println(toPerson + "에게 메일을 보냅니다.");
	}
	
	public void searchWord(String word) {
		System.out.println("사전에서 " + word + "의 뜻을 검색합니다");
	}

	public void translation(String text) {
		System.out.println(text + "를 번역합니다.");
	}

	public void viewWebtoon(String webtoonName) {
		System.out.println(webtoonName + "을 감상합니다");
	}

	public void addComment(String webtoonName) {
		System.out.println(webtoonName + "에 불꽃같은 일침댓글을 작성합니다");

	}

}

class Naver extends PortalSite {
	public void viewMailList() {
		System.out.print("네이버");super.viewMailList();
		
	}

	public void sendmail(String toPerson) {
		System.out.print("네이버이메일로 ");super.sendmail(toPerson);
	}

	public void searchWord(String word) {
		System.out.print("네이버");super.searchWord(word);
	}

	public void translation(String text) {
		System.out.print("네이버 파파고로 " );super.translation(text);
	}

	public void viewWebtoon(String webtoonName) {
		System.out.print("네이버 웹툰 "); super.viewWebtoon(webtoonName);
	}

	public void addComment(String webtoonName) {
		System.out.print("네이버 웹툰 "); super.addComment(webtoonName);
	}
//이게맞니....
}

class Daum extends PortalSite{

	public void sendmail(String toPerson) {
		System.out.print("다음이메일로 ");super.sendmail(toPerson);
	}

	public void searchWord(String word) {
		System.out.print("다음");super.searchWord(word);
	}

	public void translation(String text) {
		System.out.print("카카오AI로 " );super.translation(text);
	}

	public void viewWebtoon(String webtoonName) {
		System.out.print("다음 만화 속 세상 "); super.viewWebtoon(webtoonName);
	}

	public void addComment(String webtoonName) {
		System.out.print("다음 만화 속 세상  "); super.addComment(webtoonName);
	}

}//내가 그럴깜냥이되니.. ...잘모르겠어....................................?

class SJsInternetSurfing {
	static void surf(PortalSite site) {
		
		Mailing mail = site; 
		mail.viewMailList();
		mail.sendmail("이율돈");
		System.out.println("=================");
		Dictionary dictionary = site;
		dictionary.searchWord("babo");
		dictionary.translation("bakayarou");
		System.out.println("=================");
		WebtoonService webtoonservice = site;
		webtoonservice.viewWebtoon("이율돈의 일진생활");
		webtoonservice.addComment("이율돈을 막아라");
		System.out.println("=================");
	}
}