package chapter5.vehicle;

public class Homework197_6 {

	public static void main(String[] args) {
		/*카드 회사에서 카드를 발급할 때마다 카드 고유 번호를 부여해 줍니다. 
		 * 06-3의 〈학번 생성하기〉예제를 참고하여 카드가 생성될 때마다 카드 번호가 자동으로
		 *  증가할 수 있도록 카드 클래스를 만들고 생성해 보세요.
		 */
//		Card shinhan=getCompany.createCard("신한카드");
//		Card bc=CardComp.createCard("비씨카드");
//		Card kb=CardComp.createCard("국민카드");
//		Card nara = CardComp.createCard("나라사랑");
//				
//		System.out.println(shinhan.cardNum);
//		System.out.println(bc.cardNum);
//		System.out.println(kb.cardNum);
//		System.out.println(nara.cardNum);
		
		
			
		Card shinhan = CardComp.getCompany().createCard("신한카드");
		Card bc= CardComp.getCompany().createCard("비씨카드");
		Card kb = CardComp.getCompany().createCard("국민카드");
		Card nara = CardComp.getCompany().createCard("나라사랑카드");
		
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
	private static String comName="카드회사";
	
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