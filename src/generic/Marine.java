package generic;

public class Marine {
	String name;
	
	public Marine (String name){
		this.name=name;
	}
	
	public void attack () {
		System.out.println(this.name+"이/가 총을 두두두두두두두두두 갈깁니다.");
	}
	
	public String getName () {
		return this.name;
	}
	
}
