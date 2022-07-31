package chapter5.staticEx;

public class StaticSukje {

	public static void main(String[] args) {
		/*
		 * ������ �κ�����Ʈ�� �ִ�. ���������� �ö�Դ�. ȸ���߿����� ���� ��Ű ���� ������� �̷�D�� �ִ� �׸��� �� 5��� �̸��� 3����
		 * ���������� �о���. ȸ���� ��� ���������� �д� ����� ������ ���� �� ���� ���������� ��ȸ���� 1�� �ö󰣴�. �̰Ÿ� �����ض�.��
		 */
		Member yrs = new Member("����");
		Member delki = new Member("����Ű");
		Member yjk = new Member("���峲������");
		Member tsgg = new Member("�������");
		Member irD = new Member("�̷�D");
		Member nyo = new Member("�¿�");

		Gongzi gzsh = new Gongzi("�ʵ��Խñ�");

		yrs.viewGongzi(gzsh);
		delki.viewGongzi(gzsh);
		yjk.viewGongzi(gzsh);
		tsgg.viewGongzi(gzsh);
		irD.viewGongzi(gzsh);
		nyo.viewGongzi(gzsh);

		Member zap1 = new Member("�������»��1");
		Member zap2 = new Member("�������»��2");
		Member zap3 = new Member("�������»��3");

		
		zap1.viewGongzi(gzsh);
		zap2.viewGongzi(gzsh);
		zap3.viewGongzi(gzsh); 		}

	}

// �޸𸮻� �ö󰡾��Ѵ�

class Member {
	int memNum;
	static int memNumSer = 0; //�̰Ŵ� ���������� �ƴѵ� �׳� ȸ����ȣ�� ����ƽ���� 1�� �þ�� ���� �Ŵ�
	private String id;

	public String getId() {
		return id;
	}

	public void setId(String id) {

		this.id = id;
	}

	Member(String id) {
		memNum = memNumSer;
		memNumSer++;
		this.id = id;
	}

	void viewGongzi(Gongzi gongzi) {
		Gongzi.zohwosuSer++;
		gongzi.zohwosu = Gongzi.zohwosuSer;
		System.out.println(this.id+"�Բ��� "+gongzi.gongName+"�� �о���"
				+ "�ϴ�.");
		System.out.println(gongzi.gongName+"�� ��ȸ���� ���� "+gongzi.zohwosu+"�Դϴ�.");

	}

}

class Gongzi {
	String gongName;
	int gongNum;
	int zohwosu;
	static int gonNumSer = 0; //Serial
	static int zohwosuSer = 0;

	Gongzi(String gongName) {
		this.gongName = gongName;
	}
}
