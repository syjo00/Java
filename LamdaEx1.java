package Lamda;

 //Lambda Expression을 활용하기 위해서 대상 Interface는 abstract method를 단 하나만 보유해야된다
  
@FunctionalInterface  //컴파일러가 함수형 인터페이스를 올바르게 정의했는지 확인
interface MyFunction{ //함수형 interface MyFunction을 정의
	void run(); //추상메서드
}

public class LamdaEx1 {

	static void execute (MyFunction f) { //매개변수의 타입이 MyFunction인 메서드
		f.run();
	}
	
	
	static MyFunction getMyFunction() {//반환 타입이 MyFucntion인 메서드
		
		MyFunction f =() ->System.out.println("f3.run()");
		
		return f;
		
	}
	
	
	public static void main(String[] args) {
		
		//람다식으로 MyFunction의 run()을 구현
		MyFunction f1 = () -> System.out.println("f1.run()");		//f1.run()
		
		MyFunction f2 = new MyFunction() { //익명 클래스로 run()을 구현
						
			public void run() {
				System.out.println("f2.run()");	//f2.run()
			}

		};
	
		MyFunction f3 = getMyFunction(); //f3.run()
		
		f1.run();
		f2.run();
		f3.run();
		
		execute(f1);	//f1.run()
		execute( ()->System.out.println("run()") ); //run()
	
	}
	
}

