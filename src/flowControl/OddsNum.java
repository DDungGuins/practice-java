package flowControl;

public class OddsNum {

	public static void main(String[] args) {
		// 1부터 100까지 수를 더해라
		// 단 홀 수 일때만 더하고, 짝수일 때는 더하지마라.
		// continue문을 활용해라

		int num = 0;
		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0)
				continue;
			num += i;
		}
		System.out.println(num);
	}

}
