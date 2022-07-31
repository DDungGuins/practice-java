package arrayEx;

public class ArrayEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		MapleChara [] union = new MapleChara[40];
//
//		union[0] = new MapleChara("zl존유라");
//		union[1] = new MapleChara("zl존유라1");
//		union[2] = new MapleChara("zl존유라2");
//
//		int [] level = new int [] {0,1,2,3,4,5};//까다로운 녀석이네 		
		// 배열은...크기(원소의 개수)를 미리 정해놓기 떄문에 빠른 것이다. 왜일까? 미리 공간을 마련해두면 흩어져있는 여러 가지 변수들사이에서
		// 정해진 공간에 찾아갈 수 있기 떄문이니 뭘까먹는단거니

		// 도깨비 100명이 있다. 이름은 각자 x번 도깨비입니다. 100명을 선언하라
//		Dokebi dok1 = new Dokebi('도깨비1');
//		Dokebi dok2 = new Dokebi('도깨비2');
//		Dokebi dok3 = new Dokebi('도깨비3');
//		Dokebi dok4 = new Dokebi('도깨비4');

		Dokebi[] dokebi = new Dokebi[22222];

		// 도깨비 배열의 공간을 100개 만들었다
//		dokebi[0].nickName="도깨비1";
//		dokebi[1].nickName="도깨비2";

		// 흠... 더 좋은방법이 없을 꼬........

		for (int i = 0; i < dokebi.length; i++) {
			dokebi[i] = new Dokebi("도깨비" + (i + 1)); // 도깨비 배열의 원소 도깨비[0], 도꺠비[1]...이 비로소 생성된
//			dokebi[i].nickName = "도깨비" + i;
			// 배열의 인스턴스는 만들었는데 각각의 원소에 대한 인스턴스는 없다. 그걸 어떻게하는가?
			// 도깨비 배열의 i번째 원소의 닉네임 맴버변수에다가 도깨비i를 대입한다
			// dokebi [] =
			System.out.println(dokebi[i].nickName);
		}

		System.out.println(dokebi.length);
	}

}

class Dokebi {

	String nickName;

	Dokebi(String nickName) {
		this.nickName = nickName;

	}
}