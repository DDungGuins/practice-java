package interfaceEx;

public class WithoutIF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Aircon2 aircon = new LGAircon2();
		aircon.remoteTurnOn();
		aircon.remoteTurnOff();
		System.out.println("�������� ���峪�� ������簡 �Խ��ϴ�.");
		aircon.blink();
		aircon = new SamsungAircon2();
		aircon.remoteTurnOn();
		aircon.remoteTurnOff();
		
			
	}

}
abstract class Aircon2 {
	String name;
	
	Aircon2(String name){
		this.name=name;
	}
	
	abstract void remoteTurnOn();
	abstract void remoteTurnOff();
	abstract void remoteTempUp();	
	abstract void remoteTempDown();
	abstract void blink();
}


class LGAircon2 extends Aircon2{
	LGAircon2() {
		super("LG");
	}
	@Override
	void remoteTurnOn() {
		System.out.println("LG�������� �մϴ�.");
	}
	@Override
	void remoteTurnOff() {
		System.out.println("LG�������� ���ϴ�.");

	}
	@Override
	void remoteTempUp() {
		System.out.println("LG�������� �µ��� �ø��ϴ�.");

	}
	@Override
	void remoteTempDown() {
		System.out.println("LG���������� �µ��� �����ϴ�.");

	}
	@Override
	void blink() {
		System.out.println("LG�������� ���峻���� ������������ �˷��ݴϴ�.");
	}
	
	
}


class SamsungAircon2 extends Aircon2 {
	SamsungAircon2() {
		super("�Ｚ");
	}
	@Override
	void remoteTurnOn() {//�ʹ��ϴ� ����^^ �е� �ٸ� �едٸ� ���� �ƹ����� �� ������ �̾��ϴ�@@@@@@@
		System.out.println("�Ｚ�������� �մϴ�.");
	}
	@Override
	void remoteTurnOff() {
		System.out.println("�Ｚ�������� ���ϴ�.");

	}
	@Override
	void remoteTempUp() {
		System.out.println("�Ｚ�������� �µ��� �ø��ϴ�.");

	}
	@Override
	void remoteTempDown() {
		System.out.println("�Ｚ���������� �µ��� �����ϴ�.");

	}
	@Override
	void blink() {
		System.out.println("�Ｚ �������� ���峻���� ������������ �˷��ݴϴ�.");
	}
	
}

class InminAircon2 extends Aircon2{
	InminAircon2() {
		super("������");
	}
	@Override
	void remoteTurnOn() {//�ʹ��ϴ� ����^^ �е� �ٸ� �едٸ� ���� �ƹ����� �� ������ �̾��ϴ�@@@@@@@
		System.out.println("������ �������� �մϴ�.");
	}
	@Override
	void remoteTurnOff() {
		System.out.println("������ �������� ���ϴ�.");

	}
	@Override
	void remoteTempUp() {
		System.out.println("������ �������� �µ��� �ø��ϴ�.");

	}
	@Override
	void remoteTempDown() {
		System.out.println("������ ���������� �µ��� �����ϴ�.");

	}
	@Override
	void blink() {
		System.out.println("������ ȸ�翡���� �������� �ʴ� ����Դϴ�..�Ф�");
	}
}
