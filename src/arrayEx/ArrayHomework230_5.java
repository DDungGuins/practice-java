package arrayEx;

import java.util.ArrayList;

public class ArrayHomework230_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	ArrayList <Dogg>doge= new ArrayList<>();	
	
	Dogg dog1=new Dogg(); dog1.setName("�ص�"); dog1.setType("�ð�����");
	Dogg dog2=new Dogg(); dog2.setName("�صѱ�"); dog2.setType("������");
	Dogg dog3=new Dogg(); dog3.setName("�ر���"); dog3.setType("ǳ�갳");
	Dogg dog4=new Dogg(); dog4.setName("�ر���"); dog4.setType("������");
	Dogg dog5=new Dogg(); dog5.setName("�ظع�"); dog5.setType("ȭ����");
		
	doge.add(dog1);
	doge.add(dog2);
	doge.add(dog3);
	doge.add(dog4);
	doge.add(dog5);
	
	
//	for (int i=0; i<doge.size(); i++ ) {
//		System.out.println(doge.get(i).showDogInfo());
//	}
//	
	for (Dogg ddogg : doge) {
		System.out.println(ddogg.showDogInfo());
	
	}
	
	
	
	
	
	
	}

}


class Dogg {
	
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