package algorithm;

import java.util.Scanner;

class ShellSort2 {
	
	//셀정렬2 : 버전2 -->> h값은 40,13,4,1
	static void ShellSort(int[] a,int n) {
		
		int h;
	
		for(h=1;h<n;h=h*3+1);
		
		for(;h>0;h/=3) 
			
			for(int i=h;i<n;i++) {
			
				int j;
				int tmp = a[i];
				for(j=i-h;j>=0 && a[j]>tmp;j-=h)
					a[j+h] =a[j];
				a[j+h] = tmp;		
				
			}
		
	}//ShellSort
	
	public static void main(String[] args) {
		
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("셀 정렬(버전2)");
		
		System.out.print("요소수 :");
		
		int nx = stdIn.nextInt();
		
		int[] x = new int[nx];
		
		for(int i=0;i<nx;i++) {
			
			System.out.print("x["+i+"]");
			x[i] = stdIn.nextInt();
		}//for문
		
		ShellSort(x,nx);
		
		System.out.println("오름차순으로 정렬했습니다.");
		
		for(int i=0;i<nx;i++) 
			System.out.println("x["+i+"]="+x[i]);
			
		
	}//main
	
}//ShellSort2
