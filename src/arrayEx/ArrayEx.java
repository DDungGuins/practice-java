package arrayEx;

public class ArrayEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		MapleChara [] union = new MapleChara[40];
//
//		union[0] = new MapleChara("zl������");
//		union[1] = new MapleChara("zl������1");
//		union[2] = new MapleChara("zl������2");
//
//		int [] level = new int [] {0,1,2,3,4,5};//��ٷο� �༮�̳� 		
		// �迭��...ũ��(������ ����)�� �̸� ���س��� ������ ���� ���̴�. ���ϱ�? �̸� ������ �����صθ� ������ִ� ���� ���� ��������̿���
		// ������ ������ ã�ư� �� �ֱ� �����̴� ����Դ´ܰŴ�

		// ������ 100���� �ִ�. �̸��� ���� x�� �������Դϴ�. 100���� �����϶�
//		Dokebi dok1 = new Dokebi('������1');
//		Dokebi dok2 = new Dokebi('������2');
//		Dokebi dok3 = new Dokebi('������3');
//		Dokebi dok4 = new Dokebi('������4');

		Dokebi[] dokebi = new Dokebi[22222];

		// ������ �迭�� ������ 100�� �������
//		dokebi[0].nickName="������1";
//		dokebi[1].nickName="������2";

		// ��... �� ��������� ���� ��........

		for (int i = 0; i < dokebi.length; i++) {
			dokebi[i] = new Dokebi("������" + (i + 1)); // ������ �迭�� ���� ������[0], ���ƺ�[1]...�� ��μ� ������
//			dokebi[i].nickName = "������" + i;
			// �迭�� �ν��Ͻ��� ������µ� ������ ���ҿ� ���� �ν��Ͻ��� ����. �װ� ����ϴ°�?
			// ������ �迭�� i��° ������ �г��� �ɹ��������ٰ� ������i�� �����Ѵ�
			// dokebi [] =
			System.out.println(dokebi[i].nickName);
		}

		System.out.println(dokebi.length);
	}

}

class Dokebi {

	String nickName;

	Dokebi(String nickName) {
		this.nickName = nickName;

	}
}