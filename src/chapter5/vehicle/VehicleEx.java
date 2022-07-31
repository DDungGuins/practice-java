package chapter5.vehicle;

public class VehicleEx {

	public static void main(String[] args) {
		// 성아는 티머니카드가 있다
		// 티머니는 티머니에 만원을 충전했습니다
		// 유라는 5000원을 충전해서 지하철만 한번 타고 출퇴근한다.
		/*
		 * 성아는 지하철1번, 버스1번 타고 출근합니다. 버스요금은 1500원, 지하철은 1400원입니다. 성아는 출근할때는 지하철->버스/
		 * 퇴근할때는 버스->지하철을 탑니다 환승하면 천원이 할인댑니다. 버스와 지하철은 손님과 돈을 카운팅합니다. 유라와 성아가 출퇴근하고 오면
		 * 각각 얼마가 남아있고 버스와 지하철의 통계는 어떻게 나올까여?
		 * 
		 */

		Passenger yura = new Passenger("이유라", 5000);
		Passenger sungA = new Passenger("이성아", 10000);

		Vehicle bus =new Vehicle("버스", 1500);
		Vehicle sub = new Vehicle ("지하철",1400);
		yura.rideOn(bus);
		yura.rideOn(bus);
		sungA.rideOn(bus);sungA.transfer(sub);
		sungA.rideOn(sub);sungA.transfer(bus);
		
		System.out.println(yura.name +"님의 잔액은 " + yura.tMoney + "원입니다.");
		System.out.println(sungA.name+"님의 잔액은 "+ sungA.tMoney+ "원입니다.");
	
		System.out.println(bus.name+"를 탑승한 승객은 "+bus.count+"명이고,"+bus.income+"원을 벌었습니다.");
		System.out.println(sub.name+"을 탑승한 승객은 "+sub.count+"명이고,"+sub.income+"원을 벌었습니다.");
		
		
	
	
	}

}

class Passenger {
	int tMoney;
	String name;

	Passenger(String name, int tMoney) {
		this.tMoney = tMoney;
		this.name = name;
	}

	void rideOn(Vehicle vehicle) {
		tMoney = tMoney - vehicle.fee;
		vehicle.counting();
	}

	void transfer(Vehicle vehicle) {
		tMoney = tMoney - vehicle.fee+1000;
		vehicle.counting();
		vehicle.income -= 1000;

	}
}

class Vehicle {
	int count = 0;
	String name;
	int income = 0;
	int fee;

	Vehicle(String name, int fee) {
		this.name = name;
		this.fee = fee;
	}

	void counting() {
		count++;
		income += fee;
	}
}
