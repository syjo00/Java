package Super;

public class SuperTest {

	/*
	super는 자손클래스에서 조상클래스로붙터 상속받은 멤버를 참조하는데 사용
	되는 참조변수이다.상속받은 멤버와 자신의 멤버와 이름이 같을 때는 super를
	붙여서 구별할 수 있다.
	조상클래스와 자손클래스의 멤버가 중복정의되어 서로 구별해야 하는 경우에만 
	사용할 수 있다.
	*/
	
	public static void main(String[] args) {
		
		Child c = new Child();
		c.method();

	}	

}

class Parent{
	int x= 10;
}

class Child extends Parent {
	void method() {
		
		System.out.println("x="+x);
		System.out.println("this.x="+this.x);
		System.out.println("super.x="+super.x);
		
		/*
		
		x=10
		this.x=10
		super.x=10 
		
	    >>> x,this.x,super.x는 모두 같은 값을 의미하므로 같은 값이 출력됨.	 
	  
	  */
		
		
	}
}