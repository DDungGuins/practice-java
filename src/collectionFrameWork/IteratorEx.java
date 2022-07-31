package collectionFrameWork;

import java.util.Iterator;
import java.util.LinkedList;

public class IteratorEx {

	public static void main(String[] args) {
		// 링크드 리스트를 쓰면 좋은경우: 리스트 내의 자료들이 순서를 가져야하며, 자료의 신규생성,수정,삭제가 용이하여 자료의 입출력이 많은구조일때
		// 사용하면 좋다 -> 학교에서, 전학온 학생과 전학갈 학생, 그리고 드물게 학생이 개명할때 등 교실의 학생명단을 링크드리스트로 사용하면좋을것
		// 같다.
		// 학생들 번호 있지않 뉘.. 어.... 그......ㅇ<-< 난졌어 큰유라 작은유라

		LinkedList<String> stuList = new LinkedList<>();
		stuList.add("김뚱귄");
		stuList.add("이뚱귄");
		stuList.add("박뚱귄");
		stuList.add("김콩귄");

		stuList.add("최뚱귄");
		stuList.add("조뚱귄");
		stuList.add("배뚱귄");

		// 임뚱귄이 전학을 옴
		stuList.add("임뚱귄");
		// 최뚱귄이 최찰귄으로 개명함
//		System.out.println(stuList.get(3));
		stuList.add(3, "최찰귄");
// 마지막에 넣엇으니..
//		System.out.println(stuList.get(3));
		// 지금 전교생에게 떡을 돌립니다.
		// 한명씩 나와서 떡을 받을 수 있는데 배씨는 떡을 두개줘야합니다
		// 콩귄이는 콩귄반이기 떄문에 만약에 줄을 서있으면 옆반으로 보내야합니다 .(리스트에서 삭제해야합니다.)

//	--for 문을 통한 시도 -> 안됐던 이유, // 원소가 사라지는 경우, 인덱스로 관리하는 포문이 논리적오류를 일으킴
		// 김콩귄이 쫓겨나서 김콩귄이 번호로 갔는데 이미 김콩귄의 번호는 받은걸로취급됐기떄문이지
//		for (int i = 0; i < stuList.size(); i++) {
//			if (stuList.get(i).equals("김콩귄")) {
//				System.out.println(stuList.get(i) + "이가 씩씩거리며 자기반으로 돌아갔습니다.");
//				stuList.remove(i);
//
//			} else if (stuList.get(i).equals("배뚱귄")) {
//				System.out.println(stuList.get(i) + "가 떡을 몰래 하나 더 챙겼습니다.");
//				System.out.println(stuList.get(i) + "가 떡을 받았습니다.");
//
//			} else {
//				System.out.println(stuList.get(i) + "가 떡을 받았습니다.");
//
//			}
//		}.

		// 향상된 for문에서는 컬렉션에 들어있는 원소를 모두 가져와서 반복한다. 근데 반복되는 중에 안에있는 원소의 갯수가 달라지면
		// ConcurrentModificationException 가 발생한다.
		// -> "강 추" 자바의 이터레이터 (내부의 원소가 줄거나 늘 가능성이 있을 경우 사용)

//		for (String guins : stuList) {
//			if (guins.equals("김콩귄")) {
//				System.out.println(guins + "이가 씩씩거리며 자기반으로 돌아갔습니다.");
//				stuList.remove(guins);
//			}
//			else if (guins.equals("배뚱귄")) {
//				System.out.println(guins + "가 떡을 몰래 하나 더 챙겼습니다.");
//
//			}
//			System.out.println(guins + "이/가 떡을 받았습니다.");
//
//		}
		// 혹시 너도 멘붕이왓었니.. iter 가 next말고 이번걸 가리킬순 없니
		Iterator<String> iter = stuList.iterator();
		while (iter.hasNext()) {
			String guin = iter.next();
			if (guin.equals("김콩귄")) {
				System.out.println(guin + "이가 씩씩거리며 자기반으로 돌아갔습니다.");
				iter.remove();
			} else if (guin.equals("배뚱귄")) {
				System.out.println(guin + "이/가 떡을 하나 더 챙겼습니다.");
				System.out.println(guin + "이/가 떡을 받았습니다.");

			} else
				System.out.println(guin + "이/가 떡을 받았습니다.");
		}
		
		System.out.println(stuList.contains("김콩귄")); 
	}

}
