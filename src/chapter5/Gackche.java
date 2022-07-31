package chapter5;

public class Gackche {
	public static void main(String[] args) {
		
		Computer dulcom = new Computer();
		Computer sungcom = new Computer();
		
	}
}
// Computer :(Cpu, Memory, Disk)
// Person

class Computer {

	CPU cpu; // 한계가 있다...
	Disk disk;
	Memory memory;

}

class CPU {
	String company;
	int ymd;
	String sn;
}

class Memory {
	String company;
	int ymd;
	int size;
	String sn;
}

class Disk {
	String company;
	int ymd;
	boolean isHdd;
	int size;
	String sn;
}

class Human {
	Hand hand;
	Head head;
	Personality personality;

	public void useComputer(Computer computer) {

	}
}

class Hand {

	public void grap() {

	}
}

class Head {

}

class Personality {

}
