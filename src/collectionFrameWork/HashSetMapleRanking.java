package collectionFrameWork;

import java.util.HashSet;

public class HashSetMapleRanking {

	public static void main(String[] args) {
		// ������ ��ŷ �� ������� �����ϴ°�? �˼� �ֵ��� �ؽü��� �̿��غ��� ������ ������ �޴���
		HashSet<Ranker> rankjob = new HashSet<>();
		Ranker tarak = new Ranker("�����", 200);
		Ranker jibal = new Ranker("����", 201);
		Ranker yjk = new Ranker("�����", 205);
		Ranker rudel = new Ranker("�Ƶ�", 203);
		Ranker ridel = new Ranker("�Ƶ�", 207);

		rankjob.add(tarak);
		rankjob.add(jibal);
		rankjob.add(yjk);
		rankjob.add(rudel);
		rankjob.add(ridel);
		System.out.println(rankjob);
		System.out.println(tarak.equals(yjk));
		
	}

}

class Ranker {
	String job;
	int lv;

	Ranker(String job, int lv) {
		this.job = job;
		this.lv = lv;
	}

	public boolean equals(Ranker ranker) {
		if (ranker.job == this.job) {
			return true;
		} else
			return false;
	}

	public String toString() {
		return this.job;
	}

	public int hashCode() {
		if (this.job == "�����") {
			return 1;
		}
		else if (this.job=="�Ƶ�") {
			return 2;
		}
		else if (this.job=="����") {
			return 3;
		}
		else return 0;
	}

}