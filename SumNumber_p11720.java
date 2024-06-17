package algorithm;

import java.util.Scanner;

public class SumNumber_p11720 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		//입력값을 String 변수 sNum에 저장한 후 char[]형 변수로 변환하기
		String sNum = sc.next();
		char[] cNum = sNum.toCharArray();
		int sum =0;
		
		for(int i=0; i<cNum.length;i++) {
			//'0'을 넣으면 숫자로 변환된다.
			sum+=cNum[i]-'0';			
		}
		
		System.out.print(sum);
	}
	
}
