package chapter5.vehicle;

public class Homework197_6 {

	public static void main(String[] args) {
		/*ī�� ȸ�翡�� ī�带 �߱��� ������ ī�� ���� ��ȣ�� �ο��� �ݴϴ�. 
		 * 06-3�� ���й� �����ϱ⡵������ �����Ͽ� ī�尡 ������ ������ ī�� ��ȣ�� �ڵ�����
		 *  ������ �� �ֵ��� ī�� Ŭ������ ����� ������ ������.
		 */
//		Card shinhan=getCompany.createCard("����ī��");
//		Card bc=CardComp.createCard("��ī��");
//		Card kb=CardComp.createCard("����ī��");
//		Card nara = CardComp.createCard("������");
//				
//		System.out.println(shinhan.cardNum);
//		System.out.println(bc.cardNum);
//		System.out.println(kb.cardNum);
//		System.out.println(nara.cardNum);
		
		
			
		Card shinhan = CardComp.getCompany().createCard("����ī��");
		Card bc= CardComp.getCompany().createCard("��ī��");
		Card kb = CardComp.getCompany().createCard("����ī��");
		Card nara = CardComp.getCompany().createCard("������ī��");
		
		System.out.println(shinhan.cardNum);
		System.out.println(bc.cardNum);
		System.out.println(kb.cardNum);
		System.out.println(nara.cardNum);
	}

}


class Card{
	int cardNum;
	static int cardNumSer=0;
	String cardName;
	
	Card (String name) {
		this.cardName=name;
	}
	
}

class CardComp{
	private static String comName="ī��ȸ��";
	
	private CardComp () {
	}
	private static CardComp cardCompany;
	
	public static CardComp getCompany( ) {
		if (cardCompany == null ) {
			cardCompany = new CardComp();
		}
		return cardCompany;
	}
	
	 Card createCard (String cardName) {
		Card card = new Card(cardName);
		card.cardNumSer++;
		card.cardNum=card.cardNumSer;
		return card;
	}
	
	
}