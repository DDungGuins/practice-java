package chapter5;

public class ConstructorEx {

	public static void main(String[] args) {

		Music rideOnTime=new Music();
		rideOnTime.title="ride on time";
		rideOnTime.genre="city pop";
		rideOnTime.playtime=180;
		
		Music plaLove=new Music();
		plaLove.title="plastic Love";
		plaLove.genre="city pop";
		plaLove.playtime=300;
		
		Music someday=new Music("someday","city pop",240);
		System.out.println(someday.title);
		
		Music mirai=new Music("mirai no mirai","ost");
		System.out.println(mirai.playtime);
		
		Music rithPort;
		
		//��ü�� �Ӽ��� �ϳ��ϳ� �������� �����...
		
	}

}



















class Music {
	String title;
	String genre;
	int playtime;
	
	Music(){
		
	}
	
	Music(String title, String genre, int playtime){
		this.title=title;
		this.genre=genre;
		this.playtime=playtime;
	}
	
	Music(String title, String genre){
		this.title=title;
		this.genre=genre;
	}
	
}