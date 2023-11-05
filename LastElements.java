package algorithm;

import java.util.Scanner;

//링 버퍼의 활용 : 오래된 데이터를 버리는 용도로 사용, 요소수가 n인 배열에 계속해서 데이터가 입력될 때 가장 최근에 들어온 데이터 n개만 저장하고 오래된
//데이터는 버리는 용도로 사용한다.

public class LastElements {
	
	public static void main(String args[]) {
		
		Scanner scan = new Scanner(System.in);
		final int N =10;
		int[] a = new int[N]; //입력받은 값을 저장
		int cnt =0; //입력받은 개수
		int retry; //다시 한번?
		
		System.out.println("정수를 입력하세요.");
		
		do {
			
			System.out.printf("%d번째 정수 : ", cnt + 1);
			a[cnt++ %N] = scan.nextInt();
			
			System.out.print("계속 할까요?(예.1/아니요.0)");
			retry = scan.nextInt();
			
		} while (retry == 1);
		
		int i = cnt - N;
		if(i<0) i = 0;
		
		for(;i<cnt;i++) 
			System.out.printf("%2d번째 정수 = %d\n",i+1,a[i%N]);
		
		
	}//main

}
