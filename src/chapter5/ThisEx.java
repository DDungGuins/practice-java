package chapter5;

public class ThisEx {

	public static void main(String[] args) {
		/*
		 * 컴퓨터 클래스를 만든다. 유라는 이제 컴퓨터를 하나 조립한다 cpu와 메모리, disk를 넣고 조립해야하는데 예산이 부족해서 부품 하나가
		 * 없을 수도 있다. 이럴 경우 유라는 집에남는 싸구려부품을 쓴다.
		 * 
		 */

		Conputer noMemory;
		noMemory = new Conputer(new Cpu2("좋은 씨피유"), new Disk2("좋은 디스크"));
		noMemory.chulruk();
		/*
		 * 부품이 늘었따. (쿨러와 파워서플라이) 얘들 살돈은 없고... 집에 대신 안좋은 게 있다...
		 */
	}

}

class Conputer {

	Cpu2 cpu;
	Disk2 disk;
	Memory2 memory;
	Cooler cooler;
	PowerSupplier powSup;

	Conputer(Cpu2 cpu, Disk2 disk) {
//		this.cpu = cpu;
//		this.disk = disk;
//		memory = new Memory2();
		//cooler = new Cooler ("나름 괜찮은 쿨러");
		//powSup = new PowerSupplier ("괜찮지는 않은 파워");
		this(cpu, disk, new Memory2("안좋은 메모리"), new Cooler("안좋은 쿨러"), new PowerSupplier("안좋은 파워"));

	}

	Conputer(Cpu2 cpu, Memory2 memory) {
//		this.cpu = cpu;
//		this.memory = memory;
//		disk = new Disk2("안좋은 디스크");
		this(cpu, new Disk2("안좋은 디스크"), memory, new Cooler("안좋은 쿨러"), new PowerSupplier("안좋은 파워"));

	}

	Conputer(Disk2 disk, Memory2 memory) {
//		this.disk = disk;
//		this.memory = memory;
//		cpu = new Cpu2("안 좋은 시피유");
		this(new Cpu2("안좋은 씨피유"), disk, memory, new Cooler("안좋은 쿨러"), new PowerSupplier("안좋은 파워"));
	}

	Conputer(Cpu2 cpu, Disk2 disk, Memory2 memory, Cooler cooler, PowerSupplier powSup) {
		this.cpu = cpu;
		this.disk = disk;
		this.memory = memory;
		this.cooler = cooler;
		this.powSup = powSup;
	}

	void chulruk() {
		System.out.println(this.cpu.name);
		System.out.println(this.memory.name);
		System.out.println(this.disk.name);
		System.out.println(this.cooler.name);
		System.out.println(this.powSup.name);
	}
}

class Cpu2 {
	String name;

	Cpu2(String name) {
		this.name = name;
	}
}

class Disk2 {
	String name;

	Disk2(String name) {
		this.name = name;
	}

}

class Memory2 {
	String name;

	Memory2(String name) {
		this.name = name;
	}
}

class Cooler {
	String name;

	Cooler(String name) {
		this.name = name;
	}
}

class PowerSupplier {
	String name;

	PowerSupplier(String name) {
		this.name = name;
	}
}