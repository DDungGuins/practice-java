package sjpackage;

public class Logical {

	public static void main(String[] args) {
		//������䰡 �ִ�.���̰� 9�� ���� Or 65�� �̻� �̸� ���� �ݰ��� �޴´�.
		//����� ���� ����ΰ�?
		int age=50000; //���� ���̴� ����Դϱ�?
		boolean waribiki=(age<=9||age>=65); //9�� ���� �Ǵ� 65�� �̻��̳�? ��� ������ waribiki���ٰ� �����Ѵ�(�Ͷ�񳢴� ���� �����ϱ�)
		if (waribiki) {//���� �͸��� ������ ���̶�� (9������, 65���̻�) �̶��->�ݰ� 
			System.out.println("�ݰ��� ���̼�");
		}else {
			System.out.println("�� �����³�");//�ƴ϶�� �� ���� �����մϴ�.
		}
	}//30���ϱ� ���� �����;߰���?

}
