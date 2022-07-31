package collectionFrameWork;

import java.util.ArrayList;

public class ArrayListHomework {

	public static void main(String[] args) {
		// 단순하게, 내부 자료의 수정 및 삭제가 적고,신규로 추가하는 경우가 많을떄 ->메이플 신직업추가
		// 난 조금 부끄럽기도 해
		// HashSet이 잘어울리면 근데 기존직업 리마스터를 할 때, 먼저나온순으로 리마스터를 하는데 그럼 순서를 모르 잖 니 ㅡㅡ^^
		// 난 청산유수야 ^^
		
		ArrayList<Job> jobs = new ArrayList<>();

		Job adventuror = new Job("모험가");

		jobs.add(adventuror);
	
		Job cygnus = new Job ("시그너스");
		jobs.add(cygnus);
		
		Job resistance = new Job ("레지스탕스");
		jobs.add(resistance);
		
		Job heros =  new Job ("영웅");
		jobs.add(heros);
	}

}

class Job {
	String jName;

	Job(String jName) {
		this.jName = jName;
	}
}