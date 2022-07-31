package collectionFrameWork;

import java.util.HashMap;
import java.util.Iterator;

public class HashMapJumsu {

	public static void main(String[] args) {//맵은뭐 뻔하지않깃니... 점수와 이름 매칭...
		// 검색했다...
		// 이터레이터엔 세가지 기능이있다.
		// 바로 hasNext() => 다음자료가 있는가?를 불린으로 리턴해준다.
		// 그리고 next 는 다음 자료를 가져와준다.
		// 안될듯.. 혹시 왜 안되니ㅜㅜ 
		// 익숙하지 않다..
		// 뚱귄초 학생들의 기말고사 성적 자료를 정리 (key: 학생이름, value:점수)
		HashMap<String, Integer> gimal = new HashMap<>();
		gimal.put("김뚱귄", 80);
		gimal.put("박뚱귄", 82);
		gimal.put("최뚱귄", 88);
		gimal.put("이뚱귄", 90);
		gimal.put("배뚱귄", 96);
		System.out.println(gimal);
		gimal.remove("김뚱귄");
		System.out.println(gimal);
		System.out.println(gimal.containsValue(90));

		Iterator<String> iter = gimal.keySet().iterator();
		while (iter.hasNext()) {
			String key = iter.next();
			System.out.println(key);
		}

	}

}
