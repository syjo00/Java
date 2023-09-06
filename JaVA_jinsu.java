import java.util.Scanner;

public class JaVA_jinsu {

	public static void main(String[] args) {
		
		System.out.println("10진수를 입력하세요 :");
		Scanner my_in = new Scanner(System.in);
		
		int ken = Integer.parseInt(my_in.next());
		
		//Scanner는 계속 입력받기 때문에 닫아주어야 함.
		my_in.close();
		
		System.out.println("10진수는 : "+ken);
		System.out.println("2진수는 : "+Integer.toBinaryString(ken));
		System.out.println("8진수는 :" +Integer.toOctalString(ken));
		System.out.println("16진수는 :" +Integer.toHexString(ken));
	
		
	}
	

}
