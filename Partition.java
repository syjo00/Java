package algorithm;

import java.util.Scanner;

//배열을 나눔

public class Partition {
	//배열 요소 a[idx1]과 a[idx2]의 값을 교환
	static void swap(int[] a, int idx1,int idx2) {
		
		int t = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = t;
				
	}//swap
	
	//배열을 나눔
	static void partition(int[] a,int n) {
		
		int pl =0;		//왼쪽커서
		int pr = n-1;	//오른쪽커서
		int x=a[n/2];	//피벗(가운데 요소)
		
		//피벗 x를 기준으로 배열 a를 나눕니다.
		do {
			while(a[pl]<x) pl++;
			while(a[pr]>x) pr--;
			if(pl<=pr)
				swap(a,pl++,pr--);			
		}while(pl<=pr);
		
		System.out.println("피벗값은 "+x+"입니다.");
		
		System.out.println("피벗 이하의 그룹");
		
		for(int i=0;i<=pl;i++)
			System.out.print(a[i]+" ");	//a[0] ~a[pl-1]			
		System.out.println();
		
		if(pl>pr+1) {
			System.out.println("피벗과 같은 그룹");
			for(int i=pr+1;i<=pl-1;i++)
				System.out.print(a[i]+" ");
			System.out.println();
		}//if문
		
		System.out.println("피벗 이상의 그룹");
		for(int i=pr+1;i<n;i++)
			System.out.print(a[i]+" ");
		System.out.println();
		
		
	}//partition
	
	public static void main(String[] args) {
		
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("배열을 나눕니다.");
		
		System.out.print("요소 수 :");
		
		int nx = stdIn.nextInt();
		int[] x= new int[nx];
		
		for(int i=0;i<nx;i++) {
			System.out.print("x["+i+"]:");
			x[i]=stdIn.nextInt();
		}
		
		partition(x,nx); //배열 x를 나눔
		
	}//main
}
