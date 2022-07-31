package generic;

//import java.util.ArrayList;

public class BunkerWithoutGeneric {
	int loaded = 0;

	Object[] unitArr = new Object[4];

	void load(Object unit) {

		if (loaded == 4) {
			System.out.println("더이상 탑승할 수 없습니다.");
			return;
		}

		unitArr[loaded] = unit;
		loaded++;

		if (unit instanceof Marine) {
			System.out.println("마린 탑승했습니다. 현재 벙커 내 유닛 수=" + loaded);

		} else if (unit instanceof Firebat) {
			System.out.println("파이어뱃 탑승했습니다. 현재 벙커 내 유닛 수=" + loaded);

		} else if (unit instanceof Ghost) {
			System.out.println("고스트 탑승했습니다. 현재 벙커 내 유닛 수=" + loaded);

		}

		else {
			System.out.println("탑승할 수 없는 유닛입니다.");

		}
		System.out.println("========================================");

	}

	static String getUnitName(Object unit) {
		if (unit instanceof Marine) {
			return ((Marine) unit).name;

		} else if (unit instanceof Firebat) {
			return ((Firebat) unit).name;

		} else if (unit instanceof Ghost) {
			return ((Ghost) unit).name;

		} else
			return "";
// 다른데서도 이름 구할일이 있을것같아서...
	}

	Object unload(int index) {

		if (loaded < index + 1) {
			System.out.println("뺄수없음");
			return null;
		}
		Object returnUnit = unitArr[index];
		System.out.println(BunkerWithoutGeneric.getUnitName(unitArr[index]) + " 빠졌습니다.");
		System.out.println("========================================");

//		for (int i = 0; index + i < 3; i++) {
//			unitArr[index + i] = unitArr[index + (i + 1)];
//		}저희 지우지 마세여..."_@
		for (int i = index; i < loaded - 1; i++) {
			unitArr[i] = unitArr[i + 1];
		}
		unitArr[loaded - 1] = null;

		return returnUnit;
	}

	void bunkerInfo() {
		for (Object unit : unitArr) {
			System.out.println(BunkerWithoutGeneric.getUnitName(unit));
		}
	}

	void attack() {

		for (Object unit : unitArr) {
			if (unit instanceof Marine) {

				((Marine) unit).attack();
			} else if (unit instanceof Firebat) {
				((Firebat) unit).attack();

			} else if (unit instanceof Ghost) {
				((Ghost) unit).attack();

			} else
				System.out.println("========================================");
		}

	}
}

//Object unload(int index) { ㅠㅜ
//if (index >= 4) {
//	System.out.println("지정할 수 없는 값입니다.");
//	return "";
//}
//
//else if (unitArr[index] == null || unitArr[index] == "") {
//	System.out.println(index + "번 칸에 탑승한 유닛이 없습니다.");
//	return "";
//} else {
//
//	Object returnUnit = null;
//
//	switch (index) {
//	case 0:
//
//	{
//		switch (loaded) {
//
//		case 0:
//			System.out.println(index + "번 칸에 탑승한 유닛이 없습니다.");
//			return "";
//
//		case 1:
//			returnUnit = unitArr[0];
//			unitArr[0] = "";
//			break;
//		case 2:
//			returnUnit = unitArr[1];
//			unitArr[0] = unitArr[1];
//			unitArr[1] = "";
//
//			break;
//		case 3:
//			returnUnit = unitArr[2];
//			unitArr[0] = unitArr[1];
//			unitArr[1] = unitArr[2];
//			unitArr[2] = "";
//			break;
//
//		case 4:
//			returnUnit = unitArr[3];
//			unitArr[0] = unitArr[1];
//			unitArr[1] = unitArr[2];
//			unitArr[2] = unitArr[3];
//			unitArr[3] = "";
//
//			break;
//
//		}
//		loaded--;
//		System.out.println(index + "번 칸에 탑승한" + Bunker.getUnitName(unitArr[index]) + " 내렸습니다.");
//		System.out.println("현재 탑승 중인 유닛의 수:" + loaded);
//		System.out.println("========================================");
//		return returnUnit;
//
//	}
//	case 1:
//
//	{
//		switch (loaded) {
//
//		case 0:
//		case 1:
//			System.out.println("내릴수 없습니다.");
//
//			return "";
//		case 2:
//			System.out.println(index + "번 칸에 탑승한 " + Bunker.getUnitName(unitArr[index]) + " 내렸습니다.");
//			loaded--;
//			System.out.println("현재 탑승 중인 유닛의 수:" + loaded);
//			System.out.println("========================================");
//			Object r = unitArr[1];
//
//			unitArr[1] = "";
//			return r;
//
//		case 3:
//			System.out.println(index + "번 칸에 탑승한 " + Bunker.getUnitName(unitArr[index]) + " 내렸습니다.");
//			loaded--;
//			System.out.println("현재 탑승 중인 유닛의 수:" + loaded);
//			System.out.println("========================================");
//			r = unitArr[2];
//
//			unitArr[1] = unitArr[2];
//			unitArr[2] = "";
//			return r;
//
//		case 4:
//			System.out.println(index + "번 칸에 탑승한 " + Bunker.getUnitName(unitArr[index]) + " 내렸습니다.");
//			loaded--;
//			System.out.println("현재 탑승 중인 유닛의 수:" + loaded);
//			System.out.println("========================================");
//			r = unitArr[3];
//
//			unitArr[1] = unitArr[2];
//			unitArr[2] = unitArr[3];
//			unitArr[3] = "";
//			return r;
//
//		}
//	}
//		return "";
//	case 2: {
//		switch (loaded) {
//
//		case 0:
//		case 1:
//		case 2:
//			System.out.println("내릴수 없습니다.");
//
//			return "";
//		case 3:
//			System.out.println(index + "번 칸에 탑승한 " + Bunker.getUnitName(unitArr[index]) + " 내렸습니다.");
//			loaded--;
//			System.out.println("현재 탑승 중인 유닛의 수:" + loaded);
//			System.out.println("========================================");
//			Object r = unitArr[2];
//
//			unitArr[2] = "";
//			return r;
//
//		case 4:
//			System.out.println(index + "번 칸에 탑승한 " + Bunker.getUnitName(unitArr[index]) + " 내렸습니다.");
//			loaded--;
//			System.out.println("현재 탑승 중인 유닛의 수:" + loaded);
//			System.out.println("========================================");
//			r = unitArr[3];
//
//			unitArr[2] = unitArr[3]; // 2.4
//			unitArr[3] = "";
//			return r;
//
//		}
//	}
//		return "";
//	case 3: {
//		switch (loaded) {
//
//		case 0:
//		case 1:
//		case 2:
//		case 3:
//			System.out.println("내릴수 없습니다.");
//			loaded--;
//			return "";
//		case 4:
//			System.out.println(index + "번 칸에 탑승한 " + unitArr[index].getClass() + " 내렸습니다.");
//			loaded--;
//			System.out.println("현재 탑승 중인 유닛의 수:" + loaded);
//			System.out.println("========================================");
//			Object r = unitArr[3];
//
//			unitArr[3] = "";
//			return r;
//
//		}
//
//		return "";
//	}
//	default: {
//		System.out.println("알 수 없는 에러");
//		return "";
//	}
//	}
//
//}
//}