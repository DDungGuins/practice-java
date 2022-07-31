package interfaceEx;

public class InterfacePracticeWithoutInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Naver2 sungNN = new Naver2();
		sungNN.viewMailList();
		sungNN.sendmail("������", "�������� �ٺ���");
		System.out.println("=================");
		sungNN.searchWord("Babo");
		sungNN.translation("Bakayarou");
		System.out.println("=================");

		sungNN.viewWebtoon("������");
		sungNN.addComment("������");
		System.out.println("=================");

		System.out.println("���ļ��ƴ� ���̹����� �������� ����ž�ϴ�.");
		System.out.println("=================");

		Daum2 sungDD=new Daum2();
		sungDD.listMails(20);
		sungDD.send("������","yrd9494","ī��Ź");
		System.out.println("=================");

		sungDD.search("Babo","�ѱ���");
		sungDD.translation("Bakayarou","�Ϻ���","�ѱ���");

		System.out.println("=================");

		sungDD.getToon("������");
		
	}

}
class Portal {
	//�ٵ� �곻�� �޼��� �̸� �ٸ��� �϶�� �����ʾҴ� �װ� ������-��������(�ϻ�-���ֽ�) / ����Ű-�ϳ��� ���� (�ڵ����˻�) / �̷� D(�Ｚ���� ������ �굵 �� ���α׷�������)
	//������� (��... ���� �������� �����ɷκ��� �׳� �������� �����ϴµ� �ϴ����� �Ź��ٲ��......)//
} //�׷� ���̹��� ������ �Ȱ��� �������̽� A��� �� ���� ���� ������ �ϴ°Ŵ�

class Naver2 extends Portal {
	void viewMailList() {
		System.out.println("���̹� ���� ����� ���ϴ�.");
	}

	void sendmail(String toPerson, String content) {
		System.out.println(toPerson + "����" + content + "������ ������ �����ϴ�.");
	}

	void searchWord(String word) {
		System.out.println("���̹� �������� " + word + "�� ���� �˻��մϴ�");
	}

	void translation(String text) {
		System.out.println("���̹����İ�� " + text + "�� �����մϴ�.");
	}

	void viewWebtoon(String webtoonName) {
		System.out.println("���̹����� " + webtoonName + "�� �����մϴ�");
	}

	void addComment(String webtoonName) {

		System.out.println("���̹� ���� " + webtoonName + "�� �Ҳɰ��� ��ħ����� �ۼ��մϴ�");
	}
}

class Daum2 extends Portal {
	void listMails(int countMail) {

		System.out.println(countMail + "���� �̸����� ��Ͽ��� �ҷ��ɴϴ�.");
	}

	void send(String toPerson, String toMail, String content) {
		System.out.println("�ּ�: " + toMail + ", �޴»��: " + toPerson + "���� " + content + "��� ������ �ۼ��մϴ�.");
	}

	void search(String word, String language) {
		System.out.println(word + "�� " + language + "�������� ã���ϴ�.");
	}

	void translation(String text, String sourceLang, String TargetLang) {
		System.out.println("���� �� ���: " + sourceLang);
		System.out.println("������ ����: " + text);
		System.out.println("������ ���: " + TargetLang);
	}

	void getToon(String name) {
		System.out.println("���� " + name + "�� ���ϴ�.");
	}
}

//class SJsInternetSurfing {
//	 void surf(){
//	   //������ ����
//	    }
