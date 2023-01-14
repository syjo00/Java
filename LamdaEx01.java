package Lamda;

public class LamdaEx01 {

	@FunctionalInterface
	interface Calculation{
		int go(int aaa,int bbb);
	}
	
	@FunctionalInterface
	interface Message{
		void go(String message);
	}
	
	public static void main(String[] args) {
		
		//매개변수 유형 사용
		Calculation addition = (int nnn,int yyy) ->nnn+yyy;
		System.out.println("매개변수 유형 사용");
		System.out.println(addition.go(1, 2)); //3출력
		
		
		//매개변수 유형 미사용
		Calculation substraction =(kkk,hhh) -> kkk-hhh;
		System.out.println("매개변수 유형 미사용");
		System.out.println(substraction.go(1, 2)); //-1출력
		
		//반환값과 중괄호 사용
		Calculation multiplication = (int lll, int ddd) -> {
			return lll * ddd;
		};
		System.out.println("반환값과 중괄호 사용");
		System.out.println(multiplication.go(1, 2));
		
		//반환값과 중괄호 미사용
		Calculation division = (int www,int fff) -> www/fff;
		System.out.println("반환값과 중괄호 미사용");
		System.out.println(division.go(1,2)); //0출력
		
		//매개변수 괄호 사용
		Message secondMessage = (message)->System.out.println(message);
		System.out.println("매개변수 괄호 사용");
		secondMessage.go("firstMessage"); //firstMessage 출력
		
		
		//매개변수 괄호 미사용
		Message firstMessage= message -> System.out.println(message);
		System.out.println("매개변수 괄호 미사용");
		firstMessage.go("secondMessage"); //secondMessage 출력
		
	}

}
