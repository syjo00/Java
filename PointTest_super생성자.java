package SUPER3_생성자;

//조상클래스의 생성자 super() : 조상클래스의 생성자를 호출하는데 사용
public class PointTest_super생성자 {

	public static void main(String[] args) {
		
		Point3D p3 = new Point3D(1,2,3);

	}

}

class Point {
	
	int x, y;
	
	Point(int x,int y){
		this.x = x;
		this.y = y;
	}
	
	String getLocation() {
		return "x :"+x+",y:"+y;
	}

}//POINT

class Point3D extends Point {
	
	int z;
	
	
	Point3D(int x,int y,int z){
		//생성자 첫줄에서 다른 생성자를 호출하지 않기 떄문에 컴파일러 super();를 여기에 삽입한다.
		//super()는 Point3D의 조상인 Point클래스의 기본 생성자인 Point()를 의미한다.
		
		super(x,y);
		//조상클래스의 멤버변수는 조상의 생성자에 의해 초기화된다.
		//조상클래스의 생성자 Point(int x,int y)를 호출한다.
		this.z = z;
	}
	
	String getLocation() { //오버라이딩 : 상속받은 메서드의 내용을 변경하는 것
		return "x : " +x+"y :" +y+"z"+z;
	}
	
}//Point3D