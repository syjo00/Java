package algorithm;

import java.util.Scanner;

class CountingSort {

	//도수 정렬
	static void countingSort(int[] a,int n,int max) {
		int[] f = new int[max +1];
		int[] b = new int[n];
		
		for(int i=0; i<n; i++)	f[a[i]]++;		//1단계
		for(int i=1; i<=max; i++) f[i] +=f[i-1];//2단계
		for(int i=n-1; i>=0; i--) b[--f[a[i]]] = a[i]; //3단계
		for(int i=0; i<n; i++) a[i] = b[i]; //4단계
		
	}
	
	public static void main(String[] args) {
		
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("도수 정렬");
		System.out.print("요소수 :");
		int nx = stdIn.nextInt();
		int[] x= new int[nx];
		
		for(int i=0;i<nx;i++) {
			do {
				System.out.print("x[" + i +"]");
				x[i] = stdIn.nextInt();
				
			}while(x[i]<0);
		}//for문
		
		int max = x[0];
		for(int i =1;i<nx;i++)
			if(x[i]>max)max =x[i];
			
		countingSort(x,nx,max);
		
		System.out.println("오름차순으로 정렬했습니다.");
		
		for(int i=0;i<nx;i++)
			System.out.println("x["+i+"]="+x[i]);
		
	}//main
	
	
	
	
}
