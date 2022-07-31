package nestedClass;

import java.util.HashSet;
import java.util.Set;

//import nestedClass.GCard.MChip; //그럼 임포트 안하고도 쓸수잇는방법이있니

public class StaticNestedClass {

	public static void main(String[] args) {
		// 난 유라와의 공부가 끝나면 맛난 자바기디를 먹을거야
		// 교통카드를 만들것이다.
		// 교통카드에는 일련번호가 있고 잔액이 있다.
		// 모든교통카드 내에는 마그네틱칩이 있다
		// 칩 종류는 모든 교통카드가 똑같다고 가정
		// 이 카드를 대중교통 센서에 갖다대면 요금이 빠져나간다.
		// 각 탈것엔 요금정보가 있다
		// 이걸 구현해보자
		// 이걸 내부클래스를 구현해야하는거나

		// 나라에서 복제카드를 만들수 없게 칩의 비밀키를 변경햇습니다.
		// 이제 교통 운송 회사는 그에 대응해야합니다
		// 이제 하면댈것같은디..
		// 생각보다 칩에 뭐 할게 별로없는거같은데.. 
		GCard card = new GCard(10000, "캐시비");
		GCard ccard = new GCard(10000, "캐시뷔");//사칭회사야
		Vehicle bus = new Vehicle(1000);
		bus.jjik(card);		bus.jjik(ccard);

		
	}

}

class GCard {
	static int seNum = 0;
	int cardSerial;
	int janEk;
	MChip mChip;
	String company;

	GCard(int janEk, String company) {
		cardSerial = seNum;
		seNum++;
		this.janEk = janEk;
		this.company = company;
		MChip mChip = new MChip();
		this.mChip=mChip;
		mChip.company=company;
		
		// 얘는 모든 칩의 번호가 같으니까..
	}
	// 가짜칩생산을 막기 위해서 모든 칩엔 동일한 일련번호가 존재한다 .
	// 이 일련번호를 확인하는 주체가 대중교통의 센서다
	// 이게 확인이 되면 대중교통에 찍히는거다
	// 칩은 그 카드 제조사가 직접만든다.
	// 하지만난 칩의 컴퍼니를 카드의 컴퍼니에 맞게 바꿔줘야해..

	// 멤버로서

	// MChip클래스를 굳이 스태틱으로 선언해야하는 이유는...
	//
	
	// 스태틱은 코드가 메모리에 올라갈때, 저장된다.
	//굳이 MChip을 스태틱으로 선언한 이유는,
	// MChip은 GCard의 인스턴스가 생성되지 않는한, MChip의 존재를 보장하지않는다.
	// 그러나 MChip가 존재함을 반드시 필요로하는 다른 객체의 메소드가 있으므로 스태틱을 선언한다.
	static class MChip {
		static int chipKey = 06031212;
		String company;//컴퍼니는 매개변수마다 다달라..

	}

}

class Vehicle {
	int yogeum;

	Set<String> allowedCompany = new HashSet<>();

	Vehicle(int yogeum) {
		this.yogeum = yogeum;
		allowedCompany.add("마이비");
		allowedCompany.add("캐시비");
		allowedCompany.add("티머니");
	}

	void jjik(GCard card) {
		if (this.validation(card)) {
			card.janEk = card.janEk - yogeum;
			System.out.println("금액은 " + yogeum + "원입니다.");
			System.out.println("잔액 " + card.janEk + "원이 남았습니다.");

		} else
			System.out.println("잘못된 카드입니다.");
	}

	// 허가된 제조사의 이름이 몇가지 등록되어 있다.
	// 제조사 종류: 티머니 캐시비 마이비
	// 제조회사가 이중에 포함되는지도 확인해야함
	//그냥 바로 가져오는거아니니 바로 클래스 이름 쓰고 들고온거같은데..

	boolean validation(GCard card) {
	//밸리데이션에 card를 매개변수로 넣엇잖니
	// 근데 밑에 리턴에는 MChip.어쩌구 를 내가 써넣었잖니
// 바로 클래스이름찍고 . 찍고  아니이러면 매개변수를 넣은 의미가 없는거아닌가... 카드의 엠칩의 컴퍼니를 불러오고싶은데...
		return card.mChip.chipKey == 06031212 && allowedCompany.contains(card.mChip.company);
	
	}

}