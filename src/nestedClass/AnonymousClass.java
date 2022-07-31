package nestedClass;

public class AnonymousClass {

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

		// ����϶�� �Ѱžƴϴ�
		PlenktonGundan planks = new PlenktonGundan();
		planks.join(new Plenkton() {
			@Override
			void play() {
				System.out.println("�뷡�θ���");
			}
		});
		planks.join(new Plenkton() {//1
			@Override
			void play() {
				System.out.println("���߱�");
			}
		});
		planks.join(new Plenkton() {//2
			@Override
			void play() {
				System.out.println("���Ⱦ� ��������");
			}
		});
		planks.join(new Plenkton() {//3
			@Override
			void play() {
				System.out.println("���� �÷�ũ�� �����̿���");
			}
		});
		planks.join(new Plenkton() {//4
			@Override
			void play() {
				System.out.println("�Ի���� ��� ��ġ��");
			}
		});
		planks.join(new Plenkton() {//5
			@Override
			void play() {
				System.out.println("�ְֹŸ���");
			}
		});
		planks.join(new Plenkton() {//6
			@Override
			void play() {
				System.out.println("�ں���");
			}
		});
		planks.join(new Plenkton() {//7
			@Override
			void play() {
				System.out.println("ĥĥ��");
			}
		});
		planks.join(new Plenkton() {//8
			@Override
			void play() {
				System.out.println("������");
			}
		});
		
		planks.join(new Plenkton() { //9
			@Override
			void play() {
				System.out.println("����̿�");
			}
		});
		
		planks.join(new Plenkton() { //10
			@Override
			void play() {
				System.out.println("�ò���");
			}
		});

	}

}

abstract class Plenkton {
	abstract void play();
}

class PlenktonGundan {
	void join(Plenkton plenkton) {
		plenkton.play();
	}

}