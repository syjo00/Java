package algorithm;

import java.util.Scanner;

public class P1546_평균 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int A[] = new int[N];
		
		for(int i=0;i<N;i++) {
			A[i] = sc.nextInt();
		}
		
		long sum = 0;
		long max = 0;
		
		for(int i=0;i<N;i++) {
			
			if (A[i]>max) 
			
			//배열 A를 순회하면서 각 요소가 최대값보다 크면 max를 업데이트
			max = A[i];
			
			//모든 요소를 sum에 더합니다.
			sum = sum + A[i];
			
		}
		
		System.out.println(sum*100.0/max/N);
		
		//모든 점수들을 최대 점수로 정규화하여 새로운 평균을 계산합니다.
		//구체적으로, sum은 모든 점수의 합이고, max는 최대 점수이며, N은 점수의 개수입니다.
		//이 식은 각 점수를 최대 점수로 나눈 값에 100을 곱한 값의 평균을 구합니다.
		
	}

}//P1546_평균
