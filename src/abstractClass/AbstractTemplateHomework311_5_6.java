package abstractClass;

import java.util.ArrayList;

public class AbstractTemplateHomework311_5_6 {

	public static void main(String[] args) {

		ArrayList<Car> carList = new ArrayList<Car>();
		carList.add(new Sonata());
		carList.add(new Grandeur());
		carList.add(new Avante());
		carList.add(new Genesis());

		for (Car car : carList) {
			car.run();
			System.out.println("======================");
		}

	} 

}

abstract class Car {

	String carName;

	Car(String name) {
		this.carName = name;
	}

	void start() {
		System.out.println(this.carName + " �õ��� �մϴ�.");
	};

	void drive() {
		System.out.println(this.carName + " �޸��ϴ�.");
	};

	void stop() {
		System.out.println(this.carName + " ����ϴ�.");
	};

	void turnoff() {
		System.out.println(this.carName + " �õ��� ���ϴ�.");
	};

	void washCar () {
		System.out.println("������ �մϴ�.");
	}
	final void run() {
		start();
		drive();
		stop();
		turnoff();
		washCar();
	}

}

class Sonata extends Car {
	Sonata() {
		super("�Ÿ");
	}

}

class Avante extends Car {
	Avante() {
		super("�ƹ���");
	}
}

class Grandeur extends Car {
	Grandeur() {
		super("�׷���");
	}
}

class Genesis extends Car {
	Genesis() {
		super("���׽ý�");
	}
}