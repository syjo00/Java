package algorithm;

import java.util.Scanner;

public class HeapSort {
	
		static void swap(int[] a, int idx1, int idx2) {
			
			int t = a[idx1];
			a[idx1] = a[idx2];
			a[idx2] = t;
			
		}//swap
		
		
		static void downHeap(int[] a,int left,int right) {
			int temp = a[left];
			int child;
			int parent;
		
			
			for(parent=left;parent<(right +1)/2;parent=child) {
				int cl = parent * 2+1;
				int cr = cl+1;
			
			child = (cr<= right && a[cr] > a[cl])?cr:cl;
				if(temp >=a[child])
					break;
				a[parent] = a[child];
				
			}
			
			a[parent] = temp;

		}//downHeap

		
		//힙정렬
		static void heapSort(int[] a, int n) {
			
			 for(int i=(n-1)/2;i>=0;i--) 
				 downHeap(a,i,n-1);
				 
			 for(int i=n-1;i>0;i--) {
				 swap(a,0,i); //가장 큰 요소와 아직 정렬되지 않은 부분의 마지막 요소를 교환
				 downHeap(a,0,i-1); //a[0]~a[i-1]을 힙으로 만듦.
			 }
			
		}//heapSort
		
		public static void main(String[] args) {
			
			Scanner stdIn = new Scanner(System.in);
			
			System.out.println("힙정렬 ");
			System.out.print("요소수 : ");
			
			int nx = stdIn.nextInt();
			int[] x = new int[nx];
			
			
			for(int i=0;i<nx;i++) {
				System.out.println("x[" +i+"]");
				x[i] = stdIn.nextInt();
			}
			
			heapSort(x,nx);
		
			System.out.println("오름차순으로 정렬했습니다.");
			for(int i=0;i<nx;i++)
				System.out.println("x["+i+"]="+x[i]);
			
		}
		
}//HeapSort