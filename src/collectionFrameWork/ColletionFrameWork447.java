package collectionFrameWork;

public class ColletionFrameWork447 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		CarFactory factory = CarFactory.getlnstance( ) ; 
		Car sonatal = factory.createCar (new String("연수 차")) ; 
		Car sonata2 = factory.createCar("연수 차" ) ; 
		System.out. println(sonatal.equals(sonata2));		//true
		Car avantel = factory.createCar(new String("승연 차")); 
		Car avante2 = factory.createCar("승연 차"); 
		System.out.println(avantel.equals(avante2));//true 
		System.out.println(sonatal.equals(avantel)
				); //false
	}
}



class Car {
	String name;

	public Car() {
	}

	@Override
	public boolean equals (Object o) {
		if(this.name.equals(((Car) o).name)) {
			return true;
		}
		else return false;
	}
	public Car(String name) {
		this.name = name;
	}
}


class CarFactory {
	
	
	Car createCar(String name) {
		return new Car(name);
	}

	public static CarFactory getlnstance() {
		return new CarFactory();
	}
}

// 그 문제에는 HashMap을 사용하라고 나와있는데 어디다가 써야할지 몰라서 어... 이거 그냥 해시맵안써도 할수있을것같은데
// 왜쓰라고 한거지? 라고 생각했던 문제다..
