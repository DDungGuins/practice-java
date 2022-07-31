package collectionFrameWork;

import java.util.HashSet;

public class CollectionFramework446HomeWork {

	public static void main(String[] args) {
		//난 @Override를 적지않아서 뭘 틀렸는지조차 모르는 바보다.
		// equals 를 오버라이딩할때는 매개변수를 Object를 넣어야한다.
		// HashCode가 아니라hashCode다.
		
		HashSet<Studentz> set = new HashSet<Studentz>();
		set.add(new Studentz(100, "홍길동"));
		set.add(new Studentz(200, "강감찬 "));
		set.add(new Studentz(300, "이순신"));
		set.add(new Studentz(400, "정약용 "));
		set.add(new Studentz(100, "송중기 "));
		System.out.println(set);

	}
}
class Studentz {
	int id;
	String name;

	Studentz(int id, String name) {
		this.id = id;
		this.name = name;
	}
	//이거 해시셋이라 먼저들어간놈이 살아남는거아니니 난 컴페어러블을 몰 라..
	@Override
	public boolean equals (Object o) {
		if (this.id==((Studentz) o).id){
			return true;
		}
		else return false;
	}
	
	public String toString() {
		return this.id+":"+this.name;
	}

	@Override
	public int	hashCode() {
		return this.id;
	}

}

//"이게 송중기랑 홍길동이 둘다 id가 100번이라 같은놈취급받아서 안들어가야하는데 들어가버린다."