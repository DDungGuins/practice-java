package nestedClass;

public class AnoynumousClasswithoutAnonymous {

	public static void main(String[] args) {
		/*
		 * ������ �÷�ũ�� ������ �𿴽��ϴ� ���������̶� ������ ���� ���ϰ� adhd���� ��� ���� �մϴ� (�뷡�θ���, ���߱� ��) ��õ����
		 * �÷�ũ���� �����ϴµ�, ������ �߰��� �����մϴ� �÷�ũ���� �������ڸ��� ������ �����մϴ�
		 * 
		 * �ڵ� ���� �÷�ũ�� Ŭ�������� play() ��� �߻� �޼ҵ尡 ����Ǿ� �ִ�
		 * 
		 * �÷�ũ�� ���� Ŭ�������� join(Plenkton plenkton) �޼ҵ尡 �����ϸ�, �÷�ũ���� join���ڸ��� �ڽ��� play��
		 * �����Ѵ�
		 */

		Planktongundan planks = new Planktongundan();

		planks.join(new DanceP());
		planks.join(new SingP());
		planks.join(new MumP());


	}

}

abstract class Plankton {
	abstract void play();
}

class DanceP extends Plankton{
	void play() {
		System.out.println("���ߴ� ���ũ��~");

	}
}

class SingP extends Plankton{
	void play() {
		System.out.println("�뷡�ϴ� ���ũ��~");

	}
}

class MumP extends Plankton{
	void play() {
		System.out.println("�� ���ũ��~");

	}
}



class Planktongundan {

	

	void join(Plankton plankton) {
		plankton.play();
	}

}