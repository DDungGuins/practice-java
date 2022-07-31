package generic;

import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/*제네릭 :
 *  클래스 내부에서 쓰이는 변수타입이있다...
 *  클래스내부의 변수타입을 결정해준다.. 제네릭이...
 *   
*/

public class Bunker<T> {
	int loaded = 0;
//@_"
	
//	T[] unitArr = new T[4]; 무슨 타입이 올지 모르기때문에 클래스 정보가 없어서 인스턴스 생성을 할 수 없었다. 그래서
// 구글에 다가 generic new array라고 검색했다...
	
	T[] unitArr; 
	
	Bunker(Class<T> clazz, int capacity){
		 unitArr = (T[]) Array.newInstance(clazz, capacity);
	}

	void load(T unit) {

		if (loaded == 4) {
			System.out.println("더이상 탑승할 수 없습니다.");
			return;
		}

		unitArr[loaded] = unit;
		loaded++;
		System.out.println(unit.getClass().getSimpleName()+" 탑승했습니다. 현재 벙커 내 유닛 수=" + loaded);
//
//		if (unit instanceof Marine) {
//			System.out.println("마린 탑승했습니다. 현재 벙커 내 유닛 수=" + loaded);
//
//		} else if (unit instanceof Firebat) {
//			System.out.println("파이어뱃 탑승했습니다. 현재 벙커 내 유닛 수=" + loaded);
//
//		} else if (unit instanceof Ghost) {
//			System.out.println("고스트 탑승했습니다. 현재 벙커 내 유닛 수=" + loaded);
//
//		}

//		else {
//			System.out.println("탑승할 수 없는 유닛입니다.");
//
//		}
		System.out.println("========================================");

	}


	T unload(int index) {
		if (loaded < index + 1) {
			System.out.println("뺄수없음");
			return null;
		}
		T returnUnit = unitArr[index];
		String name = "";
		try {
//			name = (String) returnUnit.getClass().getMethod("getName", null).invoke(returnUnit, null);
			Class<? extends T> clazz = (Class<? extends T>) returnUnit.getClass();
			Method method = clazz.getMethod("getName", null);
			name = (String) method.invoke(returnUnit, null);
		} catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException | NoSuchMethodException
				| SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println( name + " 빠졌습니다.");
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
		for (T unit : unitArr) {
			String name = "";
			if (unit == null) continue;//이건왜썼니...
			try {
				Class<T> clazz = (Class<T>) unit.getClass();
				Method method = clazz.getMethod("getName", null);
				System.out.println((String) method.invoke(unit, null));
				
			} catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException | NoSuchMethodException
					| SecurityException e) {
				
				e.printStackTrace();
			}
		}
	}

	void attackk() {

		for (T unit : unitArr) {
			if (unit == null) continue;

			Class <T> clazz = (Class<T>) unit.getClass();
			try {
				Method method = clazz.getDeclaredMethod("attack", null);
				method.invoke(unit, null);
			} catch (NoSuchMethodException | SecurityException | IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			
			
			
			
			
			
			
			
			
//			if (unit instanceof Marine) {
//
//				((Marine) unit).attack();
//			} else if (unit instanceof Firebat) {
//				((Firebat) unit).attack();
//
//			} else if (unit instanceof Ghost) {
//				((Ghost) unit).attack();
//
//			} else
//				System.out.println("========================================");
		}

	}
}

//T unload(int index) { ㅠㅜ
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
//	T returnUnit = null;
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
//			T r = unitArr[1];
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
//			T r = unitArr[2];
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
//			T r = unitArr[3];
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