package collectionFrameWork.withoutGenericEx;

import java.util.ArrayList;

public class WithoutGenericEx {

	public static void main(String[] args) {
		/* 애니멀 만든다
		 * 메서드 울기
		 * 동물 세개를 리스트에 집어넣고 우는 메서드를 실행하라
		 * 리스트에 뭘 담니 애니멀을 담니?
		 * 무슨말이니 제네릭이 뭐니 학생이지  그게 제네릭이니
		 */
		Animal dog =  new Dog(); 
		Animal cat = new Cat ();
		Animal penguin = new Penguin();
		
		
		ArrayList arraylist = new ArrayList();
		arraylist.add(dog);
		arraylist.add(cat);
		arraylist.add(penguin);
		
	
		Animal d = (Animal) arraylist.get(0);//이렇게 했을 때 말이니  자동으로 안된다
		Animal c = (Animal) arraylist.get(1);
		Animal p = (Animal) arraylist.get(2);
		
		d.ulgi(); c.ulgi(); p.ulgi();
		// 하긴했는데 이게 아닌것같은..
		//난 어레이의 요소를 직접 메소드를 실행시킨게 아니라 다른 변수를 취해서 메소드를 실행했어..
		
			
		
		
	}

}
