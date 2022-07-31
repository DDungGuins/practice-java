package collectionFrameWork;

import java.util.ArrayList;
import java.util.LinkedList;
import java.time.Duration;
import java.time.Instant;

public class ArrayLinkedListFastExperiment {

	public static void main(String[] args) {
		// // 어레이리스트와 링크드 리스트의
		// 공통점: 선형구조, 먼저 들어온것이 먼저 저장됨, 순서를 가짐, 중복을 허용함
		// 차이점: 어레이리스트는 배열로 자료를 구별함(인덱스번호)
		// 차이점: 링크드 리스트는 자료가 다음자료의 주소값을 가짐 (이전,다음주소 모두 가지고있는것도 있음)
		// case1: 중간에 데이터 삽입을 할 때 (경우 : 맨처음, 중간, 마지막) 어떤 과정을 통해서 처리되는가?
		// 어레이리스트
		// 1) 맨처음에 넣을때: 1번자료부터 마지막자료까지 자기인덱스번호의 +1번배열로 옮기고 0번에 자료 삽입
		// 2) 중간에 넣을때: 들어갈 자리 x번 이후의 자료들을 자기인덱스번호 +1번배열로 옮기고 x번에 자료 삽입
		// 3) 마지막에 넣을때: 그 배열의 length번 인덱스에 자료 삽입
		// 링크드리스트
		// 1) 맨처음에 넣을 때: 자료를 임의의 메모리공간에 삽입후, 삽입된 자료가 기존의 0번 자료의 주소값을 가리키도록 수정
		// 2) 중간에 넣을 때: 자료를 임의의 메모리공간에 삽입후, x-1번째 자료가 새로삽입된 자료의 주소값을가리키도록 수정,
		// 그리고 새롭게 삽입된 X번쨰 자료가 X+1자료의 주소값을 가리키도록 지정함
		// 3 ) 마지막에 넣을 떄: 자료를 임의의 메모리공간에 삽입후, 기존의 마지막 자료가 새로 삽입된 자료의 주소값을 가리키도록 수정
		// case2: 8번째자료를 가져올 때 각각 어떤 과정을 통해 8번자료를 참조하는가?
		// 1) 어레이리스트: 인덱스값을 지정하여 8번째 자료를 바로 가져옴 O(1)
		// 2) 링크드리스트 : 0->1->2->3...->7의 과정을 거쳐 가져옴 O(N)

		ArrayList<Integer> iArr = new ArrayList<>();
		LinkedList<Integer> iLink = new LinkedList<>();
		for (int i = 0; i < 100000; i++) {
			iLink.add(i);
		}

//		for (int i = 0; i < 100000; i++) {
//			iArr.add(i);
//		}

		Instant start = Instant.now();
		for (int i = 0; i < 10000; i++) {
			int removed = iLink.remove(88888);
			System.out.println(removed);

		}
		// --검색--(자료량: 천만)
		// 링크드리스트 (인덱스:500만, 검색 1000번반복 ->33.606 초)
		// 어레이리스트 (인덱스: 500만, 검색 1000번반복->0초)

		// --삭제-- (자료량: 천만)
		// 링크드리스트 (인덱스: 1000,. 삭제 1만번 반복->0.05초)
		// 어레이리스트(인덱스: 1000, 삭제 1만번 반복-> 47.847초)

		// 링크드리스트 (인덱스: 500만,. 삭제 1만번 반복->매우오래걸림)
		// 어레이리스트 (인덱스: 500만, 삭제 1만번 반복->23.911초)

		// 링크드리스트 (인덱스: 600만,. 삭제 1만번 반복->역시나 매우오래걸림. 그러나 속도를 보니 500만보단빠른듯 속)
		// 어레이리스트 (인덱스: 600만, 삭제 1만번 반복->19.186초)
		
		// 링크드리스트 (인덱스: 850만,. 삭제 1만번 반복-> 85.134초)
		// 어레이리스트 (인덱스: 850만, 삭제 1만번 반복->7.298초)

		// 링크드리스트(인덱스:9950000, 삭제 1만번, ->0.059초)
		// 어레이리스트(인덱스:9950000, 삭제 1만번, ->추측하건데 0.094초~)
		//--삭제 --(자료량: 십만)
		// 링크드리스트(인덱스:2만, 삭제 1만번, ->0.722초)
		// 어레이리스트(인덱스:2만, 삭제 1만번, ->추측하건데 0.137초~)
		// 링크드리스트(인덱스:2만, 삭제 1천번, ->0.044초) "나의 승리다" 
		// 어레이리스트(인덱스:2만, 삭제 1천번, ->추측하건데 0.161초~)
		// 링크드리스트(인덱스:88888, 삭제 1만번, ->0.044초) "나의 승리다" 
		// 어레이리스트(인덱스:88888, 삭제 1만번, ->추측하건데 0.161초~)
		
		Instant finish = Instant.now();
		long elapsedTime = Duration.between(start, finish).toMillis();
		System.out.println("elapsedTime(ms) : " + elapsedTime);

//		for (int i = 0; i < 10000000; i++) {
//		iLink.add(i);
//	}

//		for (int i = 0; i < 10000000; i++) {
//			iLink.add(i);
//		}
	}

}
