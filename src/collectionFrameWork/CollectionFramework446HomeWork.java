package collectionFrameWork;

import java.util.HashSet;

public class CollectionFramework446HomeWork {

	public static void main(String[] args) {
		//�� @Override�� �����ʾƼ� �� Ʋ�ȴ������� �𸣴� �ٺ���.
		// equals �� �������̵��Ҷ��� �Ű������� Object�� �־���Ѵ�.
		// HashCode�� �ƴ϶�hashCode��.
		
		HashSet<Studentz> set = new HashSet<Studentz>();
		set.add(new Studentz(100, "ȫ�浿"));
		set.add(new Studentz(200, "������ "));
		set.add(new Studentz(300, "�̼���"));
		set.add(new Studentz(400, "����� "));
		set.add(new Studentz(100, "���߱� "));
		System.out.println(set);

	}
}
class Studentz {
	int id;
	String name;

	Studentz(int id, String name) {
		this.id = id;
		this.name = name;
	}
	//�̰� �ؽü��̶� ���������� ��Ƴ��°žƴϴ� �� �������� �� ��..
	@Override
	public boolean equals (Object o) {
		if (this.id==((Studentz) o).id){
			return true;
		}
		else return false;
	}
	
	public String toString() {
		return this.id+":"+this.name;
	}

	@Override
	public int	hashCode() {
		return this.id;
	}

}

//"�̰� ���߱�� ȫ�浿�� �Ѵ� id�� 100���̶� ��������޹޾Ƽ� �ȵ����ϴµ� ��������."