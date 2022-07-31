package collectionFrameWork;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map.Entry;

public class HashMapPractice {

	public static void main(String[] args) {
		// ���Ʊ����� �л��� ����~ 
		// ����� ����� ��ױ� /���ױ� �̶ױ� �輺�� �̼���/ ������ ������ ������ ������  ����� 
		// �г������� ������ ����ִ�  1,2,3�г����� �з��ؼ� ����ϰ�  �Ѥ�
		// "������ ���� ���� ������� �������, ��: �̾� -3��, �达 2�� ��/ �������ϰ�� �����ټ� ���
		//-> �̰ɸ��߾�..
		
		HashMap<Student,Integer> sungGyo = new HashMap<>();
		
		Student kKong = new Student("�����");
		Student uKong = new Student("�����");
		Student kDdung = new Student("��ױ�");
		
		Student jDdung = new Student("���ױ�");
		Student lDdung = new Student("�̶ױ�");
		Student kSung = new Student("�輺��");
		Student lSung = new Student("�̼���");
		
		Student cYura = new Student("������");
		Student kangS = new Student("������");
		Student lChal = new Student("������");
		Student kuChal = new Student("������");
		Student moonP = new Student("�����");
		
		sungGyo.put(kKong, 1);
		sungGyo.put(uKong, 1);
		sungGyo.put(kDdung, 1);
		
		sungGyo.put(jDdung, 2);
		sungGyo.put(lDdung, 2);
		sungGyo.put(kSung, 2);
		sungGyo.put(lSung, 2);
		
		sungGyo.put(cYura, 3);
		sungGyo.put(kangS, 3);
		sungGyo.put(lChal, 3);
		sungGyo.put(kuChal, 3);
		sungGyo.put(moonP, 3);
		

		Iterator<Entry<Student, Integer>> iter = sungGyo.entrySet().iterator();
		ArrayList <String> firstgrade = new ArrayList<>();
		ArrayList <String> secondrade = new ArrayList<>();
		ArrayList <String> thirdgrade = new ArrayList<>();

		while (iter.hasNext()) {
			Entry<Student, Integer> entry = iter.next();
			
			if (entry.getValue()==1) {
				firstgrade.add(entry.getKey().name);
			}
			else if (entry.getValue()==2) {
				secondrade.add(entry.getKey().name);
			}
			else if (entry.getValue()==3) {
				thirdgrade.add(entry.getKey().name);
			}
			
		}
		
		System.out.println(firstgrade);
		System.out.println(secondrade);
		System.out.println(thirdgrade);
		
		
// �ؽøʿ� �� ����� Ű:��Ʃ��Ʈ / ��:�г� (��Ƽ��) �̴�
		//�ű⼭ Ű ���� ���ִ� ��Ʃ��Ʈ �� ������ ���ڿ� �� ������ �з��غ����Ѵ�?
		//���� ī��Ʈ  ī��Ʈ�� �� ���̴�
		// Ű�� ���� ��� �ƴϱ��
		//������ ��� ��
		// �׷� ���� �ϳ� ���������ϴ� �ȸ�������ִ�

		Iterator<Student> iter2 = sungGyo.keySet().iterator();
		HashMap <Character,Integer>myoji= new HashMap<>();
	
		while (iter2.hasNext()) {
			char x = iter2.next().name.charAt(0);
			if (myoji.containsKey(x)) {
				myoji.put(x, myoji.get(x)+1);
			}else {myoji.put(x, 1);}
		};
		
		System.out.println(myoji);
			//������õ���......
	//�ٵ� �׷� �ٽ� �� �̸� �ٳ־���ϴ�
		
		
//		while (iter.hasNext()) {
//			HashSet<Student>myoji = new HashSet<>();
//			Student peng = iter.next().getKey();
//			peng.name.charAt(0)

	}

}

class Student {
	String name;

	Student(String name) {
		this.name = name;
	}

}