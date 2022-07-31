package chapter5.vehicle;

public class VehicleEx {

	public static void main(String[] args) {
		// ���ƴ� Ƽ�Ӵ�ī�尡 �ִ�
		// Ƽ�Ӵϴ� Ƽ�ӴϿ� ������ �����߽��ϴ�
		// ����� 5000���� �����ؼ� ����ö�� �ѹ� Ÿ�� ������Ѵ�.
		/*
		 * ���ƴ� ����ö1��, ����1�� Ÿ�� ����մϴ�. ��������� 1500��, ����ö�� 1400���Դϴ�. ���ƴ� ����Ҷ��� ����ö->����/
		 * ����Ҷ��� ����->����ö�� ž�ϴ� ȯ���ϸ� õ���� ���δ�ϴ�. ������ ����ö�� �մ԰� ���� ī�����մϴ�. ����� ���ư� ������ϰ� ����
		 * ���� �󸶰� �����ְ� ������ ����ö�� ���� ��� ���ñ?
		 * 
		 */

		Passenger yura = new Passenger("������", 5000);
		Passenger sungA = new Passenger("�̼���", 10000);

		Vehicle bus =new Vehicle("����", 1500);
		Vehicle sub = new Vehicle ("����ö",1400);
		yura.rideOn(bus);
		yura.rideOn(bus);
		sungA.rideOn(bus);sungA.transfer(sub);
		sungA.rideOn(sub);sungA.transfer(bus);
		
		System.out.println(yura.name +"���� �ܾ��� " + yura.tMoney + "���Դϴ�.");
		System.out.println(sungA.name+"���� �ܾ��� "+ sungA.tMoney+ "���Դϴ�.");
	
		System.out.println(bus.name+"�� ž���� �°��� "+bus.count+"���̰�,"+bus.income+"���� �������ϴ�.");
		System.out.println(sub.name+"�� ž���� �°��� "+sub.count+"���̰�,"+sub.income+"���� �������ϴ�.");
		
		
	
	
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
