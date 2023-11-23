package algorithm;

import java.util.Scanner;

class BubbleSort {
	
	//a[idx1]과 a[idx2]의 값을 교환
	static void swap(int[] a, int idx1,int idx2) {
		
		int t = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = t;
		
	}
	
	//버블정렬
	//static void bubbleSort(int[] a, int n) {
	//	for(int i=0;i<n-1;i++)
	//		for(int j = n-1;j>i;j--)
	//			swap(a,j-1,j);
	//}
	
	
	//버블정렬2(버전2)
	/*static void bubbleSort(int[]a,int n) {
		
		for(int i=0;i<n-1;i++) {
			
			int exchg=0;	//패스에서 교환하는 횟수를 저장
			
			//패스시작
			for(int j=n-1;j>i;j--)
				if(a[j-1]>a[j]) {
					swap(a,j-1,j);
					exchg++;
				}
			if(exchg ==0) break;	//교환이 이루어지지 않으므로 멈춤	
		}
		
	}*/
	

	//버블정렬3(버전3)
	static void bubbleSort(int[] a,int n) {
		int k=0;	//a[k]보다 앞쪽은 정렬을 마친 상태
		while(k<n-1) {
			int last = n-1;
			for(int j=n-1;j>k;j--)
				if(a[j-1]>a[j]) {
					swap(a,j-1,j);
					last = j;
				}
			k=last;
		}
	}
			
	public static void main(String[] args) {
		
		Scanner stdIn = new Scanner(System.in);
		System.out.println("버블정렬(버전)");
		System.out.print("요소수 : ");
		int nx = stdIn.nextInt();
		int[] x = new int[nx];
		
		for(int i=0;i<nx;i++) {
			System.out.print("x[" +i+ "]:");
			x[i] = stdIn.nextInt();
		}
		
		bubbleSort(x,nx);
		
		System.out.println("오름차순으로 정렬했습니다.");
			
		for(int i=0;i<nx;i++) 
			System.out.println("x[" + i + "]=" + x[i]);
		
	}//main

}

