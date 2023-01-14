package ClassMethod_StaticMethod;

class ExStaticMethod {

	long a,b; //a,b 인스턴스 변수
	
	//인스턴스 변수 a,b만을 이용해서 작업하므로 매개변수가 필요없다.
	long add() {return a+b;}
	long subtract() {return a-b;}
	long multiply() {return a *b;}
	double divide() {return a/b;}
		
	static long add(long a, long b) {return a+b;} //a,b는 지역변수
	static long subtract(long a, long b) {return a-b;}
	static long multiply(long a, long b) {return a*b;}
	static double divide(double a ,double b) {return a/b;}

}
	
class ExStaticMethod2 {
	
	public static void main(String[] args) {
		
		//클래스 메서드 호출, 인스턴스 생성없이 호출가능
		System.out.println(ExStaticMethod.add(200L, 100L));
		System.out.println(ExStaticMethod.subtract(200L,100L));
		System.out.println(ExStaticMethod.multiply(200L, 100L));
		System.out.println(ExStaticMethod.divide(200.0,100.0));
		
			
		ExStaticMethod mm = new ExStaticMethod(); //인스턴스를 생성
		mm.a =200L;
		mm.b = 100L;
		
		//인스턴스메서드는 객체생성 후에만 호출이 가능함.
		
		System.out.println(mm.add());
		System.out.println(mm.subtract());
		System.out.println(mm.multiply());
		System.out.println(mm.divide());
		
		
	}

}
