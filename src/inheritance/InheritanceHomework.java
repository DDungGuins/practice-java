package inheritance;

import java.util.ArrayList;

public class InheritanceHomework {

	public static void main(String[] args) {
		/*����1
���ƴ� ���� �������� ���Ƚ��ϴ�.
�մԵ��� �����Ҹ��� �ִ°��� �����ϱ� ������ �׷��͸� �鿩������ �մϴ�
������ ������ ���� �ٸ� ������ �����Ҹ��� �ٸ��ϴ�
�������� ������� ���̷��� �ϴµ� ������ ������ ��� �������� ���̷��� �մϴ�
�켱 ó�� �鿩�� ������ ��, ��, �� �Դϴ�
�������� �⺻������ ���� �ְ� ������ �� ������ �ٸ��ϴ�.
�� ������ �� ��� �ֽ��ϴ�
���ƴ� ���� ��� ������ �����߱� ������ �߰��� ������� �鿴���ϴ�
������� ����� �ְ�, 
���� ������� ������, �Ǿ��Դϴ� (�Ǿ�� �Ǿ��ϰ� ��ٰ� �����մϴ�)
���� �������� �ϻ��� ���α׷����� �ۼ��Ͻÿ�
*/
		
//		Chicken dalgi = new Chicken("��","������");
//		Bear gomi =  new Bear("��","������");
//		Horse mari = new Horse("��","����");
//		
//		System.out.println(dalgi.hairColor+"��"+dalgi.hairColor+"�Դϴ�.");
//		System.out.println(gomi.hairColor+"��"+gomi.hairColor+"�Դϴ�.");
//		System.out.println(mari.hairColor+"��"+mari.hairColor+"�Դϴ�.");
//		
//		dalgi.sound(); gomi.sound(); mari.sound();
//		
//		Frog gaeguri = new Frog("������");
//		Croco wani = new Croco("�Ǿ�");
//		
//		System.out.println(gaeguri.name+"��(��) ����� ������ �ִ°�? "+gaeguri.hasBinnle);
//		System.out.println(wani.name+"��(��) ����� ������ �ִ°�? "+wani.hasBinnle);
//
//		gaeguri.sound(); wani.sound(); ����...
		
		Mammal dalgi = new Chicken("��","������");
		Mammal gomi = new Bear ("��", "������");
		Mammal mari = new Horse ("��", "����");
		
		System.out.println(dalgi.name+"��"+dalgi.hairColor+"�Դϴ�.");
		System.out.println(gomi.name+"��"+gomi.hairColor+"�Դϴ�.");
		System.out.println(mari.name+"��"+mari.hairColor+"�Դϴ�.");
		
		dalgi.sound(); gomi.sound(); mari.sound();

		
		Reptile gaeguri = new Frog ("������");
		Reptile wani = new Croco ("�Ǿ�");
		
		System.out.println(gaeguri.name+"��(��) ����� ������ �ִ°�? "+gaeguri.hasBinnle);
		System.out.println(wani.name+"��(��) ����� ������ �ִ°�? "+wani.hasBinnle);
		
		gaeguri.sound(); wani.sound();

		Zoo sungAzoo = new Zoo();
		sungAzoo.name="���Ƶ�����";
		
		sungAzoo.dobutsu.add(dalgi);
		sungAzoo.dobutsu.add(gomi);
		sungAzoo.dobutsu.add(mari);
		sungAzoo.dobutsu.add(gaeguri);
		sungAzoo.dobutsu.add(wani);
		
		//�ֳĸ� ������ �ִϸ��� �ڽ� Ŭ���̱� ����..���� ����Ŭ������ �ִϸ��� ��������� �޼ҵ常 ������ ���� ����Ŭ������ ���� 
		//��������� �޼ҵ�� ������ �� ���´�
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
	System.out.println("����"+this.name+"�����ƴ�.");
	}
	
	
	void sound () {
		System.out.println(this.name+"��(��) ��ϴ�.");
	} 
	
}

class Mammal extends Animal {
	String hairColor;
	
	Mammal (String name, String color) {
		super(name);
		this.hairColor=color;
		System.out.println("������"+this.name+"�����ƴ�.");
	}
}

class Chicken extends Mammal{
	Chicken(String name, String color) {
		super(name, color);
		System.out.println("��"+this.name+"�����ƴ�.");

	}

	void sound () {
		System.out.println(this.name+"��(��) ������ �ϰ� ��ϴ�.");
	} 
}

class Bear extends Mammal {
	Bear(String name, String color) {
		super(name, color);
		System.out.println("��"+this.name+"�����ƴ�.");

	}

	void sound () {
		System.out.println(this.name+"��(��) ũ�� �ϰ� ��ϴ�.");
	} 
}

class Horse extends Mammal {
	Horse(String name, String color) {
		super(name, color);
		System.out.println("��"+this.name+"�����ƴ�.");

	}

	void sound () {
		System.out.println(this.name+"��(��) ������ �ϰ� ��ϴ�.");
	} 
}


class Reptile extends Animal{ 
	
	boolean hasBinnle=true;

	Reptile(String name) {
		super(name);
		System.out.println("�����"+this.name+"�����ƴ�.");

	}

}
		
	
class Frog extends Reptile{
	Frog(String name) {
		super(name);
		System.out.println("������"+this.name+"�����ƴ�.");

	}

	void sound () {
		System.out.println(this.name+"��(��) �������� ��ϴ�.");
	} 
}

class Croco extends Reptile{
	Croco(String name) {
		super(name);
		System.out.println("�Ǿ�"+this.name+"�����ƴ�.");

	}

	void sound () {
		System.out.println(this.name+"��(��) �Ǿ� �ϰ� ��ϴ�.");
	} 
}
