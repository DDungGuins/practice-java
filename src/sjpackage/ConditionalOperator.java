package sjpackage;

public class ConditionalOperator {

	public static void main(String[] args) {
		//�䱸����
		//���ǿ����ڸ� ����ؼ� �����԰� 70�� ������ ����, �ƴϸ� �㵹�̰� �ǵ��� ����
		
		int wt=80;
		String str=(wt>70)?"����":"�㵹��";
		System.out.println(str);
		
		if(wt>70) {
			System.out.println("����");
		}
		else {
			System.out.println("�㵹��");
		}
	}

}
