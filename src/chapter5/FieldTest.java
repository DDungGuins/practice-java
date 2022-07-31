package chapter5;

public class FieldTest {

	public static void main(String[] args) {
		

		Humen sungA=new Humen();
		sungA.name="이성아";
		sungA.age=19;
		
		Ramyeon shinRamyeon = new Ramyeon();
		shinRamyeon.name="신라면";
		shinRamyeon.price=800;
		shinRamyeon.company="농심";
		shinRamyeon.gram=50;
		//System.out.println(shinRamyeon.name);
	
		Dung ddong = sungA.eatRamyeon(shinRamyeon);
		
		System.out.println(sungA.name+"는 오늘 "+shinRamyeon.company+"회사의 "+shinRamyeon.price+"원짜리 "
		+shinRamyeon.name+"을 "+shinRamyeon.gram+"g먹고 "+ddong.consist+"로 이루어진 "+ddong.gram+
		"g짜리 똥을 배출했습니다.");
		
		//???는 오늘 ???회사의 ???짜리 ???라면을 ???그램 먹고 
		// ???로 이루어진 ???그램짜리 똥을 배출했습니다.
		
	}

	
	
	
}

class Ramyeon {
	//class의 속성들을 field라고 한다.
	int price;
	int gram;
	String name;
	String company;

	
}

class Humen {
	
	String name;
	int age;
	
		
	Dung eatRamyeon (Ramyeon ramyeon) {
		System.out.println(ramyeon.name+"을 먹었습니다.");
		
		Dung ddong = new Dung();//똥을 인스턴스화 했어
		ddong.consist=ramyeon.name;
		ddong.gram= ramyeon.gram/10*3;
		return ddong;
		
	}
	
	
	
}

class Dung {
	String consist;
	int gram;

	
	
}








