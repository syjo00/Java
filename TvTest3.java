package Class;


class Tv3{

	//tv의 속성(멤버변수)
	String color;		//색상
	boolean power;//전원상태(on/off)
	int channel;		//채널
	
	//tv의기능(메서드)
	void power() { power =!  power;}
	void channelUp() {++channel;}
	void channelDown() {--channel;}
	
}



public class TvTest3 {
	public static void main() {
		
		Tv3 t1 = new Tv3();
		Tv3 t2 = new Tv3();
		
		System.out.println("t1의 channel값은"+t1.channel+"입니다.");
		System.out.println("t2의 channel값은"+t2.channel+"입니다.");
		
		t2=t1;//t1이 저장하고 있는 값(주소)를 t2에 저장한다
		
		t1.channel = 7; //channel의 값을 7로 한다.
		
		System.out.println("t1의 channel값을 7로 변경함");
		
		
		System.out.println("t1의 channel값은"+t1.channel+"입니다.");
		System.out.println("t2의 channel값은"+t2.channel+"입니다.");
		
		
		
	}
	
	

}
