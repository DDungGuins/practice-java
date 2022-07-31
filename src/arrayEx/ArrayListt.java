package arrayEx;

import java.util.ArrayList;

public class ArrayListt {

	public static void main(String[] args) {
		// 캐시템을 저장하는 배열을 만들어보자~
		// 원래 캐시템은 창고 제한이 있다.무료로 계속 창고를 늘릴 수 있다.
		// 아이템이 들어가면 계속 늘어난다.
		// #만약 배열을 사용한다면
		// 크기가 11인 배열을 만들어서 이사를 시켜줘야해
		// 12인 배열을 또만들어야해
//		CashTem [] chango = new CashTem[10];
		ArrayList<CashTem> chango = new ArrayList<>();
		// ㅠㅠ
		CashTem cashtem1 = new CashTem("등대빛의검");
		CashTem cashtem2 = new CashTem("용마제구검");
		CashTem cashtem3 = new CashTem("비철단도");
		// 캐시템..
		chango.add(cashtem1);
		chango.add(cashtem2);
		chango.add(cashtem3);

//		for (int i=0; i<chango.size(); i++) {
//			System.out.println(chango.get(i));
//		}

		for (int i = 3; i < 103; i++) {
			CashTem cashtem = new CashTem("흑장단검" + (i - 2));
			chango.add(i, cashtem);
		}

//		for (int i=0; i<chango.size(); i++) {
//			System.out.println(chango.get(i));
//		}
//		그게아니라 인덱스를 활용해서 for문으로 

//		System.out.println(chango.get(5));
		// for (CashTem cash: chango)

//		
//		chango.remove(44);
//		for (int i = 0; i < chango.size(); i++) {
//			System.out.println(chango.get(i));
//		}
		
		for (CashTem cast : chango) {
			System.out.println(cast.name);
		}
		
		
		
	}

}

class IlbanTem {
	String name;

	IlbanTem(String name) {
		this.name = name;
	}

	public String toString() {
		return this.name + "입니다.";
	}
}

class CashTem {
	String name;

	CashTem() {
	}

	CashTem(String name) {
		this.name = name;
	}

	public String toString() {
		return this.name + "입니다.";
	}
}

//배열은말이야
//자료의 논리적위치와 물리적위치를 같게 해줘.. 책을봤어..
//왜냐면 자료가 들어갈 공간을 먼저 선언해야하기떄문이다..
//실제로배열이아니라 그냥 자료를 만들면 물리적위치는 실제로 동떨어져있기때문이다...
//단점은말이야 배열 의 크기를 쉽게 바꾸기 어려워....
//맞다 새 배열을 만들어서 이사를 시켜줘..

//그게 바로 어레이리스트야

// + 
// # 배열에서, 원소를 중간에 삽입을 하려면 어떻게해야하는가?(예: 크기가 10인 배열에서, 4번과 5번 사이에 새로운 자료를 넣고 싶다.)
//크기 11짜리 배열을 만들어서 이사를 시켜줘야해.. 0~4는 그대로 이사하고 5-9까지는 새로운 배열의 6-10로 이사시키고 5에다가 새로
//추가할녀석을 넣어줘..
//