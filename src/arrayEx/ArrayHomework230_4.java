package arrayEx;

public class ArrayHomework230_4 {

	public static void main(String[] args) {
//		// ������ ���� Dog Ŭ������ �ֽ��ϴ�. 
//		Dog Test Ŭ������ �迭 ���̰� 5�� Dog[ ] �迭 �� ���� ��
//		Dog �ν��Ͻ��� 5�� �����Ͽ� �迭�� �߰��մϴ�. fo r���� ���� 
//		fo r������ Dog Ŭ���� �� 
//		showDog ln fo ( ) �޼��带 ����Ͽ� 
//		�迭�� �� ���� Dog ������ ��� ����ϼ���.

		
		Dog dogs[] = new Dog [5];
		
		for (int i=0; i<dogs.length;i++) {
			dogs[i] = new Dog();
		}
		dogs[0].setName("�ص�");
		dogs[0].setType("�ð�����");
		
		dogs[1].setName("�صѱ�");
		dogs[1].setType("������");

		dogs[2].setName("�ر���");
		dogs[2].setType("ǳ�갳");
		
		dogs[3].setName("�ر���");
		dogs[3].setType("������");
		
		dogs[4].setName("�ظ���");
		dogs[4].setType("ȭ����");
		
		
//		for (int i= 0 ; i<dogs.length; i++) {
//			System.out.println(dogs[i].showDogInfo());
//		}
//		
		for (Dog ddongGae: dogs ) {
			System.out.println(ddongGae.showDogInfo());
		}
	}

}


class Dog {
	
	private String name;
	private String type;

	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String showDogInfo() {
		return name + "," +type;
	}
}