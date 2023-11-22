package algorithm;

import java.util.Scanner;

	public class RecurX1 {
			
		//꼬리 재귀를 제거
			static void recur(int n) {
				while(n>0) {
					recur(n-1);
					System.out.println(n-1);
					n = n-2;
				}			
			}
			
			public static void main(String[] args) {
				Scanner scan = new Scanner(System.in);
				
				System.out.print("정수를 입력하세요.");
				int x = scan.nextInt();
				
				recur(x);
				
			}
}
