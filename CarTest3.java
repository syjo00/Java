package Constructor_copy;

/*
 this : 인스턴스 자신을 가리키는 참조변수, 인스턴스의 주소가 저장되어있다.
         모든 인스턴스 메서드에 지역변수로 숨겨진채로 존재한다.
         
 this(),this(매개변수) : 생성자, 같은 클래스의 다른 생성자를 호출할 때 사용한다.       
 */

class Car{
	String color;
	String gearType;
	int door;

	Car(){
		this("white","auto",4);
	}
	
	Car(Car c){ //인스턴스의 복사를 위한 생성자
		color = c.color;
		gearType = c.gearType;
		door = c.door;
	}
	
	
	Car(String color,String gearType,int door){
		this.color = color;
		this.gearType= gearType;
		this.door = door;
	}

}


public class CarTest3 {

	public static void main(String[] args) {
		
		Car c1 = new Car();
		Car c2 = new Car(c1);//c1의 복사본 c2를 생성한다.
		
		System.out.println("c1의 color=" + c1.color+",gearType="+c1.gearType+",c1.door="+c1.door);
		System.out.println("c2의 color=" + c2.color+",gearType="+c2.gearType+",c2.door="+c2.door);
		
		c1.door = 100;
		
		System.out.println("c1.door =100; 수행 후");
		System.out.println("c1의 color=" + c1.color+",gearType="+c1.gearType+",c1.door="+c1.door);
		System.out.println("c2의 color=" + c2.color+",gearType="+c2.gearType+",c2.door="+c2.door);
		
		/*
		c1의 color=white,gearType=auto,c1.door=4
		c2의 color=white,gearType=auto,c2.door=4
		c1.door =100; 수행 후
		c1의 color=white,gearType=auto,c1.door=100
		c2의 color=white,gearType=auto,c2.door=4
		*/
		
	}

}
