package algorithm;

import java.util.Scanner;

public class IndexOfTester {

	public static void main(String[] args) {
		
		
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("텍스트 : ");
		String s1 = stdIn.next(); //텍스트용 문자열
		
		
		System.out.print("패턴 : ");
		String s2 = stdIn.next(); //패턴용 문자열
		
		int idx1 = s1.indexOf(s2); //문자열 s1에서 s2를 검색(앞쪽부터)
		int idx2 = s2.lastIndexOf(s2); //문자열s1에서 s2를 검색(뒤쪽부터)ㄴ
		
		if(idx1 == -1)
			System.out.println("텍스트 안에 패턴이 없습니다.");
		else {
			//찾아낸 문자열 바로 앞까지의 문자 개수 구함
			int len1 = 0;
			for(int i=0; i<idx1;i++)
				len1 += s1.substring(i,i+1).getBytes().length;
			len1 += s2.length();
			
			int len2 = 0;
			for(int i =0; i<idx2;i++)
				len2 += s1.substring(i,i+1).getBytes().length;
			len2 += s2.length();
				
			System.out.println("텍스트 : "+ s1);
			System.out.printf(String.format("패 턴 : %%%ds\n",len1),s2);
			System.out.println("텍스트 : "+s2);
			System.out.printf(String.format("패 턴 : %%%ds\n",len2),s2);
			
		}
		
		
	}

}
