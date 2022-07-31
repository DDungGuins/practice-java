package inheritance;

public class ChildInstance {

	public static void main(String[] args) {
		// 프린터를 만든다 프린터클래스를 만들고, 삼성프린트가 있따. 삼성프린터중에서는
		// 프린터에게는 boolean타입의 속성이 있다. 인쇄가능여부 스캔가능여부 , 삼성띵즈여부
//		뭘 의도하는지 잘모르겠어..
		// 삼성프린터의 인스턴스를 만들어보자, 단 생성자호출마다 호출됐다고 메시지 넣얼

		SamSungP ddongsung = new SamSungP(true, false, false);
		SamSungP godsung = new SamSungP(true, true, true);
		ddongsung.printerInfor();
		godsung.printerInfor();
	}

}

class Printer {
	String company;
	boolean canPrint;
	boolean canScan;

	Printer() {
		System.out.println("===프린터 기본생성자 호출====");
	};

	Printer(String company, boolean canPrint, boolean canScan) {
		this.company = company;
		this.canPrint = canPrint;
		this.canScan = canScan;
		System.out.println("===프린터 매개변수 생성자 호출===="); // 이게 뜨면 된거아니깃니
	}

	void printerInfor() {
		System.out.println("made by " + this.company);
		if (this.canPrint)
			System.out.println("인쇄할 수 있습니다.");
		if (this.canScan)
			System.out.println("스캔할 수 있습니다.");

	}

}

class SamSungP extends Printer {
	// 그러려고 했는데 어짜피 삼성프린트는 회사도정해져있고 기능도 다 정해져있어서 굳이 매개변수가 필요없을 것 같아서 이렇게했다..]
	boolean isSamsungThings;

	//묵시적으로 super()생성자를 호출
//	SamSungP(boolean canPrint, boolean canScan, boolean isSamsungThings) { 
//		System.out.println("===삼성 프린터 생성자호출 ===");
//		this.canPrint= canPrint;
//		this.canScan = canScan;
//		this.isSamsungThings = isSamsungThings;
//	}
	
	SamSungP(boolean canPrint, boolean canScan, boolean isSamsungThings){
		super("Samsung", canPrint, canScan); 
		this.isSamsungThings=isSamsungThings;
		System.out.println("===삼성 프린터 생성자호출 ===");
	}

	void printerInfor() {
		super.printerInfor();
		if (this.isSamsungThings) {
			System.out.println("삼성띵즈를 지원합니다.");
		}
	}
}