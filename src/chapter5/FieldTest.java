package chapter5;

public class FieldTest {

	public static void main(String[] args) {
		

		Humen sungA=new Humen();
		sungA.name="�̼���";
		sungA.age=19;
		
		Ramyeon shinRamyeon = new Ramyeon();
		shinRamyeon.name="�Ŷ��";
		shinRamyeon.price=800;
		shinRamyeon.company="���";
		shinRamyeon.gram=50;
		//System.out.println(shinRamyeon.name);
	
		Dung ddong = sungA.eatRamyeon(shinRamyeon);
		
		System.out.println(sungA.name+"�� ���� "+shinRamyeon.company+"ȸ���� "+shinRamyeon.price+"��¥�� "
		+shinRamyeon.name+"�� "+shinRamyeon.gram+"g�԰� "+ddong.consist+"�� �̷���� "+ddong.gram+
		"g¥�� ���� �����߽��ϴ�.");
		
		//???�� ���� ???ȸ���� ???¥�� ???����� ???�׷� �԰� 
		// ???�� �̷���� ???�׷�¥�� ���� �����߽��ϴ�.
		
	}

	
	
	
}

class Ramyeon {
	//class�� �Ӽ����� field��� �Ѵ�.
	int price;
	int gram;
	String name;
	String company;

	
}

class Humen {
	
	String name;
	int age;
	
		
	Dung eatRamyeon (Ramyeon ramyeon) {
		System.out.println(ramyeon.name+"�� �Ծ����ϴ�.");
		
		Dung ddong = new Dung();//���� �ν��Ͻ�ȭ �߾�
		ddong.consist=ramyeon.name;
		ddong.gram= ramyeon.gram/10*3;
		return ddong;
		
	}
	
	
	
}

class Dung {
	String consist;
	int gram;

	
	
}








