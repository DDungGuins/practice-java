package inheritance;

import java.util.Arrays;

public class WithoutInheritance {

	public static void main(String[] args) {
		// 메이플캐릭터를 만들것이다. 도적, 전사, 아델, 호영, 아크, 엔버, 은월
		// 공통기술 평타,줍기,점프, 밧줄타기, 리턴투홈
		// 주력기: 도적-럭키세븐/전사-파워스트라이크/아델-디바이드/호영-부채질 / 아크-잠식된 스펙터 손 / 엔버-춤추기 / 은월-잊혀지기
		// 를 구현해라...

		
//		Thief zldojuk = new Thief ();
//		
//		zldojuk.zupGi();
//		
//		Adele adele = new Adele ();
		
//		Adele adele = new Adele();
//		adele.skill();

		
		
		
//		MapleChara adelle = (MapleChara) adele; // 다시말해주깃니 여기서 형변환이 일어났군?
//		
//		//adelle.skill; 사용할 수 없다 (왜냐? 아델 클라스의 변수였는데 형변환되서 마치 long값이 int로 변환될떄마냥짤려나갔기떄문
//		
//		
//		System.out.println(adele);
//		System.out.println(adelle);
//		// 인스턴스의주소아니니...아델클라스의 adele과 메이플차라클라스의 adelle의  주소는 다르고 가리키는 객체는 같다
		//mapleChara.pyungTa();
		//메이플잡으로부터 상속을 받앗니
		
	
	// 메소드 오버라이딩 아니니...
 		MapleChara yura = new MapleChara();
		yura.basicSkill();
		yura = new Thief();
		yura.basicSkill();
		yura = new Warrior (); 
		yura.basicSkill();
		
//		그럼 말이야 yura는 지금 타입이 아직 메이플차라인거니 타입은 부모타입인데 들어간건 자식의 인스턴스다.어렵다...
	
	
	
	
	
	
	}

}  

//메이플캐릭터는 모든 메이플캐릭터가 가지고있는 공통된 속성을 가지고 있다. 
class MapleChara {
	String name;
	
	void basicSkill() {
		System.out.println("주력스킬을 사용합니다.");
	}
	
	void pyungTa() {
		System.out.println("기본공격을 합니다.");
	}
	
	
	
	void zupGi() {
		System.out.println("주웠습니다.");
	}

	void batZul() {
		System.out.println("밧줄에 매달렸습니다.");
	}

	void goHome() {
		System.out.println("마을로 돌아갑니다.");

	}
}  

class Thief extends MapleChara {
	void basicSkill() {
	System.out.println("럭키세븐을 외웠습니다.");	
	}
	void darkSite() {
		System.out.println("다크사이트를 외웠습니다.");
	}

}

class Warrior extends MapleChara {
	
	void basicSkill() {
		System.out.println("레이징 블로우를 외웠습니다.");}
	void powerGuard() {
		System.out.println("파워가드를 외웠습니다.");
	}

}

class Adele extends MapleChara {

	void blossom() {
		System.out.println("블로섬을 외웠습니다.");
	}

}

class Hoyung extends MapleChara {

	void potal() {
		System.out.println("축지부를 외웠습니다.");
	}

}

class Arkk extends MapleChara {

	void gongPo() {
		System.out.println("기어다니는 공포로 공격합니다.");
	}

}

class AnBur extends MapleChara {

	void timeStop() {
		System.out.println("시간을 멈출수는 없지만..");
	}

}

class Shade extends MapleChara {

	void outsider() {
		System.out.println("존재감이 사라집니다.");
	}

}
