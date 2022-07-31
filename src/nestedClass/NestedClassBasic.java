package nestedClass;

import java.util.Map;

import chapter5.ThisEx;
import nestedClass.Dalping.House;

public class NestedClassBasic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Map.Entry<String, String> a;
		// 엔트리라는 클래스는 맵 안에있군! 맵은 엔트리를 통해 자기 키와 밸류를 구성함.
		// 달팽이랑 달핑이 껍데기
		// 달팽이 껍데기는 달팽이가 있어야만 존재할 수 있다.
		// 달팽이껍데기는 단독적으로 사용할 일이 없다.

		// 달팽이를 두마리 생성했습니다
		// 각달팽이의 종이름, 무게 , 껍디기색깔, 껍디기를 뺀 무게 를 출력하시오

		Dalping yrdp = new Dalping();
		Dalping sadp = new Dalping();
		yrdp.name = "유라달핑";
		yrdp.weight = 5000;
		yrdp.cupdigi = yrdp.new House(3000, "red");
		sadp.name = "성아달핑";
		sadp.weight = 300;
		sadp.cupdigi = sadp.new House(120, "blue");
		
		yrdp.dalInfo(); sadp.dalInfo();
	}
}

//달핑의 인스턴스가 생성되면
// 맴버로, 네임, 웨이트, 컵디기 , 내부클래스-하우스=> 클래스도 멤버가 될 수 있군요
// 멤버변수와 멤버메서드와 마찬가지로, 내부클래스 역시 그 클래스의 인스턴스가 있어야만 사용할 수 있다.(맴버클래스) 
class Dalping {
	String name;
	int weight;
	House cupdigi;

	void dalInfo() {
		System.out.println("이름:" + this.name + ", 무게:" + this.weight + ", 껍디기 색깔:" + this.cupdigi.color + ", 껍디기 무게:"
				+ this.cupdigi.weight);
	}

	class House {
		int weight;
		String color;

		House(int w, String c) {
			this.weight = w;
			this.color = c;
		}

	}

}