package interfaceEx;

public class InterfaceBasic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 그러게 왜쓰지? 
		// 무슨 말인지 알 것 같긴해
		// 마치 학교에서 교사가 학생한텐 가르쳐주는 기능에 대한 관점으로 바라보지만 학부모는 민원을 넣으려는 관점으로 바라보는것과 같니

		RemoteControllable aircon = new Aircon("LG");
		aircon.remoteTurnOn();
		aircon.remoteTurnOff();
		
		
		
		System.out.println("에어꽁이 고장냣됴요...ㅜㅜ 그래서 수리공이 왔어요");
		EasyInspect airconn = (EasyInspect) aircon;
		airconn.blink(); //여기도 변수이름 다르게 햇는데..
		
		System.out.println("에어컨이 완전이 주것다. 삼성에어컨을 샀다.");
		//aircon.name 
		aircon = new Aircon("삼성");
		aircon.remoteTurnOn();
		aircon.remoteTurnOff();
		
		airconn = (EasyInspect) aircon;// 너 말은 aircon 변수이름 그대로 유지하면서 캐스팅하라는거 아니늬
		airconn.blink();
	}

}
// 사용자를 위한 명세다
interface RemoteControllable{
// 
	void remoteTurnOn ();
	void remoteTurnOff ();
	void remoteTempUp();
	void remoteTempDown();//그러게... 그냥 클래스하나 만들어서 기능을 안에다 넣으면 될것을...


}
// 기존에는 점검기사가 에어컨을 점검하려면 전부 분해해야햇다.
//근데 이 에어컨은 불빛을 깜빡깜빡하는 기능을 넣어서 어떤 부분이 고장났는지 쉽게 점검하게 할 수 있도록 합니다. 
interface EasyInspect{
	void blink ();
		

}



//리모콘은 사람과 에어컨의 인터페이스 역할을 하잖니  그래서 굳이 리모콘이라는 객체를 만들 필요가 없는거지
// 에어컨은 사람이랑 상호작용하기 위해서 리모콘이라는 인터페이스를 제공했다.
			//implements => 구현하다, 실체화하다.					
class Aircon implements RemoteControllable, EasyInspect{
	String name;
	
	Aircon(String name){
		this.name=name;
	}
	
	public void remoteTurnOn () {
		System.out.println(this.name+" 에어컨을 켭니다.");
	}
	public void remoteTurnOff () {
		System.out.println(this.name+" 에어컨을 끕니다.");

	}
	public void remoteTempUp() {
		System.out.println(this.name+" 에어컨의 온도를 올립니다.");

	}

	public void remoteTempDown() {
		System.out.println(this.name+" 에어컨을의 온도를 내립니다.");

	}
	
	public void blink () {
		System.out.println("고장내용을 깜빡깜빡으로 알려줍니다.");
	}
} 