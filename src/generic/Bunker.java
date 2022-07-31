package generic;

import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/*���׸� :
 *  Ŭ���� ���ο��� ���̴� ����Ÿ�����ִ�...
 *  Ŭ���������� ����Ÿ���� �������ش�.. ���׸���...
 *   
*/

public class Bunker<T> {
	int loaded = 0;
//@_"
	
//	T[] unitArr = new T[4]; ���� Ÿ���� ���� �𸣱⶧���� Ŭ���� ������ ��� �ν��Ͻ� ������ �� �� ������. �׷���
// ���ۿ� �ٰ� generic new array��� �˻��ߴ�...
	
	T[] unitArr; 
	
	Bunker(Class<T> clazz, int capacity){
		 unitArr = (T[]) Array.newInstance(clazz, capacity);
	}

	void load(T unit) {

		if (loaded == 4) {
			System.out.println("���̻� ž���� �� �����ϴ�.");
			return;
		}

		unitArr[loaded] = unit;
		loaded++;
		System.out.println(unit.getClass().getSimpleName()+" ž���߽��ϴ�. ���� ��Ŀ �� ���� ��=" + loaded);
//
//		if (unit instanceof Marine) {
//			System.out.println("���� ž���߽��ϴ�. ���� ��Ŀ �� ���� ��=" + loaded);
//
//		} else if (unit instanceof Firebat) {
//			System.out.println("���̾�� ž���߽��ϴ�. ���� ��Ŀ �� ���� ��=" + loaded);
//
//		} else if (unit instanceof Ghost) {
//			System.out.println("��Ʈ ž���߽��ϴ�. ���� ��Ŀ �� ���� ��=" + loaded);
//
//		}

//		else {
//			System.out.println("ž���� �� ���� �����Դϴ�.");
//
//		}
		System.out.println("========================================");

	}


	T unload(int index) {
		if (loaded < index + 1) {
			System.out.println("��������");
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
		
		System.out.println( name + " �������ϴ�.");
		System.out.println("========================================");

//		for (int i = 0; index + i < 3; i++) {
//			unitArr[index + i] = unitArr[index + (i + 1)];
//		}���� ������ ������..."_@
		for (int i = index; i < loaded - 1; i++) {
			unitArr[i] = unitArr[i + 1];
		}
		unitArr[loaded - 1] = null;

		return returnUnit;
	}

	void bunkerInfo() {
		for (T unit : unitArr) {
			String name = "";
			if (unit == null) continue;//�̰ǿֽ��...
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

//T unload(int index) { �Ф�
//if (index >= 4) {
//	System.out.println("������ �� ���� ���Դϴ�.");
//	return "";
//}
//
//else if (unitArr[index] == null || unitArr[index] == "") {
//	System.out.println(index + "�� ĭ�� ž���� ������ �����ϴ�.");
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
//			System.out.println(index + "�� ĭ�� ž���� ������ �����ϴ�.");
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
//		System.out.println(index + "�� ĭ�� ž����" + Bunker.getUnitName(unitArr[index]) + " ���Ƚ��ϴ�.");
//		System.out.println("���� ž�� ���� ������ ��:" + loaded);
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
//			System.out.println("������ �����ϴ�.");
//
//			return "";
//		case 2:
//			System.out.println(index + "�� ĭ�� ž���� " + Bunker.getUnitName(unitArr[index]) + " ���Ƚ��ϴ�.");
//			loaded--;
//			System.out.println("���� ž�� ���� ������ ��:" + loaded);
//			System.out.println("========================================");
//			T r = unitArr[1];
//
//			unitArr[1] = "";
//			return r;
//
//		case 3:
//			System.out.println(index + "�� ĭ�� ž���� " + Bunker.getUnitName(unitArr[index]) + " ���Ƚ��ϴ�.");
//			loaded--;
//			System.out.println("���� ž�� ���� ������ ��:" + loaded);
//			System.out.println("========================================");
//			r = unitArr[2];
//
//			unitArr[1] = unitArr[2];
//			unitArr[2] = "";
//			return r;
//
//		case 4:
//			System.out.println(index + "�� ĭ�� ž���� " + Bunker.getUnitName(unitArr[index]) + " ���Ƚ��ϴ�.");
//			loaded--;
//			System.out.println("���� ž�� ���� ������ ��:" + loaded);
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
//			System.out.println("������ �����ϴ�.");
//
//			return "";
//		case 3:
//			System.out.println(index + "�� ĭ�� ž���� " + Bunker.getUnitName(unitArr[index]) + " ���Ƚ��ϴ�.");
//			loaded--;
//			System.out.println("���� ž�� ���� ������ ��:" + loaded);
//			System.out.println("========================================");
//			T r = unitArr[2];
//
//			unitArr[2] = "";
//			return r;
//
//		case 4:
//			System.out.println(index + "�� ĭ�� ž���� " + Bunker.getUnitName(unitArr[index]) + " ���Ƚ��ϴ�.");
//			loaded--;
//			System.out.println("���� ž�� ���� ������ ��:" + loaded);
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
//			System.out.println("������ �����ϴ�.");
//			loaded--;
//			return "";
//		case 4:
//			System.out.println(index + "�� ĭ�� ž���� " + unitArr[index].getClass() + " ���Ƚ��ϴ�.");
//			loaded--;
//			System.out.println("���� ž�� ���� ������ ��:" + loaded);
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
//		System.out.println("�� �� ���� ����");
//		return "";
//	}
//	}
//
//}
//}