package chapter5.staticEx;

public class StaticDagger {

	public static void main(String[] args) {
		/* ����: �� ������� ������ ����Ͽ� �й��� ������ �������� �ʰ� 1�� ������Ű�鼭 �� �л������� �ο��� �� �ִ�......?
  		 * �� ������� �ױ� ��� ���� ����� ���� ���Ѻ��Ŷ�
		 * 
		 * 
		 * 
		 * �л� ���� , ����, ���� �� �ִ� �ױϱ��� ����̴�. ������ ������� �ϳ��� �й��� �ο��ȴ� �ױϽ�����Ʈ��� ��ƼƼ�� ���� �Ӽ��� �ִ�.
		 * �ٵ� �ν��Ͻ��� �������� �ʰ� ������ �� ������.....? �����������߸𸣰ٴ�
		 */
		DgStudent sj = new DgStudent("����");
		DgStudent yr = new DgStudent("����");
		DgStudent bc = new DgStudent("����");
		DgStudent dg = new DgStudent("�ױ�");
		DgStudent kg = new DgStudent("���");
		DgStudent cg = new DgStudent("����");
		DgStudent ps = new DgStudent("���");
		
		sj.jagisogae();
		yr.jagisogae();
		bc.jagisogae();
		dg.jagisogae();
		kg.jagisogae();
		cg.jagisogae();
		ps.jagisogae();

//		// �����̰� �ٴϴ� �б��̸��� �ٲ���. �׷��� �����̰� �ٴϴ� �б� �̸���?
//		sj.schoolName="����б�";
//		System.out.println(bc.schoolName);
		// ����ƽ��.. �����̶� ���̴� (��� ��ü�� ��ġ �Ѹ��ξ� �����Ѵ�)
	}
}

class DgStudent {
	static int saengsung = 0;
	int stuNo;
	String name;
	static String schoolName = "�ױ��б�";

	DgStudent(String name) {
		this.name = name;
		stuNo=saengsung;
		saengsung++;
	}

	DgStudent() {

	}

	void jagisogae() {
		System.out.println("��" + this.stuNo+"��" +this.name + "�̴�.");
	}

	// �Ӽ����� �̸� �й� ����б��̸��ٽ�

}