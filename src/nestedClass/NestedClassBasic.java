package nestedClass;

import java.util.Map;

import chapter5.ThisEx;
import nestedClass.Dalping.House;

public class NestedClassBasic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Map.Entry<String, String> a;
		// ��Ʈ����� Ŭ������ �� �ȿ��ֱ�! ���� ��Ʈ���� ���� �ڱ� Ű�� ����� ������.
		// �����̶� ������ ������
		// ������ ������� �����̰� �־�߸� ������ �� �ִ�.
		// �����̲������ �ܵ������� ����� ���� ����.

		// �����̸� �θ��� �����߽��ϴ�
		// ���������� ���̸�, ���� , ��������, ����⸦ �� ���� �� ����Ͻÿ�

		Dalping yrdp = new Dalping();
		Dalping sadp = new Dalping();
		yrdp.name = "�������";
		yrdp.weight = 5000;
		yrdp.cupdigi = yrdp.new House(3000, "red");
		sadp.name = "���ƴ���";
		sadp.weight = 300;
		sadp.cupdigi = sadp.new House(120, "blue");
		
		yrdp.dalInfo(); sadp.dalInfo();
	}
}

//������ �ν��Ͻ��� �����Ǹ�
// �ɹ���, ����, ����Ʈ, �ŵ�� , ����Ŭ����-�Ͽ콺=> Ŭ������ ����� �� �� �ֱ���
// ��������� ����޼���� ����������, ����Ŭ���� ���� �� Ŭ������ �ν��Ͻ��� �־�߸� ����� �� �ִ�.(�ɹ�Ŭ����) 
class Dalping {
	String name;
	int weight;
	House cupdigi;

	void dalInfo() {
		System.out.println("�̸�:" + this.name + ", ����:" + this.weight + ", ����� ����:" + this.cupdigi.color + ", ����� ����:"
				+ this.cupdigi.weight);
	}

	class House {
		int weight;
		String color;

		House(int w, String c) {
			this.weight = w;
			this.color = c;
		}

	}

}