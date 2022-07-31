package sjpackage;

public class ComplexedDaeip2 {

	public static void main(String[] args) {
		//성아가 60살까지 나이를 먹는데, 20살에 민증을 얻고, 26살에 유라를 얻^~^는다)
		int age=0;
		while (age<40) {
			age += 1;
			System.out.println(age);
			if(age ==20) {
				System.out.println("민증겟");
			}
			if (age==26) {
				System.out.println("유라겟");
			} 
		}
		System.out.println("끗");
	}

}
