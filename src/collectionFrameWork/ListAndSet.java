package collectionFrameWork;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class ListAndSet {

	public static void main(String[] args) {
		// 성아가 큐브를 돌립니다. 큐브옵션은 한줄이다. 상수로
		// 성아는 순서대로 다음과 같이 합니다.
		// 호영으로 큐브를 돌린다.
		// 체력 체력 마나 체력 올스텟 체력 지능 체력 힘 체력 마력 체력 힘 마나 체력 행운 나왔지만
		// 더좋은걸 뽑기위해 더 돌렸지 ^^
		// 지능 지능 마력 보공 ^^
		// 성아가 한번돌릴때마다 히스토리에 저장된다 . 그리고 마지막에 성아가 여태 나온 옵션 종류를 모두 출력하시오!!!!

		final String BOSS_ATTACK = "보스공걱력";
		final String ATTACK = "공격력";
		final String M_ATTACK = "마력";
		final String STR = "힘";
		final String DEX = "민첩";
		final String INT = "지능";
		final String LUK = "행운";
		final String ALLSTAT = "올스탯";
		final String HP = "체력";
		final String MP = "마나";

		List<String> cubeHistory = new LinkedList<>();
		cubeHistory.add(HP);
		cubeHistory.add(HP);
		cubeHistory.add(MP);
		cubeHistory.add(HP);
		cubeHistory.add(ALLSTAT);
		cubeHistory.add(HP);
		cubeHistory.add(INT);
		cubeHistory.add(HP);
		cubeHistory.add(STR);
		cubeHistory.add(HP);
		cubeHistory.add(M_ATTACK);
		cubeHistory.add(HP);
		cubeHistory.add(STR);
		cubeHistory.add(MP);
		cubeHistory.add(HP);
		cubeHistory.add(LUK);
		cubeHistory.add(INT);
		cubeHistory.add(INT);
		cubeHistory.add(M_ATTACK);
		cubeHistory.add(BOSS_ATTACK);

		System.out.println(cubeHistory);
		Set<String> cubeSet = new HashSet<>(cubeHistory);
		Iterator<String> iter = cubeSet.iterator();

		while (iter.hasNext()) {
			String abil = iter.next();
			System.out.print(abil+" ");
			if (abil.equals(BOSS_ATTACK) || abil.equals(ATTACK)) {
				System.out.println("노무좋노~");

			}
			
			else if (abil.equals(LUK)||abil.equals(ALLSTAT)) {
				System.out.println("나쁘진않네 ㅋ");
			}
			else if (abil.equals(M_ATTACK)){
				System.out.println("삭제좀;;");
			}
			else {
				System.out.println("잡옵 망겜");
			}
		}

	}

}
