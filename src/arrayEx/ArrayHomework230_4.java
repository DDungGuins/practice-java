package arrayEx;

public class ArrayHomework230_4 {

	public static void main(String[] args) {
//		// 다음과 같이 Dog 클래스가 있습니다. 
//		Dog Test 클래스와 배열 길이가 5인 Dog[ ] 배열 을 만든 후
//		Dog 인스턴스를 5개 생성하여 배열에 추가합니다. fo r문과 향상된 
//		fo r문에서 Dog 클래스 의 
//		showDog ln fo ( ) 메서드를 사용하여 
//		배열에 추 가한 Dog 정보를 모두 출력하세요.

		
		Dog dogs[] = new Dog [5];
		
		for (int i=0; i<dogs.length;i++) {
			dogs[i] = new Dog();
		}
		dogs[0].setName("멈독");
		dogs[0].setType("시골잡종");
		
		dogs[1].setName("멈둘기");
		dogs[1].setType("진돗개");

		dogs[2].setName("멈귄이");
		dogs[2].setType("풍산개");
		
		dogs[3].setName("멈괭스");
		dogs[3].setType("도지견");
		
		dogs[4].setName("멈멈이");
		dogs[4].setType("화성견");
		
		
//		for (int i= 0 ; i<dogs.length; i++) {
//			System.out.println(dogs[i].showDogInfo());
//		}
//		
		for (Dog ddongGae: dogs ) {
			System.out.println(ddongGae.showDogInfo());
		}
	}

}


class Dog {
	
	private String name;
	private String type;

	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String showDogInfo() {
		return name + "," +type;
	}
}