package interfaceEx;

public class InterfaceBasic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub �׷��� �־���? 
		// ���� ������ �� �� ������
		// ��ġ �б����� ���簡 �л����� �������ִ� ��ɿ� ���� �������� �ٶ����� �кθ�� �ο��� �������� �������� �ٶ󺸴°Ͱ� ����

		RemoteControllable aircon = new Aircon("LG");
		aircon.remoteTurnOn();
		aircon.remoteTurnOff();
		
		
		
		System.out.println("������� ����n�Ϳ�...�̤� �׷��� �������� �Ծ��");
		EasyInspect airconn = (EasyInspect) aircon;
		airconn.blink(); //���⵵ �����̸� �ٸ��� �޴µ�..
		
		System.out.println("�������� ������ �ְʹ�. �Ｚ�������� ���.");
		//aircon.name 
		aircon = new Aircon("�Ｚ");
		aircon.remoteTurnOn();
		aircon.remoteTurnOff();
		
		airconn = (EasyInspect) aircon;// �� ���� aircon �����̸� �״�� �����ϸ鼭 ĳ�����϶�°� �ƴϴ�
		airconn.blink();
	}

}
// ����ڸ� ���� ����
interface RemoteControllable{
// 
	void remoteTurnOn ();
	void remoteTurnOff ();
	void remoteTempUp();
	void remoteTempDown();//�׷���... �׳� Ŭ�����ϳ� ���� ����� �ȿ��� ������ �ɰ���...


}
// �������� ���˱�簡 �������� �����Ϸ��� ���� �����ؾ��޴�.
//�ٵ� �� �������� �Һ��� ���������ϴ� ����� �־ � �κ��� ���峵���� ���� �����ϰ� �� �� �ֵ��� �մϴ�. 
interface EasyInspect{
	void blink ();
		

}



//�������� ����� �������� �������̽� ������ ���ݴ�  �׷��� ���� �������̶�� ��ü�� ���� �ʿ䰡 ���°���
// �������� ����̶� ��ȣ�ۿ��ϱ� ���ؼ� �������̶�� �������̽��� �����ߴ�.
			//implements => �����ϴ�, ��üȭ�ϴ�.					
class Aircon implements RemoteControllable, EasyInspect{
	String name;
	
	Aircon(String name){
		this.name=name;
	}
	
	public void remoteTurnOn () {
		System.out.println(this.name+" �������� �մϴ�.");
	}
	public void remoteTurnOff () {
		System.out.println(this.name+" �������� ���ϴ�.");

	}
	public void remoteTempUp() {
		System.out.println(this.name+" �������� �µ��� �ø��ϴ�.");

	}

	public void remoteTempDown() {
		System.out.println(this.name+" ���������� �µ��� �����ϴ�.");

	}
	
	public void blink () {
		System.out.println("���峻���� ������������ �˷��ݴϴ�.");
	}
} 