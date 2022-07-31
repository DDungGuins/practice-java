package collectionFrameWork;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class ColletionFrameWorkBasic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*이율돈의 요구사항:
		 * 송파구경찰서에서..최근 범죄를 저지른 사람들의 리스트를 챱뽑을라고한다.
		 * 범죄를저지른 순서: 콩귄(악덕범죄자)- > 뚱귄 (생계형범죄자) -> 콩귄 -> 찰귄(경범죄) -> 콩귄(연쇄범죄)->콩귄 (전과4범)
		 * 송파구에서 일어난 범죄를 일으킨 범죄자 순서, 송파구의 범죄자 리스트 를 출력하라고 햇는데 내가 이거 지금몰라도 풀수있는거니
		 뮈어니 범죄기록담당 성아는 꿀빠는걸 좋아해서 일을 두번하지않는다. 대신 범죄자 리스트를 기계에 쫙 넣을수잇다?????
		 
		 * 범죄 별 벌금 테이블을 만들어보자 //도둑질 5천원, 폭행 3만원, 무단횡단 십만원, 음주운전 8천원, 기물파손 5천원
		 * 범죄목록은 클래스를만드니 그냥 스트링이니 스트링치즈
		 * 
		 */
		
		
		ArrayList<Criminal> guinsTimelist = new ArrayList<>();
		Criminal kong =new Criminal ("흉악범죄자 콩귄");
		Criminal ddung = new Criminal ("생계형범죄자 뚱귄");
		Criminal chal = new Criminal ("무단횡단 찰귄");
		
		guinsTimelist.add(kong); 
		guinsTimelist.add(ddung);
		guinsTimelist.add(kong);
		guinsTimelist.add(chal);
		guinsTimelist.add(kong);
		guinsTimelist.add(kong);
		
		//SET에는 중복이 없다. 그리고 순서도 보장하지 않음 속도? 흠...
		HashSet<Criminal> guinsSet = new HashSet<>();
		guinsSet.add(kong);
		guinsSet.add(ddung);
		guinsSet.add(kong);
		guinsSet.add(chal);
		guinsSet.add(kong);
		guinsSet.add(kong);

		
		
		for (Criminal guin : guinsTimelist) {
			System.out.println(guin.name);
		}
		System.out.println("====================");

		for (Criminal guin : guinsSet) {
			System.out.println(guin.name);
		}
		// 각종 펭귄들은 범죄를 저지를 때마다 벌금을 물었습니다.
		// 범죄자와 벌금내역을 묶어서 출력하라 이말이니
////		 * 범죄 별 벌금 테이블을 만들어보자 //도둑질 5천원, 폭행 3만원, 무단횡단 십만원, 음주운전 8천원, 기물파손 5천원
//		 * 범죄목록은 클래스를만드니 그냥 스트링
		HashMap<String, Integer> costMap = new HashMap<>();
		HashMap<String, Integer> costMap1 = new HashMap<>();

		costMap.put("도둑질", 5000);
		costMap.put("폭행", 30000);
		costMap.put("무단횡단", 100000);
		costMap.put("음주운전", 8000);
		costMap.put("기물파손", 5000);
		costMap.put("폭행", 200000);
		
		costMap1.put("도둑질", 5000);//이게 연산이 되나?
		costMap1.put("폭행", 30000);//  이렇게 하면 콩귄이가 2000원+5000원의 벌금을 무는게 아니라  
		costMap1.put("무단횡단", 100000);
		costMap1.put("음주운전", 8000);
		costMap1.put("기물파손", 5000);
		costMap1.put("폭행", 200000);
		//혹시 해시맵이라 해시함수를 통해 자료로 변환되어 저장되는데
		// 해시함수는 바뀌지않기때문에 입력한 순서가 같으니 (순서대로저장된다는뜻은아니고) 그대로 저장되는게 맞니
		
		System.out.println(guinsTimelist);//
		System.out.println(guinsSet);
		System.out.println(guinsSet);
		System.out.println(guinsSet);
		System.out.println(costMap);
		System.out.println(costMap1);
 	}

}

class Criminal {
	String name;
	
	
	Criminal (String name) {
		this.name=name;
	}
	public String toString () {
		return this.name;
	}
	




}
