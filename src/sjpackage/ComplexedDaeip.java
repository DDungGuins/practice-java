package sjpackage;

public class ComplexedDaeip {

	public static void main(String[] args) {
		//성아가 60살까지 나이를 먹는데, 20살에 민증을 얻고, 26살에 유라를 얻^~^는다)
		int sAge=0;
		while (sAge<20) {
			sAge+=1;
			System.out.println(sAge);

		}
		System.out.println("민증나왔다");
		while (sAge>=20&&sAge<26) { //20<=sAge<26
			sAge+=1;
			System.out.println(sAge);
		}		
		System.out.println("유라를 얻었다.");
		while (sAge<40) {
			sAge+=1;
			System.out.println(sAge);
		}
		System.out.println("늙었다.");

		//반복문은 <알고리즘의 꽃이야
		
		
		
	}

}
