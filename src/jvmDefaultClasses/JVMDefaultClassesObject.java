package jvmDefaultClasses;

public class JVMDefaultClassesObject {

	public static void main(String[] args) {
		//
		Child child1 = new Child();
		Child child2 = new Child();
		System.out.println(child1.toString());
		System.out.println("faj".toString());

		System.out.println(child1.equals(child2));
		System.out.println(child1.hashCode());
		// ������Ʈ�� �ٷ� Ŭ���� ���� Ŭ���� ��� Ŭ������ �ֻ��� Ŭ������ �ܱ�Ŭ���� �ƴ�.. �׳� �Ʊ� ��½�ô�
	}

}

class Parent extends Object {
	void imParent() {
		System.out.println("�����Ͼֺ��");
	}

}

class Child extends Parent {
	int a;
	String name;

	void iamChild() {
	}

//	public String toString() {
//
//		return name + "�ٺ�";
//
//	}
}