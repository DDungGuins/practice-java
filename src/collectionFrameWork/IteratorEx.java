package collectionFrameWork;

import java.util.Iterator;
import java.util.LinkedList;

public class IteratorEx {

	public static void main(String[] args) {
		// ��ũ�� ����Ʈ�� ���� �������: ����Ʈ ���� �ڷ���� ������ �������ϸ�, �ڷ��� �űԻ���,����,������ �����Ͽ� �ڷ��� ������� ���������϶�
		// ����ϸ� ���� -> �б�����, ���п� �л��� ���а� �л�, �׸��� �幰�� �л��� �����Ҷ� �� ������ �л������ ��ũ�帮��Ʈ�� ����ϸ�������
		// ����.
		// �л��� ��ȣ ������ ��.. ��.... ��......��<-< ������ ū���� ��������

		LinkedList<String> stuList = new LinkedList<>();
		stuList.add("��ױ�");
		stuList.add("�̶ױ�");
		stuList.add("�ڶױ�");
		stuList.add("�����");

		stuList.add("�ֶױ�");
		stuList.add("���ױ�");
		stuList.add("��ױ�");

		// �Ӷױ��� ������ ��
		stuList.add("�Ӷױ�");
		// �ֶױ��� ���������� ������
//		System.out.println(stuList.get(3));
		stuList.add(3, "������");
// �������� �־�����..
//		System.out.println(stuList.get(3));
		// ���� ���������� ���� �����ϴ�.
		// �Ѹ� ���ͼ� ���� ���� �� �ִµ� �达�� ���� �ΰ�����մϴ�
		// ����̴� ��Ϲ��̱� ������ ���࿡ ���� �������� �������� �������մϴ� .(����Ʈ���� �����ؾ��մϴ�.)

//	--for ���� ���� �õ� -> �ȵƴ� ����, // ���Ұ� ������� ���, �ε����� �����ϴ� ������ ���������� ����Ŵ
		// ������� �Ѱܳ��� ������� ��ȣ�� ���µ� �̹� ������� ��ȣ�� �����ɷ���޵Ʊ⋚������
//		for (int i = 0; i < stuList.size(); i++) {
//			if (stuList.get(i).equals("�����")) {
//				System.out.println(stuList.get(i) + "�̰� �����Ÿ��� �ڱ������ ���ư����ϴ�.");
//				stuList.remove(i);
//
//			} else if (stuList.get(i).equals("��ױ�")) {
//				System.out.println(stuList.get(i) + "�� ���� ���� �ϳ� �� ì����ϴ�.");
//				System.out.println(stuList.get(i) + "�� ���� �޾ҽ��ϴ�.");
//
//			} else {
//				System.out.println(stuList.get(i) + "�� ���� �޾ҽ��ϴ�.");
//
//			}
//		}.

		// ���� for�������� �÷��ǿ� ����ִ� ���Ҹ� ��� �����ͼ� �ݺ��Ѵ�. �ٵ� �ݺ��Ǵ� �߿� �ȿ��ִ� ������ ������ �޶�����
		// ConcurrentModificationException �� �߻��Ѵ�.
		// -> "�� ��" �ڹ��� ���ͷ����� (������ ���Ұ� �ٰų� �� ���ɼ��� ���� ��� ���)

//		for (String guins : stuList) {
//			if (guins.equals("�����")) {
//				System.out.println(guins + "�̰� �����Ÿ��� �ڱ������ ���ư����ϴ�.");
//				stuList.remove(guins);
//			}
//			else if (guins.equals("��ױ�")) {
//				System.out.println(guins + "�� ���� ���� �ϳ� �� ì����ϴ�.");
//
//			}
//			System.out.println(guins + "��/�� ���� �޾ҽ��ϴ�.");
//
//		}
		// Ȥ�� �ʵ� ����̿Ӿ���.. iter �� next���� �̹��� ����ų�� ����
		Iterator<String> iter = stuList.iterator();
		while (iter.hasNext()) {
			String guin = iter.next();
			if (guin.equals("�����")) {
				System.out.println(guin + "�̰� �����Ÿ��� �ڱ������ ���ư����ϴ�.");
				iter.remove();
			} else if (guin.equals("��ױ�")) {
				System.out.println(guin + "��/�� ���� �ϳ� �� ì����ϴ�.");
				System.out.println(guin + "��/�� ���� �޾ҽ��ϴ�.");

			} else
				System.out.println(guin + "��/�� ���� �޾ҽ��ϴ�.");
		}
		
		System.out.println(stuList.contains("�����")); 
	}

}
