package Lamda;

public class LamdaEx0 {
	
	@FunctionalInterface 	 
	interface Cal{
			int add(int a,int b);
	}
	
	public static void main(String args[]) {
		
		Cal cal = (int a,int b)-> a+b;
		
		System.out.println(cal.add(1, 2));

	}

}
