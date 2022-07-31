package jvmDefaultClasses;

public class Juwhangbushut {

	public static void main(String[] args) throws ClassNotFoundException {
		// TODO Auto-generated method stub
			
		Monster Jmush1 = new Monster(new String("주황버섯"),80,23);//얘랑
		Monster Jmush2 = new Monster(new String("주황버섯"),80,23);//얘는 서로 다른 스트링 클래스의 인스턴스야

//		왜냐면 그냥"주황버섯"이라고 쓰면 걔내들은 뭐라하더라? 상수메모리? 를 가리킨다고 알 고 있다..
		
		System.out.println(Jmush1.equals(Jmush2));
		System.out.println(Jmush1);
		
	}
//뮈어니 같을거같은데..
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
		return 		"몬스터 이름: " + this.name+", Hp: "+this.hp+", 데미지: "+this.damage;

	}
	
}