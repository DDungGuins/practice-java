package collectionFrameWork;

import java.util.HashMap;
import java.util.Iterator;

public class HashMapJumsu {

	public static void main(String[] args) {//������ �������ʱ��... ������ �̸� ��Ī...
		// �˻��ߴ�...
		// ���ͷ����Ϳ� ������ ������ִ�.
		// �ٷ� hasNext() => �����ڷᰡ �ִ°�?�� �Ҹ����� �������ش�.
		// �׸��� next �� ���� �ڷḦ �������ش�.
		// �ȵɵ�.. Ȥ�� �� �ȵǴϤ̤� 
		// �ͼ����� �ʴ�..
		// �ױ��� �л����� �⸻��� ���� �ڷḦ ���� (key: �л��̸�, value:����)
		HashMap<String, Integer> gimal = new HashMap<>();
		gimal.put("��ױ�", 80);
		gimal.put("�ڶױ�", 82);
		gimal.put("�ֶױ�", 88);
		gimal.put("�̶ױ�", 90);
		gimal.put("��ױ�", 96);
		System.out.println(gimal);
		gimal.remove("��ױ�");
		System.out.println(gimal);
		System.out.println(gimal.containsValue(90));

		Iterator<String> iter = gimal.keySet().iterator();
		while (iter.hasNext()) {
			String key = iter.next();
			System.out.println(key);
		}

	}

}
