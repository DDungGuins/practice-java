package collectionFrameWork;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.time.Duration;
import java.time.Instant;

public class SetHowFast {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSet<Integer> iHs = new HashSet<>();
		for (int i = 0; i < 10000000; i++) {
			iHs.add(i);
		}

		Instant start = Instant.now();
		for (int i=0; i<10000;i++) {
	
			boolean removed= iHs.remove(10000+i);
			System.out.println(removed);
		}
	

		Instant finish = Instant.now();
		long elapsedTime = Duration.between(start, finish).toMillis();
		System.out.println("elapsedTime(ms) : " + elapsedTime);
	}
}