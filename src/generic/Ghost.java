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
		System.out.println(this.name+"이/가 칩칩칩칩칩칩칩 총을 쏩니다.");
	}
	
}
