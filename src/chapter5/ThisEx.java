package chapter5;

public class ThisEx {

	public static void main(String[] args) {
		/*
		 * ��ǻ�� Ŭ������ �����. ����� ���� ��ǻ�͸� �ϳ� �����Ѵ� cpu�� �޸�, disk�� �ְ� �����ؾ��ϴµ� ������ �����ؼ� ��ǰ �ϳ���
		 * ���� ���� �ִ�. �̷� ��� ����� �������� �α�����ǰ�� ����.
		 * 
		 */

		Conputer noMemory;
		noMemory = new Conputer(new Cpu2("���� ������"), new Disk2("���� ��ũ"));
		noMemory.chulruk();
		/*
		 * ��ǰ�� �þ���. (�𷯿� �Ŀ����ö���) ��� �쵷�� ����... ���� ��� ������ �� �ִ�...
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
		//cooler = new Cooler ("���� ������ ��");
		//powSup = new PowerSupplier ("�������� ���� �Ŀ�");
		this(cpu, disk, new Memory2("������ �޸�"), new Cooler("������ ��"), new PowerSupplier("������ �Ŀ�"));

	}

	Conputer(Cpu2 cpu, Memory2 memory) {
//		this.cpu = cpu;
//		this.memory = memory;
//		disk = new Disk2("������ ��ũ");
		this(cpu, new Disk2("������ ��ũ"), memory, new Cooler("������ ��"), new PowerSupplier("������ �Ŀ�"));

	}

	Conputer(Disk2 disk, Memory2 memory) {
//		this.disk = disk;
//		this.memory = memory;
//		cpu = new Cpu2("�� ���� ������");
		this(new Cpu2("������ ������"), disk, memory, new Cooler("������ ��"), new PowerSupplier("������ �Ŀ�"));
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