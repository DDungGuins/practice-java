package collectionFrameWork.withoutGenericEx;

import java.util.ArrayList;

public class WithoutGenericEx {

	public static void main(String[] args) {
		/* �ִϸ� �����
		 * �޼��� ���
		 * ���� ������ ����Ʈ�� ����ְ� ��� �޼��带 �����϶�
		 * ����Ʈ�� �� ��� �ִϸ��� ���?
		 * �������̴� ���׸��� ���� �л�����  �װ� ���׸��̴�
		 */
		Animal dog =  new Dog(); 
		Animal cat = new Cat ();
		Animal penguin = new Penguin();
		
		
		ArrayList arraylist = new ArrayList();
		arraylist.add(dog);
		arraylist.add(cat);
		arraylist.add(penguin);
		
	
		Animal d = (Animal) arraylist.get(0);//�̷��� ���� �� ���̴�  �ڵ����� �ȵȴ�
		Animal c = (Animal) arraylist.get(1);
		Animal p = (Animal) arraylist.get(2);
		
		d.ulgi(); c.ulgi(); p.ulgi();
		// �ϱ��ߴµ� �̰� �ƴѰͰ���..
		//�� ����� ��Ҹ� ���� �޼ҵ带 �����Ų�� �ƴ϶� �ٸ� ������ ���ؼ� �޼ҵ带 �����߾�..
		
			
		
		
	}

}
