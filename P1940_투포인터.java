package algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/*
 
  갑옷을 만드는 데에 2가지 재료의 고유한 번호를 합쳐 M(1<=M<=10000000)이 되면 갑옷을 만들 수 있다.
  N(1<=N<=15,000)의 개의 재료와 M이 주어졌을 때 몇 개의 갑옷을 만들 수 있는 지 구하는 프로그램을 작성하세요.
 */


public class P1940_투포인터 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(bf.readLine());
		int M = Integer.parseInt(bf.readLine());
		
		int[] A = new int[N];
		StringTokenizer st = new StringTokenizer(bf.readLine());
		/*
		 1. 띄어쓰기 기준으로 문자열을 분리StringTokenizer st = new StringTokenizer(문자열);
		 */
		
		for(int i=0;i<N;i++) {
			A[i] = Integer.parseInt(st.nextToken());			
		}
		
		Arrays.sort(A);
		int count =0;
		int i = 0;
		int j = 0;
		
		while(i<j) { // 투 포인터 이동 원칙에 따라 포인트를 이동하며 처리
			
			if(A[i]+A[j]<M) { //작은 번호의 재료를 한 칸 위로 변경하기
				
				i++;
				
			} else if(A[i]+A[j]>M) {	//큰 번호 재료를 한 칸 아래로 변경하기
				
				j--;
				
			}else{ //경우의 수 증가, 양쪽 index 각각 변경하기
				
				count++;
				i++;
				j--;
				
			}			
		}
		
		System.out.println(count);
		bf.close();
	}

}



