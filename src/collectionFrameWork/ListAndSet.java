package collectionFrameWork;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class ListAndSet {

	public static void main(String[] args) {
		// ���ư� ť�긦 �����ϴ�. ť��ɼ��� �����̴�. �����
		// ���ƴ� ������� ������ ���� �մϴ�.
		// ȣ������ ť�긦 ������.
		// ü�� ü�� ���� ü�� �ý��� ü�� ���� ü�� �� ü�� ���� ü�� �� ���� ü�� ��� ��������
		// �������� �̱����� �� ������ ^^
		// ���� ���� ���� ���� ^^
		// ���ư� �ѹ����������� �����丮�� ����ȴ� . �׸��� �������� ���ư� ���� ���� �ɼ� ������ ��� ����Ͻÿ�!!!!

		final String BOSS_ATTACK = "�������Ʒ�";
		final String ATTACK = "���ݷ�";
		final String M_ATTACK = "����";
		final String STR = "��";
		final String DEX = "��ø";
		final String INT = "����";
		final String LUK = "���";
		final String ALLSTAT = "�ý���";
		final String HP = "ü��";
		final String MP = "����";

		List<String> cubeHistory = new LinkedList<>();
		cubeHistory.add(HP);
		cubeHistory.add(HP);
		cubeHistory.add(MP);
		cubeHistory.add(HP);
		cubeHistory.add(ALLSTAT);
		cubeHistory.add(HP);
		cubeHistory.add(INT);
		cubeHistory.add(HP);
		cubeHistory.add(STR);
		cubeHistory.add(HP);
		cubeHistory.add(M_ATTACK);
		cubeHistory.add(HP);
		cubeHistory.add(STR);
		cubeHistory.add(MP);
		cubeHistory.add(HP);
		cubeHistory.add(LUK);
		cubeHistory.add(INT);
		cubeHistory.add(INT);
		cubeHistory.add(M_ATTACK);
		cubeHistory.add(BOSS_ATTACK);

		System.out.println(cubeHistory);
		Set<String> cubeSet = new HashSet<>(cubeHistory);
		Iterator<String> iter = cubeSet.iterator();

		while (iter.hasNext()) {
			String abil = iter.next();
			System.out.print(abil+" ");
			if (abil.equals(BOSS_ATTACK) || abil.equals(ATTACK)) {
				System.out.println("�빫����~");

			}
			
			else if (abil.equals(LUK)||abil.equals(ALLSTAT)) {
				System.out.println("�������ʳ� ��");
			}
			else if (abil.equals(M_ATTACK)){
				System.out.println("������;;");
			}
			else {
				System.out.println("��� ����");
			}
		}

	}

}
