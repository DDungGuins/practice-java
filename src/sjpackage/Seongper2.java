package sjpackage;

public class Seongper2 {

	public static void main(String[] args) {
		int sug = 58000;
		System.out.println(+sug);//58000
		System.out.println(-sug);//-58000
		System.out.println(sug);//58000
		
		sug = -sug;//sug<--58000
	
		System.out.println(-sug);//+58000
		System.out.println(sug);//-58000
	
		
		//
		int val=3;
		int res1=val+1;
		System.out.println(val);//3
		System.out.println(res1);//4
		int res2=++val;//4
		System.out.println(res2);//4
		System.out.println(val);//4
		int res3=val++;
		System.out.println(res3);//4
		System.out.println(val);//5
		
		
		int x = 5;
		int a = --x + x++ + ++x + x--; 
		//      4 + 4 + 6 + 6
		
		System.out.println(--x);// 5->4
		System.out.println(a++);//20
		System.out.println(a);
		
		int sAge= 19;//���迬����
		boolean tf;
		tf = (sAge>=19);//������ ����� �����ұ��...
		if (tf) {//if��ɾȿ��� ���� ������ (True of False)�� ����.
			System.out.println("����˴ϴ�.");
		}else {
			System.out.println("���������³�~");
		}
	}//a=2


}
