package abstractClass;

public class AbstractClassInheritance {

	public static void main(String[] args) {
		// ��� fish (�̸�,  
		// �����, ���Ƹ�
		
		Fish jinbe = new JinbeZame ("�����");
		Fish aAron = new WhiteShark ("���Ƹ�");
		jinbe.habit();
		aAron.habit();
		
//		Shark shaark = new Shark ("����");
		
		// �߻�Ŭ�����δ� �ν��Ͻ� ������ ���Ѵ�. �� ���ұ�? ���״�� ��ü���� ����� �ƴϱ� ����
		// �߻�ȭ �� �޼ҵ带 ������ �ֱ⶧���̴�..?
		// �޼��尡 ����(�ʱ�ȭ)�Ǿ����� �ʾұ� ������ 
		// �߻�Ŭ������ �ν��Ͻ��� ��� ������ �� ������? 
		// ����� ���� �ڽ�Ŭ������ �ν��Ͻ��� �����Ѵ�..
		// ����Ŭ������ ����� 
				
		
	}

}
//fish �̸�, �غ�
abstract class Fish {
	String name;
	
	Fish (String name){
		this.name=name;
	}
	
	abstract void habit();
	
}

abstract class Shark extends Fish {
	
	Shark (String name) {
		super(name);
	}
	
	abstract void habit(); 
}


class JinbeZame extends Shark {
	
	JinbeZame (String name) {
		super (name);
	}
	
	void habit () {
		System.out.println(this.name+"�� �ſ� �¼��ϸ� �ö�ũ��� ���� ���� ���� �Խ��ϴ�.");
	}
}

class WhiteShark extends Shark{
	
	WhiteShark (String name) {
		super(name);
	}
	
	void habit() {
		System.out.println(this.name+"�� �ſ� �糪��� ���� ���� ����� ����Ͽ� �Խ��ϴ�.");

	}
}