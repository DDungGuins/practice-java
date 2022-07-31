package collectionFrameWork.withoutGenericEx;

import java.util.ArrayList;

public class WithGeneric {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Animal dog =  new Dog(); 
		Animal cat = new Cat ();
		Animal penguin = new Penguin();
		
		
		ArrayList<Animal> arraylist = new ArrayList<Animal>(); //너 왜 날 낚으려 했니 ㅡㅡ
		arraylist.add(dog);
		arraylist.add(cat);
		arraylist.add(penguin);
		
	
		arraylist.get(0).ulgi();//이렇게 했을 때 말이니  자동으로 안된다
		arraylist.get(1).ulgi();
		arraylist.get(2).ulgi();
		
		// 하긴했는데 이게 아닌것같은..
		//난 어레이의 요소를 직접 메소드를 실행시킨게 아니라 다른 변수를 취해서 메소드를 실행했어..
		//잠깐만 디스코드 채팅 30초만..
		
			
	}

}
