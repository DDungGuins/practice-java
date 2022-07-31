package collectionFrameWork;

import java.util.HashSet;

public class HashSetMapleRanking {

	public static void main(String[] args) {
		// 메이플 랭킹 중 어떤직업이 분포하는가? 알수 있도록 해시셋을 이용해보려 했으나 난항을 겪는중
		HashSet<Ranker> rankjob = new HashSet<>();
		Ranker tarak = new Ranker("히어로", 200);
		Ranker jibal = new Ranker("나로", 201);
		Ranker yjk = new Ranker("히어로", 205);
		Ranker rudel = new Ranker("아델", 203);
		Ranker ridel = new Ranker("아델", 207);

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
		if (this.job == "히어로") {
			return 1;
		}
		else if (this.job=="아델") {
			return 2;
		}
		else if (this.job=="나로") {
			return 3;
		}
		else return 0;
	}

}