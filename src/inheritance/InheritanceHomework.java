package inheritance;

import java.util.ArrayList;

public class InheritanceHomework {

	public static void main(String[] args) {
		/*숙제1
성아는 새로 동물원을 차렸습니다.
손님들은 울음소리가 있는것을 좋아하기 때문에 그런것만 들여오려고 합니다
동물은 종마다 각자 다리 개수나 울음소리가 다릅니다
포유류와 파충류를 들이려고 하는데 당장은 물가가 없어서 포유류만 들이려고 합니다
우선 처음 들여온 동물은 닭, 곰, 말 입니다
포유류는 기본적으로 털이 있고 종마다 털 색깔이 다릅니다.
각 동물은 잘 울고 있습니다
성아는 돈을 벌어서 물가를 마련했기 때문에 추가로 파충류를 들였습니다
파충류는 비늘이 있고, 
들인 파충류는 개구리, 악어입니다 (악어는 악악하고 운다고 가정합니다)
성아 동물원의 일상을 프로그램으로 작성하시오
*/
		
//		Chicken dalgi = new Chicken("닭","빨간색");
//		Bear gomi =  new Bear("곰","검정색");
//		Horse mari = new Horse("말","갈색");
//		
//		System.out.println(dalgi.hairColor+"는"+dalgi.hairColor+"입니다.");
//		System.out.println(gomi.hairColor+"는"+gomi.hairColor+"입니다.");
//		System.out.println(mari.hairColor+"는"+mari.hairColor+"입니다.");
//		
//		dalgi.sound(); gomi.sound(); mari.sound();
//		
//		Frog gaeguri = new Frog("개구리");
//		Croco wani = new Croco("악어");
//		
//		System.out.println(gaeguri.name+"은(는) 비늘을 가지고 있는가? "+gaeguri.hasBinnle);
//		System.out.println(wani.name+"은(는) 비늘을 가지고 있는가? "+wani.hasBinnle);
//
//		gaeguri.sound(); wani.sound(); 으응...
		
		Mammal dalgi = new Chicken("닭","빨간색");
		Mammal gomi = new Bear ("곰", "검정색");
		Mammal mari = new Horse ("말", "갈색");
		
		System.out.println(dalgi.name+"는"+dalgi.hairColor+"입니다.");
		System.out.println(gomi.name+"는"+gomi.hairColor+"입니다.");
		System.out.println(mari.name+"는"+mari.hairColor+"입니다.");
		
		dalgi.sound(); gomi.sound(); mari.sound();

		
		Reptile gaeguri = new Frog ("개구리");
		Reptile wani = new Croco ("악어");
		
		System.out.println(gaeguri.name+"은(는) 비늘을 가지고 있는가? "+gaeguri.hasBinnle);
		System.out.println(wani.name+"은(는) 비늘을 가지고 있는가? "+wani.hasBinnle);
		
		gaeguri.sound(); wani.sound();

		Zoo sungAzoo = new Zoo();
		sungAzoo.name="성아동물원";
		
		sungAzoo.dobutsu.add(dalgi);
		sungAzoo.dobutsu.add(gomi);
		sungAzoo.dobutsu.add(mari);
		sungAzoo.dobutsu.add(gaeguri);
		sungAzoo.dobutsu.add(wani);
		
		//왜냐면 쟤들은 애니멀의 자식 클라스이기 때문..들어갈때 상위클래스인 애니멀의 멤버변수와 메소드만 가지고 들어가고 하위클래스만 가진 
		//멤버변수와 메소드는 버리고 들어간 상태다
	}

}

class Zoo { 
	String name;
	ArrayList<Animal>dobutsu =  new ArrayList<>();
	
	
}

class Animal{
	int leg;
	String name;
	
	Animal (String name) {
	this.name=name;
	System.out.println("동물"+this.name+"생성됐다.");
	}
	
	
	void sound () {
		System.out.println(this.name+"이(가) 웁니다.");
	} 
	
}

class Mammal extends Animal {
	String hairColor;
	
	Mammal (String name, String color) {
		super(name);
		this.hairColor=color;
		System.out.println("포유류"+this.name+"생성됐다.");
	}
}

class Chicken extends Mammal{
	Chicken(String name, String color) {
		super(name, color);
		System.out.println("닭"+this.name+"생성됐다.");

	}

	void sound () {
		System.out.println(this.name+"이(가) 꼬끼오 하고 웁니다.");
	} 
}

class Bear extends Mammal {
	Bear(String name, String color) {
		super(name, color);
		System.out.println("곰"+this.name+"생성됐다.");

	}

	void sound () {
		System.out.println(this.name+"이(가) 크왕 하고 웁니다.");
	} 
}

class Horse extends Mammal {
	Horse(String name, String color) {
		super(name, color);
		System.out.println("말"+this.name+"생성됐다.");

	}

	void sound () {
		System.out.println(this.name+"이(가) 히이잉 하고 웁니다.");
	} 
}


class Reptile extends Animal{ 
	
	boolean hasBinnle=true;

	Reptile(String name) {
		super(name);
		System.out.println("파충류"+this.name+"생성됐다.");

	}

}
		
	
class Frog extends Reptile{
	Frog(String name) {
		super(name);
		System.out.println("개구리"+this.name+"생성됐다.");

	}

	void sound () {
		System.out.println(this.name+"이(가) 개굴개굴 웁니다.");
	} 
}

class Croco extends Reptile{
	Croco(String name) {
		super(name);
		System.out.println("악어"+this.name+"생성됐다.");

	}

	void sound () {
		System.out.println(this.name+"이(가) 악악 하고 웁니다.");
	} 
}
