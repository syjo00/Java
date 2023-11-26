package algorithm;

import java.util.Scanner;

class ShellSort {

	//셀정렬
	static void shellSort(int[] a,int n) {
		
		for(int h=n/2;h>0;h /= 2) 
			
			for(int i=h;i<n;i++) {
				
				int j;
				int tmp = a[i];
				for(j=i-h;i>=0&&a[j]>tmp;j-=h)
					a[j+h] =a[j];
				a[j+h]=tmp;
				
			}
			
		
	}//shellSort
	
	
	public static void main(String[] args) {
		
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("셀 정렬(버전1)");

		System.out.print("요소수 :");

		int nx = stdIn.nextInt();
		int[] x=  new int[nx];
		
		for(int i=0;i<nx;i++) {
			
			System.out.print("x["+i+"]");
			x[i]=stdIn.nextInt();
			
		}//for
		
				
		shellSort(x,nx); //배열 x를 셀정렬
	
		System.out.println("오름차순으로 정렬했습니다.");
		
		for(int i=0;i<nx;i++)
			System.out.println("x["+i+"]"+"="+x[i]);
		
	}//main
	
}//ShellSort