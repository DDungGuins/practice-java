package collectionFrameWork;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class ColletionFrameWorkBasic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*�������� �䱸����:
		 * ���ı�����������..�ֱ� ���˸� ������ ������� ����Ʈ�� �y��������Ѵ�.
		 * ���˸������� ����: ���(�Ǵ�������)- > �ױ� (������������) -> ��� -> ����(�����) -> ���(�������)->��� (����4��)
		 * ���ı����� �Ͼ ���˸� ����Ų ������ ����, ���ı��� ������ ����Ʈ �� ����϶�� �޴µ� ���� �̰� ���ݸ��� Ǯ���ִ°Ŵ�
		 ����� ���˱�ϴ�� ���ƴ� �ܺ��°� �����ؼ� ���� �ι������ʴ´�. ��� ������ ����Ʈ�� ��迡 �� �������մ�?????
		 
		 * ���� �� ���� ���̺��� ������ //������ 5õ��, ���� 3����, ����Ⱦ�� �ʸ���, ���ֿ��� 8õ��, �⹰�ļ� 5õ��
		 * ���˸���� Ŭ����������� �׳� ��Ʈ���̴� ��Ʈ��ġ��
		 * 
		 */
		
		
		ArrayList<Criminal> guinsTimelist = new ArrayList<>();
		Criminal kong =new Criminal ("��ǹ����� ���");
		Criminal ddung = new Criminal ("������������ �ױ�");
		Criminal chal = new Criminal ("����Ⱦ�� ����");
		
		guinsTimelist.add(kong); 
		guinsTimelist.add(ddung);
		guinsTimelist.add(kong);
		guinsTimelist.add(chal);
		guinsTimelist.add(kong);
		guinsTimelist.add(kong);
		
		//SET���� �ߺ��� ����. �׸��� ������ �������� ���� �ӵ�? ��...
		HashSet<Criminal> guinsSet = new HashSet<>();
		guinsSet.add(kong);
		guinsSet.add(ddung);
		guinsSet.add(kong);
		guinsSet.add(chal);
		guinsSet.add(kong);
		guinsSet.add(kong);

		
		
		for (Criminal guin : guinsTimelist) {
			System.out.println(guin.name);
		}
		System.out.println("====================");

		for (Criminal guin : guinsSet) {
			System.out.println(guin.name);
		}
		// ���� ��ϵ��� ���˸� ������ ������ ������ �������ϴ�.
		// �����ڿ� ���ݳ����� ��� ����϶� �̸��̴�
////		 * ���� �� ���� ���̺��� ������ //������ 5õ��, ���� 3����, ����Ⱦ�� �ʸ���, ���ֿ��� 8õ��, �⹰�ļ� 5õ��
//		 * ���˸���� Ŭ����������� �׳� ��Ʈ��
		HashMap<String, Integer> costMap = new HashMap<>();
		HashMap<String, Integer> costMap1 = new HashMap<>();

		costMap.put("������", 5000);
		costMap.put("����", 30000);
		costMap.put("����Ⱦ��", 100000);
		costMap.put("���ֿ���", 8000);
		costMap.put("�⹰�ļ�", 5000);
		costMap.put("����", 200000);
		
		costMap1.put("������", 5000);//�̰� ������ �ǳ�?
		costMap1.put("����", 30000);//  �̷��� �ϸ� ����̰� 2000��+5000���� ������ ���°� �ƴ϶�  
		costMap1.put("����Ⱦ��", 100000);
		costMap1.put("���ֿ���", 8000);
		costMap1.put("�⹰�ļ�", 5000);
		costMap1.put("����", 200000);
		//Ȥ�� �ؽø��̶� �ؽ��Լ��� ���� �ڷ�� ��ȯ�Ǿ� ����Ǵµ�
		// �ؽ��Լ��� �ٲ����ʱ⶧���� �Է��� ������ ������ (�����������ȴٴ¶����ƴϰ�) �״�� ����Ǵ°� �´�
		
		System.out.println(guinsTimelist);//
		System.out.println(guinsSet);
		System.out.println(guinsSet);
		System.out.println(guinsSet);
		System.out.println(costMap);
		System.out.println(costMap1);
 	}

}

class Criminal {
	String name;
	
	
	Criminal (String name) {
		this.name=name;
	}
	public String toString () {
		return this.name;
	}
	




}
