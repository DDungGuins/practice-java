package collectionFrameWork.withoutGenericEx;

import java.util.ArrayList;

public class WithGeneric {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Animal dog =  new Dog(); 
		Animal cat = new Cat ();
		Animal penguin = new Penguin();
		
		
		ArrayList<Animal> arraylist = new ArrayList<Animal>(); //�� �� �� ������ �ߴ� �Ѥ�
		arraylist.add(dog);
		arraylist.add(cat);
		arraylist.add(penguin);
		
	
		arraylist.get(0).ulgi();//�̷��� ���� �� ���̴�  �ڵ����� �ȵȴ�
		arraylist.get(1).ulgi();
		arraylist.get(2).ulgi();
		
		// �ϱ��ߴµ� �̰� �ƴѰͰ���..
		//�� ����� ��Ҹ� ���� �޼ҵ带 �����Ų�� �ƴ϶� �ٸ� ������ ���ؼ� �޼ҵ带 �����߾�..
		//��� ���ڵ� ä�� 30�ʸ�..
		
			
	}

}
