package jvmDefaultClasses;

public class Juwhangbushut {

	public static void main(String[] args) throws ClassNotFoundException {
		// TODO Auto-generated method stub
			
		Monster Jmush1 = new Monster(new String("��Ȳ����"),80,23);//���
		Monster Jmush2 = new Monster(new String("��Ȳ����"),80,23);//��� ���� �ٸ� ��Ʈ�� Ŭ������ �ν��Ͻ���

//		�ֳĸ� �׳�"��Ȳ����"�̶�� ���� �³����� �����ϴ���? ����޸�? �� ����Ų�ٰ� �� �� �ִ�..
		
		System.out.println(Jmush1.equals(Jmush2));
		System.out.println(Jmush1);
		
	}
//����� �����Ű�����..
}



class Monster {
	String name;
	int hp;
	int damage;
	
	Monster (String name, int hp, int damage) {
		this.name=name;
		this.hp=hp;
		this.damage=damage;
	}

	boolean equals (Monster M) { 
		if (this.name.equals(M.name)&&this.hp==M.hp&&this.damage==M.damage) {
			return true; 
		}
		else return false;
	}
	
	public String toString() {
		return 		"���� �̸�: " + this.name+", Hp: "+this.hp+", ������: "+this.damage;

	}
	
}