package abstractClass;

import java.util.ArrayList;

public class AbstractClassBasic {

	public static void main(String[] args) {
		// �ִϸ� Ŭ������ �����, �̸�, �����Ҹ�, ���(�޼���)]
		// �޼����
		// 
		
		
		Zoo zoo = new Zoo();
		Animal usagi = new Usagi ();
		Animal daramgi = new Daramgy();
		Animal nurungi = new Nurungi();
//		Animal yura = new Animal("����"); 
		
		
		zoo.dobutsu.add(usagi);
		zoo.dobutsu.add(daramgi);
		zoo.dobutsu.add(nurungi);
		
		
		for (Animal abc : zoo.dobutsu) {
			System.out.print(abc.name+"�� "); abc.habit();
		}
		
//		yura.habit(); 
		
//		for (Animal abc : zoo.dobutsu) {
//			if (abc instanceof Usagi) {
//				Usagi abcd = (Usagi) abc;
//				abcd.habit();
//			}
//			else if (abc instanceof Daramgy) {
//				Daramgy abcd = (Daramgy) abc;
//				abcd.habit();
//			}
//			
//			else if (abc instanceof Nurungi) {
//				Nurungi abcd = (Nurungi) abc;
//				abcd.habit();
//			}
//			
//			
//				
//		}
		
		
		
		
		
		
		
	}

}
// Zoo���� activity��� �޼��尡�ִ�. �ִϸ� �ϳ��� ���� ������ �����ϴ� ���̴�. 
class Zoo{
	ArrayList <Animal> dobutsu = new ArrayList<>();
	
	void activity (Animal animal) {
		animal.habit();
	}
}

abstract class Animal {
	String name;
	
	
	Animal (String name){
		this.name=name;
	}
	
//	void ulgi ( ) {
//		System.out.println(this.name+"��/��  ��ϴ�.");
//	}
	
	
	// �޼ҵ带 ���� �ϰ� ���Ǵ� ���� �ʰڴ�
	abstract void habit(); 
	//habit�̶�� �޼��带 ������ �ֱ��ϴ� �̶�ƴϴ�..�Ű�����+��ȯŸ���� ������ �����Ѵ�.
	
	
}


class Usagi extends Animal {
	
	Usagi ( ){
		super("�䳢");
	}
	
	void habit () {
		System.out.println("�͸� �б� ����ϴ�.");
	}
	
	
}

class Daramgy extends Animal {
	
	Daramgy () {
		super("�ٶ���");
	}
	void habit () {
		System.out.println("������ ž�ϴ�.");
	}
	
}

class Nurungi extends Animal{
	
	Nurungi () {
		super ("�����");
	}
	void habit () {
		System.out.println("�������� �Խ��ϴ�.");
	}
}
