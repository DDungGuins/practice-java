package chapter5.staticEx;

public class StaticEx2 {

	public static void main(String[] args) {
		// 요구사항명세분석 난 롤을 하고 있다. 쉬바나랑 룰루랑 파이크랑 같은 팀이다.
		/* 쉬바나랑 룰루랑 파이크랑 q스킬을 썻다 그리고 세명은 기분이 좋은 나머지 춤추기를 했다. 
		 * 그 중에 몇명은 웃기도 했다 
		 * 조건: 감정표현 class만들것 농담 도발 춤 웃기 이게 스태틱과 관계가 있는 것이니
		 뜡귄이... 넌뜡귄이를 버리지 않았구나 
		 */
		
		Champion shyv = new Champion("쉬바나",500,1);
		Champion lulu = new Champion("룰루",400,2);
		Champion pykk = new Champion("파이크", 450, 3);
		
		shyv.qAttack(); Gamjong.dance(shyv); 
		lulu.qAttack(); Gamjong.dance(lulu); Gamjong.laugh(lulu);
		pykk.qAttack(); Gamjong.dance(pykk); Gamjong.laugh(pykk);
				
		
		
		//참피온이 아니라 짠폰을 생성했어...
		
	}

}


class Champion {
	String name;
	int hp;
	int champNum;
	
	Champion(String name, int hp, int champNum) {
		this.name=name;
		this.hp=hp;
		this.champNum=champNum;
	}
	
	void qAttack ( ) {
		System.out.println("q스킬을 시전했습니다.");
	}
}

class Gamjong {
	static void joke (Champion champ) {
		System.out.println(champ.name+"가 농담을 합니다.");
		
	}
	
	static void dobal (Champion champ) {
		System.out.println(champ.name+"적을 도발합니다.");
	}
	
	static void dance (Champion champ) {
		System.out.println(champ.name+"가 춤을 춥니다.");
	}
	
	static void laugh (Champion champ) {
		System.out.println(champ.name+"가 웃습니다.");
	}
}











