package Array;

import java.util.Arrays;

public class ArrayEx2 {

	public static void main(String[] args) {
		
		int[] iArr1 = new int[10];
		int[] iArr2 = new int[10];
		int[] iArr3 = new int[] {100,95,80,70,60};
		
		char[] chArr = {'a','b','c','d'};
		
		for(int i=0; i<iArr1.length;i++) {
			iArr1[i]= i+1;
		}

		for(int i=0; i<iArr2.length;i++) {
			iArr2[i] = (int) (Math.random()*10) +1;
		
		}

	//배열에 저장된 값들을 출력한다.
		for(int i=0;i<iArr1.length;i++) {
			System.out.print(iArr1[i]+",");
			
		}
		
		System.out.println();
		System.out.println(Arrays.toString(iArr2));
		System.out.println(Arrays.toString(iArr3));
		System.out.println(Arrays.toString(chArr));
		
		
		/*
		 1,2,3,4,5,6,7,8,9,10,
		[3, 7, 10, 1, 7, 3, 5, 8, 6, 6]
		[100, 95, 80, 70, 60]
		[a, b, c, d]
		 */
		
		
	
	}
	
}
