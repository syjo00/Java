package Constructor_this;

//생성자에서 다른 생성자 호출하기

class Car{
	String color;
	String gearType;
	int door;



Car(){
	this("white","auto",4); //Car(String color,String gearType,int door)호출
}

Car(String color){
	
	/* 
	  color = "white"
	  gearType = "auto"
	  door = 4
	 */
	
	//위의 내용을 간략히 함
	this(color,"auto",4);
	

	
}

Car(String color, String gearType, int door) {
	
	//Car 대신 this 사용 
	this.color = color; //this.color는 인스턴스 변수. this는 참조변수로 인스턴스 자신을 가리킨다.
	this.gearType = gearType;
	this.door = door;
}


}

public class CarTest2 {

	public static void main(String[] args) {
		
		Car c1 = new Car();
		Car c2 = new Car("blue");
		
		System.out.println("c1의 color=" + c1.color+",gearType="+c1.gearType+",c1.door="+c1.door);
		System.out.println("c2의 color=" + c2.color+",gearType="+c2.gearType+",c2.door="+c2.door);
		
		/*
		 c1의 color=white,gearType=auto,c1.door=4
		c2의 color=blue,gearType=auto,c2.door=4

		  */
		
		
	}

}
