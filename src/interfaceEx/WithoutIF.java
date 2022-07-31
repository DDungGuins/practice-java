package interfaceEx;

public class WithoutIF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Aircon2 aircon = new LGAircon2();
		aircon.remoteTurnOn();
		aircon.remoteTurnOff();
		System.out.println("에어컨이 고장나서 수리기사가 왔습니다.");
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
		System.out.println("LG에어컨을 켭니다.");
	}
	@Override
	void remoteTurnOff() {
		System.out.println("LG에어컨을 끕니다.");

	}
	@Override
	void remoteTempUp() {
		System.out.println("LG에어컨의 온도를 올립니다.");

	}
	@Override
	void remoteTempDown() {
		System.out.println("LG에어컨을의 온도를 내립니다.");

	}
	@Override
	void blink() {
		System.out.println("LG에어컨의 고장내용을 깜빡깜빡으로 알려줍니다.");
	}
	
	
}


class SamsungAircon2 extends Aircon2 {
	SamsungAircon2() {
		super("삼성");
	}
	@Override
	void remoteTurnOn() {//너뭐하니 ㅋㅋ^^ 둔둔 다리 둔둔다리 못난 아버지를 둔 딸에게 미안하다@@@@@@@
		System.out.println("삼성에어컨을 켭니다.");
	}
	@Override
	void remoteTurnOff() {
		System.out.println("삼성에어컨을 끕니다.");

	}
	@Override
	void remoteTempUp() {
		System.out.println("삼성에어컨의 온도를 올립니다.");

	}
	@Override
	void remoteTempDown() {
		System.out.println("삼성에어컨을의 온도를 내립니다.");

	}
	@Override
	void blink() {
		System.out.println("삼성 에어컨의 고장내용을 깜빡깜빡으로 알려줍니다.");
	}
	
}

class InminAircon2 extends Aircon2{
	InminAircon2() {
		super("가난한");
	}
	@Override
	void remoteTurnOn() {//너뭐하니 ㅋㅋ^^ 둔둔 다리 둔둔다리 못난 아버지를 둔 딸에게 미안하다@@@@@@@
		System.out.println("가난한 에어컨을 켭니다.");
	}
	@Override
	void remoteTurnOff() {
		System.out.println("가난한 에어컨을 끕니다.");

	}
	@Override
	void remoteTempUp() {
		System.out.println("가난한 에어컨의 온도를 올립니다.");

	}
	@Override
	void remoteTempDown() {
		System.out.println("가난한 에어컨을의 온도를 내립니다.");

	}
	@Override
	void blink() {
		System.out.println("가난한 회사에서는 지원하지 않는 기능입니다..ㅠㅠ");
	}
}
