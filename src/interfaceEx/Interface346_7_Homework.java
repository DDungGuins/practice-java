package interfaceEx;

import java.io.IOException;// 진짜 정렬하라는 알고리즘을 만드는 문제는 아니고 그냥 정렬중입니다 출력만 하는 알고리즘임

public class Interface346_7_Homework {

	public static void main(String[] args) throws IOException {

		System.out.println("정렬 방식을 선택하세요.");
		System.out.println("B ： BubbleSort ");
		System.out.println("H ： HeapSort ");
		System.out.println("Q : Quicksort ");

		int ch = System.in.read();
		Sort sort = null;

		switch(ch){
				
		case 'B': case 'b': {
			sort = new BubbleSort();
			break;
		}
		case 'H' : case 'h' : {
			sort =  new HeapSort();
			break;
		}
		
		case 'Q': case 'q' : {
			sort =  new QuickSort();
			break;
		}
		default : {
			System.out.println("지원되지 않는 기능 입니다 .");
			return;
		}
		
		
		}
		
//		if (ch == 'B' || ch == 'b') {
//			sort = new BubbleSort();
//		} else if (ch == 'H' || ch == 'h') {
//			sort = new HeapSort();
//		} else if (ch == 'Q' | ch == 'q') {
//			sort = new QuickSort();
//		} else {
//			System.out.println("지원되지 않는 기능 입니다 .");
//			return;
//		}

		int[] arr = new int[10];
		sort.ascending(arr);
		sort.descending(arr);
		sort.description();
	}

}//내가 실제로 만든건 이거뿐이다.

interface Sort {

	int[] ascending(int[] asc);

	int[] descending(int[] des);

	default void description() {//근데 얘는 문제에 디폴트 메서드로 하라고 해서 일단 디폴트로 했는데 너내발톱에머했니
		System.out.println("숫자를 정렬하는 알고리즘입니다.");
	}
}

class BubbleSort implements Sort {
	
	
	@Override
	public void description() {
		// TODO Auto-generated method stub//여기서 디폴트메서드를 수정했다.
		
		Sort.super.description();
		System.out.println("BubbleSort입니다.");
		
	}

	public int[] ascending(int[] asc) {

		System.out.println("BubbleSort ascending");
		return asc;
	}

	public int[] descending(int[] des) { 
		System.out.println("BubbleSort descending");
		return des;
	}
}

class HeapSort implements Sort {
	@Override
	public void description() {
		// TODO Auto-generated method stub
		Sort.super.description();
		System.out.println("HeapSort입니다.");
	}

	public int[] ascending(int[] asc) {

		System.out.println("HeapSort ascending");
		return asc;
	}

	public int[] descending(int[] des) {
		System.out.println("HeapSort descending");
		return des;
	}

}

class QuickSort implements Sort {
	@Override
	public void description() {
		// TODO Auto-generated method stub
		Sort.super.description();
		System.out.println("QuickSort입니다.");

	}

	public int[] ascending(int[] asc) {

		System.out.println("QuicSort ascending");
		return asc;
	}

	public int[] descending(int[] des) {
		System.out.println("QuickSort descending");
		return des;
	}

}
