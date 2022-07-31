package generic;

//import java.util.ArrayList;

public class BunkerWithoutGeneric {
	int loaded = 0;

	Object[] unitArr = new Object[4];

	void load(Object unit) {

		if (loaded == 4) {
			System.out.println("���̻� ž���� �� �����ϴ�.");
			return;
		}

		unitArr[loaded] = unit;
		loaded++;

		if (unit instanceof Marine) {
			System.out.println("���� ž���߽��ϴ�. ���� ��Ŀ �� ���� ��=" + loaded);

		} else if (unit instanceof Firebat) {
			System.out.println("���̾�� ž���߽��ϴ�. ���� ��Ŀ �� ���� ��=" + loaded);

		} else if (unit instanceof Ghost) {
			System.out.println("��Ʈ ž���߽��ϴ�. ���� ��Ŀ �� ���� ��=" + loaded);

		}

		else {
			System.out.println("ž���� �� ���� �����Դϴ�.");

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
// �ٸ������� �̸� �������� �����Ͱ��Ƽ�...
	}

	Object unload(int index) {

		if (loaded < index + 1) {
			System.out.println("��������");
			return null;
		}
		Object returnUnit = unitArr[index];
		System.out.println(BunkerWithoutGeneric.getUnitName(unitArr[index]) + " �������ϴ�.");
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

//Object unload(int index) { �Ф�
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
//	Object returnUnit = null;
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
//			Object r = unitArr[1];
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
//			Object r = unitArr[2];
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
//		System.out.println("�� �� ���� ����");
//		return "";
//	}
//	}
//
//}
//}