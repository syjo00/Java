package algorithm;

public class InnerEx1 {
	//내부 클래스 중에서 static 클래스만 static 멤버를 가질 수 있다.
	//final static이 동시에 붙은 변수는 상수이기 때문에 모든 내부 클래스에서 정의가 가능하다.
	
	class InstanceInner {
		
		int iv = 100;
		//static int cv = 100; //static 변수를 선언할 수 없다.
		final static int CONST = 100; //final static은 상수이므로 허용된다.
		
	}
	
	static class StaticInner {
		int iv = 200;
		static int cv = 200; //static 클래스만 static 변수를 정의할 수 있다.
	}
	
	void myMethod() {
		class LocalInner{
			int iv = 300;
			//static int cv = 300; //static 변수를 선언할 수 없다.
			final static int CONST = 300; //final static은 상수이므로 허용된다.
		}
	}
	
	public static void main(String[] args) {
		System.out.println(InstanceInner.CONST);
		System.out.println(StaticInner.cv);
	}
	
}
