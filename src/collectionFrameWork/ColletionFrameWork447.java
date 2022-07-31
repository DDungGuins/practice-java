package collectionFrameWork;

public class ColletionFrameWork447 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		CarFactory factory = CarFactory.getlnstance( ) ; 
		Car sonatal = factory.createCar (new String("���� ��")) ; 
		Car sonata2 = factory.createCar("���� ��" ) ; 
		System.out. println(sonatal.equals(sonata2));		//true
		Car avantel = factory.createCar(new String("�¿� ��")); 
		Car avante2 = factory.createCar("�¿� ��"); 
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

// �� �������� HashMap�� ����϶�� �����ִµ� ���ٰ� ������� ���� ��... �̰� �׳� �ؽøʾȽᵵ �Ҽ������Ͱ�����
// �־���� �Ѱ���? ��� �����ߴ� ������..
