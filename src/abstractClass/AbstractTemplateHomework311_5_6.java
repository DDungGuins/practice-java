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
		System.out.println(this.carName + " 시동을 켭니다.");
	};

	void drive() {
		System.out.println(this.carName + " 달립니다.");
	};

	void stop() {
		System.out.println(this.carName + " 멈춥니다.");
	};

	void turnoff() {
		System.out.println(this.carName + " 시동을 끕니다.");
	};

	void washCar () {
		System.out.println("세차를 합니다.");
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
		super("쏘나타");
	}

}

class Avante extends Car {
	Avante() {
		super("아반테");
	}
}

class Grandeur extends Car {
	Grandeur() {
		super("그랜저");
	}
}

class Genesis extends Car {
	Genesis() {
		super("제네시스");
	}
}