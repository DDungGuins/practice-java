package exception;

import java.util.ArrayList;

public class CustomException {

	public static void main(String[] args) {
		// ��ũ�� Ŭ���� ���� ��ũ��(��ǳ�� ���� �޼���)�̶�� �޼��尡 �ִ�.
		// ���������� ��ũ���� �� ����� ���ϴ� join(��������� �޼���)�̶�� �޼��尡 �մ�
		// �׷���, ���ƿ� ���ẹ�� ���������� �̰� ���� ��Ȳ�̴�.

		Picnic sybPicnic = new Picnic();

		sybPicnic.join("����");
		sybPicnic.join("����");
		sybPicnic.join("����");
		sybPicnic.join("�ױ�");

		sybPicnic.goPicnic();
		sybPicnic.join("�ẹ");// �Ǥ�
		sybPicnic.goPicnic(); // ���α׷� ��ü������ �Ұ����ѻ�Ȳ�� �ƴ�����, �������� ���￡�� �Ұ����� (����) ��Ȳ�̴�.

	}

}//

class Picnic {
	private ArrayList<String> picnicers = new ArrayList<>();

	void join(String picnicer) {
		picnicers.add(picnicer);
		System.out.println(picnicer + "��/�� �շ��߽��ϴ�.");
	}

	void goPicnic() {
		// ������� �ẹ�� ���ư� �����ִ� ��Ȳ�� �߻���, ���ο� ���ܸ� �߻�throw ���Ѿ��Ѵ�
		try {
			if (picnicers.contains("����") && picnicers.contains("�ẹ")) {

				throw new SungChunException("���ƿ� �ẹ�� �Բ��� �� ����.");
			}
			else {
				System.out.println(picnicers + "���� ��ſ� ��ǳ�� ���ϴ�.");

			}
		}

		catch (SungChunException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}

class SungChunException extends Exception {
	SungChunException() {
	}

	SungChunException(String message) {
		super(message);
	}

}