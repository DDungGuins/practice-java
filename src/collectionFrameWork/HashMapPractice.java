package collectionFrameWork;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map.Entry;

public class HashMapPractice {

	public static void main(String[] args) {
		// 성아교에는 학생이 많아~ 
		// 김콩귄 유콩귄 김뚱귄 /전뚱귄 이뚱귄 김성아 이성아/ 최유라 강선민 이찰귄 구찰귄  문펭수 
		// 학년정보가 값으로 들어있다  1,2,3학년으로 분류해서 출력하고  ㅡㅡ
		// "성씨가 많이 나온 순서대로 갯수출력, 예: 이씨 -3명, 김씨 2명 등/ 같은수일경우 가나다순 출력
		//-> 이걸못했어..
		
		HashMap<Student,Integer> sungGyo = new HashMap<>();
		
		Student kKong = new Student("김콩귄");
		Student uKong = new Student("유콩귄");
		Student kDdung = new Student("김뚱귄");
		
		Student jDdung = new Student("전뚱귄");
		Student lDdung = new Student("이뚱귄");
		Student kSung = new Student("김성아");
		Student lSung = new Student("이성아");
		
		Student cYura = new Student("최유라");
		Student kangS = new Student("강선민");
		Student lChal = new Student("이찰귄");
		Student kuChal = new Student("구찰귄");
		Student moonP = new Student("문펭수");
		
		sungGyo.put(kKong, 1);
		sungGyo.put(uKong, 1);
		sungGyo.put(kDdung, 1);
		
		sungGyo.put(jDdung, 2);
		sungGyo.put(lDdung, 2);
		sungGyo.put(kSung, 2);
		sungGyo.put(lSung, 2);
		
		sungGyo.put(cYura, 3);
		sungGyo.put(kangS, 3);
		sungGyo.put(lChal, 3);
		sungGyo.put(kuChal, 3);
		sungGyo.put(moonP, 3);
		

		Iterator<Entry<Student, Integer>> iter = sungGyo.entrySet().iterator();
		ArrayList <String> firstgrade = new ArrayList<>();
		ArrayList <String> secondrade = new ArrayList<>();
		ArrayList <String> thirdgrade = new ArrayList<>();

		while (iter.hasNext()) {
			Entry<Student, Integer> entry = iter.next();
			
			if (entry.getValue()==1) {
				firstgrade.add(entry.getKey().name);
			}
			else if (entry.getValue()==2) {
				secondrade.add(entry.getKey().name);
			}
			else if (entry.getValue()==3) {
				thirdgrade.add(entry.getKey().name);
			}
			
		}
		
		System.out.println(firstgrade);
		System.out.println(secondrade);
		System.out.println(thirdgrade);
		
		
// 해시맵에 들어간 놈들은 키:스튜던트 / 값:학년 (인티저) 이다
		//거기서 키 값에 들어가있는 스튜던트 의 네임의 문자열 중 성씨를 분류해봐야한다?
		//성씨 카운트  카운트가 왜 맵이니
		// 키와 값의 페어 아니깃니
		//성씨당 사람 수
		// 그럼 맵을 하나 더만들어야하니 안만들수도있니

		Iterator<Student> iter2 = sungGyo.keySet().iterator();
		HashMap <Character,Integer>myoji= new HashMap<>();
	
		while (iter2.hasNext()) {
			char x = iter2.next().name.charAt(0);
			if (myoji.containsKey(x)) {
				myoji.put(x, myoji.get(x)+1);
			}else {myoji.put(x, 1);}
		};
		
		System.out.println(myoji);
			//넌정말천재야......
	//근데 그럼 다시 저 이름 다넣어야하니
		
		
//		while (iter.hasNext()) {
//			HashSet<Student>myoji = new HashSet<>();
//			Student peng = iter.next().getKey();
//			peng.name.charAt(0)

	}

}

class Student {
	String name;

	Student(String name) {
		this.name = name;
	}

}