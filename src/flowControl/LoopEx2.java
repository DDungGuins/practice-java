package flowControl;

public class LoopEx2 {

	public static void main(String[] args) {
		// 1~100���ڰ��ִ�
		//1������ : 1~100������ 5�� ����� ������ ������ ���� ��� ���϶�
		//2������ : 1~100���� ���������� ���ϴµ� �� ���� ������ ��, �� �����  �����ڸ����� 3�� ����� �� ���� ������ �ʱ�
		// �´� ���� 
		
		int sum=0;
		for (int i=0 ; i<=100;i++) {
			if (i%5==0) {
				continue;
			}
			sum+=i;
			
		}
		//�״ϱ� ������� 1+2�� �ؾ��ϴ� ���ʸ� 1+2=3�̴ϱ� �װ� ��ŵ�ϰ� 1+3�� �ϴ°Ŵ�
		
		System.out.println(sum);
		
		int sum2=0;
		for (int i=0; i<=100; i++) {
			if(sum2+i%10%3==0) {
				continue;
			}
			else sum2+=i;
		}
		System.out.println(sum2);

	}

	
	
		
}
