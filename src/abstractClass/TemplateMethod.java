package abstractClass;

public class TemplateMethod {

	public static void main(String[] args) {
		// 만만한메이플
		// 캐릭터 하나가 풀콤보를 넣습니다.
		// 조건: 무조건 버프스킬 하나 , 일반스킬 하나 x2
		// 마지막은 평타로 마무리합니다. 일반스킬말이니?

		Chara adele = new Adele();
		Chara hoyung = new Hoyung();
		
		adele.fullCombo();
		
		System.out.println(" ");
		
		hoyung.fullCombo();
		
		
	
	}

}

// fullcombo 메서드
abstract class Chara {
	String name;

	Chara(String name) {
		this.name = name;
	}

	abstract void buff();

	abstract void attack1();

	abstract void attack2();

	void fullCombo() {
		this.buff();
		this.attack1();
		this.attack2();
		this.pyungTa();
	};

	void pyungTa() {
		System.out.println("평타를 씁니다.");
	};

}

class Adele extends Chara {

	Adele() {
		super("아델");
	}
	@Override
	void buff() {
		System.out.println("레프의 의지를 사용합니다.");
	}
	@Override
	void attack1() {
		System.out.println("디바이드를 사용합니다.");
	}
	@Override
	void attack2() {
		System.out.println("게더링-블로썸을 사용합니다.");
	}

	
}

class Hoyung extends Chara {

	Hoyung () {
		super("호영");
	}
	@Override
	void buff() {
		System.out.println("아니마의 의지를 사용합니다.");
	}
	@Override
	void attack1() {
		System.out.println("토파류를 사용합니다.");
	}
	@Override
	void attack2() {
		System.out.println("금고봉을 사용합니다.");
	}
	

}