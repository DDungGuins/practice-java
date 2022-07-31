package interfaceEx;

public class InterfacePractice {

	public static void main(String[] args) {
		// ���̹� Ŭ������ ���� Ŭ������ ���� Ŭ������ ��Ż����Ʈ Ŭ������ ���� ����߾�..
		// �� ������ ���ͳݻ�Ȱ�̶�� �޼ҵ带 �ι� �ݺ��ؼ� �������, ���̹��� ������ ��Ż����Ʈ�� ����� ������⶧���� �Ű�������
		// PortalSite�� ���� ������ �� �־ �޼ҵ带 �ϳ��� ���� �ƾ�..
		// �� �� �������̽��� ����� ���� ������ �� ����.....

//		
//		Naver sungN =new Naver(); 
//		sungN.viewMailList();
//		sungN.sendmail("������");
//		System.out.println("=================");
//		sungN.searchWord("Babo");
//		sungN.translation("Bakayarou");
//		System.out.println("=================");
//
//		sungN.viewWebtoon("������");
//		sungN.addComment("������");
//		System.out.println("=================");
//
//		System.out.println("���ļ��ƴ� ���̹����� �������� ����ž�ϴ�.");
//		System.out.println("=================");
//
//		Daum sungD=new Daum();
//		sungD.viewMailList();
//		sungD.sendmail("������");
//		System.out.println("=================");
//
//		sungD.searchWord("Babo");
//		sungD.translation("Bakayarou");
//
//		System.out.println("=================");
//
//		sungD.viewWebtoon("������");
//		sungD.addComment("������");
//		

		
		SJsInternetSurfing.surf(new Naver());
		System.out.println("���ļ��ƴ� ���̹����� �������� ����ž�ϴ�.");
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
		System.out.println("���� ����� ���ϴ�.");
	}
	
	public void sendmail(String toPerson) {
		System.out.println(toPerson + "���� ������ �����ϴ�.");
	}
	
	public void searchWord(String word) {
		System.out.println("�������� " + word + "�� ���� �˻��մϴ�");
	}

	public void translation(String text) {
		System.out.println(text + "�� �����մϴ�.");
	}

	public void viewWebtoon(String webtoonName) {
		System.out.println(webtoonName + "�� �����մϴ�");
	}

	public void addComment(String webtoonName) {
		System.out.println(webtoonName + "�� �Ҳɰ��� ��ħ����� �ۼ��մϴ�");

	}

}

class Naver extends PortalSite {
	public void viewMailList() {
		System.out.print("���̹�");super.viewMailList();
		
	}

	public void sendmail(String toPerson) {
		System.out.print("���̹��̸��Ϸ� ");super.sendmail(toPerson);
	}

	public void searchWord(String word) {
		System.out.print("���̹�");super.searchWord(word);
	}

	public void translation(String text) {
		System.out.print("���̹� ���İ�� " );super.translation(text);
	}

	public void viewWebtoon(String webtoonName) {
		System.out.print("���̹� ���� "); super.viewWebtoon(webtoonName);
	}

	public void addComment(String webtoonName) {
		System.out.print("���̹� ���� "); super.addComment(webtoonName);
	}
//�̰Ը´�....
}

class Daum extends PortalSite{

	public void sendmail(String toPerson) {
		System.out.print("�����̸��Ϸ� ");super.sendmail(toPerson);
	}

	public void searchWord(String word) {
		System.out.print("����");super.searchWord(word);
	}

	public void translation(String text) {
		System.out.print("īī��AI�� " );super.translation(text);
	}

	public void viewWebtoon(String webtoonName) {
		System.out.print("���� ��ȭ �� ���� "); super.viewWebtoon(webtoonName);
	}

	public void addComment(String webtoonName) {
		System.out.print("���� ��ȭ �� ����  "); super.addComment(webtoonName);
	}

}//���� �׷������̵Ǵ�.. ...�߸𸣰ھ�....................................?

class SJsInternetSurfing {
	static void surf(PortalSite site) {
		
		Mailing mail = site; 
		mail.viewMailList();
		mail.sendmail("������");
		System.out.println("=================");
		Dictionary dictionary = site;
		dictionary.searchWord("babo");
		dictionary.translation("bakayarou");
		System.out.println("=================");
		WebtoonService webtoonservice = site;
		webtoonservice.viewWebtoon("�������� ������Ȱ");
		webtoonservice.addComment("�������� ���ƶ�");
		System.out.println("=================");
	}
}