package collectionFrameWork;

import java.util.ArrayList;

public class ArrayListHomework {

	public static void main(String[] args) {
		// �ܼ��ϰ�, ���� �ڷ��� ���� �� ������ ����,�űԷ� �߰��ϴ� ��찡 ������ ->������ �������߰�
		// �� ���� �β����⵵ ��
		// HashSet�� �߾�︮�� �ٵ� �������� �������͸� �� ��, �������¼����� �������͸� �ϴµ� �׷� ������ �� �� �� �Ѥ�^^
		// �� û�������� ^^
		
		ArrayList<Job> jobs = new ArrayList<>();

		Job adventuror = new Job("���谡");

		jobs.add(adventuror);
	
		Job cygnus = new Job ("�ñ׳ʽ�");
		jobs.add(cygnus);
		
		Job resistance = new Job ("����������");
		jobs.add(resistance);
		
		Job heros =  new Job ("����");
		jobs.add(heros);
	}

}

class Job {
	String jName;

	Job(String jName) {
		this.jName = jName;
	}
}