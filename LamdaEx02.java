package Lamda;

public class LamdaEx02 {
	
	@FunctionalInterface
	interface Calculation2 {
		
		int go(int aaa,int bbb);
		
	}
	
	static Calculation2 getCalculation(int ccc,int ddd) {
		
		return (aaa,bbb)->{
			
			return aaa +bbb +ccc+ddd;
			
		};
		
	}
	
	public static void main(String[] args) {
	
		
		Calculation2  cal = getCalculation(1,2);
		System.out.println(cal.go(3, 4)); //10

		///aaa =3,bbb =4,,ccc=1,ddd=2
		
	}

}
