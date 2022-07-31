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
		// 오브젝트는 바로 클래스 중의 클래스 모든 클래스의 최상위 클래스다 단군클래스 아니.. 그냥 아까 슬쩍봤다
	}

}

class Parent extends Object {
	void imParent() {
		System.out.println("내가니애비다");
	}

}

class Child extends Parent {
	int a;
	String name;

	void iamChild() {
	}

//	public String toString() {
//
//		return name + "바보";
//
//	}
}