package generic;

public class GenericBasic {

	public static void main(String[] args) {
		// 벙커 . 마린 파이어벳  고스트만 들어갈 수 잇다고 가정한다
		// 한 종류만 가능
		// 마린은 두두두두 쏜다
		// 파이어뱃은 푸시푸시푸시 
		// 고스트는 칩칩칩칩 쏜다
		// 4마리까지 들어갈 수 있다
		// 현재 벙커에 들어있는 수만큼 공격한다. 
		// 벙커는 세개다 하나는 마린, 하나는 파뱃,하나는 고스트 다 
		// 세 벙커에 각각 유닛을 넣어 공격한다
		
		Bunker<Marine> aBunker = new Bunker<>(Marine.class, 4);
		
		
		aBunker.load(new Marine("마식이"));
		aBunker.load(new Marine("마돌이"));
		aBunker.load(new Marine("마라탕"));

		//m.shoot();
		
		
		aBunker.unload(0);
		aBunker.bunkerInfo();
		aBunker.attackk();
	
	}

}
