package generic;

public class Ghost {
	public String getName() {
		return name;
	}
	
	String name;
	
	public Ghost (String name){
		this.name=name;
	}
	public void attack () {
		System.out.println(this.name+"��/�� ĨĨĨĨĨĨĨ ���� ���ϴ�.");
	}
	
}
