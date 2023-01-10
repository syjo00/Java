package Super2;

public class SuperTest2 {

	public static void main(String[] args) {
		 
		Child c = new Child();
		
		c.method();

	}

}

class Parent{
	
	int x = 10;
	
}

class Child extends Parent {
	
	int x= 20;
	
	void method() {
		
		System.out.println("x = "+x); //x=20
		System.out.println("this.x ="+this.x); //this.x =20
		System.out.println("super.x = "+super.x); //super.x=10
				
	}
	 
}