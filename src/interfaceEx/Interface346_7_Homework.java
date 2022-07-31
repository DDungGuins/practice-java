package interfaceEx;

import java.io.IOException;// ��¥ �����϶�� �˰����� ����� ������ �ƴϰ� �׳� �������Դϴ� ��¸� �ϴ� �˰�����

public class Interface346_7_Homework {

	public static void main(String[] args) throws IOException {

		System.out.println("���� ����� �����ϼ���.");
		System.out.println("B �� BubbleSort ");
		System.out.println("H �� HeapSort ");
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
			System.out.println("�������� �ʴ� ��� �Դϴ� .");
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
//			System.out.println("�������� �ʴ� ��� �Դϴ� .");
//			return;
//		}

		int[] arr = new int[10];
		sort.ascending(arr);
		sort.descending(arr);
		sort.description();
	}

}//���� ������ ����� �̰Ż��̴�.

interface Sort {

	int[] ascending(int[] asc);

	int[] descending(int[] des);

	default void description() {//�ٵ� ��� ������ ����Ʈ �޼���� �϶�� �ؼ� �ϴ� ����Ʈ�� �ߴµ� �ʳ����鿡���ߴ�
		System.out.println("���ڸ� �����ϴ� �˰����Դϴ�.");
	}
}

class BubbleSort implements Sort {
	
	
	@Override
	public void description() {
		// TODO Auto-generated method stub//���⼭ ����Ʈ�޼��带 �����ߴ�.
		
		Sort.super.description();
		System.out.println("BubbleSort�Դϴ�.");
		
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
		System.out.println("HeapSort�Դϴ�.");
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
		System.out.println("QuickSort�Դϴ�.");

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
